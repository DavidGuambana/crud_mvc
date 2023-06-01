package controlador;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import modelo.MdlPersona;
import modelo.Persona;
import vista.VisPersona;

public final class CtrlPersona extends KeyAdapter {
    private final MdlPersona modelo;
    private final VisPersona vista;
    private List<Persona> personas= new ArrayList<>();
    DefaultTableModel dtm;
    String[] columnas = {"ID", "nombres", "apellidos", "edad", "telefono", "sexo", "sueldo", "cupo","email"};
    String id;
    public CtrlPersona(MdlPersona modelo, VisPersona vista) {
        this.modelo = modelo;
        this.vista = vista;
        vista.setVisible(true);
        //vista.setLocationRelativeTo(null);
        visualizar("");
        seleccionar(vista.getT_personas());
        modo("vista");
    }
    
    public void iniciarCtrlBtn() {
        vista.getBtnBuscar().addActionListener(buscar -> visualizar(vista.getTxtBuscar().getText()));
        vista.getBtnRemover().addActionListener(remover -> {
            if (modelo.eliminarPersona(vista.getTxtID().getText())) {
                JOptionPane.showMessageDialog(null, "¡Eliminado correctamente!");
            } else {
                JOptionPane.showMessageDialog(null, "¡Error al eliminar!");
            }
            nuevoRegistro();
            visualizar("");
        });
        vista.getBtnRegistrar().addActionListener(registrar -> {
            setearDatos();
            if (modelo.crearPersona()) {
                JOptionPane.showMessageDialog(null, "¡Registrado correctamente!");
            } else {
                JOptionPane.showMessageDialog(null, "¡Error al registrar!");
            }
            nuevoRegistro();
            visualizar("");
        });
        vista.getBtnActualizar().addActionListener(actualizar -> {
            setearDatos();
            if (modelo.updatePersona()) {
                JOptionPane.showMessageDialog(null, "¡Actualizado correctamente!");
            } else {
                JOptionPane.showMessageDialog(null, "¡Error al actualizar!");
            }
            visualizar("");
        });
        vista.getBtnM_vista().addActionListener(a -> modo("vista"));
        vista.getBtnM_registro().addActionListener(b -> modo("registrar"));
        vista.getBtnM_editar().addActionListener(c -> modo("editar"));
    }
    public void iniciarCtrlKey() {
        vista.getTxtNombres().addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                Validar.letras_espacios(vista.getTxtNombres(), 30);
            }
        });
        vista.getTxtApellidos().addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                Validar.letras_espacios(vista.getTxtApellidos(), 30);
            }
        });
        vista.getTxtID().addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                Validar.numero(vista.getTxtID(), 4);
            }
        });
        vista.getTxtCupo().addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                Validar.numero(vista.getTxtCupo(), 3);
            }
        });
        vista.getTxtSueldo().addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                Validar.dinero(vista.getTxtSueldo(), 7);
            }
        });
        
        vista.getTxtTelefono().addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                Validar.numero(vista.getTxtTelefono(), 10);
            }
        });
        
        vista.getTxtSexo().addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                Validar.letras(vista.getTxtSexo(), 9);
            }
        });
    }

    private void visualizar(String id) {
        dtm = new DefaultTableModel(null, columnas);
        personas = modelo.listarPersonas(id);
        personas.stream().forEach(p -> dtm.addRow(new Object[]{p.getIdPersona(), p.getNombrePersona(), p.getApellidoPersona(),
            p.getEdad(), p.getTelefono(), p.getSexo(), p.getSueldo(), p.getCupo(), p.getCorreo()}));
        vista.getT_personas().setModel(dtm);
        vista.getT_personas().setRowHeight(30);
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
    public void setearDatos() {
        try {
            if (vista.getTxtID().getText().isEmpty()||vista.getTxtNombres().getText().isEmpty()|| vista.getTxtApellidos().getText().isEmpty() || vista.getTxtFechanacimiento().getDate().equals("") || vista.getTxtTelefono().getText().isEmpty()|| vista.getTxtSueldo().getText().isEmpty()||
                    vista.getTxtSueldo().getText().isEmpty() || vista.getTxtCupo().getText().isEmpty()||vista.getTxtEmail().getText().isEmpty()) {
                JOptionPane.showMessageDialog(null, "¡Aun hay campos por completar!");
            } else {
                modelo.setIdPersona(vista.getTxtID().getText());
                modelo.setNombrePersona(vista.getTxtNombres().getText());
                modelo.setApellidoPersona(vista.getTxtApellidos().getText());
                Date fecha = vista.getTxtFechanacimiento().getDate();
                Long d = fecha.getTime();
                java.sql.Date nac = new java.sql.Date(d);
                modelo.setFechanacimineto(nac);
                modelo.setTelefono(vista.getTxtTelefono().getText());
                modelo.setSexo(vista.getTxtSexo().getText());
                modelo.setSueldo(Double.parseDouble(vista.getTxtSueldo().getText()));
                modelo.setCupo(Integer.parseInt(vista.getTxtCupo().getText()));
                //modelo.setFoto((byte)00111001);
                modelo.setCorreo(vista.getTxtEmail().getText());
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "¡Algunos datos no son correctos!");
        }
        
    }
    public void llenarPerfil(){
        personas = modelo.listarPersonas(id);
        if (!personas.isEmpty()) {
            vista.getTxtID().setText(personas.get(0).getIdPersona());
            vista.getTxtNombres().setText(personas.get(0).getNombrePersona());
            vista.getTxtApellidos().setText(personas.get(0).getApellidoPersona());
            vista.getTxtFechanacimiento().setDate(personas.get(0).getFechanacimineto());
            vista.getTxtTelefono().setText(personas.get(0).getTelefono());
            vista.getTxtSexo().setText(personas.get(0).getSexo());
            vista.getTxtSueldo().setText("" + personas.get(0).getSueldo());
            vista.getTxtCupo().setText("" + personas.get(0).getCupo());
            vista.getTxtEmail().setText(personas.get(0).getCorreo());
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
        vista.getTxtNombres().setEditable(m);
        vista.getTxtApellidos().setEditable(m);
        vista.getTxtFechanacimiento().setEnabled(m);
        vista.getTxtTelefono().setEditable(m);
        vista.getTxtSexo().setEditable(m);
        vista.getTxtSueldo().setEditable(m);
        vista.getTxtCupo().setEditable(m);
        vista.getTxtEmail().setEditable(m);
    }
    public void nuevoRegistro(){
        vista.getTxtID().setEditable(true);
        vista.getTxtID().setText("");
        vista.getTxtNombres().setText("");
        vista.getTxtApellidos().setText("");
        vista.getTxtFechanacimiento().setDate(null);
        vista.getTxtTelefono().setText("");
        vista.getTxtSexo().setText("");
        vista.getTxtSueldo().setText("");
        vista.getTxtCupo().setText("");
        vista.getTxtEmail().setText("");
    }
 }

