package controlador;

import controlador.util.BotonTabla;
import controlador.util.FiltrarTabla;
import java.awt.Color;
import java.awt.Cursor;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import modelo.Detalle;
import modelo.Encabezado;
import modelo.MdlDetalle;
import modelo.MdlEncabezado;
import modelo.MdlPersona;
import modelo.MdlProducto;
import modelo.Persona;
import modelo.Producto;
import reporte.Reporte;
import vista.VisFactura;

public final class CtrlFactura  {
    private final MdlEncabezado mdlencabezado;
    private final MdlDetalle mdldetalle;
    private final MdlProducto mdlproducto;
    private final MdlPersona mdlpersona;
    private final VisFactura vista;
    
    private List<Encabezado> encabezados= new ArrayList<>();
    private List<Detalle> detalles= new ArrayList<>();
    private List<Producto> productos= new ArrayList<>();
    private List<Persona> personas= new ArrayList<>();
    
    DefaultTableModel dtm, dtm2;
    ArrayList<String> productos_agregados = new ArrayList<>();
    
    String[] columnas_enc = {"Código", "Cliente", "Fecha", "Total"};
    String[] columnas_det = {"ID", "ID de producto", "Cantidad", "Subtotal", "Código de factura"};
    String[] columnas_productos= {"ID producto","Nombre","Precio","Stock", "Categoria", "Acción"};
    String[] columnasdetalles= {"ID producto", "Nombre","Precio", "Cantidad", "Subtotal", "Acción"};
    JButton btnAgregar = new JButton();
    JButton btnEliminar = new JButton();
    
    Double total=0.0;
    
    public CtrlFactura(MdlEncabezado mdlencabezado, MdlDetalle mdldetalle, MdlProducto mdlproducto, MdlPersona mdlpersona, VisFactura vista) {
        this.mdlencabezado = mdlencabezado;
        this.mdldetalle = mdldetalle;
        this.mdlproducto = mdlproducto;
        this.mdlpersona = mdlpersona;
        this.vista = vista;
        
        btnAgregar.setBackground(Color.WHITE);
        btnEliminar.setBackground(Color.WHITE);
        InsertarIcono(btnAgregar, "/vista/iconos/agregar.png");
        InsertarIcono(btnEliminar, "/vista/iconos/eliminar.png");
        ControlarTablas(vista.getT_productos(),vista.getT_detalles());
        dtm2 = new DefaultTableModel(null, columnasdetalles);
        vista.getT_detalles().setRowHeight(40);
        vista.getT_detalles().setModel(dtm2);
        vista.setVisible(true);
        
        visualizarProductos("");
        visualizarFacturas(0);
        
        SeleccionarEncabezado(vista.getT_encabezados());
        vista.getBtnEliminarFactura().setVisible(false);
        vista.getT_productos().setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
    }
    

    public void iniciarControl() {
        vista.getBtnBuscar_enc().addActionListener(buscar -> FiltrarTabla.filtrar(vista.getT_encabezados(), vista.getTxtBuscar_enc(), vista.getCbFactura()));
        vista.getBtnBuscar_pro().addActionListener(buscar -> FiltrarTabla.filtrar(vista.getT_productos(), vista.getTxtBuscar_pro(), vista.getCbxProducto()));
        vista.getBtnCrearFactura().addActionListener(c -> {
            if (vista.getBtnCrearFactura().getText().equals("CREAR FACTURA")) {
                crearFactura();
                CtrlPrincipal.CountRegistros();
            } else if (vista.getBtnCrearFactura().getText().equals("IMPRIMIR FACTURA")) {
                Reporte r = new Reporte();
                r.imprimir_factura(Integer.parseInt(vista.getTxtCodigo().getText()));
            }
            
        });
        vista.getBtnSeleccionarProduto().addActionListener(c -> abrirDialogo("Listado de productos"));
        vista.getBtnReiniciarFactura().addActionListener(c -> reiniciarFactura());
        vista.getBtnBuscar_cli().addActionListener(c -> visualizarClientes(vista.getTxtBuscar_cli().getText(), vista.getCbCliente()));
        vista.getBtnEliminarFactura().addActionListener(c -> ocultarEncabezado(Integer.parseInt(vista.getTxtCodigo().getText())));
        vista.getBtnLimpiar_cli().addActionListener(c-> vista.getTxtBuscar_cli().setText(""));
        vista.getBtnLimpiar_pro().addActionListener(c-> vista.getTxtBuscar_pro().setText(""));
    }
    
