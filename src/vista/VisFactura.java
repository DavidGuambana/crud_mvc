package vista;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JSeparator;
import javax.swing.JTable;
import javax.swing.JTextField;

public class VisFactura extends javax.swing.JInternalFrame {

    public VisFactura() {
        initComponents();
    }

    public JButton getBtnBuscar_cli() {
        return btnBuscar_cli;
    }

    public void setBtnBuscar_cli(JButton btnBuscar_cli) {
        this.btnBuscar_cli = btnBuscar_cli;
    }

    public JButton getBtnBuscar_pro() {
        return btnBuscar_pro;
    }

    public void setBtnBuscar_pro(JButton btnBuscar_pro) {
        this.btnBuscar_pro = btnBuscar_pro;
    }

    public JButton getBtnCrearFactura() {
        return btnCrearFactura;
    }

    public void setBtnCrearFactura(JButton btnCrearFactura) {
        this.btnCrearFactura = btnCrearFactura;
    }

    public JButton getBtnLimpiar_cli() {
        return btnLimpiar_cli;
    }

    public void setBtnLimpiar_cli(JButton btnLimpiar_cli) {
        this.btnLimpiar_cli = btnLimpiar_cli;
    }

    public JButton getBtnLimpiar_pro() {
        return btnLimpiar_pro;
    }

    public void setBtnLimpiar_pro(JButton btnLimpiar_pro) {
        this.btnLimpiar_pro = btnLimpiar_pro;
    }

    public JButton getBtnSeleccionarProduto() {
        return btnSeleccionarProduto;
    }

    public void setBtnSeleccionarProduto(JButton btnSeleccionarProduto) {
        this.btnSeleccionarProduto = btnSeleccionarProduto;
    }

    public JComboBox<String> getCbCliente() {
        return cbCliente;
    }

    public void setCbCliente(JComboBox<String> cbCliente) {
        this.cbCliente = cbCliente;
    }

    public JComboBox<String> getCbxProducto() {
        return cbxProducto;
    }

    public void setCbxProducto(JComboBox<String> cbxProducto) {
        this.cbxProducto = cbxProducto;
    }

    public JDialog getSeleccionar_pro() {
        return seleccionar_pro;
    }

    public void setSeleccionar_pro(JDialog seleccionar_pro) {
        this.seleccionar_pro = seleccionar_pro;
    }

    public JSeparator getSep_cli() {
        return sep_cli;
    }

    public void setSep_cli(JSeparator sep_cli) {
        this.sep_cli = sep_cli;
    }

    public JSeparator getSep_pro() {
        return sep_pro;
    }

    public void setSep_pro(JSeparator sep_pro) {
        this.sep_pro = sep_pro;
    }

    public JTable getT_detalles() {
        return t_detalles;
    }

    public void setT_detalles(JTable t_detalles) {
        this.t_detalles = t_detalles;
    }

    public JTable getT_productos() {
        return t_productos;
    }

    public void setT_productos(JTable t_productos) {
        this.t_productos = t_productos;
    }

    public JTextField getTxtApellidos() {
        return txtApellidos;
    }

    public void setTxtApellidos(JTextField txtApellidos) {
        this.txtApellidos = txtApellidos;
    }

    public JTextField getTxtBuscar_cli() {
        return txtBuscar_cli;
    }

    public void setTxtBuscar_cli(JTextField txtBuscar_cli) {
        this.txtBuscar_cli = txtBuscar_cli;
    }

    public JPanel getJpBuscar_cli() {
        return jpBuscar_cli;
    }

    public JTextField getTxtBuscar_pro() {
        return txtBuscar_pro;
    }

    public void setTxtBuscar_pro(JTextField txtBuscar_pro) {
        this.txtBuscar_pro = txtBuscar_pro;
    }

    public JTextField getTxtCodigo() {
        return txtCodigo;
    }

    public void setTxtCodigo(JTextField txtCodigo) {
        this.txtCodigo = txtCodigo;
    }

