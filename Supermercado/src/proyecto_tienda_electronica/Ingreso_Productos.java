/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package proyecto_tienda_electronica;
import java.awt.Image;
import java.io.File;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.filechooser.FileNameExtensionFilter;
/*
import org.jfree.chart.ChartFactory;
import org.jfree.chart.JFreeChart;
import org.jfree.data.general.DefaultPieDataset; 
import org.jfree.chart.plot.PiePlot; 
import org.jfree.chart.ChartFrame;
import org.jfree.data.category.DefaultCategoryDataset;
*/

public class Ingreso_Productos extends javax.swing.JFrame {

    /**
     * Creates new form Ingreso_Productos
     * @param aux
     * @param c
     */
    public Ingreso_Productos(Inventariado aux) {
        initComponents();
        TC = new DefaultTableModel();
        String ids [] = {"Codigo","Nombre","Marca","Cantidad","Precio","Descripcion"};
        TC.setColumnIdentifiers(ids);
        Tabla.setModel(TC);
        inventariado = aux;
        Componentes = 0;
        Consolas = 0;
        Celulares = 0;
        Computadores = 0;
        CBCategoria.setModel(new DefaultComboBoxModel(inventariado.getListado(true)));
        CBCategoriaIngreso.setModel(new DefaultComboBoxModel(inventariado.getListado(true)));
        Componentes_Ver.setModel(new DefaultComboBoxModel(inventariado.getListado(false)));
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
        jButton1 = new javax.swing.JButton();
        GuardarBT = new javax.swing.JButton();
        Panel_Principal = new javax.swing.JPanel();
        Panel_Tabla = new javax.swing.JPanel();
        Componentes_Ver = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        Tabla = new javax.swing.JTable();
        Panel_Ingreso_Productos_Nuevos = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
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
        TFMarca = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        CBCantidad = new javax.swing.JComboBox<>();
        jLabel10 = new javax.swing.JLabel();
        TFDescripcion1 = new javax.swing.JTextField();
        jButton3 = new javax.swing.JButton();
        Panel_Ingreso_Productos_Existente = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        ButtonIngresoExistente = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        CBCategoriaIngreso = new javax.swing.JComboBox<>();
        jLabel12 = new javax.swing.JLabel();
        CBProductoIngreso = new javax.swing.JComboBox<>();
        jLabel13 = new javax.swing.JLabel();
        CBCantidadIngreso = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(800, 600));
        getContentPane().setLayout(new javax.swing.BoxLayout(getContentPane(), javax.swing.BoxLayout.PAGE_AXIS));

        jPanel1.setBackground(new java.awt.Color(7, 153, 182));
        jPanel1.setFont(new java.awt.Font("Lucida Sans", 3, 36)); // NOI18N

