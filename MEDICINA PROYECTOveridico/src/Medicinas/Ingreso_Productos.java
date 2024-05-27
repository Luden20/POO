/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Medicinas;
import java.awt.Color;
import java.awt.Image;
import java.io.File;
import javax.swing.table.DefaultTableModel;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.filechooser.FileNameExtensionFilter;
import java.util.Map;
import javax.swing.JOptionPane;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.JFreeChart;
import org.jfree.data.general.DefaultPieDataset; 
import org.jfree.chart.ChartFrame;
import org.jfree.data.category.DefaultCategoryDataset;
import Medicinas.Almacenamiento_Medicinas;


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
    public Ingreso_Productos(Almacenamiento_Medicinas aux) {
        initComponents();
        TC = new DefaultTableModel();    
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

        jPanel1 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        Botones = new javax.swing.JPanel();
        jButton2 = new javax.swing.JButton();
        Productos_ExistentesBT = new javax.swing.JButton();
        Nuevos_ProductosBT = new javax.swing.JButton();
        Ver_TablaBT = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        GuardarBT = new javax.swing.JButton();
        VerBarrasBT = new javax.swing.JButton();
        Panel_Principal = new javax.swing.JPanel();
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
        jLabel15 = new javax.swing.JLabel();
        CBCantidad = new javax.swing.JComboBox<>();
        jLabel10 = new javax.swing.JLabel();
        TFDescripcion1 = new javax.swing.JTextField();
        jButton3 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        TFFechaElaboracion = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        TFFechaVencimiento = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        Panel_Estadisticas = new javax.swing.JPanel();
        Panel_Ingreso_Productos_Existente = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        ButtonIngresoExistente = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        CBCategoriaIngreso = new javax.swing.JComboBox<>();
        jLabel12 = new javax.swing.JLabel();
        CBProductoIngreso = new javax.swing.JComboBox<>();
        jLabel13 = new javax.swing.JLabel();
        CBCantidadIngreso = new javax.swing.JComboBox<>();
        jButton4 = new javax.swing.JButton();
        jLabel14 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(800, 600));
        getContentPane().setLayout(new javax.swing.BoxLayout(getContentPane(), javax.swing.BoxLayout.PAGE_AXIS));

        jPanel1.setBackground(new java.awt.Color(1, 82, 73));
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.setFont(new java.awt.Font("Lucida Sans", 3, 36)); // NOI18N

        jLabel7.setFont(new java.awt.Font("Lucida Sans", 1, 24)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
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

        Botones.setLayout(new javax.swing.BoxLayout(Botones, javax.swing.BoxLayout.X_AXIS));

        jButton2.setBackground(new java.awt.Color(87, 188, 144));
        jButton2.setFont(new java.awt.Font("Lucida Sans", 3, 18)); // NOI18N
        jButton2.setForeground(new java.awt.Color(242, 242, 242));
        jButton2.setText("Refrescar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        Botones.add(jButton2);

        Productos_ExistentesBT.setBackground(new java.awt.Color(87, 188, 144));
        Productos_ExistentesBT.setFont(new java.awt.Font("Lucida Sans", 3, 18)); // NOI18N
        Productos_ExistentesBT.setForeground(new java.awt.Color(242, 242, 242));
        Productos_ExistentesBT.setText("Modificar Productos Existentes");
        Productos_ExistentesBT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Productos_ExistentesBTActionPerformed(evt);
            }
        });
        Botones.add(Productos_ExistentesBT);

        Nuevos_ProductosBT.setBackground(new java.awt.Color(87, 188, 144));
        Nuevos_ProductosBT.setFont(new java.awt.Font("Lucida Sans", 3, 18)); // NOI18N
        Nuevos_ProductosBT.setForeground(new java.awt.Color(242, 242, 242));
        Nuevos_ProductosBT.setText("Ingresar Productos Nuevos");
        Nuevos_ProductosBT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Nuevos_ProductosBTActionPerformed(evt);
            }
        });
        Botones.add(Nuevos_ProductosBT);

        Ver_TablaBT.setBackground(new java.awt.Color(87, 188, 144));
        Ver_TablaBT.setFont(new java.awt.Font("Lucida Sans", 3, 18)); // NOI18N
        Ver_TablaBT.setForeground(new java.awt.Color(242, 242, 242));
        Ver_TablaBT.setText("VerTabla");
        Ver_TablaBT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Ver_TablaBTActionPerformed(evt);
            }
        });
        Botones.add(Ver_TablaBT);

        jButton1.setBackground(new java.awt.Color(87, 188, 144));
        jButton1.setFont(new java.awt.Font("Lucida Sans", 3, 18)); // NOI18N
        jButton1.setForeground(new java.awt.Color(242, 242, 242));
        jButton1.setText("Cargar inventario");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        Botones.add(jButton1);

        GuardarBT.setBackground(new java.awt.Color(87, 188, 144));
        GuardarBT.setFont(new java.awt.Font("Lucida Sans", 3, 18)); // NOI18N
        GuardarBT.setForeground(new java.awt.Color(242, 242, 242));
        GuardarBT.setText("Guardar inventario/Seleccionar Archivo");
        GuardarBT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GuardarBTActionPerformed(evt);
            }
        });
        Botones.add(GuardarBT);

        VerBarrasBT.setBackground(new java.awt.Color(87, 188, 144));
        VerBarrasBT.setFont(new java.awt.Font("Lucida Sans", 3, 18)); // NOI18N
        VerBarrasBT.setForeground(new java.awt.Color(242, 242, 242));
        VerBarrasBT.setText("Estadisticas");
        VerBarrasBT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VerBarrasBTActionPerformed(evt);
            }
        });
        Botones.add(VerBarrasBT);

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

        Panel_Ingreso_Productos_Nuevos.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        BotonIngresoNuevo.setFont(new java.awt.Font("Lucida Sans", 1, 24)); // NOI18N
        BotonIngresoNuevo.setForeground(new java.awt.Color(24, 18, 30));
        BotonIngresoNuevo.setText("Ingresar");
        BotonIngresoNuevo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        BotonIngresoNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonIngresoNuevoActionPerformed(evt);
            }
        });
        Panel_Ingreso_Productos_Nuevos.add(BotonIngresoNuevo, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 360, 190, 50));

        jLabel17.setBackground(new java.awt.Color(205, 205, 205));
        jLabel17.setFont(new java.awt.Font("Lucida Sans", 1, 18)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(24, 18, 30));
        jLabel17.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel17.setText("Categoria (Si no existe)");
        Panel_Ingreso_Productos_Nuevos.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 210, -1, 28));

        CategoriaTF.setFont(new java.awt.Font("Lucida Sans", 1, 18)); // NOI18N
        CategoriaTF.setForeground(new java.awt.Color(24, 18, 30));
        Panel_Ingreso_Productos_Nuevos.add(CategoriaTF, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 210, 202, -1));

        jLabel9.setBackground(new java.awt.Color(205, 205, 205));
        jLabel9.setFont(new java.awt.Font("Lucida Sans", 1, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(24, 18, 30));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("Categoria (Si ya existe)");
        Panel_Ingreso_Productos_Nuevos.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 160, -1, 28));

        CBCategoria.setFont(new java.awt.Font("Lucida Sans", 1, 18)); // NOI18N
        CBCategoria.setForeground(new java.awt.Color(24, 18, 30));
        CBCategoria.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "NaN" }));
        CBCategoria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CBCategoriaActionPerformed(evt);
            }
        });
        Panel_Ingreso_Productos_Nuevos.add(CBCategoria, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 160, 202, -1));

        jLabel3.setBackground(new java.awt.Color(205, 205, 205));
        jLabel3.setFont(new java.awt.Font("Lucida Sans", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(24, 18, 30));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Codigo");
        Panel_Ingreso_Productos_Nuevos.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 110, -1, 28));

        TFCodigo.setFont(new java.awt.Font("Lucida Sans", 1, 18)); // NOI18N
        TFCodigo.setForeground(new java.awt.Color(24, 18, 30));
        TFCodigo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TFCodigoActionPerformed(evt);
            }
        });
        Panel_Ingreso_Productos_Nuevos.add(TFCodigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 110, 175, -1));

        jLabel4.setBackground(new java.awt.Color(205, 205, 205));
        jLabel4.setFont(new java.awt.Font("Lucida Sans", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(24, 18, 30));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Nombre");
        Panel_Ingreso_Productos_Nuevos.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, -1, 28));

        TFNombre.setFont(new java.awt.Font("Lucida Sans", 1, 18)); // NOI18N
        TFNombre.setForeground(new java.awt.Color(24, 18, 30));
        Panel_Ingreso_Productos_Nuevos.add(TFNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 110, 202, -1));

        jLabel5.setBackground(new java.awt.Color(205, 205, 205));
        jLabel5.setFont(new java.awt.Font("Lucida Sans", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(24, 18, 30));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Precio");
        Panel_Ingreso_Productos_Nuevos.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 260, -1, 28));

        TFPrecio.setFont(new java.awt.Font("Lucida Sans", 1, 18)); // NOI18N
        TFPrecio.setForeground(new java.awt.Color(24, 18, 30));
        Panel_Ingreso_Productos_Nuevos.add(TFPrecio, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 260, 202, -1));

        jLabel6.setBackground(new java.awt.Color(205, 205, 205));
        jLabel6.setFont(new java.awt.Font("Lucida Sans", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(24, 18, 30));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Descripcion");
        Panel_Ingreso_Productos_Nuevos.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 160, -1, 28));

        TFFabricante.setFont(new java.awt.Font("Lucida Sans", 1, 18)); // NOI18N
        TFFabricante.setForeground(new java.awt.Color(24, 18, 30));
        Panel_Ingreso_Productos_Nuevos.add(TFFabricante, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 310, 202, -1));

        jLabel15.setBackground(new java.awt.Color(205, 205, 205));
        jLabel15.setFont(new java.awt.Font("Lucida Sans", 1, 18)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(24, 18, 30));
        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel15.setText("Imagen");
        Panel_Ingreso_Productos_Nuevos.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 360, -1, 28));

        CBCantidad.setFont(new java.awt.Font("Lucida Sans", 1, 18)); // NOI18N
        CBCantidad.setForeground(new java.awt.Color(24, 18, 30));
        CBCantidad.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31", "32", "33", "34", "35", "36", "37", "38", "39", "40", "41", "42", "43", "44", "45", "46", "47", "48", "49", "50", "51", "52", "53", "54", "55", "56", "57", "58", "59", "60", "61", "62", "63", "64", "65", "66", "67", "68", "69", "70", "71", "72", "73", "74", "75", "76", "77", "78", "79", "80", "81", "82", "83", "84", "85", "86", "87", "88", "89", "90", "91", "92", "93", "94", "95", "96", "97", "98", "99" }));
        CBCantidad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CBCantidadActionPerformed(evt);
            }
        });
        Panel_Ingreso_Productos_Nuevos.add(CBCantidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 310, 175, -1));

        jLabel10.setBackground(new java.awt.Color(205, 205, 205));
        jLabel10.setFont(new java.awt.Font("Lucida Sans", 1, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(24, 18, 30));
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("Fabricante");
        Panel_Ingreso_Productos_Nuevos.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 310, -1, 28));

        TFDescripcion1.setFont(new java.awt.Font("Lucida Sans", 1, 18)); // NOI18N
        TFDescripcion1.setForeground(new java.awt.Color(24, 18, 30));
        Panel_Ingreso_Productos_Nuevos.add(TFDescripcion1, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 160, 175, -1));

        jButton3.setFont(new java.awt.Font("Lucida Sans", 0, 12)); // NOI18N
        jButton3.setForeground(new java.awt.Color(24, 18, 30));
        jButton3.setText("Agregar Imagen");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        Panel_Ingreso_Productos_Nuevos.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 360, 200, 28));

        jLabel2.setFont(new java.awt.Font("Lucida Sans", 1, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(24, 18, 30));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Ingreso de Medicinas Nuevas");
        Panel_Ingreso_Productos_Nuevos.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, -1, -1));

        jLabel16.setBackground(new java.awt.Color(205, 205, 205));
        jLabel16.setFont(new java.awt.Font("Lucida Sans", 1, 18)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(24, 18, 30));
        jLabel16.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel16.setText("Cantidad");
        Panel_Ingreso_Productos_Nuevos.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 310, -1, 28));

        TFFechaElaboracion.setFont(new java.awt.Font("Lucida Sans", 1, 18)); // NOI18N
        TFFechaElaboracion.setForeground(new java.awt.Color(24, 18, 30));
        Panel_Ingreso_Productos_Nuevos.add(TFFechaElaboracion, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 210, 175, -1));

        jLabel18.setBackground(new java.awt.Color(205, 205, 205));
        jLabel18.setFont(new java.awt.Font("Lucida Sans", 1, 18)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(24, 18, 30));
        jLabel18.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel18.setText("Fecha elaboracion");
        Panel_Ingreso_Productos_Nuevos.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 210, -1, 28));

        TFFechaVencimiento.setFont(new java.awt.Font("Lucida Sans", 1, 18)); // NOI18N
        TFFechaVencimiento.setForeground(new java.awt.Color(24, 18, 30));
        Panel_Ingreso_Productos_Nuevos.add(TFFechaVencimiento, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 260, 175, -1));

        jLabel19.setBackground(new java.awt.Color(205, 205, 205));
        jLabel19.setFont(new java.awt.Font("Lucida Sans", 1, 18)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(24, 18, 30));
        jLabel19.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel19.setText("Fecha vencimiento");
        Panel_Ingreso_Productos_Nuevos.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 260, -1, 28));

        jLabel1.setForeground(new java.awt.Color(24, 18, 30));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/turquesa olas.jpg"))); // NOI18N
        Panel_Ingreso_Productos_Nuevos.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-50, -60, -1, -1));

        Panel_Principal.add(Panel_Ingreso_Productos_Nuevos, "card2");

        Panel_Estadisticas.setLayout(new java.awt.GridBagLayout());
        Panel_Principal.add(Panel_Estadisticas, "card3");

        Panel_Ingreso_Productos_Existente.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel8.setFont(new java.awt.Font("Lucida Sans", 1, 24)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(24, 18, 30));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("Imagen");
        jLabel8.setToolTipText("");
        Panel_Ingreso_Productos_Existente.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 440, -1, 37));

        ButtonIngresoExistente.setBackground(new java.awt.Color(204, 255, 204));
        ButtonIngresoExistente.setFont(new java.awt.Font("Lucida Sans", 1, 24)); // NOI18N
        ButtonIngresoExistente.setForeground(new java.awt.Color(51, 51, 51));
        ButtonIngresoExistente.setText("Ingresar");
        ButtonIngresoExistente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonIngresoExistenteActionPerformed(evt);
            }
        });
        Panel_Ingreso_Productos_Existente.add(ButtonIngresoExistente, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 540, 355, -1));

        jLabel11.setFont(new java.awt.Font("Lucida Sans", 1, 24)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(24, 18, 30));
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setText("Categoria");
        jLabel11.setToolTipText("");
        Panel_Ingreso_Productos_Existente.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 150, -1, 37));

        CBCategoriaIngreso.setFont(new java.awt.Font("Lucida Sans", 1, 18)); // NOI18N
        CBCategoriaIngreso.setForeground(new java.awt.Color(24, 18, 30));
        CBCategoriaIngreso.setToolTipText("");
        CBCategoriaIngreso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CBCategoriaIngresoActionPerformed(evt);
            }
        });
        Panel_Ingreso_Productos_Existente.add(CBCategoriaIngreso, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 150, 281, 37));

        jLabel12.setFont(new java.awt.Font("Lucida Sans", 1, 24)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(24, 18, 30));
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setText("Medicina");
        jLabel12.setToolTipText("");
        Panel_Ingreso_Productos_Existente.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 240, -1, 37));

        CBProductoIngreso.setFont(new java.awt.Font("Lucida Sans", 1, 18)); // NOI18N
        CBProductoIngreso.setForeground(new java.awt.Color(24, 18, 30));
        CBProductoIngreso.setToolTipText("");
        CBProductoIngreso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CBProductoIngresoActionPerformed(evt);
            }
        });
        Panel_Ingreso_Productos_Existente.add(CBProductoIngreso, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 240, 281, 37));

        jLabel13.setFont(new java.awt.Font("Lucida Sans", 1, 24)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(24, 18, 30));
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel13.setText("Cantidad a ingresar");
        jLabel13.setToolTipText("");
        Panel_Ingreso_Productos_Existente.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 350, -1, 37));

        CBCantidadIngreso.setFont(new java.awt.Font("Lucida Sans", 1, 18)); // NOI18N
        CBCantidadIngreso.setForeground(new java.awt.Color(24, 18, 30));
        CBCantidadIngreso.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31", "32", "33", "34", "35", "36", "37", "38", "39", "40", "41", "42", "43", "44", "45", "46", "47", "48", "49", "50", "51", "52", "53", "54", "55", "56", "57", "58", "59", "60", "61", "62", "63", "64", "65", "66", "67", "68", "69", "70", "71", "72", "73", "74", "75", "76", "77", "78", "79", "80", "81", "82", "83", "84", "85", "86", "87", "88", "89", "90", "91", "92", "93", "94", "95", "96", "97", "98", "99" }));
        CBCantidadIngreso.setToolTipText("");
        CBCantidadIngreso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CBCantidadIngresoActionPerformed(evt);
            }
        });
        Panel_Ingreso_Productos_Existente.add(CBCantidadIngreso, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 340, 277, 37));

        jButton4.setFont(new java.awt.Font("Segoe UI", 2, 18)); // NOI18N
        jButton4.setForeground(new java.awt.Color(24, 18, 30));
        jButton4.setText("Ingresar Imagen");
        jButton4.setToolTipText("");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        Panel_Ingreso_Productos_Existente.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 440, 280, 37));

        jLabel14.setFont(new java.awt.Font("Lucida Sans", 1, 30)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(24, 18, 30));
        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel14.setText("Actualizar información de Medicinas");
        jLabel14.setToolTipText("");
        Panel_Ingreso_Productos_Existente.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 60, 580, 37));

        jLabel20.setIcon(new javax.swing.ImageIcon(getClass().getResource("/otro fondo turquesa.jpg"))); // NOI18N
        Panel_Ingreso_Productos_Existente.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -60, -1, -1));

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
                Medicinas.Cambiar(productoSeleccionado, "DI",rellenarEspacios(faux.getAbsolutePath(),50) );
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
                        cat = rellenarEspacios(CategoriaTF.getText(),10);          
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
                            rellenarEspacios(TFCodigo.getText(), 6),
                            cat,                       
                            rellenarEspacios(TFNombre.getText(), 15),
                            rellenarEspacios(TFFabricante.getText(), 15),
                            Integer.parseInt(CBCantidad.getSelectedItem().toString()),
                            Double.parseDouble(TFPrecio.getText()),
                            rellenarEspacios(TFFechaElaboracion.getText(), 8),
                            rellenarEspacios(TFFechaVencimiento.getText(), 8),
                            rellenarEspacios(TFDescripcion1.getText(), 50),
                            rellenarEspacios(faux.getAbsolutePath(),50)
                        );
                    }
                    else
                    {
                        Medicinas.Ingresar
                        (
                            rellenarEspacios(TFCodigo.getText(), 6),
                            cat,                       
                            rellenarEspacios(TFNombre.getText(), 15),
                            rellenarEspacios(TFFabricante.getText(), 15),
                            Integer.parseInt(CBCantidad.getSelectedItem().toString()),
                            Double.parseDouble(TFPrecio.getText()),
                            rellenarEspacios(TFFechaElaboracion.getText(), 8),
                            rellenarEspacios(TFFechaVencimiento.getText(), 8),
                            rellenarEspacios(TFDescripcion1.getText(), 50)
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

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
            /*JFileChooser jFileChooser3 = new JFileChooser();
            jFileChooser3.setAcceptAllFileFilterUsed(false); 
            FileNameExtensionFilter filter = new FileNameExtensionFilter("Archivos de datos(*.dat)", "dat");
            jFileChooser3.addChoosableFileFilter(filter); 
            jFileChooser3.setDialogTitle("Selecciona un archivo para cargar los datos");
            if (jFileChooser3.showSaveDialog(null) == JFileChooser.APPROVE_OPTION) 
            {
                File file = jFileChooser3.getSelectedFile();
                 Medicinas.Leer(file); 
                 Refrescar();
            }*/
    }//GEN-LAST:event_jButton1ActionPerformed

    private void GuardarBTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GuardarBTActionPerformed
        // TODO add your handling code here:
        
            JFileChooser jFileChooser3 = new JFileChooser();
            jFileChooser3.setDialogTitle("Selecciona un archivo para cargar los datos");
            jFileChooser3.setAcceptAllFileFilterUsed(false); 
            FileNameExtensionFilter filter = new FileNameExtensionFilter("Archivos de datos(*.dat)", "dat");
            jFileChooser3.addChoosableFileFilter(filter); 
            if (jFileChooser3.showSaveDialog(null) == JFileChooser.APPROVE_OPTION) {
                faux = jFileChooser3.getSelectedFile();
                faux = new File(faux.getParentFile(), faux.getName() + ".dat");         
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
                faux = jFileChooser3.getSelectedFile();
                jButton3.setBackground(Color.green);
                JOptionPane.showMessageDialog(null, "Imagen cargada con exito", "Mensaje", JOptionPane.INFORMATION_MESSAGE);

        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        JFileChooser jFileChooser3 = new JFileChooser();
            jFileChooser3.setDialogTitle("Selecciona una imagen los datos");
            if (jFileChooser3.showSaveDialog(null) == JFileChooser.APPROVE_OPTION) {
                File file = jFileChooser3.getSelectedFile();
                JOptionPane.showMessageDialog(null, "Imagen cargada con exito", "Mensaje", JOptionPane.INFORMATION_MESSAGE);
                jButton4.setBackground(Color.green);
        }
    }//GEN-LAST:event_jButton4ActionPerformed

    private void VerBarrasBTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VerBarrasBTActionPerformed
        Panel_Principal.removeAll();
        Panel_Principal.add(Panel_Estadisticas);
        Panel_Principal.repaint();
        Panel_Principal.revalidate();
    }//GEN-LAST:event_VerBarrasBTActionPerformed

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
    
    public static DefaultComboBoxModel<String> ModeloCant(int i)
    {
        String[] elementos = new String [i];
        for (int x = 0; x < i; x++)
        {
            elementos[x] = String.valueOf(x );
        }
        return new DefaultComboBoxModel<>(elementos);
    }
    public void Refrescar()
    {
        CBCategoria.setModel(new DefaultComboBoxModel(Medicinas.getListadoCategorias(true)));
        CBCategoriaIngreso.setModel(new DefaultComboBoxModel(Medicinas.getListadoCategorias(true)));
        Componentes_Ver.setModel(new DefaultComboBoxModel(Medicinas.getListadoCategorias(true)));
        aux=null;
        jButton3.setBackground(Color.white);
        jButton4.setBackground(Color.white);
    }
    
    private boolean validarLongitud() 
    {
    return TFCodigo.getText().length() <= 5 &&
           TFNombre.getText().length() <= 15 &&
           TFFabricante.getText().length() <= 15 &&
           TFDescripcion1.getText().length() <= 40;
    }
    
    private String rellenarEspacios(String str, int longitud) 
    {
      for (int i =str.length();i < longitud;i++) 
        {
            str =str+ " ";
        }
        return str;
    }
    
    
    //Falta importar la biblioteca Jfreechart?

    
    
    
 
    

    
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
    private javax.swing.JPanel Panel_Estadisticas;
    private javax.swing.JPanel Panel_Ingreso_Productos_Existente;
    private javax.swing.JPanel Panel_Ingreso_Productos_Nuevos;
    private javax.swing.JPanel Panel_Principal;
    private javax.swing.JPanel Panel_Tabla;
    private javax.swing.JButton Productos_ExistentesBT;
    private javax.swing.JTextField TFCodigo;
    private javax.swing.JTextField TFDescripcion1;
    private javax.swing.JTextField TFFabricante;
    private javax.swing.JTextField TFFechaElaboracion;
    private javax.swing.JTextField TFFechaVencimiento;
    private javax.swing.JTextField TFNombre;
    private javax.swing.JTextField TFPrecio;
    private javax.swing.JTable Tabla;
    private javax.swing.JButton VerBarrasBT;
    private javax.swing.JButton Ver_TablaBT;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
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
    private Almacenamiento_Medicinas Medicinas;
    private int Componentes, Consolas, Celulares, Computadores;
    private  DefaultTableModel TC;
    private ImageIcon aux;
    private File faux;
}