    public JTextField getTxtFecha() {
        return txtFecha;
    }

    public void setTxtFecha(JTextField txtFecha) {
        this.txtFecha = txtFecha;
    }

    public JTextField getTxtID() {
        return txtID;
    }

    public void setTxtID(JTextField txtID) {
        this.txtID = txtID;
    }

    public JTextField getTxtNombres() {
        return txtNombres;
    }

    public void setTxtNombres(JTextField txtNombres) {
        this.txtNombres = txtNombres;
    }

    public JTextField getTxtTelefono() {
        return txtTelefono;
    }

    public void setTxtTelefono(JTextField txtTelefono) {
        this.txtTelefono = txtTelefono;
    }

    public JTextField getTxtTotal() {
        return txtTotal;
    }

    public void setTxtTotal(JTextField txtTotal) {
        this.txtTotal = txtTotal;
    }

    public JButton getBtnReiniciarFactura() {
        return btnReiniciarFactura;
    }

    public JScrollPane getJspDatos() {
        return jspDatos;
    }

    public JButton getBtnBuscar_enc() {
        return btnBuscar_enc;
    }

    public JButton getBtnEliminarFactura() {
        return btnEliminarFactura;
    }

    public JTable getT_encabezados() {
        return t_encabezados;
    }

    public JTextField getTxtBuscar_enc() {
        return txtBuscar_enc;
    }