        jLabel7.setFont(new java.awt.Font("Lucida Sans", 1, 24)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(242, 230, 207));
        jLabel7.setText("Manejo de inventario");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1920, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(627, 627, 627)
                    .addComponent(jLabel7)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 42, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jLabel7)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        getContentPane().add(jPanel1);

        Botones.setLayout(new javax.swing.BoxLayout(Botones, javax.swing.BoxLayout.LINE_AXIS));

        jButton2.setBackground(new java.awt.Color(242, 230, 207));
        jButton2.setFont(new java.awt.Font("Lucida Sans", 3, 18)); // NOI18N
        jButton2.setForeground(new java.awt.Color(74, 110, 176));
        jButton2.setText("Refrescar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        Botones.add(jButton2);

        Productos_ExistentesBT.setBackground(new java.awt.Color(242, 230, 207));
        Productos_ExistentesBT.setFont(new java.awt.Font("Lucida Sans", 3, 18)); // NOI18N
        Productos_ExistentesBT.setForeground(new java.awt.Color(74, 110, 176));
        Productos_ExistentesBT.setText("Agregar existencias a productos existentes");
        Productos_ExistentesBT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Productos_ExistentesBTActionPerformed(evt);
            }
        });
        Botones.add(Productos_ExistentesBT);

        Nuevos_ProductosBT.setBackground(new java.awt.Color(242, 230, 207));
        Nuevos_ProductosBT.setFont(new java.awt.Font("Lucida Sans", 3, 18)); // NOI18N
        Nuevos_ProductosBT.setForeground(new java.awt.Color(74, 110, 176));
        Nuevos_ProductosBT.setText("Ingreso de productos nuevos");
        Nuevos_ProductosBT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Nuevos_ProductosBTActionPerformed(evt);
            }
        });
        Botones.add(Nuevos_ProductosBT);

        Ver_TablaBT.setBackground(new java.awt.Color(242, 230, 207));
        Ver_TablaBT.setFont(new java.awt.Font("Lucida Sans", 3, 18)); // NOI18N
        Ver_TablaBT.setForeground(new java.awt.Color(74, 110, 176));
        Ver_TablaBT.setText("Ver Tabla");
        Ver_TablaBT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Ver_TablaBTActionPerformed(evt);
            }
        });
        Botones.add(Ver_TablaBT);

        jButton1.setBackground(new java.awt.Color(242, 230, 207));
        jButton1.setFont(new java.awt.Font("Lucida Sans", 3, 18)); // NOI18N
        jButton1.setForeground(new java.awt.Color(74, 110, 176));
        jButton1.setText("Cargar inventario de un archivo");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        Botones.add(jButton1);

        GuardarBT.setBackground(new java.awt.Color(242, 230, 207));
        GuardarBT.setFont(new java.awt.Font("Lucida Sans", 3, 18)); // NOI18N
        GuardarBT.setForeground(new java.awt.Color(74, 110, 176));
        GuardarBT.setText("Guardar inventario en un archivo");
        GuardarBT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GuardarBTActionPerformed(evt);
            }
        });
        Botones.add(GuardarBT);

        getContentPane().add(Botones);

        Panel_Principal.setBackground(new java.awt.Color(255, 255, 255));
        Panel_Principal.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        Panel_Principal.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        Panel_Principal.setMaximumSize(new java.awt.Dimension(1920, 1080));
        Panel_Principal.setMinimumSize(new java.awt.Dimension(1920, 1080));
        Panel_Principal.setPreferredSize(new java.awt.Dimension(1920, 1080));
        Panel_Principal.setLayout(new java.awt.CardLayout());

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

        Panel_Ingreso_Productos_Nuevos.setBackground(new java.awt.Color(156, 210, 211));
        Panel_Ingreso_Productos_Nuevos.setLayout(new java.awt.GridBagLayout());

        jLabel1.setFont(new java.awt.Font("Lucida Sans", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(17, 76, 95));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Ingreso de Productos Nuevos");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipady = 1;
        gridBagConstraints.weightx = 1.0;
        Panel_Ingreso_Productos_Nuevos.add(jLabel1, gridBagConstraints);

        BotonIngresoNuevo.setBackground(new java.awt.Color(240, 230, 207));
        BotonIngresoNuevo.setFont(new java.awt.Font("Lucida Sans", 3, 24)); // NOI18N
        BotonIngresoNuevo.setForeground(new java.awt.Color(74, 110, 176));
        BotonIngresoNuevo.setText("Ingresar");
        BotonIngresoNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonIngresoNuevoActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipady = 1;
        gridBagConstraints.weightx = 1.0;
        Panel_Ingreso_Productos_Nuevos.add(BotonIngresoNuevo, gridBagConstraints);

        jLabel17.setFont(new java.awt.Font("Lucida Sans", 1, 18)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(17, 76, 95));
        jLabel17.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel17.setText("Categoria (Si no existe)");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipady = 1;
        gridBagConstraints.weightx = 1.0;
        Panel_Ingreso_Productos_Nuevos.add(jLabel17, gridBagConstraints);

        CategoriaTF.setFont(new java.awt.Font("Lucida Sans", 1, 18)); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipady = 1;
        gridBagConstraints.weightx = 1.0;
        Panel_Ingreso_Productos_Nuevos.add(CategoriaTF, gridBagConstraints);

        jLabel9.setFont(new java.awt.Font("Lucida Sans", 1, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(17, 76, 95));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("Categoria (Si ya existe)");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipady = 1;
        gridBagConstraints.weightx = 1.0;
        Panel_Ingreso_Productos_Nuevos.add(jLabel9, gridBagConstraints);

        CBCategoria.setFont(new java.awt.Font("Lucida Sans", 1, 18)); // NOI18N
        CBCategoria.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "NaN" }));
        CBCategoria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CBCategoriaActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipady = 1;
        gridBagConstraints.weightx = 1.0;
        Panel_Ingreso_Productos_Nuevos.add(CBCategoria, gridBagConstraints);

        jLabel3.setFont(new java.awt.Font("Lucida Sans", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(17, 76, 95));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Codigo");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipady = 1;
        gridBagConstraints.weightx = 1.0;
        Panel_Ingreso_Productos_Nuevos.add(jLabel3, gridBagConstraints);

        TFCodigo.setFont(new java.awt.Font("Lucida Sans", 1, 18)); // NOI18N
        TFCodigo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TFCodigoActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 5;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipady = 1;
        gridBagConstraints.weightx = 1.0;
        Panel_Ingreso_Productos_Nuevos.add(TFCodigo, gridBagConstraints);

        jLabel4.setFont(new java.awt.Font("Lucida Sans", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(17, 76, 95));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Nombre");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipady = 1;
        gridBagConstraints.weightx = 1.0;
        Panel_Ingreso_Productos_Nuevos.add(jLabel4, gridBagConstraints);

        TFNombre.setFont(new java.awt.Font("Lucida Sans", 1, 18)); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipady = 1;
        gridBagConstraints.weightx = 1.0;
        Panel_Ingreso_Productos_Nuevos.add(TFNombre, gridBagConstraints);

        jLabel5.setFont(new java.awt.Font("Lucida Sans", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(17, 76, 95));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Precio");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipady = 1;
        gridBagConstraints.weightx = 1.0;
        Panel_Ingreso_Productos_Nuevos.add(jLabel5, gridBagConstraints);

        TFPrecio.setFont(new java.awt.Font("Lucida Sans", 1, 18)); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipady = 1;
        gridBagConstraints.weightx = 1.0;
        Panel_Ingreso_Productos_Nuevos.add(TFPrecio, gridBagConstraints);

        jLabel6.setFont(new java.awt.Font("Lucida Sans", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(17, 76, 95));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Descripcion");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipady = 1;
        gridBagConstraints.weightx = 1.0;
        Panel_Ingreso_Productos_Nuevos.add(jLabel6, gridBagConstraints);

        TFMarca.setFont(new java.awt.Font("Lucida Sans", 1, 18)); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 5;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipady = 1;
        gridBagConstraints.weightx = 1.0;
        Panel_Ingreso_Productos_Nuevos.add(TFMarca, gridBagConstraints);

        jLabel15.setFont(new java.awt.Font("Lucida Sans", 1, 18)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(17, 76, 95));
        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel15.setText("Cantidad");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipady = 1;
        gridBagConstraints.weightx = 1.0;
        Panel_Ingreso_Productos_Nuevos.add(jLabel15, gridBagConstraints);

        CBCantidad.setFont(new java.awt.Font("Lucida Sans", 1, 18)); // NOI18N
        CBCantidad.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31", "32", "33", "34", "35", "36", "37", "38", "39", "40", "41", "42", "43", "44", "45", "46", "47", "48", "49", "50", "51", "52", "53", "54", "55", "56", "57", "58", "59", "60", "61", "62", "63", "64", "65", "66", "67", "68", "69", "70", "71", "72", "73", "74", "75", "76", "77", "78", "79", "80", "81", "82", "83", "84", "85", "86", "87", "88", "89", "90", "91", "92", "93", "94", "95", "96", "97", "98", "99" }));
        CBCantidad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CBCantidadActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 5;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipady = 1;
        gridBagConstraints.weightx = 1.0;
        Panel_Ingreso_Productos_Nuevos.add(CBCantidad, gridBagConstraints);

        jLabel10.setFont(new java.awt.Font("Lucida Sans", 1, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(17, 76, 95));
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("Marca");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipady = 1;
        gridBagConstraints.weightx = 1.0;
        Panel_Ingreso_Productos_Nuevos.add(jLabel10, gridBagConstraints);

        TFDescripcion1.setFont(new java.awt.Font("Lucida Sans", 1, 18)); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipady = 1;
        gridBagConstraints.weightx = 1.0;
        Panel_Ingreso_Productos_Nuevos.add(TFDescripcion1, gridBagConstraints);

        jButton3.setText("Agregar Imagen");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipady = 1;
        gridBagConstraints.weightx = 1.0;
        Panel_Ingreso_Productos_Nuevos.add(jButton3, gridBagConstraints);

        Panel_Principal.add(Panel_Ingreso_Productos_Nuevos, "card2");

        Panel_Ingreso_Productos_Existente.setBackground(new java.awt.Color(17, 76, 95));
        Panel_Ingreso_Productos_Existente.setLayout(new java.awt.GridLayout(6, 2, 10, 150));

        jLabel8.setFont(new java.awt.Font("Lucida Sans", 1, 24)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(156, 210, 211));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("Ingreso");
        Panel_Ingreso_Productos_Existente.add(jLabel8);

        ButtonIngresoExistente.setBackground(new java.awt.Color(240, 230, 207));
        ButtonIngresoExistente.setFont(new java.awt.Font("Lucida Sans", 3, 24)); // NOI18N
        ButtonIngresoExistente.setForeground(new java.awt.Color(74, 110, 176));
        ButtonIngresoExistente.setText("Ingresar");
        ButtonIngresoExistente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonIngresoExistenteActionPerformed(evt);
            }
        });
        Panel_Ingreso_Productos_Existente.add(ButtonIngresoExistente);

        jLabel11.setFont(new java.awt.Font("Lucida Sans", 1, 24)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(156, 210, 211));
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setText("Categoria");
        Panel_Ingreso_Productos_Existente.add(jLabel11);

        CBCategoriaIngreso.setFont(new java.awt.Font("Lucida Sans", 1, 18)); // NOI18N
        CBCategoriaIngreso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CBCategoriaIngresoActionPerformed(evt);
            }
        });
        Panel_Ingreso_Productos_Existente.add(CBCategoriaIngreso);

        jLabel12.setFont(new java.awt.Font("Lucida Sans", 1, 24)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(156, 210, 211));
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setText("Producto");
        Panel_Ingreso_Productos_Existente.add(jLabel12);

        CBProductoIngreso.setFont(new java.awt.Font("Lucida Sans", 1, 18)); // NOI18N
        CBProductoIngreso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CBProductoIngresoActionPerformed(evt);
            }
        });
        Panel_Ingreso_Productos_Existente.add(CBProductoIngreso);

        jLabel13.setFont(new java.awt.Font("Lucida Sans", 1, 24)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(156, 210, 211));
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel13.setText("Cantidad a ingresar");
        Panel_Ingreso_Productos_Existente.add(jLabel13);

        CBCantidadIngreso.setFont(new java.awt.Font("Lucida Sans", 1, 18)); // NOI18N
        CBCantidadIngreso.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31", "32", "33", "34", "35", "36", "37", "38", "39", "40", "41", "42", "43", "44", "45", "46", "47", "48", "49", "50", "51", "52", "53", "54", "55", "56", "57", "58", "59", "60", "61", "62", "63", "64", "65", "66", "67", "68", "69", "70", "71", "72", "73", "74", "75", "76", "77", "78", "79", "80", "81", "82", "83", "84", "85", "86", "87", "88", "89", "90", "91", "92", "93", "94", "95", "96", "97", "98", "99" }));
        CBCantidadIngreso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CBCantidadIngresoActionPerformed(evt);
            }
        });
        Panel_Ingreso_Productos_Existente.add(CBCantidadIngreso);

        Panel_Principal.add(Panel_Ingreso_Productos_Existente, "card3");

        getContentPane().add(Panel_Principal);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void CBCategoriaIngresoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CBCategoriaIngresoActionPerformed
        // TODO add your handling code here:
        String categoriaSeleccionada = CBCategoriaIngreso.getSelectedItem().toString();
    
        Object[] productos = inventariado.getCategoria(categoriaSeleccionada).getListado();
    
        String[] productosString = new String[productos.length];
        for (int i = 0; i < productos.length; i++) 
        {
            productosString[i] = productos[i].toString();
        }
    
        CBProductoIngreso.setModel(new DefaultComboBoxModel<>(productosString));
        Refrescar();
    }//GEN-LAST:event_CBCategoriaIngresoActionPerformed

    private void ButtonIngresoExistenteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonIngresoExistenteActionPerformed
        // TODO add your handling code here:
        String categoriaSeleccionada = CBCategoriaIngreso.getSelectedItem().toString();
        if(!"NaN".equals(categoriaSeleccionada))
        {
            String productoSeleccionado = CBProductoIngreso.getSelectedItem().toString();
            int cantidadIngresada = Integer.parseInt(CBCantidadIngreso.getSelectedItem().toString());

            Categoria categoria = inventariado.getCategoria(categoriaSeleccionada);
            Producto producto = categoria.getProducto(productoSeleccionado);

            producto.AumentarCantidad(cantidadIngresada);
            inventariado.getCategoria(Componentes_Ver.getSelectedItem().toString()).mostrarTabla(TC);
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
        if("NaN".equals(CBCategoria.getSelectedItem().toString()))
        {
             cat=CategoriaTF.getText().toString();          
        }
        else
        {
            cat = CBCategoria.getSelectedItem().toString();
        }
        Producto prd;
        prd = new Producto(TFCodigo.getText(), TFNombre.getText(),TFMarca.getText(), Double.parseDouble(TFPrecio.getText()), TFMarca.getText(), Integer.parseInt(CBCantidad.getSelectedItem().toString()),aux);
        inventariado.agregar_Producto(prd, cat);
        JOptionPane.showMessageDialog(null, "Ingreso\n"+prd, "Mensaje", JOptionPane.INFORMATION_MESSAGE);
        
        reset();
    } 
    else {
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
        inventariado.getCategoria(Componentes_Ver.getSelectedItem().toString()).mostrarTabla(TC);
        Refrescar();
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

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
            JFileChooser jFileChooser3 = new JFileChooser();
            jFileChooser3.setAcceptAllFileFilterUsed(false); 
            FileNameExtensionFilter filter = new FileNameExtensionFilter("Archivos de datos(*.dat)", "dat");
            jFileChooser3.addChoosableFileFilter(filter); 
            jFileChooser3.setDialogTitle("Selecciona un archivo para cargar los datos");
            if (jFileChooser3.showSaveDialog(null) == JFileChooser.APPROVE_OPTION) 
            {
                File file = jFileChooser3.getSelectedFile();
                 inventariado.Leer(file); 
                 Refrescar();
            }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void GuardarBTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GuardarBTActionPerformed
        // TODO add your handling code here:
            JFileChooser jFileChooser3 = new JFileChooser();
            jFileChooser3.setDialogTitle("Selecciona un archivo para cargar los datos");
            jFileChooser3.setAcceptAllFileFilterUsed(false); 
            FileNameExtensionFilter filter = new FileNameExtensionFilter("Archivos de datos(*.dat)", "dat");
            jFileChooser3.addChoosableFileFilter(filter); 
            if (jFileChooser3.showSaveDialog(null) == JFileChooser.APPROVE_OPTION) {
                File file = jFileChooser3.getSelectedFile();
                file = new File(file.getParentFile(), file.getName() + ".dat");
                inventariado.GuardarTodo(file);           
                Refrescar();
        }
    }//GEN-LAST:event_GuardarBTActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        Refrescar();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        JFileChooser jFileChooser3 = new JFileChooser();
            jFileChooser3.setDialogTitle("Selecciona una imagen los datos");
            if (jFileChooser3.showSaveDialog(null) == JFileChooser.APPROVE_OPTION) {
                File file = jFileChooser3.getSelectedFile();
                aux=new ImageIcon(file.getAbsolutePath()); 
                Image xd = aux.getImage().getScaledInstance(350, 350, Image.SCALE_SMOOTH);
                aux=new ImageIcon(xd);
                Refrescar();
        }
    }//GEN-LAST:event_jButton3ActionPerformed

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
        return !"".equals(TFCodigo.getText())&&!"".equals(TFNombre.getText())&&!"".equals(TFPrecio.getText())&&!"".equals(TFMarca.getText());
    }
    
  
    public void reset()
    {
        CBCategoria.setSelectedIndex(0);
        CategoriaTF.setText("");
        TFCodigo.setText("");
        TFNombre.setText("");
        TFPrecio.setText("");
        TFMarca.setText("");
        CBCantidad.setSelectedIndex(0);
        aux=null;
        Refrescar();
    }
    
    public static DefaultComboBoxModel<String> ModeloCant(int i)
    {
        String[] elementos = new String [i];
        for (int x = 0; x < i; x++)
        {
            elementos[x] = String.valueOf(x + 1);
        }
        return new DefaultComboBoxModel<>(elementos);
    }
    public void Refrescar()
    {
        CBCategoria.setModel(new DefaultComboBoxModel(inventariado.getListado(true)));
        CBCategoriaIngreso.setModel(new DefaultComboBoxModel(inventariado.getListado(true)));
        Componentes_Ver.setModel(new DefaultComboBoxModel(inventariado.getListado(true)));
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotonIngresoNuevo;
    private javax.swing.JPanel Botones;
    private javax.swing.JButton ButtonIngresoExistente;
    private javax.swing.JComboBox<String> CBCantidad;
    private javax.swing.JComboBox<String> CBCantidadIngreso;
    private javax.swing.JComboBox<String> CBCategoria;
    private javax.swing.JComboBox<String> CBCategoriaIngreso;
    private javax.swing.JComboBox<String> CBProductoIngreso;
    private javax.swing.JTextField CategoriaTF;
    private javax.swing.JComboBox<String> Componentes_Ver;
    private javax.swing.JButton GuardarBT;
    private javax.swing.JButton Nuevos_ProductosBT;
    private javax.swing.JPanel Panel_Ingreso_Productos_Existente;
    private javax.swing.JPanel Panel_Ingreso_Productos_Nuevos;
    private javax.swing.JPanel Panel_Principal;
    private javax.swing.JPanel Panel_Tabla;
    private javax.swing.JButton Productos_ExistentesBT;
    private javax.swing.JTextField TFCodigo;
    private javax.swing.JTextField TFDescripcion1;
    private javax.swing.JTextField TFMarca;
    private javax.swing.JTextField TFNombre;
    private javax.swing.JTextField TFPrecio;
    private javax.swing.JTable Tabla;
    private javax.swing.JButton Ver_TablaBT;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
    private Inventariado inventariado;
    private int Componentes, Consolas, Celulares, Computadores;
    private  DefaultTableModel TC;
    private ImageIcon aux;
}
