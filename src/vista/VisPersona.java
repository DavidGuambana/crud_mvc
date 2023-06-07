package vista;

import com.toedter.calendar.JDateChooser;
import java.awt.Cursor;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.JTextField;

public class VisPersona extends javax.swing.JInternalFrame  {

    public VisPersona() {
        initComponents();
    }
    public JButton getBtnActualizar() {
        return btnActualizar;
    }
    public JButton getBtnBuscar() {
        return btnBuscar;
    }
    public JButton getBtnImprimir() {
        return btnImprimir;
    }
    public JButton getBtnRegistrar() {
        return btnRegistrar;
    }
    public JButton getBtnRemover() {
        return btnRemover;
    }
    public JLabel getLblSeleccionarFoto() {
        return lblSeleccionarFoto;
    }
    public JTable getT_personas() {
        return t_personas;
    }
    public JTextField getTxtApellidos() {
        return txtApellidos;
    }
    public JTextField getTxtBuscar() {
        return txtBuscar;
    }
    public JTextField getTxtCupo() {
        return txtCupo;
    }
    public JTextField getTxtEmail() {
        return txtEmail;
    }
    public JDateChooser getTxtFechanacimiento() {
        return txtFechanacimiento;
    }
    public JLabel getTxtFoto() {
        return txtFoto;
    }
    public JTextField getTxtID() {
        return txtID;
    }
    public JTextField getTxtNombres() {
        return txtNombres;
    }
    public JTextField getTxtSexo() {
        return txtSexo;
    }
    public JTextField getTxtTelefono() {
        return txtTelefono;
    }
    public JTextField getTxtSueldo() {
        return txtSueldo;
    }
    public JButton getBtnM_editar() {
        return btnM_editar;
    }
    public JButton getBtnM_registro() {
        return btnM_registro;
    }
    public JButton getBtnM_vista() {
        return btnM_vista;
    }

