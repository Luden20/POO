/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package proyecto_tienda_electronica;
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
        VerFacturaBT = new javax.swing.JButton();
        VerBarrasBT = new javax.swing.JButton();
        VerPastelBT1 = new javax.swing.JButton();
        Panel_Principal = new javax.swing.JPanel();
        Panel_Tabla = new javax.swing.JPanel();
        Componentes_Ver = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        Tabla = new javax.swing.JTable();
        Panel_Factura = new javax.swing.JPanel();
        jButton5 = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        FAC = new javax.swing.JTextArea();
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
        TFMarca = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        CBCantidad = new javax.swing.JComboBox<>();
        jLabel10 = new javax.swing.JLabel();
        TFDescripcion1 = new javax.swing.JTextField();
        jButton3 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
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

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(800, 600));
        getContentPane().setLayout(new javax.swing.BoxLayout(getContentPane(), javax.swing.BoxLayout.PAGE_AXIS));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setFont(new java.awt.Font("Lucida Sans", 3, 36)); // NOI18N

        jLabel7.setFont(new java.awt.Font("Lucida Sans", 1, 24)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(64, 64, 64));
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
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(21, Short.MAX_VALUE)
                .addComponent(jLabel7)
                .addContainerGap())
        );

        getContentPane().add(jPanel1);

        Botones.setLayout(new javax.swing.BoxLayout(Botones, javax.swing.BoxLayout.X_AXIS));

        jButton2.setBackground(new java.awt.Color(255, 59, 63));
        jButton2.setFont(new java.awt.Font("Lucida Sans", 3, 18)); // NOI18N
        jButton2.setForeground(new java.awt.Color(242, 242, 242));
        jButton2.setText("Refrescar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        Botones.add(jButton2);

        Productos_ExistentesBT.setBackground(new java.awt.Color(255, 59, 63));
        Productos_ExistentesBT.setFont(new java.awt.Font("Lucida Sans", 3, 18)); // NOI18N
        Productos_ExistentesBT.setForeground(new java.awt.Color(242, 242, 242));
        Productos_ExistentesBT.setText("Modificar Productos Existentes");
        Productos_ExistentesBT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Productos_ExistentesBTActionPerformed(evt);
            }
        });
        Botones.add(Productos_ExistentesBT);

        Nuevos_ProductosBT.setBackground(new java.awt.Color(255, 59, 63));
        Nuevos_ProductosBT.setFont(new java.awt.Font("Lucida Sans", 3, 18)); // NOI18N
        Nuevos_ProductosBT.setForeground(new java.awt.Color(242, 242, 242));
        Nuevos_ProductosBT.setText("Ingresar Productos Nuevos");
        Nuevos_ProductosBT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Nuevos_ProductosBTActionPerformed(evt);
            }
        });
        Botones.add(Nuevos_ProductosBT);

        Ver_TablaBT.setBackground(new java.awt.Color(255, 59, 63));
        Ver_TablaBT.setFont(new java.awt.Font("Lucida Sans", 3, 18)); // NOI18N
        Ver_TablaBT.setForeground(new java.awt.Color(242, 242, 242));
        Ver_TablaBT.setText("VerTabla");
        Ver_TablaBT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Ver_TablaBTActionPerformed(evt);
            }
        });
        Botones.add(Ver_TablaBT);

        jButton1.setBackground(new java.awt.Color(255, 59, 63));
        jButton1.setFont(new java.awt.Font("Lucida Sans", 3, 18)); // NOI18N
        jButton1.setForeground(new java.awt.Color(242, 242, 242));
        jButton1.setText("Cargar inventario");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        Botones.add(jButton1);

        GuardarBT.setBackground(new java.awt.Color(255, 59, 63));
        GuardarBT.setFont(new java.awt.Font("Lucida Sans", 3, 18)); // NOI18N
        GuardarBT.setForeground(new java.awt.Color(242, 242, 242));
        GuardarBT.setText("Guardar inventario/Seleccionar Archivo");
        GuardarBT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GuardarBTActionPerformed(evt);
            }
        });
        Botones.add(GuardarBT);

        VerFacturaBT.setBackground(new java.awt.Color(255, 59, 63));
        VerFacturaBT.setFont(new java.awt.Font("Lucida Sans", 3, 18)); // NOI18N
        VerFacturaBT.setForeground(new java.awt.Color(242, 242, 242));
        VerFacturaBT.setText("Ver Facturas");
        VerFacturaBT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VerFacturaBTActionPerformed(evt);
            }
        });
        Botones.add(VerFacturaBT);

        VerBarrasBT.setBackground(new java.awt.Color(255, 59, 63));
        VerBarrasBT.setFont(new java.awt.Font("Lucida Sans", 3, 18)); // NOI18N
        VerBarrasBT.setForeground(new java.awt.Color(242, 242, 242));
        VerBarrasBT.setText("Ver G.Barras");
        VerBarrasBT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VerBarrasBTActionPerformed(evt);
            }
        });
        Botones.add(VerBarrasBT);

        VerPastelBT1.setBackground(new java.awt.Color(255, 59, 63));
        VerPastelBT1.setFont(new java.awt.Font("Lucida Sans", 3, 18)); // NOI18N
        VerPastelBT1.setForeground(new java.awt.Color(242, 242, 242));
        VerPastelBT1.setText("Ver G.Barras");
        VerPastelBT1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VerPastelBT1ActionPerformed(evt);
            }
        });
        Botones.add(VerPastelBT1);

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

        Panel_Factura.setLayout(new java.awt.BorderLayout());

        jButton5.setBackground(new java.awt.Color(255, 59, 63));
        jButton5.setFont(new java.awt.Font("Lucida Sans", 3, 24)); // NOI18N
        jButton5.setForeground(new java.awt.Color(242, 242, 242));
        jButton5.setText("Seleccionar Factura");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        Panel_Factura.add(jButton5, java.awt.BorderLayout.PAGE_START);

        FAC.setEditable(false);
        FAC.setColumns(20);
        FAC.setRows(5);
        jScrollPane3.setViewportView(FAC);

        Panel_Factura.add(jScrollPane3, java.awt.BorderLayout.CENTER);

        Panel_Principal.add(Panel_Factura, "card5");

        BotonIngresoNuevo.setBackground(new java.awt.Color(255, 59, 63));
        BotonIngresoNuevo.setFont(new java.awt.Font("Lucida Sans", 3, 24)); // NOI18N
        BotonIngresoNuevo.setForeground(new java.awt.Color(242, 242, 242));
        BotonIngresoNuevo.setText("Ingresar");
        BotonIngresoNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonIngresoNuevoActionPerformed(evt);
            }
        });

        jLabel17.setFont(new java.awt.Font("Lucida Sans", 1, 18)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(64, 64, 64));
        jLabel17.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel17.setText("Categoria (Si no existe)");

        CategoriaTF.setBackground(new java.awt.Color(202, 235, 242));
        CategoriaTF.setFont(new java.awt.Font("Lucida Sans", 1, 18)); // NOI18N

        jLabel9.setFont(new java.awt.Font("Lucida Sans", 1, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(64, 64, 64));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("Categoria (Si ya existe)");

        CBCategoria.setBackground(new java.awt.Color(202, 235, 242));
        CBCategoria.setFont(new java.awt.Font("Lucida Sans", 1, 18)); // NOI18N
        CBCategoria.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "NaN" }));
        CBCategoria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CBCategoriaActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Lucida Sans", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(64, 64, 64));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Codigo");

        TFCodigo.setBackground(new java.awt.Color(202, 235, 242));
        TFCodigo.setFont(new java.awt.Font("Lucida Sans", 1, 18)); // NOI18N
        TFCodigo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TFCodigoActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Lucida Sans", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(64, 64, 64));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Nombre");

        TFNombre.setBackground(new java.awt.Color(202, 235, 242));
        TFNombre.setFont(new java.awt.Font("Lucida Sans", 1, 18)); // NOI18N

        jLabel5.setFont(new java.awt.Font("Lucida Sans", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(64, 64, 64));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Precio");

        TFPrecio.setBackground(new java.awt.Color(202, 235, 242));
        TFPrecio.setFont(new java.awt.Font("Lucida Sans", 1, 18)); // NOI18N

        jLabel6.setFont(new java.awt.Font("Lucida Sans", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(64, 64, 64));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Descripcion");

        TFMarca.setBackground(new java.awt.Color(202, 235, 242));
        TFMarca.setFont(new java.awt.Font("Lucida Sans", 1, 18)); // NOI18N

        jLabel15.setFont(new java.awt.Font("Lucida Sans", 1, 18)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(64, 64, 64));
        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel15.setText("Imagen");

        CBCantidad.setBackground(new java.awt.Color(202, 235, 242));
        CBCantidad.setFont(new java.awt.Font("Lucida Sans", 1, 18)); // NOI18N
        CBCantidad.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31", "32", "33", "34", "35", "36", "37", "38", "39", "40", "41", "42", "43", "44", "45", "46", "47", "48", "49", "50", "51", "52", "53", "54", "55", "56", "57", "58", "59", "60", "61", "62", "63", "64", "65", "66", "67", "68", "69", "70", "71", "72", "73", "74", "75", "76", "77", "78", "79", "80", "81", "82", "83", "84", "85", "86", "87", "88", "89", "90", "91", "92", "93", "94", "95", "96", "97", "98", "99" }));
        CBCantidad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CBCantidadActionPerformed(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Lucida Sans", 1, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(64, 64, 64));
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("Marca");

        TFDescripcion1.setBackground(new java.awt.Color(202, 235, 242));
        TFDescripcion1.setFont(new java.awt.Font("Lucida Sans", 1, 18)); // NOI18N

        jButton3.setBackground(new java.awt.Color(202, 235, 242));
        jButton3.setFont(new java.awt.Font("Lucida Sans", 0, 12)); // NOI18N
        jButton3.setText("Agregar Imagen");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Lucida Sans", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(64, 64, 64));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Ingreso de Productos Nuevos");

        jLabel16.setFont(new java.awt.Font("Lucida Sans", 1, 18)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(64, 64, 64));
        jLabel16.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel16.setText("Cantidad");

        javax.swing.GroupLayout Panel_Ingreso_Productos_NuevosLayout = new javax.swing.GroupLayout(Panel_Ingreso_Productos_Nuevos);
        Panel_Ingreso_Productos_Nuevos.setLayout(Panel_Ingreso_Productos_NuevosLayout);
        Panel_Ingreso_Productos_NuevosLayout.setHorizontalGroup(
            Panel_Ingreso_Productos_NuevosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Panel_Ingreso_Productos_NuevosLayout.createSequentialGroup()
                .addGroup(Panel_Ingreso_Productos_NuevosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Panel_Ingreso_Productos_NuevosLayout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addGroup(Panel_Ingreso_Productos_NuevosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(Panel_Ingreso_Productos_NuevosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(Panel_Ingreso_Productos_NuevosLayout.createSequentialGroup()
                                    .addComponent(jLabel10)
                                    .addGap(185, 185, 185)
                                    .addComponent(TFMarca, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(Panel_Ingreso_Productos_NuevosLayout.createSequentialGroup()
                                    .addGroup(Panel_Ingreso_Productos_NuevosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel17)
                                        .addComponent(jLabel9))
                                    .addGap(25, 25, 25)
                                    .addGroup(Panel_Ingreso_Productos_NuevosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(CategoriaTF)
                                        .addComponent(CBCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGroup(Panel_Ingreso_Productos_NuevosLayout.createSequentialGroup()
                                    .addComponent(jLabel4)
                                    .addGap(168, 168, 168)
                                    .addComponent(TFNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(Panel_Ingreso_Productos_NuevosLayout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addGap(186, 186, 186)
                                .addComponent(TFPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(4, 4, 4)))
                        .addGap(38, 38, 38)
                        .addGroup(Panel_Ingreso_Productos_NuevosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addComponent(jLabel3)
                            .addComponent(jLabel16)
                            .addComponent(jLabel15))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(Panel_Ingreso_Productos_NuevosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(CBCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(TFDescripcion1, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(TFCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(Panel_Ingreso_Productos_NuevosLayout.createSequentialGroup()
                        .addGap(294, 294, 294)
                        .addComponent(jLabel2))
                    .addGroup(Panel_Ingreso_Productos_NuevosLayout.createSequentialGroup()
                        .addGap(427, 427, 427)
                        .addComponent(BotonIngresoNuevo)))
                .addContainerGap(1118, Short.MAX_VALUE))
        );
        Panel_Ingreso_Productos_NuevosLayout.setVerticalGroup(
            Panel_Ingreso_Productos_NuevosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Panel_Ingreso_Productos_NuevosLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jLabel2)
                .addGroup(Panel_Ingreso_Productos_NuevosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Panel_Ingreso_Productos_NuevosLayout.createSequentialGroup()
                        .addGap(73, 73, 73)
                        .addGroup(Panel_Ingreso_Productos_NuevosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(TFCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(28, 28, 28)
                        .addGroup(Panel_Ingreso_Productos_NuevosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(TFDescripcion1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(28, 28, 28)
                        .addGroup(Panel_Ingreso_Productos_NuevosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(CBCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(23, 23, 23)
                        .addGroup(Panel_Ingreso_Productos_NuevosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(Panel_Ingreso_Productos_NuevosLayout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addGroup(Panel_Ingreso_Productos_NuevosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(TFNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(28, 28, 28)
                        .addGroup(Panel_Ingreso_Productos_NuevosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(CBCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(28, 28, 28)
                        .addGroup(Panel_Ingreso_Productos_NuevosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(CategoriaTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(28, 28, 28)
                        .addGroup(Panel_Ingreso_Productos_NuevosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(TFPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(28, 28, 28)
                        .addGroup(Panel_Ingreso_Productos_NuevosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(TFMarca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(65, 65, 65)
                .addComponent(BotonIngresoNuevo)
                .addContainerGap(646, Short.MAX_VALUE))
        );

        Panel_Principal.add(Panel_Ingreso_Productos_Nuevos, "card2");

        Panel_Ingreso_Productos_Existente.setLayout(new java.awt.GridBagLayout());

        jLabel8.setFont(new java.awt.Font("Lucida Sans", 1, 24)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(64, 64, 64));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("Imagen");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.ipady = 7;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(59, 40, 0, 0);
        Panel_Ingreso_Productos_Existente.add(jLabel8, gridBagConstraints);

        ButtonIngresoExistente.setBackground(new java.awt.Color(255, 59, 63));
        ButtonIngresoExistente.setFont(new java.awt.Font("Lucida Sans", 3, 24)); // NOI18N
        ButtonIngresoExistente.setForeground(new java.awt.Color(242, 242, 242));
        ButtonIngresoExistente.setText("Ingresar");
        ButtonIngresoExistente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonIngresoExistenteActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 8;
        gridBagConstraints.gridwidth = 12;
        gridBagConstraints.ipadx = 223;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(84, 129, 71, 0);
        Panel_Ingreso_Productos_Existente.add(ButtonIngresoExistente, gridBagConstraints);

        jLabel11.setFont(new java.awt.Font("Lucida Sans", 1, 24)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(64, 64, 64));
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setText("Categoria");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.ipady = 7;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(60, 40, 0, 0);
        Panel_Ingreso_Productos_Existente.add(jLabel11, gridBagConstraints);

        CBCategoriaIngreso.setBackground(new java.awt.Color(202, 235, 242));
        CBCategoriaIngreso.setFont(new java.awt.Font("Lucida Sans", 1, 18)); // NOI18N
        CBCategoriaIngreso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CBCategoriaIngresoActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 7;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridwidth = 13;
        gridBagConstraints.ipadx = 209;
        gridBagConstraints.ipady = 9;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(60, 38, 0, 101);
        Panel_Ingreso_Productos_Existente.add(CBCategoriaIngreso, gridBagConstraints);

        jLabel12.setFont(new java.awt.Font("Lucida Sans", 1, 24)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(64, 64, 64));
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setText("Producto");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.ipady = 7;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(51, 40, 0, 0);
        Panel_Ingreso_Productos_Existente.add(jLabel12, gridBagConstraints);

        CBProductoIngreso.setBackground(new java.awt.Color(202, 235, 242));
        CBProductoIngreso.setFont(new java.awt.Font("Lucida Sans", 1, 18)); // NOI18N
        CBProductoIngreso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CBProductoIngresoActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 7;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.gridwidth = 13;
        gridBagConstraints.ipadx = 209;
        gridBagConstraints.ipady = 9;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(49, 38, 0, 101);
        Panel_Ingreso_Productos_Existente.add(CBProductoIngreso, gridBagConstraints);

        jLabel13.setFont(new java.awt.Font("Lucida Sans", 1, 24)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(64, 64, 64));
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel13.setText("Cantidad a ingresar");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.gridwidth = 4;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.ipady = 7;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(69, 40, 0, 0);
        Panel_Ingreso_Productos_Existente.add(jLabel13, gridBagConstraints);

        CBCantidadIngreso.setBackground(new java.awt.Color(202, 235, 242));
        CBCantidadIngreso.setFont(new java.awt.Font("Lucida Sans", 1, 18)); // NOI18N
        CBCantidadIngreso.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31", "32", "33", "34", "35", "36", "37", "38", "39", "40", "41", "42", "43", "44", "45", "46", "47", "48", "49", "50", "51", "52", "53", "54", "55", "56", "57", "58", "59", "60", "61", "62", "63", "64", "65", "66", "67", "68", "69", "70", "71", "72", "73", "74", "75", "76", "77", "78", "79", "80", "81", "82", "83", "84", "85", "86", "87", "88", "89", "90", "91", "92", "93", "94", "95", "96", "97", "98", "99" }));
        CBCantidadIngreso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CBCantidadIngresoActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 7;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.gridwidth = 13;
        gridBagConstraints.ipadx = 205;
        gridBagConstraints.ipady = 9;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(65, 42, 0, 101);
        Panel_Ingreso_Productos_Existente.add(CBCantidadIngreso, gridBagConstraints);

        jButton4.setBackground(new java.awt.Color(202, 235, 242));
        jButton4.setText("Ingreso de Imagen");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 7;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.gridwidth = 13;
        gridBagConstraints.ipadx = 162;
        gridBagConstraints.ipady = 14;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(53, 42, 0, 101);
        Panel_Ingreso_Productos_Existente.add(jButton4, gridBagConstraints);

        jLabel14.setFont(new java.awt.Font("Lucida Sans", 1, 24)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(64, 64, 64));
        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel14.setText("Ingreso de Productos");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 5;
        gridBagConstraints.ipadx = 3;
        gridBagConstraints.ipady = 7;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(60, 16, 0, 0);
        Panel_Ingreso_Productos_Existente.add(jLabel14, gridBagConstraints);

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
        //Refrescar();
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
            producto.ModificarImagen(aux);
            inventariado.getCategoria(Componentes_Ver.getSelectedItem().toString()).mostrarTabla(TC);
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
                        cat = rellenarEspacios(CategoriaTF.getText(),15);          
                    } 
                    else 
                    {
                        cat = rellenarEspacios(CBCategoria.getSelectedItem().toString(),15);
                    }
                    // Rellenar con espacios si los valores son menores a 15 caracteres
                    Producto prd = new Producto
                    (
                        rellenarEspacios(TFCodigo.getText(), 5),
                        rellenarEspacios(TFNombre.getText(), 15),
                        rellenarEspacios(TFMarca.getText(), 15),
                        Double.parseDouble(TFPrecio.getText()),
                        rellenarEspacios(TFDescripcion1.getText(), 40),
                        Integer.parseInt(CBCantidad.getSelectedItem().toString()),
                        aux
                    );
                    
                    if(faux!=null)
                    {
                        inventariado.agregar_Producto(prd, cat);
                        inventariado.GuardarTodo(faux);
                        JOptionPane.showMessageDialog(null, "Ingreso\n"+prd, "Mensaje", JOptionPane.INFORMATION_MESSAGE);
                    }
                    else
                    {
                        JOptionPane.showMessageDialog(this, "Seleccione un archivo sobre el que escribir", "ERROR", JOptionPane.ERROR_MESSAGE);
                    }
                    
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
        inventariado.getCategoria(Componentes_Ver.getSelectedItem().toString()).mostrarTabla(TC);
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
                faux = jFileChooser3.getSelectedFile();
                faux = new File(faux.getParentFile(), faux.getName() + ".dat");
                inventariado.GuardarTodo(faux);           
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
                jButton3.setBackground(Color.green);
                JOptionPane.showMessageDialog(null, "Imagen cargada con exito", "Mensaje", JOptionPane.INFORMATION_MESSAGE);

        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void VerFacturaBTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VerFacturaBTActionPerformed
        // TODO add your handling code here:
        Panel_Principal.removeAll();
        Panel_Principal.add(Panel_Factura);
        Panel_Principal.repaint();
        Panel_Principal.revalidate();
        Refrescar();
    }//GEN-LAST:event_VerFacturaBTActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
        String x="";
        JFileChooser jFileChooser3 = new JFileChooser();
            jFileChooser3.setDialogTitle("Selecciona un archivo para cargar los datos");
            jFileChooser3.setAcceptAllFileFilterUsed(false); 
            FileNameExtensionFilter filter = new FileNameExtensionFilter("Archivos de datos(*.dat)", "dat");
            jFileChooser3.addChoosableFileFilter(filter); 
            if (jFileChooser3.showSaveDialog(null) == JFileChooser.APPROVE_OPTION) {
                FAC.setText("");
                File file = jFileChooser3.getSelectedFile();
                Factura f=new Factura(new Cliente());
                x=f.Leer(file);
                System.out.println(x);
                FAC.setText(x);
                Refrescar();
        }
        
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        JFileChooser jFileChooser3 = new JFileChooser();
            jFileChooser3.setDialogTitle("Selecciona una imagen los datos");
            if (jFileChooser3.showSaveDialog(null) == JFileChooser.APPROVE_OPTION) {
                File file = jFileChooser3.getSelectedFile();
                aux=new ImageIcon(file.getAbsolutePath()); 
                Image xd = aux.getImage().getScaledInstance(350, 350, Image.SCALE_SMOOTH);
                aux=new ImageIcon(xd);
                JOptionPane.showMessageDialog(null, "Imagen cargada con exito", "Mensaje", JOptionPane.INFORMATION_MESSAGE);
                jButton4.setBackground(Color.green);
        }
    }//GEN-LAST:event_jButton4ActionPerformed

    private void VerBarrasBTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VerBarrasBTActionPerformed
        // TODO add your handling code here:
        inventariado.graficoBarras();
    }//GEN-LAST:event_VerBarrasBTActionPerformed

    private void VerPastelBT1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VerPastelBT1ActionPerformed
        // TODO add your handling code here:
        inventariado.graficoPastel();
    }//GEN-LAST:event_VerPastelBT1ActionPerformed

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
            elementos[x] = String.valueOf(x );
        }
        return new DefaultComboBoxModel<>(elementos);
    }
    public void Refrescar()
    {
        CBCategoria.setModel(new DefaultComboBoxModel(inventariado.getListado(true)));
        CBCategoriaIngreso.setModel(new DefaultComboBoxModel(inventariado.getListado(true)));
        Componentes_Ver.setModel(new DefaultComboBoxModel(inventariado.getListado(true)));
        aux=null;
        jButton3.setBackground(Color.white);
        jButton4.setBackground(Color.white);
    }
    
    private boolean validarLongitud() 
    {
    return TFCodigo.getText().length() <= 5 &&
           TFNombre.getText().length() <= 15 &&
           TFMarca.getText().length() <= 15 &&
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
    private javax.swing.JTextArea FAC;
    private javax.swing.JButton GuardarBT;
    private javax.swing.JButton Nuevos_ProductosBT;
    private javax.swing.JPanel Panel_Factura;
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
    private javax.swing.JButton VerBarrasBT;
    private javax.swing.JButton VerFacturaBT;
    private javax.swing.JButton VerPastelBT1;
    private javax.swing.JButton Ver_TablaBT;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    // End of variables declaration//GEN-END:variables
    private Inventariado inventariado;
    private int Componentes, Consolas, Celulares, Computadores;
    private  DefaultTableModel TC;
    private ImageIcon aux;
    private File faux;
}
