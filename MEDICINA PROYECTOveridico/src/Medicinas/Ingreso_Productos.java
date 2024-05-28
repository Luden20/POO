package Medicinas;
import java.awt.Color;
import java.io.File;
import javax.swing.table.DefaultTableModel;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.JOptionPane;
import java.util.StringTokenizer;
public class Ingreso_Productos extends javax.swing.JFrame {
    public Ingreso_Productos(Almacenamiento_Medicinas aux, ALMACENAMIENTO_CLIENTES Cliente) {
        initComponents();
        this.Cliente=Cliente;
        TC = new DefaultTableModel();    
        FC = new DefaultTableModel();
        C = new DefaultTableModel();
        TablaFactura.setModel(FC);
        TablaClientes.setModel(C);
        Tabla.setModel(TC);
        Medicinas = aux;
        Componentes = 0;
        Consolas = 0;
        Celulares = 0;
        Computadores = 0;
        CBCategoria.setModel(new DefaultComboBoxModel(Medicinas.getListadoCategorias(true)));
        CBCategoriaIngreso.setModel(new DefaultComboBoxModel(Medicinas.getListadoCategorias(true)));
        Componentes_Ver.setModel(new DefaultComboBoxModel(Medicinas.getListadoCategorias(false)));
    }

    private Ingreso_Productos() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        jPanel1 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        Botones = new javax.swing.JPanel();
        jButton2 = new javax.swing.JButton();
        Productos_ExistentesBT = new javax.swing.JButton();
        Nuevos_ProductosBT = new javax.swing.JButton();
        Ver_TablaBT = new javax.swing.JButton();
        CARGARbt = new javax.swing.JButton();
        GuardarBT = new javax.swing.JButton();
        VerBarrasBT = new javax.swing.JButton();
        VerFacturaBT = new javax.swing.JButton();
        VerClientesBT = new javax.swing.JButton();
        Panel_Principal = new javax.swing.JPanel();
        Panel_Factura = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        FacturaTF = new javax.swing.JTextArea();
        CargarFacturaBT = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        TablaFactura = new javax.swing.JTable();
        Panel_Tabla_Clientes = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        TablaClientes = new javax.swing.JTable();
        Panel_Tabla = new javax.swing.JPanel();
        Componentes_Ver = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        Tabla = new javax.swing.JTable();
        Panel_Ingreso_Productos_Nuevos = new javax.swing.JPanel();
        BotonIngresoNuevo = new javax.swing.JButton();
        jLabel17 = new javax.swing.JLabel();
        CategoriaTF = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        CBCategoria = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        TFCodigo = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        TFNombre = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        TFPrecio = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        TFFabricante = new javax.swing.JTextField();
        CBCantidad = new javax.swing.JComboBox<>();
        jLabel10 = new javax.swing.JLabel();
        TFDescripcion1 = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        TFFechaElaboracion = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        TFFechaVencimiento = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        IngresoImagenMNuevaBTT = new javax.swing.JButton();
        jLabel15 = new javax.swing.JLabel();
        Panel_Estadisticas = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jComboBox2 = new javax.swing.JComboBox<>();
        jLabel21 = new javax.swing.JLabel();
        jComboBox3 = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();
        jPanel7 = new javax.swing.JPanel();
        Panel_Ingreso_Productos_Existente = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        ButtonIngresoExistente = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        CBCategoriaIngreso = new javax.swing.JComboBox<>();
        jLabel12 = new javax.swing.JLabel();
        CBProductoIngreso = new javax.swing.JComboBox<>();
        jLabel13 = new javax.swing.JLabel();
        CBCantidadIngreso = new javax.swing.JComboBox<>();
        IngresoImagenAM = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(800, 600));
        getContentPane().setLayout(new javax.swing.BoxLayout(getContentPane(), javax.swing.BoxLayout.PAGE_AXIS));

        jPanel1.setBackground(new java.awt.Color(7, 31, 64));
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.setFont(new java.awt.Font("Lucida Sans", 3, 36)); // NOI18N

        jLabel7.setFont(new java.awt.Font("Lucida Sans", 1, 24)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(243, 206, 80));
        jLabel7.setText("Manejo de inventario");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(624, 624, 624)
                .addComponent(jLabel7)
                .addContainerGap(1037, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel7)
                .addContainerGap(14, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1);

        Botones.setBackground(new java.awt.Color(4, 50, 91));
        Botones.setLayout(new javax.swing.BoxLayout(Botones, javax.swing.BoxLayout.X_AXIS));

        jButton2.setBackground(new java.awt.Color(3, 133, 135));
        jButton2.setFont(new java.awt.Font("Lucida Sans", 3, 18)); // NOI18N
        jButton2.setForeground(new java.awt.Color(242, 242, 242));
        jButton2.setText("Refrescar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        Botones.add(jButton2);

        Productos_ExistentesBT.setBackground(new java.awt.Color(3, 133, 135));
        Productos_ExistentesBT.setFont(new java.awt.Font("Lucida Sans", 3, 18)); // NOI18N
        Productos_ExistentesBT.setForeground(new java.awt.Color(242, 242, 242));
        Productos_ExistentesBT.setText("Modificar Medicinas Existentes");
        Productos_ExistentesBT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Productos_ExistentesBTActionPerformed(evt);
            }
        });
        Botones.add(Productos_ExistentesBT);

        Nuevos_ProductosBT.setBackground(new java.awt.Color(3, 133, 135));
        Nuevos_ProductosBT.setFont(new java.awt.Font("Lucida Sans", 3, 18)); // NOI18N
        Nuevos_ProductosBT.setForeground(new java.awt.Color(242, 242, 242));
        Nuevos_ProductosBT.setText("Ingresar Medicinas Nuevos");
        Nuevos_ProductosBT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Nuevos_ProductosBTActionPerformed(evt);
            }
        });
        Botones.add(Nuevos_ProductosBT);

        Ver_TablaBT.setBackground(new java.awt.Color(3, 133, 135));
        Ver_TablaBT.setFont(new java.awt.Font("Lucida Sans", 3, 18)); // NOI18N
        Ver_TablaBT.setForeground(new java.awt.Color(242, 242, 242));
        Ver_TablaBT.setText("VerTabla");
        Ver_TablaBT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Ver_TablaBTActionPerformed(evt);
            }
        });
        Botones.add(Ver_TablaBT);

        CARGARbt.setBackground(new java.awt.Color(3, 133, 135));
        CARGARbt.setFont(new java.awt.Font("Lucida Sans", 3, 18)); // NOI18N
        CARGARbt.setForeground(new java.awt.Color(242, 242, 242));
        CARGARbt.setText("Cargar inventario");
        CARGARbt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CARGARbtActionPerformed(evt);
            }
        });
        Botones.add(CARGARbt);

        GuardarBT.setBackground(new java.awt.Color(3, 133, 135));
        GuardarBT.setFont(new java.awt.Font("Lucida Sans", 3, 18)); // NOI18N
        GuardarBT.setForeground(new java.awt.Color(242, 242, 242));
        GuardarBT.setText("Guardar inventario");
        GuardarBT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GuardarBTActionPerformed(evt);
            }
        });
        Botones.add(GuardarBT);

        VerBarrasBT.setBackground(new java.awt.Color(3, 133, 135));
        VerBarrasBT.setFont(new java.awt.Font("Lucida Sans", 3, 18)); // NOI18N
        VerBarrasBT.setForeground(new java.awt.Color(242, 242, 242));
        VerBarrasBT.setText("Estadisticas");
        VerBarrasBT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VerBarrasBTActionPerformed(evt);
            }
        });
        Botones.add(VerBarrasBT);

        VerFacturaBT.setBackground(new java.awt.Color(3, 133, 135));
        VerFacturaBT.setFont(new java.awt.Font("Lucida Sans", 3, 18)); // NOI18N
        VerFacturaBT.setForeground(new java.awt.Color(242, 242, 242));
        VerFacturaBT.setText("Ver Facturas");
        VerFacturaBT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VerFacturaBTActionPerformed(evt);
            }
        });
        Botones.add(VerFacturaBT);

        VerClientesBT.setBackground(new java.awt.Color(3, 133, 135));
        VerClientesBT.setFont(new java.awt.Font("Lucida Sans", 3, 18)); // NOI18N
        VerClientesBT.setForeground(new java.awt.Color(242, 242, 242));
        VerClientesBT.setText("Ver Clientes");
        VerClientesBT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VerClientesBTActionPerformed(evt);
            }
        });
        Botones.add(VerClientesBT);

        getContentPane().add(Botones);

        Panel_Principal.setBackground(new java.awt.Color(255, 255, 255));
        Panel_Principal.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        Panel_Principal.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        Panel_Principal.setMaximumSize(new java.awt.Dimension(1920, 1080));
        Panel_Principal.setMinimumSize(new java.awt.Dimension(1920, 1080));
        Panel_Principal.setPreferredSize(new java.awt.Dimension(1920, 1080));
        Panel_Principal.setLayout(new java.awt.CardLayout());

        Panel_Factura.setLayout(new javax.swing.BoxLayout(Panel_Factura, javax.swing.BoxLayout.PAGE_AXIS));

        jPanel2.setLayout(new java.awt.GridLayout(1, 0));

        jScrollPane3.setMinimumSize(new java.awt.Dimension(3, 3));

        FacturaTF.setColumns(20);
        FacturaTF.setRows(5);
        FacturaTF.setText("Aqui iran los detalles del cliente de la factura");
        jScrollPane3.setViewportView(FacturaTF);

        jPanel2.add(jScrollPane3);

        CargarFacturaBT.setText("CARGAR FACTURA");
        CargarFacturaBT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CargarFacturaBTActionPerformed(evt);
            }
        });
        jPanel2.add(CargarFacturaBT);

        Panel_Factura.add(jPanel2);

        TablaFactura.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane2.setViewportView(TablaFactura);

        Panel_Factura.add(jScrollPane2);

        Panel_Principal.add(Panel_Factura, "card6");

        Panel_Tabla_Clientes.setLayout(new javax.swing.BoxLayout(Panel_Tabla_Clientes, javax.swing.BoxLayout.LINE_AXIS));

        TablaClientes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Codigo", "Nombre", "Marca", "Cantidad", "Precio", "Descripcion"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane4.setViewportView(TablaClientes);

        Panel_Tabla_Clientes.add(jScrollPane4);

        Panel_Principal.add(Panel_Tabla_Clientes, "card4");

        Panel_Tabla.setLayout(new java.awt.BorderLayout());

        Componentes_Ver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Componentes_VerActionPerformed(evt);
            }
        });
        Panel_Tabla.add(Componentes_Ver, java.awt.BorderLayout.PAGE_START);

        Tabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Codigo", "Nombre", "Marca", "Cantidad", "Precio", "Descripcion"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(Tabla);

        Panel_Tabla.add(jScrollPane1, java.awt.BorderLayout.CENTER);

        Panel_Principal.add(Panel_Tabla, "card4");

        Panel_Ingreso_Productos_Nuevos.setBackground(new java.awt.Color(4, 50, 91));
        Panel_Ingreso_Productos_Nuevos.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        BotonIngresoNuevo.setBackground(new java.awt.Color(3, 133, 135));
        BotonIngresoNuevo.setFont(new java.awt.Font("Lucida Sans", 1, 24)); // NOI18N
        BotonIngresoNuevo.setForeground(new java.awt.Color(242, 242, 242));
        BotonIngresoNuevo.setText("Ingresar");
        BotonIngresoNuevo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        BotonIngresoNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonIngresoNuevoActionPerformed(evt);
            }
        });
        Panel_Ingreso_Productos_Nuevos.add(BotonIngresoNuevo, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 390, 190, 50));

        jLabel17.setBackground(new java.awt.Color(205, 205, 205));
        jLabel17.setFont(new java.awt.Font("Lucida Sans", 1, 18)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(242, 242, 242));
        jLabel17.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel17.setText("Categoria (Si no existe)");
        Panel_Ingreso_Productos_Nuevos.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 240, -1, 28));

        CategoriaTF.setFont(new java.awt.Font("Lucida Sans", 1, 18)); // NOI18N
        CategoriaTF.setForeground(new java.awt.Color(64, 64, 64));
        Panel_Ingreso_Productos_Nuevos.add(CategoriaTF, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 240, 202, -1));

        jLabel9.setBackground(new java.awt.Color(205, 205, 205));
        jLabel9.setFont(new java.awt.Font("Lucida Sans", 1, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(242, 242, 242));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("Categoria (Si ya existe)");
        Panel_Ingreso_Productos_Nuevos.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 190, -1, 28));

        CBCategoria.setFont(new java.awt.Font("Lucida Sans", 1, 18)); // NOI18N
        CBCategoria.setForeground(new java.awt.Color(64, 64, 64));
        CBCategoria.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "NaN" }));
        CBCategoria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CBCategoriaActionPerformed(evt);
            }
        });
        Panel_Ingreso_Productos_Nuevos.add(CBCategoria, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 190, 202, -1));

        jLabel3.setBackground(new java.awt.Color(205, 205, 205));
        jLabel3.setFont(new java.awt.Font("Lucida Sans", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(242, 242, 242));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Codigo");
        Panel_Ingreso_Productos_Nuevos.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 140, -1, 28));

        TFCodigo.setFont(new java.awt.Font("Lucida Sans", 1, 18)); // NOI18N
        TFCodigo.setForeground(new java.awt.Color(64, 64, 64));
        TFCodigo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TFCodigoActionPerformed(evt);
            }
        });
        Panel_Ingreso_Productos_Nuevos.add(TFCodigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 140, 175, -1));

        jLabel4.setBackground(new java.awt.Color(205, 205, 205));
        jLabel4.setFont(new java.awt.Font("Lucida Sans", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(242, 242, 242));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Nombre");
        Panel_Ingreso_Productos_Nuevos.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 140, -1, 28));

        TFNombre.setFont(new java.awt.Font("Lucida Sans", 1, 18)); // NOI18N
        TFNombre.setForeground(new java.awt.Color(64, 64, 64));
        Panel_Ingreso_Productos_Nuevos.add(TFNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 140, 202, -1));

        jLabel5.setBackground(new java.awt.Color(205, 205, 205));
        jLabel5.setFont(new java.awt.Font("Lucida Sans", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(242, 242, 242));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Precio");
        Panel_Ingreso_Productos_Nuevos.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 290, -1, 28));

        TFPrecio.setFont(new java.awt.Font("Lucida Sans", 1, 18)); // NOI18N
        TFPrecio.setForeground(new java.awt.Color(64, 64, 64));
        Panel_Ingreso_Productos_Nuevos.add(TFPrecio, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 290, 202, -1));

        jLabel6.setBackground(new java.awt.Color(205, 205, 205));
        jLabel6.setFont(new java.awt.Font("Lucida Sans", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(242, 242, 242));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Descripcion");
        Panel_Ingreso_Productos_Nuevos.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 190, -1, 28));

        TFFabricante.setFont(new java.awt.Font("Lucida Sans", 1, 18)); // NOI18N
        TFFabricante.setForeground(new java.awt.Color(64, 64, 64));
        Panel_Ingreso_Productos_Nuevos.add(TFFabricante, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 340, 202, -1));

        CBCantidad.setFont(new java.awt.Font("Lucida Sans", 1, 18)); // NOI18N
        CBCantidad.setForeground(new java.awt.Color(64, 64, 64));
        CBCantidad.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31", "32", "33", "34", "35", "36", "37", "38", "39", "40", "41", "42", "43", "44", "45", "46", "47", "48", "49", "50", "51", "52", "53", "54", "55", "56", "57", "58", "59", "60", "61", "62", "63", "64", "65", "66", "67", "68", "69", "70", "71", "72", "73", "74", "75", "76", "77", "78", "79", "80", "81", "82", "83", "84", "85", "86", "87", "88", "89", "90", "91", "92", "93", "94", "95", "96", "97", "98", "99" }));
        CBCantidad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CBCantidadActionPerformed(evt);
            }
        });
        Panel_Ingreso_Productos_Nuevos.add(CBCantidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 340, 175, -1));

        jLabel10.setBackground(new java.awt.Color(205, 205, 205));
        jLabel10.setFont(new java.awt.Font("Lucida Sans", 1, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(242, 242, 242));
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("Fabricante");
        Panel_Ingreso_Productos_Nuevos.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 340, -1, 28));

        TFDescripcion1.setFont(new java.awt.Font("Lucida Sans", 1, 18)); // NOI18N
        TFDescripcion1.setForeground(new java.awt.Color(64, 64, 64));
        Panel_Ingreso_Productos_Nuevos.add(TFDescripcion1, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 190, 175, -1));

        jLabel16.setBackground(new java.awt.Color(205, 205, 205));
        jLabel16.setFont(new java.awt.Font("Lucida Sans", 1, 18)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(242, 242, 242));
        jLabel16.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel16.setText("Cantidad");
        Panel_Ingreso_Productos_Nuevos.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 340, -1, 28));

        TFFechaElaboracion.setFont(new java.awt.Font("Lucida Sans", 1, 18)); // NOI18N
        TFFechaElaboracion.setForeground(new java.awt.Color(64, 64, 64));
        Panel_Ingreso_Productos_Nuevos.add(TFFechaElaboracion, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 240, 175, -1));

        jLabel18.setBackground(new java.awt.Color(205, 205, 205));
        jLabel18.setFont(new java.awt.Font("Lucida Sans", 1, 18)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(242, 242, 242));
        jLabel18.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel18.setText("Fecha elaboracion");
        Panel_Ingreso_Productos_Nuevos.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 240, -1, 28));

        TFFechaVencimiento.setFont(new java.awt.Font("Lucida Sans", 1, 18)); // NOI18N
        TFFechaVencimiento.setForeground(new java.awt.Color(64, 64, 64));
        Panel_Ingreso_Productos_Nuevos.add(TFFechaVencimiento, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 290, 175, -1));

        jLabel19.setBackground(new java.awt.Color(205, 205, 205));
        jLabel19.setFont(new java.awt.Font("Lucida Sans", 1, 18)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(242, 242, 242));
        jLabel19.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel19.setText("Fecha vencimiento");
        Panel_Ingreso_Productos_Nuevos.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 290, -1, 28));

        jPanel3.setBackground(new java.awt.Color(7, 31, 64));

        jLabel2.setFont(new java.awt.Font("Lucida Sans", 1, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(243, 206, 80));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Ingreso de Medicinas Nuevas");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jLabel2)
                .addContainerGap(1355, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jLabel2)
                .addContainerGap(29, Short.MAX_VALUE))
        );

        Panel_Ingreso_Productos_Nuevos.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1920, -1));

        jPanel4.setBackground(new java.awt.Color(1, 90, 149));

        IngresoImagenMNuevaBTT.setBackground(new java.awt.Color(3, 133, 135));
        IngresoImagenMNuevaBTT.setFont(new java.awt.Font("Lucida Sans", 1, 12)); // NOI18N
        IngresoImagenMNuevaBTT.setForeground(new java.awt.Color(242, 242, 242));
        IngresoImagenMNuevaBTT.setText("Agregar Imagen");
        IngresoImagenMNuevaBTT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IngresoImagenMNuevaBTTActionPerformed(evt);
            }
        });

        jLabel15.setBackground(new java.awt.Color(205, 205, 205));
        jLabel15.setFont(new java.awt.Font("Lucida Sans", 1, 18)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(242, 242, 242));
        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel15.setText("Imagen");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel15)
                .addGap(211, 211, 211)
                .addComponent(IngresoImagenMNuevaBTT, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(498, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(266, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(IngresoImagenMNuevaBTT, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(43, 43, 43))
        );

        Panel_Ingreso_Productos_Nuevos.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, 990, 340));

        Panel_Principal.add(Panel_Ingreso_Productos_Nuevos, "card2");

        Panel_Estadisticas.setBackground(new java.awt.Color(0, 51, 51));
        Panel_Estadisticas.setLayout(new java.awt.GridBagLayout());

        jLabel1.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 204, 0));
        jLabel1.setText("ESCOJA LO QUE SE QUIERE COMPARAR");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.insets = new java.awt.Insets(22, 0, 22, 0);
        Panel_Estadisticas.add(jLabel1, gridBagConstraints);

        jLabel20.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(255, 204, 0));
        jLabel20.setText("ESCOJA EL CAMPO POR EL QUE SE QUIERE COMPARAR");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.insets = new java.awt.Insets(20, 0, 20, 0);
        Panel_Estadisticas.add(jLabel20, gridBagConstraints);

        jComboBox1.setBackground(new java.awt.Color(204, 255, 204));
        jComboBox1.setFont(new java.awt.Font("Century Gothic", 0, 24)); // NOI18N
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "CATEGORIA", "NOMBRE", "FABRICANTE", "FE", "FA" }));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.ipadx = 98;
        Panel_Estadisticas.add(jComboBox1, gridBagConstraints);

        jComboBox2.setBackground(new java.awt.Color(204, 255, 204));
        jComboBox2.setFont(new java.awt.Font("Century Gothic", 0, 24)); // NOI18N
        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Por Registro", "Por Cantidad", "Por Cantidad X Precio" }));
        jComboBox2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox2ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.ipadx = 71;
        gridBagConstraints.insets = new java.awt.Insets(0, 21, 0, 21);
        Panel_Estadisticas.add(jComboBox2, gridBagConstraints);

        jLabel21.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(255, 204, 0));
        jLabel21.setText("ESCOJA EL TIPO DE GRAFICA QUE SE BUSCA");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.insets = new java.awt.Insets(20, 0, 20, 0);
        Panel_Estadisticas.add(jLabel21, gridBagConstraints);

        jComboBox3.setBackground(new java.awt.Color(204, 255, 204));
        jComboBox3.setFont(new java.awt.Font("Century Gothic", 0, 24)); // NOI18N
        jComboBox3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Barras", "Pastel" }));
        jComboBox3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox3ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.ipadx = 98;
        Panel_Estadisticas.add(jComboBox3, gridBagConstraints);

        jButton1.setBackground(new java.awt.Color(0, 153, 102));
        jButton1.setFont(new java.awt.Font("Century Gothic", 3, 36)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 51));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Medicinas/1573395 (1).png"))); // NOI18N
        jButton1.setText("GRAFICAR");
        jButton1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.insets = new java.awt.Insets(25, 5, 25, 5);
        Panel_Estadisticas.add(jButton1, gridBagConstraints);

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        Panel_Estadisticas.add(jPanel7, new java.awt.GridBagConstraints());

        Panel_Principal.add(Panel_Estadisticas, "card3");

        Panel_Ingreso_Productos_Existente.setBackground(new java.awt.Color(4, 50, 91));
        Panel_Ingreso_Productos_Existente.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel8.setFont(new java.awt.Font("Lucida Sans", 1, 24)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(242, 242, 242));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("Imagen");
        jLabel8.setToolTipText("");
        Panel_Ingreso_Productos_Existente.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 440, -1, 37));

        ButtonIngresoExistente.setBackground(new java.awt.Color(3, 133, 135));
        ButtonIngresoExistente.setFont(new java.awt.Font("Lucida Sans", 1, 24)); // NOI18N
        ButtonIngresoExistente.setForeground(new java.awt.Color(242, 242, 242));
        ButtonIngresoExistente.setText("Ingresar");
        ButtonIngresoExistente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonIngresoExistenteActionPerformed(evt);
            }
        });
        Panel_Ingreso_Productos_Existente.add(ButtonIngresoExistente, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 540, 355, -1));

        jLabel11.setFont(new java.awt.Font("Lucida Sans", 1, 24)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(242, 242, 242));
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setText("Categoria");
        jLabel11.setToolTipText("");
        Panel_Ingreso_Productos_Existente.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 150, -1, 37));

        CBCategoriaIngreso.setFont(new java.awt.Font("Lucida Sans", 1, 18)); // NOI18N
        CBCategoriaIngreso.setForeground(new java.awt.Color(64, 64, 64));
        CBCategoriaIngreso.setToolTipText("");
        CBCategoriaIngreso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CBCategoriaIngresoActionPerformed(evt);
            }
        });
        Panel_Ingreso_Productos_Existente.add(CBCategoriaIngreso, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 150, 281, 37));

        jLabel12.setFont(new java.awt.Font("Lucida Sans", 1, 24)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(242, 242, 242));
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setText("Medicina");
        jLabel12.setToolTipText("");
        Panel_Ingreso_Productos_Existente.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 240, -1, 37));

        CBProductoIngreso.setFont(new java.awt.Font("Lucida Sans", 1, 18)); // NOI18N
        CBProductoIngreso.setForeground(new java.awt.Color(64, 64, 64));
        CBProductoIngreso.setToolTipText("");
        CBProductoIngreso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CBProductoIngresoActionPerformed(evt);
            }
        });
        Panel_Ingreso_Productos_Existente.add(CBProductoIngreso, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 240, 281, 37));

        jLabel13.setFont(new java.awt.Font("Lucida Sans", 1, 24)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(242, 242, 242));
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel13.setText("Cantidad a ingresar");
        jLabel13.setToolTipText("");
        Panel_Ingreso_Productos_Existente.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 350, -1, 37));

        CBCantidadIngreso.setFont(new java.awt.Font("Lucida Sans", 1, 18)); // NOI18N
        CBCantidadIngreso.setForeground(new java.awt.Color(64, 64, 64));
        CBCantidadIngreso.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31", "32", "33", "34", "35", "36", "37", "38", "39", "40", "41", "42", "43", "44", "45", "46", "47", "48", "49", "50", "51", "52", "53", "54", "55", "56", "57", "58", "59", "60", "61", "62", "63", "64", "65", "66", "67", "68", "69", "70", "71", "72", "73", "74", "75", "76", "77", "78", "79", "80", "81", "82", "83", "84", "85", "86", "87", "88", "89", "90", "91", "92", "93", "94", "95", "96", "97", "98", "99" }));
        CBCantidadIngreso.setToolTipText("");
        CBCantidadIngreso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CBCantidadIngresoActionPerformed(evt);
            }
        });
        Panel_Ingreso_Productos_Existente.add(CBCantidadIngreso, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 340, 277, 37));

        IngresoImagenAM.setFont(new java.awt.Font("Segoe UI", 2, 18)); // NOI18N
        IngresoImagenAM.setForeground(new java.awt.Color(64, 64, 64));
        IngresoImagenAM.setText("Ingresar Imagen");
        IngresoImagenAM.setToolTipText("");
        IngresoImagenAM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IngresoImagenAMActionPerformed(evt);
            }
        });
        Panel_Ingreso_Productos_Existente.add(IngresoImagenAM, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 440, 280, 37));

        jPanel5.setBackground(new java.awt.Color(7, 31, 64));

        jLabel14.setFont(new java.awt.Font("Lucida Sans", 1, 30)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(243, 206, 80));
        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel14.setText("Actualizar información de Medicinas");
        jLabel14.setToolTipText("");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(68, 68, 68)
                .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 580, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(92, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(33, Short.MAX_VALUE))
        );

        Panel_Ingreso_Productos_Existente.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 740, -1));

        jPanel6.setBackground(new java.awt.Color(1, 90, 149));

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 630, Short.MAX_VALUE)
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 490, Short.MAX_VALUE)
        );

        Panel_Ingreso_Productos_Existente.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 130, 630, 490));

        Panel_Principal.add(Panel_Ingreso_Productos_Existente, "card3");

        getContentPane().add(Panel_Principal);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void CBCategoriaIngresoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CBCategoriaIngresoActionPerformed
        // TODO add your handling code here:
        String categoriaSeleccionada = CBCategoriaIngreso.getSelectedItem().toString();
    
        Object[] productos = Medicinas.getListadoMedicinas(categoriaSeleccionada);
    
        String[] productosString = new String[productos.length];
        for (int i = 0; i < productos.length; i++) 
        {
            productosString[i] = productos[i].toString();
        } 
        CBProductoIngreso.setModel(new DefaultComboBoxModel<>(productosString));
        //Refrescar();
    }//GEN-LAST:event_CBCategoriaIngresoActionPerformed

    private void ButtonIngresoExistenteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonIngresoExistenteActionPerformed
        // TODO add your handling code here:
        String categoriaSeleccionada = CBCategoriaIngreso.getSelectedItem().toString();
        if(!"NaN".equals(categoriaSeleccionada))
        {
            String productoSeleccionado = CBProductoIngreso.getSelectedItem().toString();
            int cantidadIngresada = Integer.parseInt(CBCantidadIngreso.getSelectedItem().toString());

            Medicinas.AgregarCantidad(productoSeleccionado,cantidadIngresada);
            if(faux!=null)
            {
                Medicinas.Cambiar(productoSeleccionado, "DI",Utilidades.rellenarEspacios(faux.getAbsolutePath(),50) );
            }           
            Medicinas.MostrarTabla(Componentes_Ver.getSelectedItem().toString(),TC);
            JOptionPane.showMessageDialog(null, "Producto actualizado con exito", "Mensaje", JOptionPane.INFORMATION_MESSAGE);
            Refrescar();
        }
        else
        {
            JOptionPane.showMessageDialog(null, "Seleccione una categoria valida","Error", JOptionPane.ERROR_MESSAGE);
        }
        
    }//GEN-LAST:event_ButtonIngresoExistenteActionPerformed

    private void TFCodigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TFCodigoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TFCodigoActionPerformed

    private void BotonIngresoNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonIngresoNuevoActionPerformed
    // TODO add your handling code here:
    String cat;
            if (validar()) 
            {
                // Verificar si todos los valores a guardar son menores a 15 caracteres
                if (validarLongitud()) 
                {
                    if ("NaN".equals(CBCategoria.getSelectedItem().toString())) 
                    {
                        cat = Utilidades.rellenarEspacios(CategoriaTF.getText(),10);          
                    } 
                    else 
                    {
                        cat = CBCategoria.getSelectedItem().toString();
                    }
                    // Rellenar con espacios si los valores son menores a 15 caracteres
                    if(faux!=null)
                    {
                        Medicinas.Ingresar
                        (
                            Utilidades.rellenarEspacios(TFCodigo.getText(), 6),
                            cat,                       
                            Utilidades.rellenarEspacios(TFNombre.getText(), 15),
                            Utilidades.rellenarEspacios(TFFabricante.getText(), 15),
                            Integer.parseInt(CBCantidad.getSelectedItem().toString()),
                            Double.parseDouble(TFPrecio.getText()),
                            Utilidades.rellenarEspacios(TFFechaElaboracion.getText(), 10),
                            Utilidades.rellenarEspacios(TFFechaVencimiento.getText(), 10),
                            Utilidades.rellenarEspacios(TFDescripcion1.getText(), 50),
                            Utilidades.rellenarEspacios(faux.getAbsolutePath(),50)
                        );
                    }
                    else
                    {
                        Medicinas.Ingresar
                        (
                            Utilidades.rellenarEspacios(TFCodigo.getText(), 6),
                            cat,                       
                            Utilidades.rellenarEspacios(TFNombre.getText(), 15),
                            Utilidades.rellenarEspacios(TFFabricante.getText(), 15),
                            Integer.parseInt(CBCantidad.getSelectedItem().toString()),
                            Double.parseDouble(TFPrecio.getText()),
                            Utilidades.rellenarEspacios(TFFechaElaboracion.getText(), 8),
                            Utilidades.rellenarEspacios(TFFechaVencimiento.getText(), 8),
                            Utilidades.rellenarEspacios(TFDescripcion1.getText(), 50)
                        );
                    }
                    JOptionPane.showMessageDialog(null, "Ingreso Exitoso", "Mensaje", JOptionPane.INFORMATION_MESSAGE);
                    reset();
                } 
                else 
                {
                    JOptionPane.showMessageDialog(this, "Al menos uno de los valores a guardar supera los caracteres establecidos.", "ERROR", JOptionPane.ERROR_MESSAGE);
                }
            } 
            else 
            {
                JOptionPane.showMessageDialog(this, "Error en el Ingreso de datos", "ERROR", JOptionPane.ERROR_MESSAGE);
            }

    }//GEN-LAST:event_BotonIngresoNuevoActionPerformed

    private void CBCantidadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CBCantidadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CBCantidadActionPerformed

    private void CBCategoriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CBCategoriaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CBCategoriaActionPerformed

    private void Componentes_VerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Componentes_VerActionPerformed
        // TODO add your handling code here:
        Medicinas.MostrarTabla(Componentes_Ver.getSelectedItem().toString(),TC);
        //Refrescar();
    }//GEN-LAST:event_Componentes_VerActionPerformed

    private void CBProductoIngresoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CBProductoIngresoActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_CBProductoIngresoActionPerformed

    private void CBCantidadIngresoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CBCantidadIngresoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CBCantidadIngresoActionPerformed

    private void Productos_ExistentesBTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Productos_ExistentesBTActionPerformed
        // TODO add your handling code here:
        Panel_Principal.removeAll();
        Panel_Principal.add(Panel_Ingreso_Productos_Existente);
        Panel_Principal.repaint();
        Panel_Principal.revalidate();
        Refrescar();
    }//GEN-LAST:event_Productos_ExistentesBTActionPerformed

    private void Nuevos_ProductosBTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Nuevos_ProductosBTActionPerformed
        // TODO add your handling code here:
        Panel_Principal.removeAll();
        Panel_Principal.add(Panel_Ingreso_Productos_Nuevos);
        Panel_Principal.repaint();
        Panel_Principal.revalidate();
        Refrescar();
    }//GEN-LAST:event_Nuevos_ProductosBTActionPerformed

    private void Ver_TablaBTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Ver_TablaBTActionPerformed
        // TODO add your handling code here:
        Panel_Principal.removeAll();
        Panel_Principal.add(Panel_Tabla);
        Panel_Principal.repaint();
        Panel_Principal.revalidate();
        Refrescar();
    }//GEN-LAST:event_Ver_TablaBTActionPerformed

    private void CARGARbtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CARGARbtActionPerformed
            File file=Utilidades.obtenerArchivo("dat", "Seleccione archivo para cargar");
            Medicinas= new Almacenamiento_Medicinas(file); 
            Refrescar();
    }//GEN-LAST:event_CARGARbtActionPerformed

    private void GuardarBTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GuardarBTActionPerformed
            File file=Utilidades.obtenerArchivo("dat", "Seleccione archivo para guardar");
            Medicinas.Copiar(file);
            Refrescar();
        
    }//GEN-LAST:event_GuardarBTActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        Refrescar();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void IngresoImagenMNuevaBTTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IngresoImagenMNuevaBTTActionPerformed

                faux = Utilidades.obtenerArchivo("Seleccione un archivo de imagen");
                IngresoImagenMNuevaBTT.setBackground(Color.green);
                JOptionPane.showMessageDialog(null, "Imagen cargada con exito", "Mensaje", JOptionPane.INFORMATION_MESSAGE);
        
    }//GEN-LAST:event_IngresoImagenMNuevaBTTActionPerformed

    private void IngresoImagenAMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IngresoImagenAMActionPerformed

                faux = Utilidades.obtenerArchivo("Seleccione una imagen");
                JOptionPane.showMessageDialog(null, "Imagen cargada con exito", "Mensaje", JOptionPane.INFORMATION_MESSAGE);
                IngresoImagenAM.setBackground(Color.green);
        
    }//GEN-LAST:event_IngresoImagenAMActionPerformed

    private void VerBarrasBTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VerBarrasBTActionPerformed
        Panel_Principal.removeAll();
        Panel_Principal.add(Panel_Estadisticas);
        Panel_Principal.repaint();
        Panel_Principal.revalidate();
    }//GEN-LAST:event_VerBarrasBTActionPerformed

    private void VerFacturaBTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VerFacturaBTActionPerformed
        // TODO add your handling code here:
        Panel_Principal.removeAll();
        Panel_Principal.add(Panel_Factura);
        Panel_Principal.repaint();
        Panel_Principal.revalidate();
        Refrescar();
    }//GEN-LAST:event_VerFacturaBTActionPerformed

    private void CargarFacturaBTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CargarFacturaBTActionPerformed
        // TODO add your handling code here:
                File file=Utilidades.obtenerArchivo("dat", "Seleccione archivo para cargar");
                Almacenamiento_Medicinas FA=new Almacenamiento_Medicinas(file);
                String saux=file.getName();
                StringTokenizer st=new StringTokenizer(saux,",");
                String Ced=st.nextToken();
                saux=st.nextToken();
                st=new StringTokenizer(saux,".");
                String FNum=st.nextToken();
                FacturaTF.setText("Numero de Factura "+FNum+"\n"+Cliente.getInfoCliente(Ced));
                FA.MostrarTabla(FC);
                Refrescar();
    }//GEN-LAST:event_CargarFacturaBTActionPerformed

    private void VerClientesBTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VerClientesBTActionPerformed
        // TODO add your handling code here:
        Panel_Principal.removeAll();
        Panel_Principal.add(Panel_Tabla_Clientes);
        Panel_Principal.repaint();
        Panel_Principal.revalidate();
        Cliente.MostrarTabla(C);
        Refrescar();
    }//GEN-LAST:event_VerClientesBTActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
    String atributo = (String) jComboBox1.getSelectedItem();
    String metodo = (String) jComboBox2.getSelectedItem();
    String tipoGrafico = (String) jComboBox3.getSelectedItem();

    try {
        if (tipoGrafico.equals("Barras")) {
            if (metodo.equals("Por Registro")) {
                    Medicinas.graficoBarrasDeDiferentesDe(atributo);
            } else if (metodo.equals("Por Cantidad")) {
                    Medicinas.graficoBarrasDeDiferentesDeTomandoCuentaCantidad(atributo);
            } else if (metodo.equals("Por Cantidad X Precio")) {
                    Medicinas.graficoBarrasDeDiferentesDeTomandoCuentaCantidadyPrecio(atributo);
            }
        } else if (tipoGrafico.equals("Pastel")) {
            if (metodo.equals("Por Registro")) {
                    Medicinas.graficoPastelDeDiferentesDe(atributo);
            } else if (metodo.equals("Por Cantidad")) {
                    Medicinas.graficoPastelDeDiferentesDeTomandoEnCuentaCantidad(atributo);
            } else if (metodo.equals("Por Cantidad X Precio")) {
                    Medicinas.graficoPastelDeDiferentesDeTomandoEnCuentaCantidadyPrecio(atributo);
            }
        } else {
            JOptionPane.showMessageDialog(this, "Debe seleccionar un atributo, un método y un tipo de gráfico.");
        }
    } catch (Exception e) {
        e.printStackTrace();
        JOptionPane.showMessageDialog(this, "Error al generar el gráfico: " + e.getMessage());
    }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void jComboBox2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox2ActionPerformed
       
    }//GEN-LAST:event_jComboBox2ActionPerformed

    private void jComboBox3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox3ActionPerformed
       
    }//GEN-LAST:event_jComboBox3ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Ingreso_Productos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Ingreso_Productos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Ingreso_Productos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Ingreso_Productos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Ingreso_Productos().setVisible(true);
            }
        });
    }
    
    public boolean validar()
    {
        return !"".equals(TFCodigo.getText())&&!"".equals(TFNombre.getText())&&!"".equals(TFPrecio.getText())&&!"".equals(TFFabricante.getText());
    }
    
  
    public void reset()
    {
        CBCategoria.setSelectedIndex(0);
        CategoriaTF.setText("");
        TFCodigo.setText("");
        TFNombre.setText("");
        TFDescripcion1.setText("");
        TFPrecio.setText("");
        TFFabricante.setText("");
        TFFechaElaboracion.setText("");
        TFFechaVencimiento.setText("");
        CBCantidad.setSelectedIndex(0);
        aux=null;
        Refrescar();
    }
    
    
    public void Refrescar()
    {
        CBCategoria.setModel(new DefaultComboBoxModel(Medicinas.getListadoCategorias(true)));
        CBCategoriaIngreso.setModel(new DefaultComboBoxModel(Medicinas.getListadoCategorias(true)));
        Componentes_Ver.setModel(new DefaultComboBoxModel(Medicinas.getListadoCategorias(true)));
        aux=null;
        IngresoImagenMNuevaBTT.setBackground(Color.white);
        IngresoImagenAM.setBackground(Color.white);
    }
    
    private boolean validarLongitud() 
    {
    return TFCodigo.getText().length() <= 5 &&
           TFNombre.getText().length() <= 15 &&
           TFFabricante.getText().length() <= 15 &&
           TFDescripcion1.getText().length() <= 40;
    } 
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotonIngresoNuevo;
    private javax.swing.JPanel Botones;
    private javax.swing.JButton ButtonIngresoExistente;
    private javax.swing.JButton CARGARbt;
    private javax.swing.JComboBox<String> CBCantidad;
    private javax.swing.JComboBox<String> CBCantidadIngreso;
    private javax.swing.JComboBox<String> CBCategoria;
    private javax.swing.JComboBox<String> CBCategoriaIngreso;
    private javax.swing.JComboBox<String> CBProductoIngreso;
    private javax.swing.JButton CargarFacturaBT;
    private javax.swing.JTextField CategoriaTF;
    private javax.swing.JComboBox<String> Componentes_Ver;
    private javax.swing.JTextArea FacturaTF;
    private javax.swing.JButton GuardarBT;
    private javax.swing.JButton IngresoImagenAM;
    private javax.swing.JButton IngresoImagenMNuevaBTT;
    private javax.swing.JButton Nuevos_ProductosBT;
    private javax.swing.JPanel Panel_Estadisticas;
    private javax.swing.JPanel Panel_Factura;
    private javax.swing.JPanel Panel_Ingreso_Productos_Existente;
    private javax.swing.JPanel Panel_Ingreso_Productos_Nuevos;
    private javax.swing.JPanel Panel_Principal;
    private javax.swing.JPanel Panel_Tabla;
    private javax.swing.JPanel Panel_Tabla_Clientes;
    private javax.swing.JButton Productos_ExistentesBT;
    private javax.swing.JTextField TFCodigo;
    private javax.swing.JTextField TFDescripcion1;
    private javax.swing.JTextField TFFabricante;
    private javax.swing.JTextField TFFechaElaboracion;
    private javax.swing.JTextField TFFechaVencimiento;
    private javax.swing.JTextField TFNombre;
    private javax.swing.JTextField TFPrecio;
    private javax.swing.JTable Tabla;
    private javax.swing.JTable TablaClientes;
    private javax.swing.JTable TablaFactura;
    private javax.swing.JButton VerBarrasBT;
    private javax.swing.JButton VerClientesBT;
    private javax.swing.JButton VerFacturaBT;
    private javax.swing.JButton Ver_TablaBT;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JComboBox<String> jComboBox3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    // End of variables declaration//GEN-END:variables
    private Almacenamiento_Medicinas Medicinas;
    private ALMACENAMIENTO_CLIENTES Cliente;
    private int Componentes, Consolas, Celulares, Computadores;
    private  DefaultTableModel TC;
    private  DefaultTableModel FC;
    private  DefaultTableModel C;
    private ImageIcon aux;
    private File faux;

}