    public JComboBox<String> getCbAtributos() {
        return cbAtributos;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtBuscar = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        btnBuscar = new javax.swing.JButton();
        cbAtributos = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        t_personas = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jspDatos = new javax.swing.JScrollPane();
        jpDatos = new javax.swing.JPanel();
        txtFoto = new javax.swing.JLabel();
        txtID = new javax.swing.JTextField();
        txtNombres = new javax.swing.JTextField();
        txtApellidos = new javax.swing.JTextField();
        txtFechanacimiento = new com.toedter.calendar.JDateChooser();
        lblSeleccionarFoto = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        txtTelefono = new javax.swing.JTextField();
        txtSexo = new javax.swing.JTextField();
        txtEmail = new javax.swing.JTextField();
        txtCupo = new javax.swing.JTextField();
        txtSueldo = new javax.swing.JTextField();
        btnM_vista = new javax.swing.JButton();
        btnM_registro = new javax.swing.JButton();
        btnM_editar = new javax.swing.JButton();
        btnImprimir = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        btnRegistrar = new javax.swing.JButton();
        btnActualizar = new javax.swing.JButton();
        btnRemover = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();

        setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 51, 51)));
        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setPreferredSize(new java.awt.Dimension(918, 503));

        jPanel2.setBackground(new java.awt.Color(51, 51, 51));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Filtrar");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 10, 90, 30));

        txtBuscar.setBackground(new java.awt.Color(51, 51, 51));
        txtBuscar.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtBuscar.setForeground(new java.awt.Color(255, 255, 255));
        txtBuscar.setBorder(null);
        txtBuscar.setCaretColor(new java.awt.Color(255, 255, 255));
        txtBuscar.setDisabledTextColor(new java.awt.Color(255, 255, 255));
        txtBuscar.setOpaque(true);
        txtBuscar.setSelectedTextColor(new java.awt.Color(0, 0, 0));
        txtBuscar.setSelectionColor(new java.awt.Color(0, 204, 255));
        jPanel2.add(txtBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 10, 360, 30));

        jSeparator1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 255, 255)));
        jPanel2.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 10, 380, 30));

        btnBuscar.setBackground(new java.awt.Color(0, 204, 255));
        btnBuscar.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnBuscar.setForeground(new java.awt.Color(255, 255, 255));
        btnBuscar.setText("Buscar");
        btnBuscar.setBorder(null);
        btnBuscar.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        btnBuscar.setOpaque(true);
        jPanel2.add(btnBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 10, 120, 30));

        cbAtributos.setBackground(new java.awt.Color(0, 204, 255));
        cbAtributos.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        cbAtributos.setForeground(new java.awt.Color(255, 255, 255));
        cbAtributos.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "ID", "Nombres", "Apellidos", "Edad", "Teléfono", "Sexo", "Sueldo", "Cupo", "Email" }));
        cbAtributos.setBorder(null);
        cbAtributos.setOpaque(true);
        jPanel2.add(cbAtributos, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 10, 170, 30));

        t_personas = new javax.swing.JTable(){
            public boolean isCellEditable(int rowIndex, int colIndex){
                return false;
            }
        };
        t_personas.setBackground(new java.awt.Color(51, 51, 51));
        t_personas.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 204, 255)));
        t_personas.setFont(new java.awt.Font("Yu Gothic UI", 1, 12)); // NOI18N
        t_personas.setForeground(new java.awt.Color(255, 255, 255));
        t_personas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        t_personas.setOpaque(false);
        t_personas.setSelectionBackground(new java.awt.Color(102, 255, 102));
        t_personas.getTableHeader().setResizingAllowed(false);
        t_personas.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(t_personas);

        jLabel2.setBackground(new java.awt.Color(0, 153, 204));
        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("REGISTROS DE PERSONAS");
        jLabel2.setOpaque(true);

        jpDatos.setBackground(new java.awt.Color(255, 255, 255));
        jpDatos.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));

        txtFoto.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtFoto.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 1, true));

        txtID.setEditable(false);
        txtID.setBackground(new java.awt.Color(255, 255, 255));
        txtID.setFont(new java.awt.Font("Pristina", 1, 20)); // NOI18N
        txtID.setForeground(new java.awt.Color(102, 204, 255));
        txtID.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtID.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Identificador:", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.ABOVE_TOP, new java.awt.Font("Pristina", 0, 18))); // NOI18N

        txtNombres.setEditable(false);
        txtNombres.setBackground(new java.awt.Color(255, 255, 255));
        txtNombres.setFont(new java.awt.Font("Pristina", 1, 20)); // NOI18N
        txtNombres.setForeground(new java.awt.Color(102, 204, 255));
        txtNombres.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtNombres.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Nombres:", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.ABOVE_TOP, new java.awt.Font("Pristina", 0, 18))); // NOI18N

        txtApellidos.setEditable(false);
        txtApellidos.setBackground(new java.awt.Color(255, 255, 255));
        txtApellidos.setFont(new java.awt.Font("Pristina", 1, 20)); // NOI18N
        txtApellidos.setForeground(new java.awt.Color(102, 204, 255));
        txtApellidos.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtApellidos.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Apellidos:", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.ABOVE_TOP, new java.awt.Font("Pristina", 0, 18))); // NOI18N

        txtFechanacimiento.setBackground(new java.awt.Color(255, 255, 255));
        txtFechanacimiento.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Fecha de nacimiento:", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Pristina", 0, 18))); // NOI18N
        txtFechanacimiento.setForeground(new java.awt.Color(102, 204, 255));
        txtFechanacimiento.setDateFormatString("yyyy-MM-dd");
        txtFechanacimiento.setEnabled(false);
        txtFechanacimiento.setFont(new java.awt.Font("Pristina", 1, 20)); // NOI18N

        lblSeleccionarFoto.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblSeleccionarFoto.setForeground(new java.awt.Color(102, 204, 255));
        lblSeleccionarFoto.setText("Seleccionar foto");
        lblSeleccionarFoto.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        jSeparator2.setBackground(new java.awt.Color(0, 204, 0));
        jSeparator2.setForeground(new java.awt.Color(0, 204, 102));

        txtTelefono.setEditable(false);
        txtTelefono.setBackground(new java.awt.Color(255, 255, 255));
        txtTelefono.setFont(new java.awt.Font("Pristina", 1, 20)); // NOI18N
        txtTelefono.setForeground(new java.awt.Color(102, 204, 255));
        txtTelefono.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtTelefono.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Teléfono:", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.ABOVE_TOP, new java.awt.Font("Pristina", 0, 18))); // NOI18N

        txtSexo.setEditable(false);
        txtSexo.setBackground(new java.awt.Color(255, 255, 255));
        txtSexo.setFont(new java.awt.Font("Pristina", 1, 20)); // NOI18N
        txtSexo.setForeground(new java.awt.Color(102, 204, 255));
        txtSexo.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtSexo.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Sexo:", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.ABOVE_TOP, new java.awt.Font("Pristina", 0, 18))); // NOI18N

        txtEmail.setEditable(false);
        txtEmail.setBackground(new java.awt.Color(255, 255, 255));
        txtEmail.setFont(new java.awt.Font("Pristina", 1, 20)); // NOI18N
        txtEmail.setForeground(new java.awt.Color(102, 204, 255));
        txtEmail.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtEmail.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Email:", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.ABOVE_TOP, new java.awt.Font("Pristina", 0, 18))); // NOI18N

        txtCupo.setEditable(false);
        txtCupo.setBackground(new java.awt.Color(255, 255, 255));
        txtCupo.setFont(new java.awt.Font("Pristina", 1, 20)); // NOI18N
        txtCupo.setForeground(new java.awt.Color(102, 204, 255));
        txtCupo.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtCupo.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Cupo:", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.ABOVE_TOP, new java.awt.Font("Pristina", 0, 18))); // NOI18N

        txtSueldo.setEditable(false);
        txtSueldo.setBackground(new java.awt.Color(255, 255, 255));
        txtSueldo.setFont(new java.awt.Font("Pristina", 1, 20)); // NOI18N
        txtSueldo.setForeground(new java.awt.Color(102, 204, 255));
        txtSueldo.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtSueldo.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Sueldo:", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.ABOVE_TOP, new java.awt.Font("Pristina", 0, 18))); // NOI18N

        btnM_vista.setBackground(new java.awt.Color(255, 0, 0));
        btnM_vista.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnM_vista.setForeground(new java.awt.Color(255, 255, 255));
        btnM_vista.setText("Modo vista");
        btnM_vista.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        btnM_registro.setBackground(new java.awt.Color(0, 153, 204));
        btnM_registro.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnM_registro.setForeground(new java.awt.Color(255, 255, 255));
        btnM_registro.setText("Nuevo registro");
        btnM_registro.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        btnM_editar.setBackground(new java.awt.Color(0, 204, 51));
        btnM_editar.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnM_editar.setForeground(new java.awt.Color(255, 255, 255));
        btnM_editar.setText("Modo editar");
        btnM_editar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        javax.swing.GroupLayout jpDatosLayout = new javax.swing.GroupLayout(jpDatos);
        jpDatos.setLayout(jpDatosLayout);
        jpDatosLayout.setHorizontalGroup(
            jpDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpDatosLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jpDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtNombres)
                    .addComponent(txtApellidos, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jpDatosLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(txtFechanacimiento, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jpDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jSeparator2)
                    .addComponent(lblSeleccionarFoto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtFoto, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtID))
                .addGap(20, 20, 20))
            .addGroup(jpDatosLayout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(jpDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 298, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jpDatosLayout.createSequentialGroup()
                        .addGroup(jpDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtSueldo, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jpDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtCupo, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtSexo, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(38, Short.MAX_VALUE))
            .addGroup(jpDatosLayout.createSequentialGroup()
                .addComponent(btnM_vista, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(btnM_registro)
                .addGap(0, 0, 0)
                .addComponent(btnM_editar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jpDatosLayout.setVerticalGroup(
            jpDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpDatosLayout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addGroup(jpDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnM_vista, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnM_registro, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnM_editar, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(jpDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpDatosLayout.createSequentialGroup()
                        .addComponent(lblSeleccionarFoto)
                        .addGap(0, 0, 0)
                        .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtFoto, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jpDatosLayout.createSequentialGroup()
                        .addComponent(txtNombres, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20)
                        .addComponent(txtApellidos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txtFechanacimiento, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jpDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtSexo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22)
                .addGroup(jpDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCupo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtSueldo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jspDatos.setViewportView(jpDatos);

        btnImprimir.setBackground(new java.awt.Color(51, 51, 51));
        btnImprimir.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        btnImprimir.setForeground(new java.awt.Color(255, 255, 255));
        btnImprimir.setText("Imprimir");
        btnImprimir.setBorder(null);
        btnImprimir.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));

        btnRegistrar.setBackground(new java.awt.Color(0, 153, 204));
        btnRegistrar.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnRegistrar.setForeground(new java.awt.Color(255, 255, 255));
        btnRegistrar.setText("Registrar");
        btnRegistrar.setBorder(null);
        btnRegistrar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        btnActualizar.setBackground(new java.awt.Color(0, 204, 51));
        btnActualizar.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnActualizar.setForeground(new java.awt.Color(255, 255, 255));
        btnActualizar.setText("Actualizar");
        btnActualizar.setBorder(null);
        btnActualizar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        btnRemover.setBackground(new java.awt.Color(255, 0, 0));
        btnRemover.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnRemover.setForeground(new java.awt.Color(255, 255, 255));
        btnRemover.setText("Remover");
        btnRemover.setBorder(null);
        btnRemover.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnRemover, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnActualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btnRegistrar, javax.swing.GroupLayout.PREFERRED_SIZE, 376, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(12, Short.MAX_VALUE)
                .addComponent(btnRegistrar, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnActualizar, javax.swing.GroupLayout.DEFAULT_SIZE, 34, Short.MAX_VALUE)
                    .addComponent(btnRemover, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(14, 14, 14))
        );

        jPanel3.setBackground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 916, Short.MAX_VALUE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1)
                            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(0, 0, 0)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnImprimir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jspDatos))))
                .addGap(0, 0, 0))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnImprimir, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(jspDatos, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 282, Short.MAX_VALUE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        jspDatos.getVerticalScrollBar().setUnitIncrement(16);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnActualizar;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnImprimir;
    private javax.swing.JButton btnM_editar;
    private javax.swing.JButton btnM_registro;
    private javax.swing.JButton btnM_vista;
    private javax.swing.JButton btnRegistrar;
    private javax.swing.JButton btnRemover;
    private javax.swing.JComboBox<String> cbAtributos;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JPanel jpDatos;
    private javax.swing.JScrollPane jspDatos;
    private javax.swing.JLabel lblSeleccionarFoto;
    private javax.swing.JTable t_personas;
    private javax.swing.JTextField txtApellidos;
    private javax.swing.JTextField txtBuscar;
    private javax.swing.JTextField txtCupo;
    private javax.swing.JTextField txtEmail;
    private com.toedter.calendar.JDateChooser txtFechanacimiento;
    private javax.swing.JLabel txtFoto;
    private javax.swing.JTextField txtID;
    private javax.swing.JTextField txtNombres;
    private javax.swing.JTextField txtSexo;
    private javax.swing.JTextField txtSueldo;
    private javax.swing.JTextField txtTelefono;
    // End of variables declaration//GEN-END:variables
}
