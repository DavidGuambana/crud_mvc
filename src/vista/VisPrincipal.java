package vista;

import javax.swing.JButton;
import javax.swing.JDesktopPane;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JProgressBar;
import javax.swing.JToolBar;

public class VisPrincipal extends javax.swing.JFrame {

   
    public VisPrincipal() {
        initComponents();
    }

    public JDesktopPane getDskPrincipal() {
        return dskPrincipal;
    }

    public JMenu getJmClientes() {
        return jmClientes;
    }

    public JMenu getJmProductos() {
        return jmProductos;
    }

    public JMenu getJmVentas() {
        return jmVentas;
    }

    public JMenuItem getJmiAnual() {
        return jmiAnual;
    }

    public JMenuItem getJmiDiario() {
        return jmiDiario;
    }

    public JMenuItem getJmiMensual() {
        return jmiMensual;
    }

    public JMenuItem getJmiSemanal() {
        return jmiSemanal;
    }

    public JMenuItem getJmi_registrar_venta() {
        return jmi_registrar_venta;
    }

    public JMenuItem getJmi_visualizar_clientes() {
        return jmi_visualizar_clientes;
    }

    public JMenuItem getJmi_visualizar_productos() {
        return jmi_visualizar_productos;
    }

    public JMenuItem getJmi_visualizar_ventas() {
        return jmi_visualizar_ventas;
    }

    public JProgressBar getPbClientes() {
        return pbClientes;
    }

    public JButton getTlbFacturar() {
        return tlbFacturar;
    }

    public JButton getTlbPersonas() {
        return tlbPersonas;
    }

    public JButton getTlbProductos() {
        return tlbProductos;
    }