    public void crearFactura() {
        if (validado()) {
            int valor = JOptionPane.showConfirmDialog(null, "¿Desea confirmar el registro de esta factura?", null, JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
            if (valor == JOptionPane.YES_OPTION) {
                //Crear encabezado
                mdlencabezado.setIdpersona(vista.getTxtID().getText());
                Date hoy = new Date();
                Long d = hoy.getTime();
                java.sql.Date date = new java.sql.Date(d);
                mdlencabezado.setFecha(date);
                mdlencabezado.setTotal(total);
                mdlencabezado.setEstado("activo");
                mdlencabezado.crearEncabezado();

                int codigo = mdlencabezado.ultimoID();
                //Crear detalle/s
                for (int i = 0; i < vista.getT_detalles().getRowCount(); i++) {
                    mdldetalle.setEncabezadoid(codigo);
                    mdldetalle.setProductoid(vista.getT_detalles().getValueAt(i, 0).toString());
                    mdldetalle.setCantidad(Integer.parseInt(vista.getT_detalles().getValueAt(i, 3).toString()));
                    mdldetalle.setSubtotal(Double.parseDouble(vista.getT_detalles().getValueAt(i, 4).toString()));
                    mdldetalle.crearDetalle();
                    actualizarStock(mdldetalle.getProductoid(), mdldetalle.getCantidad());
                }
                JOptionPane.showMessageDialog(null, "¡Registrado correctamente!");
                reiniciarFactura();
                visualizarFacturas(0);
            }
        }
    }

    public boolean validado() {
        if (vista.getTxtID().getText().isEmpty() || total <= 0) {
            JOptionPane.showMessageDialog(null, "¡Aun hay campos por completar!");
            return false;
        } else {
            return true;
        }
    }
    
    public void visualizarProductos(String idpro) {
        dtm = new DefaultTableModel(null, columnas_productos);
        productos = mdlproducto.listarProductos("");
        vista.getT_productos().setDefaultRenderer(Object.class, new BotonTabla());
        productos.stream().forEach(p -> dtm.addRow(new Object[]{p.getIdproducto(), p.getNombre(), p.getPrecio(),
            p.getStock(), p.getCategoría(),btnAgregar}));
        vista.getT_productos().setModel(dtm);
        vista.getT_productos().setRowHeight(40);
    }
    
    public void visualizarFacturas(int codigo) {
        dtm = new DefaultTableModel(null, columnas_enc);
        encabezados = mdlencabezado.listarEncabezados(codigo);
        encabezados.stream().forEach(e -> dtm.addRow(new Object[]{e.getIdencabezado(),e.getIdpersona(),e.getFecha(),e.getTotal()}));
        vista.getT_encabezados().setModel(dtm);
        vista.getT_encabezados().setRowHeight(30);
    }
    public void visualizarDetalles(int codigo_enc) {
        dtm = new DefaultTableModel(null, columnas_det);
        detalles = mdldetalle.listarDetalles(codigo_enc);
        detalles.stream().forEach(d -> dtm.addRow(new Object[]{d.getDetalleid(),d.getProductoid(),d.getCantidad(),d.getSubtotal(),d.getEncabezadoid()}));
        vista.getT_detalles().setModel(dtm);
        vista.getT_detalles().setRowHeight(20);
    }

    public void visualizarClientes(String txt, JComboBox cb) {
        if (txt.equals("")) {
            JOptionPane.showMessageDialog(null, "¡Introduzca algo antes de buscar!");
        } else {
            String campo="";
            switch (cb.getSelectedIndex()) {
                case 0: campo="idpersona"; break;
                case 1: campo="nombres"; break;
                case 2: campo="apellidos"; break;
                case 3: campo="telefono"; break;
            }
            personas = mdlpersona.listarPersonasLike(txt,campo);
            if (!personas.isEmpty()) {
                vista.getTxtID().setText(personas.get(0).getIdPersona());
                vista.getTxtNombres().setText(personas.get(0).getNombrePersona());
                vista.getTxtApellidos().setText(personas.get(0).getApellidoPersona());
                vista.getTxtTelefono().setText(personas.get(0).getTelefono());
            } else{
                JOptionPane.showMessageDialog(null, "¡Ningun dato coincide con " + vista.getTxtBuscar_cli().getText() + "!");
            }
        }
    }
    
    public void SeleccionarEncabezado(JTable t){
        t.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent me) {
                if (me.getClickCount() == 1) {
                    int codigo_fac = Integer.parseInt(t.getValueAt(t.getSelectedRow(), 0).toString());
                    visualizarDetalles(codigo_fac);
                    encabezados = mdlencabezado.listarEncabezados(codigo_fac);
                    vista.getTxtCodigo().setText(""+encabezados.get(0).getIdencabezado());
                    vista.getTxtFecha().setText(""+encabezados.get(0).getFecha());
                    vista.getTxtTotal().setText(""+encabezados.get(0).getTotal());
                    vista.getTxtID().setText(encabezados.get(0).getIdpersona());
                    //cargar datos de cliente
                    personas = mdlpersona.listarPersonas(vista.getTxtID().getText());
                    vista.getTxtNombres().setText(personas.get(0).getNombrePersona());
                    vista.getTxtApellidos().setText(personas.get(0).getApellidoPersona());
                    vista.getTxtTelefono().setText(personas.get(0).getTelefono());
                    
                    vista.getBtnEliminarFactura().setVisible(true);
                    vista.getBtnCrearFactura().setText("IMPRIMIR FACTURA");
                    vista.getBtnSeleccionarProduto().setVisible(false);
                    vista.getBtnReiniciarFactura().setVisible(false);
                    vista.getJpBuscar_cli().setVisible(false);
                }
            }
        });
    }

    public void ControlarTablas(JTable t, JTable t2){
        t.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent me) {
                if (me.getClickCount() == 1) {
                    String id_pro = t.getValueAt(t.getSelectedRow(), 0).toString();
                    String nombre_pro = t.getValueAt(t.getSelectedRow(), 1).toString();
                    double precio_pro = Double.parseDouble(t.getValueAt(t.getSelectedRow(), 2).toString());
                    int existencias = Integer.parseInt(t.getValueAt(t.getSelectedRow(), 3).toString());
                    int xcolum = t.getColumnModel().getColumnIndexAtX(me.getX());
                    int xrow = me.getY() / t.getRowHeight();
                    if (xcolum <= vista.getT_productos().getColumnCount() && xcolum >= 0 && xrow <= vista.getT_productos().getRowCount() && xrow >= 0) {
                        Object obj = vista.getT_productos().getValueAt(xrow, xcolum);
                        if (obj instanceof JButton) {
                            agregarProducto(id_pro, nombre_pro, precio_pro, existencias);
                        } 
                    }
                }
            }
        });
        t2.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent me) {
                if (me.getClickCount() == 1) {
                    if (vista.getBtnCrearFactura().isVisible()) {
                        String id_pro = t2.getValueAt(t2.getSelectedRow(), 0).toString();
                        double precio_pro = Double.parseDouble(t2.getValueAt(t2.getSelectedRow(), 2).toString());
                        int cantidad = Integer.parseInt(t2.getValueAt(t2.getSelectedRow(), 3).toString());
                        int xcolum = t2.getColumnModel().getColumnIndexAtX(me.getX());
                        int xrow = me.getY() / t2.getRowHeight();
                        if (xcolum <= vista.getT_productos().getColumnCount() && xcolum >= 0 && xrow <= vista.getT_productos().getRowCount() && xrow >= 0) {
                            Object obj = vista.getT_productos().getValueAt(xrow, xcolum);
                            if (obj instanceof JButton) {
                                removerProducto(id_pro, precio_pro, cantidad);
                            }
                        }
                    }
                }
            }
        });
    }

    public void reiniciarFactura() {
        dtm2 = new DefaultTableModel(null, columnasdetalles);
        vista.getT_detalles().setModel(dtm2);
        productos_agregados.clear();
        total = 0.0;
        vista.getTxtCodigo().setText("Autogenerable");
        vista.getTxtFecha().setText("Autogenerable");
        vista.getTxtTotal().setText("$" + total);
        vista.getTxtApellidos().setText("");
        vista.getTxtNombres().setText("");
        vista.getTxtID().setText("");
        vista.getTxtBuscar_cli().setText("");
        vista.getTxtTelefono().setText("");
        vista.getJspDatos().getVerticalScrollBar().setValue(0);

    }

    public void InsertarIcono(JButton bot, String ruta){ //insertar icono en boton:
        bot.setIcon(new javax.swing.ImageIcon(getClass().getResource(ruta)));
    }
    
    public void abrirDialogo(String titulo) {
        vista.getSeleccionar_pro().setLocationRelativeTo(vista);
        vista.getSeleccionar_pro().setSize(606, 515);
        vista.getSeleccionar_pro().setTitle(titulo);
        vista.getSeleccionar_pro().setLocationRelativeTo(null);
        vista.getSeleccionar_pro().setVisible(true);
    }

    public void agregarProducto(String id_pro, String nombre_pro, Double precio_pro, int existencias) {
        if (existencias > 0) {
            boolean repetido = false;
            for (int i = 0; i < productos_agregados.size(); i++) {
                if (productos_agregados.get(i).equals(id_pro)) {
                    repetido = true;
                    break;
                }
            }
            if (repetido) {
                JOptionPane.showMessageDialog(null, "¡Este producto ya fué seleccionado!, Seleccione otro!", null, JOptionPane.WARNING_MESSAGE);
            } else {
                try {
                    int cantidad = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese la cantidad:", 1));
                    if (cantidad > 0 && cantidad <= existencias) {
                        vista.getT_detalles().setDefaultRenderer(Object.class, new BotonTabla());
                        Object detalle[] = {id_pro, nombre_pro, precio_pro, cantidad, precio_pro * cantidad, btnEliminar};
                        dtm2.addRow(detalle);
                        vista.getT_detalles().setModel(dtm2);
                        total += (precio_pro * cantidad);
                        vista.getTxtTotal().setText("$" + total);
                        productos_agregados.add(id_pro);
                        vista.getSeleccionar_pro().setVisible(false);
                    } else {
                        if (cantidad > existencias) {
                            JOptionPane.showMessageDialog(null, "¡Solo existen '" + existencias + "' de este producto!", null, JOptionPane.WARNING_MESSAGE);
                        }
                        if (cantidad <= 0) {
                            JOptionPane.showMessageDialog(null, "¡El mínimo de venta es de 1!", null, JOptionPane.WARNING_MESSAGE);
                        }
                    }
                } catch (NumberFormatException e) {
                }
            }
        } else {
            JOptionPane.showMessageDialog(null, "¡Producto agotado!, Seleccione otro!", null, JOptionPane.WARNING_MESSAGE);
        }
    }

    public void removerProducto(String id_pro, Double precio_pro, int cantidad) {
        int valor = JOptionPane.showConfirmDialog(null, "¿Desea remover este producto?", null, JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
        if (valor == JOptionPane.YES_OPTION) { 
            total -= (precio_pro * cantidad);
            vista.getTxtTotal().setText("$" + total);
            dtm2.removeRow(vista.getT_detalles().getSelectedRow());
            vista.getT_detalles().setModel(dtm2);
            for (int i = 0; i < productos_agregados.size(); i++) {
                if (productos_agregados.get(i).equals(id_pro)) {
                    productos_agregados.remove(id_pro);
                    i = productos_agregados.size();
                }
            }
        }
    }
    
    public void actualizarStock(String id_pro, int cantidad){
        productos = mdlproducto.listarProductos(id_pro);
        int stock = productos.get(0).getStock();
        stock-=cantidad;
        mdlproducto.setIdproducto(id_pro);
        mdlproducto.setStock(stock);
        mdlproducto.updateProductoStock();
    }
    
    public void ocultarEncabezado(int codigo) {
        int valor = JOptionPane.showConfirmDialog(null, "¡Una vez eliminado NO podrá recuperarla! ¿Desea continuar?", "Precaución!", JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE);
        if (valor == JOptionPane.YES_OPTION) {
            encabezados = mdlencabezado.listarEncabezados(codigo);
            mdlencabezado.setIdencabezado(codigo);
            mdlencabezado.setEstado("oculto");
            mdlencabezado.updateEncabezado();
            visualizarFacturas(0);
            reiniciarFactura();
            CtrlPrincipal.CountRegistros();
        }
    }
    
}
