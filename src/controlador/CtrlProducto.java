package controlador;

import controlador.otros.FiltrarTabla;
import controlador.otros.Validar;
import java.awt.HeadlessException;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import modelo.MdlProducto;
import modelo.Producto;
import vista.VisProducto;

public final class CtrlProducto {
    private final MdlProducto modelo;
    private final VisProducto vista;
    private List<Producto> productos= new ArrayList<>();
    DefaultTableModel dtm;
    String[] columnas = {"ID", "nombre", "precio", "stock", "descripción", "categoría"};
    String id;

    public CtrlProducto(MdlProducto modelo, VisProducto vista) {
        this.modelo = modelo;
        this.vista = vista;
        vista.setVisible(true);
        visualizar("");
        seleccionar(vista.getT_productos());
        modo("vista");
    }
    
    public void iniciarCtrlBtn() {
        vista.getBtnBuscar().addActionListener(buscar -> FiltrarTabla.filtrar(vista.getT_productos(),vista.getTxtBuscar(),vista.getCbAtributos()));
        vista.getBtnRemover().addActionListener(remover -> {
            if (modelo.eliminarProducto(vista.getTxtID().getText())) {
                JOptionPane.showMessageDialog(null, "¡Eliminado correctamente!");
            } else {
                JOptionPane.showMessageDialog(null, "¡Error al eliminar!");
            }
            nuevoRegistro();
            visualizar("");
        });
        vista.getBtnRegistrar().addActionListener(registrar -> {
            if (validado()) {
                if (modelo.crearProducto()) {
                    JOptionPane.showMessageDialog(null, "¡Registrado correctamente!");
                } else {
                    JOptionPane.showMessageDialog(null, "¡Error al registrar!");
                }
                nuevoRegistro();
                visualizar("");
            }
        });
        vista.getBtnActualizar().addActionListener(actualizar -> {
            if (validado()) {
                if (modelo.updateProducto()) {
                    JOptionPane.showMessageDialog(null, "¡Actualizado correctamente!");
                } else {
                    JOptionPane.showMessageDialog(null, "¡Error al actualizar!");
                }
                visualizar("");
            }
        });
         vista.getBtnM_vista().addActionListener(a -> modo("vista"));
         vista.getBtnM_registro().addActionListener(b -> modo("registrar"));
         vista.getBtnM_editar().addActionListener(c -> modo("editar"));
    }
    public void iniciarCtrlKey() {
        vista.getTxtID().addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e){
                Validar.numero(vista.getTxtID(), 4); 
            }
        });
        vista.getTxtNombre().addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e){
                Validar.letras_espacios(vista.getTxtNombre(), 30); 
            }
        });
        vista.getTxtPrecio().addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e){
                Validar.dinero(vista.getTxtPrecio(), 7); 
            }
        });
        vista.getTxtStock().addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e){
                Validar.numero(vista.getTxtStock(), 3); 
            }
        });
        vista.getTxtDescripcion().addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e){
                Validar.descripcion(vista.getTxtDescripcion(), 80); 
            }
        });
        vista.getTxtCategoria().addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e){
                Validar.letras(vista.getTxtCategoria(), 20); 
            }
        });
    }

    private void visualizar(String id) {
        dtm = new DefaultTableModel(null, columnas);
        productos = modelo.listarProductos(id);
        productos.stream().forEach(p -> dtm.addRow(new Object[]{p.getIdproducto(), p.getNombre(), p.getPrecio(),
            p.getStock(), p.getDescripcion(), p.getCategoría()}));
        vista.getT_productos().setModel(dtm);
        vista.getT_productos().setRowHeight(30);
    }

    public void seleccionar(JTable t){
        t.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent me) {
                if (me.getClickCount() == 1) {
                    id = t.getValueAt(t.getSelectedRow(), 0).toString();
                    llenarPerfil();
                }
            }
        });
    }
    
    public boolean validado() {
        try {
            if (vista.getTxtID().getText().isEmpty()||vista.getTxtNombre().getText().isEmpty()||vista.getTxtPrecio().getText().isEmpty() 
                    ||vista.getTxtStock().getText().isEmpty() || vista.getTxtDescripcion().getText().isEmpty()|| vista.getTxtCategoria().getText().isEmpty()) {
                JOptionPane.showMessageDialog(null, "¡Aun hay campos por completar!");
                return false;
            } else {
                modelo.setIdproducto(vista.getTxtID().getText());
                modelo.setNombre(vista.getTxtNombre().getText());
                modelo.setPrecio(Double.parseDouble(vista.getTxtPrecio().getText()));
                modelo.setStock(Integer.parseInt(vista.getTxtStock().getText()));
                modelo.setDescripcion(vista.getTxtDescripcion().getText());
                modelo.setCategoría(vista.getTxtCategoria().getText());
                return true;
            }
        } catch (HeadlessException | NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "¡Algunos datos no son correctos!");
            return false;
        }
    }
    
    public void llenarPerfil(){
        productos = modelo.listarProductos(id);
        if (!productos.isEmpty()) {
            vista.getTxtID().setText(productos.get(0).getIdproducto());
            vista.getTxtNombre().setText(productos.get(0).getNombre());
            vista.getTxtPrecio().setText(""+productos.get(0).getPrecio());
            vista.getTxtStock().setText(""+productos.get(0).getStock());
            vista.getTxtDescripcion().setText(productos.get(0).getDescripcion());
            vista.getTxtCategoria().setText(productos.get(0).getCategoría());
        }
    }
    
    public void modo (String modo){
        boolean m;
        if (modo.equals("editar") || modo.equals("vista")  ) {
            llenarPerfil();
            vista.getTxtID().setEditable(false);
            if (m = modo.equals("editar")) {
                vista.getBtnActualizar().setEnabled(true);
                vista.getBtnRegistrar().setEnabled(false);
                vista.getBtnRemover().setEnabled(false);
            } else{
                vista.getBtnActualizar().setEnabled(false);
                vista.getBtnRegistrar().setEnabled(false);
                vista.getBtnRemover().setEnabled(true);
            }
        } else{
            vista.getBtnActualizar().setEnabled(false);
            vista.getBtnRegistrar().setEnabled(true);
            vista.getBtnRemover().setEnabled(false);
            nuevoRegistro();
            m = true;
        }
        vista.getTxtNombre().setEditable(m);
        vista.getTxtPrecio().setEditable(m);
        vista.getTxtStock().setEditable(m);
        vista.getTxtDescripcion().setEditable(m);
        vista.getTxtCategoria().setEditable(m);
    }
    public void nuevoRegistro(){
        vista.getTxtID().setEditable(true);
        vista.getTxtID().setText("");
        vista.getTxtNombre().setText("");
        vista.getTxtPrecio().setText("");
        vista.getTxtStock().setText("");
        vista.getTxtDescripcion().setText("");
        vista.getTxtCategoria().setText("");
    }
}