    public JButton getTlbResumen() {
        return tlbResumen;
    }
    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        pbClientes = new javax.swing.JProgressBar();
        dskPrincipal = new javax.swing.JDesktopPane();
        jPanel2 = new javax.swing.JPanel();
        tolbar = new javax.swing.JToolBar();
        tlbFacturar = new javax.swing.JButton();
        jSeparator4 = new javax.swing.JToolBar.Separator();
        jSeparator3 = new javax.swing.JToolBar.Separator();
        tlbPersonas = new javax.swing.JButton();
        jSeparator2 = new javax.swing.JToolBar.Separator();
        jSeparator6 = new javax.swing.JToolBar.Separator();
        tlbProductos = new javax.swing.JButton();
        jSeparator7 = new javax.swing.JToolBar.Separator();
        jSeparator5 = new javax.swing.JToolBar.Separator();
        tlbResumen = new javax.swing.JButton();
        tolbar1 = new javax.swing.JToolBar();
        jLabel2 = new javax.swing.JLabel();
        jSeparator14 = new javax.swing.JToolBar.Separator();
        jSeparator13 = new javax.swing.JToolBar.Separator();
        jLabel1 = new javax.swing.JLabel();
        jSeparator11 = new javax.swing.JToolBar.Separator();
        jSeparator12 = new javax.swing.JToolBar.Separator();
        jSeparator20 = new javax.swing.JToolBar.Separator();
        jSeparator21 = new javax.swing.JToolBar.Separator();
        jSeparator23 = new javax.swing.JToolBar.Separator();
        jSeparator22 = new javax.swing.JToolBar.Separator();
        jButton4 = new javax.swing.JButton();
        jSeparator10 = new javax.swing.JToolBar.Separator();
        jSeparator9 = new javax.swing.JToolBar.Separator();
        jButton2 = new javax.swing.JButton();
        menubar = new javax.swing.JMenuBar();
        jmVentas = new javax.swing.JMenu();
        jmi_registrar_venta = new javax.swing.JMenuItem();
        jSeparator18 = new javax.swing.JPopupMenu.Separator();
        jmi_visualizar_ventas = new javax.swing.JMenuItem();
        jSeparator19 = new javax.swing.JPopupMenu.Separator();
        jmResumen = new javax.swing.JMenu();
        jmiDiario = new javax.swing.JMenuItem();
        jSeparator15 = new javax.swing.JPopupMenu.Separator();
        jmiSemanal = new javax.swing.JMenuItem();
        jSeparator16 = new javax.swing.JPopupMenu.Separator();
        jmiMensual = new javax.swing.JMenuItem();
        jSeparator17 = new javax.swing.JPopupMenu.Separator();
        jmiAnual = new javax.swing.JMenuItem();
        jmClientes = new javax.swing.JMenu();
        jmi_visualizar_clientes = new javax.swing.JMenuItem();
        jmProductos = new javax.swing.JMenu();
        jmi_visualizar_productos = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Sistema facturación");
        setBackground(new java.awt.Color(51, 51, 51));
        setFont(new java.awt.Font("Yu Gothic UI", 0, 12)); // NOI18N

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));

        pbClientes.setBackground(new java.awt.Color(0, 204, 51));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pbClientes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pbClientes, javax.swing.GroupLayout.PREFERRED_SIZE, 6, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(34, Short.MAX_VALUE))
        );

        dskPrincipal.setBackground(new java.awt.Color(255, 255, 255));
        dskPrincipal.setPreferredSize(new java.awt.Dimension(912, 521));

        javax.swing.GroupLayout dskPrincipalLayout = new javax.swing.GroupLayout(dskPrincipal);
        dskPrincipal.setLayout(dskPrincipalLayout);
        dskPrincipalLayout.setHorizontalGroup(
            dskPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        dskPrincipalLayout.setVerticalGroup(
            dskPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 502, Short.MAX_VALUE)
        );

        jPanel2.setBackground(new java.awt.Color(51, 51, 51));

        tolbar.setBackground(new java.awt.Color(51, 51, 51));
        tolbar.setBorder(null);
        tolbar.setRollover(true);

        tlbFacturar.setBackground(new java.awt.Color(51, 51, 51));
        tlbFacturar.setFont(new java.awt.Font("Segoe UI", 1, 10)); // NOI18N
        tlbFacturar.setForeground(new java.awt.Color(0, 204, 255));
        tlbFacturar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vista/iconos/facturacion.png"))); // NOI18N
        tlbFacturar.setToolTipText("Nueva factura...");
        tlbFacturar.setBorder(null);
        tlbFacturar.setFocusable(false);
        tlbFacturar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        tlbFacturar.setOpaque(true);
        tlbFacturar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        tolbar.add(tlbFacturar);

        jSeparator4.setBackground(new java.awt.Color(0, 0, 0));
        tolbar.add(jSeparator4);

        jSeparator3.setBackground(new java.awt.Color(0, 0, 0));
        tolbar.add(jSeparator3);

        tlbPersonas.setBackground(new java.awt.Color(51, 51, 51));
        tlbPersonas.setFont(new java.awt.Font("Segoe UI", 1, 10)); // NOI18N
        tlbPersonas.setForeground(new java.awt.Color(0, 204, 255));
        tlbPersonas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vista/iconos/publico-objetivo.png"))); // NOI18N
        tlbPersonas.setToolTipText("Clientes...");
        tlbPersonas.setBorder(null);
        tlbPersonas.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        tlbPersonas.setOpaque(true);
        tlbPersonas.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        tolbar.add(tlbPersonas);

        jSeparator2.setBackground(new java.awt.Color(0, 0, 0));
        tolbar.add(jSeparator2);

        jSeparator6.setBackground(new java.awt.Color(0, 0, 0));
        tolbar.add(jSeparator6);

        tlbProductos.setBackground(new java.awt.Color(51, 51, 51));
        tlbProductos.setForeground(new java.awt.Color(0, 204, 255));
        tlbProductos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vista/iconos/carrito-de-supermercado.png"))); // NOI18N
        tlbProductos.setToolTipText("Productos...");
        tlbProductos.setBorder(null);
        tlbProductos.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        tlbProductos.setOpaque(true);
        tlbProductos.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        tolbar.add(tlbProductos);

        jSeparator7.setBackground(new java.awt.Color(0, 0, 0));
        tolbar.add(jSeparator7);

        jSeparator5.setBackground(new java.awt.Color(0, 0, 0));
        tolbar.add(jSeparator5);

        tlbResumen.setBackground(new java.awt.Color(51, 51, 51));
        tlbResumen.setForeground(new java.awt.Color(0, 204, 255));
        tlbResumen.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vista/iconos/satisfaccion.png"))); // NOI18N
        tlbResumen.setToolTipText("Resumen...");
        tlbResumen.setBorder(null);
        tlbResumen.setFocusable(false);
        tlbResumen.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        tlbResumen.setOpaque(true);
        tlbResumen.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        tolbar.add(tlbResumen);

        tolbar1.setBackground(new java.awt.Color(51, 51, 51));
        tolbar1.setBorder(null);
        tolbar1.setRollover(true);

        jLabel2.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vista/iconos/etiqueta-de-precio (2).png"))); // NOI18N
        jLabel2.setText("0");
        jLabel2.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        tolbar1.add(jLabel2);
        tolbar1.add(jSeparator14);
        tolbar1.add(jSeparator13);

        jLabel1.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vista/iconos/signo-de-dolar.png"))); // NOI18N
        jLabel1.setText("0,00");
        jLabel1.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        tolbar1.add(jLabel1);
        tolbar1.add(jSeparator11);
        tolbar1.add(jSeparator12);
        tolbar1.add(jSeparator20);
        tolbar1.add(jSeparator21);
        tolbar1.add(jSeparator23);
        tolbar1.add(jSeparator22);

        jButton4.setBackground(new java.awt.Color(51, 51, 51));
        jButton4.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jButton4.setForeground(new java.awt.Color(255, 255, 255));
        jButton4.setText("Username");
        jButton4.setBorder(null);
        jButton4.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton4.setOpaque(true);
        jButton4.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        tolbar1.add(jButton4);
        tolbar1.add(jSeparator10);
        tolbar1.add(jSeparator9);

        jButton2.setBackground(new java.awt.Color(51, 51, 51));
        jButton2.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("Cerrar Sesión");
        jButton2.setBorder(null);
        jButton2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton2.setOpaque(true);
        jButton2.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        tolbar1.add(jButton2);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(tolbar, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 337, Short.MAX_VALUE)
                .addComponent(tolbar1, javax.swing.GroupLayout.PREFERRED_SIZE, 338, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(4, 4, 4)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tolbar1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tolbar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        menubar.setBackground(new java.awt.Color(51, 51, 51));
        menubar.setBorder(null);
        menubar.setPreferredSize(new java.awt.Dimension(200, 40));

        jmVentas.setBackground(new java.awt.Color(51, 51, 51));
        jmVentas.setForeground(new java.awt.Color(255, 255, 255));
        jmVentas.setText("Ventas");
        jmVentas.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jmVentas.setFont(new java.awt.Font("Yu Gothic", 1, 12)); // NOI18N

        jmi_registrar_venta.setFont(new java.awt.Font("Yu Gothic", 0, 12)); // NOI18N
        jmi_registrar_venta.setForeground(new java.awt.Color(0, 102, 204));
        jmi_registrar_venta.setText("Nueva venta");
        jmi_registrar_venta.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        jmi_registrar_venta.setOpaque(true);
        jmVentas.add(jmi_registrar_venta);
        jmVentas.add(jSeparator18);

        jmi_visualizar_ventas.setFont(new java.awt.Font("Yu Gothic", 0, 12)); // NOI18N
        jmi_visualizar_ventas.setForeground(new java.awt.Color(0, 102, 204));
        jmi_visualizar_ventas.setText("Todas las ventas");
        jmi_visualizar_ventas.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        jmi_visualizar_ventas.setOpaque(true);
        jmVentas.add(jmi_visualizar_ventas);
        jmVentas.add(jSeparator19);

        jmResumen.setForeground(new java.awt.Color(0, 102, 153));
        jmResumen.setText("Resumen");
        jmResumen.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jmResumen.setFont(new java.awt.Font("Yu Gothic", 0, 12)); // NOI18N
        jmResumen.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        jmResumen.setOpaque(true);

        jmiDiario.setFont(new java.awt.Font("Yu Gothic", 0, 12)); // NOI18N
        jmiDiario.setForeground(new java.awt.Color(0, 102, 153));
        jmiDiario.setText("Diario");
        jmResumen.add(jmiDiario);
        jmResumen.add(jSeparator15);

        jmiSemanal.setFont(new java.awt.Font("Yu Gothic", 0, 12)); // NOI18N
        jmiSemanal.setForeground(new java.awt.Color(0, 102, 153));
        jmiSemanal.setText("Semanal");
        jmResumen.add(jmiSemanal);
        jmResumen.add(jSeparator16);

        jmiMensual.setFont(new java.awt.Font("Yu Gothic", 0, 12)); // NOI18N
        jmiMensual.setForeground(new java.awt.Color(0, 102, 153));
        jmiMensual.setText("Mensual");
        jmResumen.add(jmiMensual);
        jmResumen.add(jSeparator17);

        jmiAnual.setFont(new java.awt.Font("Yu Gothic", 0, 12)); // NOI18N
        jmiAnual.setForeground(new java.awt.Color(0, 102, 153));
        jmiAnual.setText("Anual");
        jmResumen.add(jmiAnual);

        jmVentas.add(jmResumen);

        menubar.add(jmVentas);

        jmClientes.setBackground(new java.awt.Color(51, 51, 51));
        jmClientes.setForeground(new java.awt.Color(255, 255, 255));
        jmClientes.setText("Clientes");
        jmClientes.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jmClientes.setFont(new java.awt.Font("Yu Gothic", 1, 12)); // NOI18N

        jmi_visualizar_clientes.setFont(new java.awt.Font("Yu Gothic", 0, 12)); // NOI18N
        jmi_visualizar_clientes.setForeground(new java.awt.Color(0, 102, 204));
        jmi_visualizar_clientes.setText("Todos los clientes");
        jmi_visualizar_clientes.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        jmi_visualizar_clientes.setOpaque(true);
        jmClientes.add(jmi_visualizar_clientes);

        menubar.add(jmClientes);

        jmProductos.setBackground(new java.awt.Color(51, 51, 51));
        jmProductos.setForeground(new java.awt.Color(255, 255, 255));
        jmProductos.setText("Productos");
        jmProductos.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jmProductos.setFont(new java.awt.Font("Yu Gothic", 1, 12)); // NOI18N

        jmi_visualizar_productos.setFont(new java.awt.Font("Yu Gothic", 0, 12)); // NOI18N
        jmi_visualizar_productos.setForeground(new java.awt.Color(0, 102, 204));
        jmi_visualizar_productos.setText("Todos los productos");
        jmi_visualizar_productos.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        jmi_visualizar_productos.setOpaque(true);
        jmProductos.add(jmi_visualizar_productos);

        menubar.add(jmProductos);

        setJMenuBar(menubar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(dskPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(dskPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, 502, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane dskPrincipal;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JToolBar.Separator jSeparator10;
    private javax.swing.JToolBar.Separator jSeparator11;
    private javax.swing.JToolBar.Separator jSeparator12;
    private javax.swing.JToolBar.Separator jSeparator13;
    private javax.swing.JToolBar.Separator jSeparator14;
    private javax.swing.JPopupMenu.Separator jSeparator15;
    private javax.swing.JPopupMenu.Separator jSeparator16;
    private javax.swing.JPopupMenu.Separator jSeparator17;
    private javax.swing.JPopupMenu.Separator jSeparator18;
    private javax.swing.JPopupMenu.Separator jSeparator19;
    private javax.swing.JToolBar.Separator jSeparator2;
    private javax.swing.JToolBar.Separator jSeparator20;
    private javax.swing.JToolBar.Separator jSeparator21;
    private javax.swing.JToolBar.Separator jSeparator22;
    private javax.swing.JToolBar.Separator jSeparator23;
    private javax.swing.JToolBar.Separator jSeparator3;
    private javax.swing.JToolBar.Separator jSeparator4;
    private javax.swing.JToolBar.Separator jSeparator5;
    private javax.swing.JToolBar.Separator jSeparator6;
    private javax.swing.JToolBar.Separator jSeparator7;
    private javax.swing.JToolBar.Separator jSeparator9;
    private javax.swing.JMenu jmClientes;
    private javax.swing.JMenu jmProductos;
    private javax.swing.JMenu jmResumen;
    private javax.swing.JMenu jmVentas;
    private javax.swing.JMenuItem jmiAnual;
    private javax.swing.JMenuItem jmiDiario;
    private javax.swing.JMenuItem jmiMensual;
    private javax.swing.JMenuItem jmiSemanal;
    private javax.swing.JMenuItem jmi_registrar_venta;
    private javax.swing.JMenuItem jmi_visualizar_clientes;
    private javax.swing.JMenuItem jmi_visualizar_productos;
    private javax.swing.JMenuItem jmi_visualizar_ventas;
    private javax.swing.JMenuBar menubar;
    private javax.swing.JProgressBar pbClientes;
    private javax.swing.JButton tlbFacturar;
    private javax.swing.JButton tlbPersonas;
    private javax.swing.JButton tlbProductos;
    private javax.swing.JButton tlbResumen;
    private javax.swing.JToolBar tolbar;
    private javax.swing.JToolBar tolbar1;
    // End of variables declaration//GEN-END:variables
}