    public JComboBox<String> getCbFactura() {
        return cbFactura;
    }
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        seleccionar_pro = new javax.swing.JDialog();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        t_productos = new javax.swing.JTable();
        jLabel4 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        cbxProducto = new javax.swing.JComboBox<>();
        txtBuscar_pro = new javax.swing.JTextField();
        btnBuscar_pro = new javax.swing.JButton();
        btnLimpiar_pro = new javax.swing.JButton();
        sep_pro = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        jspDatos = new javax.swing.JScrollPane();
        jpFacturacion = new javax.swing.JPanel();
        jpBuscar_cli = new javax.swing.JPanel();
        cbCliente = new javax.swing.JComboBox<>();
        txtBuscar_cli = new javax.swing.JTextField();
        btnBuscar_cli = new javax.swing.JButton();
        btnLimpiar_cli = new javax.swing.JButton();
        sep_cli = new javax.swing.JSeparator();
        jSeparator4 = new javax.swing.JSeparator();
        jLabel1 = new javax.swing.JLabel();
        txtID = new javax.swing.JTextField();
        jScrollPane3 = new javax.swing.JScrollPane();
        t_detalles = new javax.swing.JTable();
        jLabel7 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        txtNombres = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        txtApellidos = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        txtTelefono = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        btnSeleccionarProduto = new javax.swing.JButton();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtCodigo = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        txtFecha = new javax.swing.JTextField();
        txtTotal = new javax.swing.JTextField();
        btnCrearFactura = new javax.swing.JButton();
        jLabel19 = new javax.swing.JLabel();
        btnReiniciarFactura = new javax.swing.JButton();
        btnEliminarFactura = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        t_encabezados = new javax.swing.JTable();
        btnBuscar_enc = new javax.swing.JButton();
        txtBuscar_enc = new javax.swing.JTextField();
        cbFactura = new javax.swing.JComboBox<>();

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        t_productos = new javax.swing.JTable(){
            public boolean isCellEditable(int rowIndex, int colIndex){
                return false;
            }
        };
        t_productos.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 204, 255)));
        t_productos.setFont(new java.awt.Font("Yu Gothic UI", 1, 12)); // NOI18N
        t_productos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        t_productos.setOpaque(false);
        t_productos.setSelectionBackground(new java.awt.Color(102, 255, 102));
        t_productos.getTableHeader().setResizingAllowed(false);
        t_productos.getTableHeader().setReorderingAllowed(false);
        jScrollPane2.setViewportView(t_productos);

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel4.setText("Listado de productos");

        jPanel4.setBackground(new java.awt.Color(239, 239, 239));
        jPanel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));

        cbxProducto.setBackground(new java.awt.Color(239, 239, 239));
        cbxProducto.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "ID producto", "Nombre", "Precio", "Stock", "Categoria" }));
        cbxProducto.setBorder(null);

        txtBuscar_pro.setBackground(new java.awt.Color(239, 239, 239));
        txtBuscar_pro.setBorder(null);

        btnBuscar_pro.setBackground(new java.awt.Color(239, 239, 239));
        btnBuscar_pro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vista/iconos/lupa (1).png"))); // NOI18N
        btnBuscar_pro.setBorder(null);

        btnLimpiar_pro.setBackground(new java.awt.Color(239, 239, 239));
        btnLimpiar_pro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vista/iconos/marca-x.png"))); // NOI18N
        btnLimpiar_pro.setBorder(null);

        sep_pro.setOrientation(javax.swing.SwingConstants.VERTICAL);
        sep_pro.setToolTipText("");

        jSeparator3.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jSeparator3.setToolTipText("");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(cbxProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 12, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtBuscar_pro, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnLimpiar_pro, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(sep_pro, javax.swing.GroupLayout.PREFERRED_SIZE, 12, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnBuscar_pro, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnLimpiar_pro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jSeparator3)
                    .addComponent(sep_pro)
                    .addComponent(txtBuscar_pro)
                    .addComponent(btnBuscar_pro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cbxProducto, javax.swing.GroupLayout.DEFAULT_SIZE, 26, Short.MAX_VALUE))
                .addGap(8, 8, 8))
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane2)
                    .addComponent(jLabel4)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 20, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel4)
                .addGap(20, 20, 20)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 343, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20))
        );

        javax.swing.GroupLayout seleccionar_proLayout = new javax.swing.GroupLayout(seleccionar_pro.getContentPane());
        seleccionar_pro.getContentPane().setLayout(seleccionar_proLayout);
        seleccionar_proLayout.setHorizontalGroup(
            seleccionar_proLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        seleccionar_proLayout.setVerticalGroup(
            seleccionar_proLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 102, 153)));
        setClosable(true);
        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setMinimumSize(new java.awt.Dimension(600, 956));

        jspDatos.setPreferredSize(new java.awt.Dimension(912, 521));

        jpFacturacion.setBackground(new java.awt.Color(255, 255, 255));
        jpFacturacion.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        jpFacturacion.setPreferredSize(new java.awt.Dimension(902, 833));

        jpBuscar_cli.setBackground(new java.awt.Color(239, 239, 239));
        jpBuscar_cli.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));

        cbCliente.setBackground(new java.awt.Color(239, 239, 239));
        cbCliente.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "ID cliente", "Nombres", "Apellidos", "Teléfono" }));
        cbCliente.setBorder(null);

        txtBuscar_cli.setBackground(new java.awt.Color(239, 239, 239));
        txtBuscar_cli.setBorder(null);

        btnBuscar_cli.setBackground(new java.awt.Color(239, 239, 239));
        btnBuscar_cli.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vista/iconos/lupa (1).png"))); // NOI18N
        btnBuscar_cli.setBorder(null);

        btnLimpiar_cli.setBackground(new java.awt.Color(239, 239, 239));
        btnLimpiar_cli.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vista/iconos/marca-x.png"))); // NOI18N
        btnLimpiar_cli.setBorder(null);

        sep_cli.setOrientation(javax.swing.SwingConstants.VERTICAL);
        sep_cli.setToolTipText("");

        jSeparator4.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jSeparator4.setToolTipText("");

        javax.swing.GroupLayout jpBuscar_cliLayout = new javax.swing.GroupLayout(jpBuscar_cli);
        jpBuscar_cli.setLayout(jpBuscar_cliLayout);
        jpBuscar_cliLayout.setHorizontalGroup(
            jpBuscar_cliLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpBuscar_cliLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(cbCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 12, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtBuscar_cli, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(btnLimpiar_cli, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(sep_cli, javax.swing.GroupLayout.PREFERRED_SIZE, 12, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnBuscar_cli, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15))
        );
        jpBuscar_cliLayout.setVerticalGroup(
            jpBuscar_cliLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpBuscar_cliLayout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addGroup(jpBuscar_cliLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnLimpiar_cli, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jSeparator4)
                    .addComponent(sep_cli)
                    .addComponent(txtBuscar_cli)
                    .addComponent(btnBuscar_cli, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cbCliente, javax.swing.GroupLayout.DEFAULT_SIZE, 26, Short.MAX_VALUE))
                .addGap(8, 8, 8))
        );

        jLabel1.setText("ID cliente:");

        txtID.setEditable(false);
        txtID.setBackground(new java.awt.Color(255, 255, 255));
        txtID.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N

        t_detalles = new javax.swing.JTable(){
            public boolean isCellEditable(int rowIndex, int colIndex){
                return false;
            }
        };
        t_detalles.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 204, 255)));
        t_detalles.setFont(new java.awt.Font("Yu Gothic UI", 1, 12)); // NOI18N
        t_detalles.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        t_detalles.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        t_detalles.setOpaque(false);
        t_detalles.setSelectionBackground(new java.awt.Color(0, 102, 204));
        t_detalles.setSelectionForeground(new java.awt.Color(255, 255, 255));
        t_detalles.getTableHeader().setResizingAllowed(false);
        t_detalles.getTableHeader().setReorderingAllowed(false);
        jScrollPane3.setViewportView(t_detalles);

        jLabel7.setBackground(new java.awt.Color(255, 255, 255));
        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 102, 153));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("FACTURA");
        jLabel7.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 102, 153)));
        jLabel7.setOpaque(true);

        jLabel9.setBackground(new java.awt.Color(0, 102, 153));
        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("DETALLES");
        jLabel9.setOpaque(true);

        txtNombres.setEditable(false);
        txtNombres.setBackground(new java.awt.Color(255, 255, 255));

        jLabel11.setText("Nombres:");

        txtApellidos.setEditable(false);
        txtApellidos.setBackground(new java.awt.Color(255, 255, 255));

        jLabel12.setText("Apellidos:");

        txtTelefono.setEditable(false);
        txtTelefono.setBackground(new java.awt.Color(255, 255, 255));

        jLabel13.setText("Teléfono:");

        btnSeleccionarProduto.setBackground(new java.awt.Color(51, 255, 51));
        btnSeleccionarProduto.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnSeleccionarProduto.setText("+ Seleccionar producto");
        btnSeleccionarProduto.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        jLabel15.setBackground(new java.awt.Color(0, 102, 153));
        jLabel15.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel15.setText("ENCABEZADO");
        jLabel15.setOpaque(true);

        jLabel16.setBackground(new java.awt.Color(255, 255, 255));
        jLabel16.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(0, 102, 153));
        jLabel16.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel16.setText("Datos del cliente:");
        jLabel16.setOpaque(true);

        jLabel3.setText("Código factura:");

        txtCodigo.setEditable(false);
        txtCodigo.setBackground(new java.awt.Color(255, 255, 255));
        txtCodigo.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        txtCodigo.setText("Autogenerable");

        jLabel17.setText("Fecha:");

        txtFecha.setEditable(false);
        txtFecha.setBackground(new java.awt.Color(255, 255, 255));
        txtFecha.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        txtFecha.setText("Autogenerable");

        txtTotal.setEditable(false);
        txtTotal.setBackground(new java.awt.Color(0, 153, 255));
        txtTotal.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        txtTotal.setForeground(new java.awt.Color(255, 255, 255));
        txtTotal.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtTotal.setText("$ 0.00");

        btnCrearFactura.setBackground(new java.awt.Color(0, 204, 102));
        btnCrearFactura.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnCrearFactura.setForeground(new java.awt.Color(255, 255, 255));
        btnCrearFactura.setText("CREAR FACTURA");
        btnCrearFactura.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        jLabel19.setBackground(new java.awt.Color(255, 255, 255));
        jLabel19.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(0, 153, 255));
        jLabel19.setText("Total:");

        btnReiniciarFactura.setBackground(new java.awt.Color(255, 51, 0));
        btnReiniciarFactura.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnReiniciarFactura.setForeground(new java.awt.Color(255, 255, 255));
        btnReiniciarFactura.setText("¡Volver a empezar!");
        btnReiniciarFactura.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnReiniciarFactura.setOpaque(true);

        btnEliminarFactura.setBackground(new java.awt.Color(0, 0, 0));
        btnEliminarFactura.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnEliminarFactura.setForeground(new java.awt.Color(255, 255, 255));
        btnEliminarFactura.setText("ELIMINAR FACTURA");
        btnEliminarFactura.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 102, 153), 2));

        jLabel8.setBackground(new java.awt.Color(255, 255, 255));
        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 102, 153));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("Facturas disponibles");
        jLabel8.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 102, 153)));
        jLabel8.setOpaque(true);

        t_encabezados = new javax.swing.JTable(){
            public boolean isCellEditable(int rowIndex, int colIndex){
                return false;
            }
        };
        t_encabezados.setFont(new java.awt.Font("Yu Gothic UI", 0, 10)); // NOI18N
        t_encabezados.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        t_encabezados.setOpaque(false);
        t_encabezados.setSelectionBackground(new java.awt.Color(0, 102, 204));
        t_encabezados.setSelectionForeground(new java.awt.Color(255, 255, 255));
        t_encabezados.getTableHeader().setResizingAllowed(false);
        t_encabezados.getTableHeader().setReorderingAllowed(false);
        jScrollPane4.setViewportView(t_encabezados);

        btnBuscar_enc.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vista/iconos/lupa (1).png"))); // NOI18N
        btnBuscar_enc.setBorder(null);

        txtBuscar_enc.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));

        cbFactura.setBackground(new java.awt.Color(239, 239, 239));
        cbFactura.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Código", "Cliente", "Fecha", "Total" }));
        cbFactura.setBorder(null);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(txtBuscar_enc)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnBuscar_enc, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(cbFactura, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addGap(22, 22, 22))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(cbFactura)
                .addGap(4, 4, 4)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtBuscar_enc)
                    .addComponent(btnBuscar_enc, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jpFacturacionLayout = new javax.swing.GroupLayout(jpFacturacion);
        jpFacturacion.setLayout(jpFacturacionLayout);
        jpFacturacionLayout.setHorizontalGroup(
            jpFacturacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpFacturacionLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(jpFacturacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jpFacturacionLayout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(104, 104, 104)
                        .addGroup(jpFacturacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnCrearFactura, javax.swing.GroupLayout.DEFAULT_SIZE, 170, Short.MAX_VALUE)
                            .addComponent(btnEliminarFactura, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 170, Short.MAX_VALUE))
                        .addGap(154, 154, 154)
                        .addGroup(jpFacturacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnSeleccionarProduto, javax.swing.GroupLayout.DEFAULT_SIZE, 193, Short.MAX_VALUE)
                            .addComponent(btnReiniciarFactura, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jpFacturacionLayout.createSequentialGroup()
                        .addGroup(jpFacturacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jpFacturacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabel15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jpFacturacionLayout.createSequentialGroup()
                                    .addGap(55, 55, 55)
                                    .addGroup(jpFacturacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jpFacturacionLayout.createSequentialGroup()
                                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(12, 12, 12)
                                            .addComponent(txtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 263, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(jpFacturacionLayout.createSequentialGroup()
                                            .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(12, 12, 12)
                                            .addComponent(txtFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 263, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addComponent(jLabel16, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jpBuscar_cli, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(jpFacturacionLayout.createSequentialGroup()
                                .addGap(55, 55, 55)
                                .addGroup(jpFacturacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(jpFacturacionLayout.createSequentialGroup()
                                        .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(12, 12, 12)
                                        .addComponent(txtTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 263, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jpFacturacionLayout.createSequentialGroup()
                                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(12, 12, 12)
                                        .addComponent(txtID, javax.swing.GroupLayout.PREFERRED_SIZE, 263, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jpFacturacionLayout.createSequentialGroup()
                                        .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(12, 12, 12)
                                        .addComponent(txtNombres, javax.swing.GroupLayout.PREFERRED_SIZE, 263, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jpFacturacionLayout.createSequentialGroup()
                                        .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(12, 12, 12)
                                        .addComponent(txtApellidos, javax.swing.GroupLayout.PREFERRED_SIZE, 263, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addGap(23, 23, 23)
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(28, 28, 28))
        );
        jpFacturacionLayout.setVerticalGroup(
            jpFacturacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpFacturacionLayout.createSequentialGroup()
                .addGroup(jpFacturacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpFacturacionLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jpFacturacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jpFacturacionLayout.createSequentialGroup()
                                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(20, 20, 20)
                                .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addGroup(jpFacturacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(12, 12, 12)
                                .addGroup(jpFacturacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(62, 62, 62)
                                .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(12, 12, 12)
                                .addComponent(jpBuscar_cli, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addGroup(jpFacturacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtID, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(8, 8, 8)
                                .addGroup(jpFacturacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtNombres, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(8, 8, 8)
                                .addGroup(jpFacturacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtApellidos, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(8, 8, 8)
                                .addGroup(jpFacturacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(35, 35, 35)
                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jpFacturacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jpFacturacionLayout.createSequentialGroup()
                                .addGap(2, 2, 2)
                                .addComponent(btnSeleccionarProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jpFacturacionLayout.createSequentialGroup()
                                .addGap(50, 50, 50)
                                .addGroup(jpFacturacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txtTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(26, 26, 26))
                    .addGroup(jpFacturacionLayout.createSequentialGroup()
                        .addGap(712, 712, 712)
                        .addComponent(btnCrearFactura, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(9, 9, 9)
                        .addGroup(jpFacturacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnEliminarFactura, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnReiniciarFactura, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(36, 36, 36))
        );

        jspDatos.setViewportView(jpFacturacion);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jspDatos, javax.swing.GroupLayout.DEFAULT_SIZE, 918, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jspDatos, javax.swing.GroupLayout.PREFERRED_SIZE, 478, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        jspDatos.getVerticalScrollBar().setUnitIncrement(16);

        pack();
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscar_cli;
    private javax.swing.JButton btnBuscar_enc;
    private javax.swing.JButton btnBuscar_pro;
    private javax.swing.JButton btnCrearFactura;
    private javax.swing.JButton btnEliminarFactura;
    private javax.swing.JButton btnLimpiar_cli;
    private javax.swing.JButton btnLimpiar_pro;
    private javax.swing.JButton btnReiniciarFactura;
    private javax.swing.JButton btnSeleccionarProduto;
    private javax.swing.JComboBox<String> cbCliente;
    private javax.swing.JComboBox<String> cbFactura;
    private javax.swing.JComboBox<String> cbxProducto;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JPanel jpBuscar_cli;
    private javax.swing.JPanel jpFacturacion;
    private javax.swing.JScrollPane jspDatos;
    private javax.swing.JDialog seleccionar_pro;
    private javax.swing.JSeparator sep_cli;
    private javax.swing.JSeparator sep_pro;
    private javax.swing.JTable t_detalles;
    private javax.swing.JTable t_encabezados;
    private javax.swing.JTable t_productos;
    private javax.swing.JTextField txtApellidos;
    private javax.swing.JTextField txtBuscar_cli;
    private javax.swing.JTextField txtBuscar_enc;
    private javax.swing.JTextField txtBuscar_pro;
    private javax.swing.JTextField txtCodigo;
    private javax.swing.JTextField txtFecha;
    private javax.swing.JTextField txtID;
    private javax.swing.JTextField txtNombres;
    private javax.swing.JTextField txtTelefono;
    private javax.swing.JTextField txtTotal;
    // End of variables declaration//GEN-END:variables
}
