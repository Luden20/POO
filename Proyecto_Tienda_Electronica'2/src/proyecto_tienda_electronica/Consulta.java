/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package proyecto_tienda_electronica;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.LinkedHashMap;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author polip
 */
public class Consulta extends javax.swing.JFrame {

    /**
     * Creates new form Consulta
     * @param c
     * @param aux
     */
    public Consulta(Cliente c,Inventariado aux) {
        initComponents();
        TC =new DefaultTableModel();
        String ids [] = {"Codigo","Nombre","Cantidad","PrecioU","PrecioT"};
        TC.setColumnIdentifiers(ids);
        TB_Factura.setModel(TC);
        clientefinal=c;
        inventariado=aux;
        UsuarioTx.setText("Bienvenido "+c.getNombre()+" a GadgetGalaxy");
        Facturafinal=new Factura(clientefinal);
        CategoriaCB.setModel(new DefaultComboBoxModel(inventariado.getListado()));
        
    }

    private Consulta() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Panel_Superior = new javax.swing.JPanel();
        UsuarioTx = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        Panel_Principal = new javax.swing.JPanel();
        Panel_Ver = new javax.swing.JPanel();
        CategoriaCB = new javax.swing.JComboBox<>();
        ProductosCB = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        CODIGO = new javax.swing.JScrollPane();
        CODIGO_TA = new javax.swing.JTextArea();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane6 = new javax.swing.JScrollPane();
        PRODUCTO_TA = new javax.swing.JTextArea();
        jLabel4 = new javax.swing.JLabel();
        PRECIO = new javax.swing.JScrollPane();
        PRECIO_TA = new javax.swing.JTextArea();
        jLabel7 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        DescripcionTA = new javax.swing.JTextArea();
        jLabel6 = new javax.swing.JLabel();
        CantidadCB = new javax.swing.JComboBox<>();
        jLabel9 = new javax.swing.JLabel();
        PagarB = new javax.swing.JButton();
        Panel_Informacion = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        TB_Factura = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jScrollPane5 = new javax.swing.JScrollPane();
        CEDULA_TA = new javax.swing.JTextArea();
        jLabel11 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        NOMBRE_TA = new javax.swing.JTextArea();
        jLabel12 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        DIRECCION_TA = new javax.swing.JTextArea();
        jLabel3 = new javax.swing.JLabel();
        PTotalJL = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        PagarBT = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(1920, 1080));
        setMinimumSize(new java.awt.Dimension(1920, 1080));
        setPreferredSize(new java.awt.Dimension(1920, 1080));
        getContentPane().setLayout(new javax.swing.BoxLayout(getContentPane(), javax.swing.BoxLayout.Y_AXIS));

        Panel_Superior.setBackground(new java.awt.Color(102, 153, 255));
        Panel_Superior.setAlignmentY(0.25F);
        Panel_Superior.setMaximumSize(new java.awt.Dimension(32767, 327));
        Panel_Superior.setLayout(new java.awt.GridLayout(1, 2));

        UsuarioTx.setFont(new java.awt.Font("Lucida Sans", 3, 36)); // NOI18N
        UsuarioTx.setForeground(new java.awt.Color(51, 0, 51));
        UsuarioTx.setText("Bienvenido usuario");
        Panel_Superior.add(UsuarioTx);

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyecto_tienda_electronica/shop_117803.png"))); // NOI18N
        Panel_Superior.add(jLabel2);

        getContentPane().add(Panel_Superior);

        Panel_Principal.setLayout(new javax.swing.BoxLayout(Panel_Principal, javax.swing.BoxLayout.X_AXIS));

        Panel_Ver.setBackground(new java.awt.Color(204, 204, 204));
        Panel_Ver.setLayout(new java.awt.GridLayout(8, 3, 15, 30));

        CategoriaCB.setFont(new java.awt.Font("Lucida Sans", 1, 24)); // NOI18N
        CategoriaCB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CategoriaCBActionPerformed(evt);
            }
        });
        Panel_Ver.add(CategoriaCB);

        ProductosCB.setFont(new java.awt.Font("Lucida Sans", 1, 24)); // NOI18N
        ProductosCB.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione una categoria", " " }));
        ProductosCB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ProductosCBActionPerformed(evt);
            }
        });
        Panel_Ver.add(ProductosCB);

        jLabel1.setFont(new java.awt.Font("Lucida Sans", 1, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("CODIGO");
        Panel_Ver.add(jLabel1);

        CODIGO_TA.setEditable(false);
        CODIGO_TA.setColumns(20);
        CODIGO_TA.setFont(new java.awt.Font("Lucida Sans", 0, 24)); // NOI18N
        CODIGO_TA.setRows(5);
        CODIGO.setViewportView(CODIGO_TA);

        Panel_Ver.add(CODIGO);

        jLabel5.setFont(new java.awt.Font("Lucida Sans", 1, 24)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("PRODUCTO");
        Panel_Ver.add(jLabel5);

        PRODUCTO_TA.setEditable(false);
        PRODUCTO_TA.setColumns(20);
        PRODUCTO_TA.setFont(new java.awt.Font("Lucida Sans", 0, 24)); // NOI18N
        PRODUCTO_TA.setRows(5);
        jScrollPane6.setViewportView(PRODUCTO_TA);

        Panel_Ver.add(jScrollPane6);

        jLabel4.setFont(new java.awt.Font("Lucida Sans", 1, 24)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("PRECIO");
        Panel_Ver.add(jLabel4);

        PRECIO_TA.setEditable(false);
        PRECIO_TA.setColumns(20);
        PRECIO_TA.setFont(new java.awt.Font("Lucida Sans", 0, 24)); // NOI18N
        PRECIO_TA.setRows(5);
        PRECIO.setViewportView(PRECIO_TA);

        Panel_Ver.add(PRECIO);

        jLabel7.setFont(new java.awt.Font("Lucida Sans", 1, 24)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Descripcion");
        Panel_Ver.add(jLabel7);

        DescripcionTA.setEditable(false);
        DescripcionTA.setColumns(20);
        DescripcionTA.setFont(new java.awt.Font("Lucida Sans", 0, 24)); // NOI18N
        DescripcionTA.setRows(5);
        jScrollPane2.setViewportView(DescripcionTA);

        Panel_Ver.add(jScrollPane2);

        jLabel6.setFont(new java.awt.Font("Lucida Sans", 1, 24)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Cantidad");
        Panel_Ver.add(jLabel6);

        CantidadCB.setFont(new java.awt.Font("Lucida Sans", 1, 36)); // NOI18N
        CantidadCB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CantidadCBActionPerformed(evt);
            }
        });
        Panel_Ver.add(CantidadCB);

        jLabel9.setFont(new java.awt.Font("Lucida Sans", 1, 12)); // NOI18N
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Panel_Ver.add(jLabel9);

        PagarB.setFont(new java.awt.Font("Segoe UI", 3, 24)); // NOI18N
        PagarB.setForeground(new java.awt.Color(0, 51, 255));
        PagarB.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyecto_tienda_electronica/shopping-cart-add-button_icon-icons.com_56132 (1).png"))); // NOI18N
        PagarB.setText("Agregar");
        PagarB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PagarBActionPerformed(evt);
            }
        });
        Panel_Ver.add(PagarB);

        Panel_Principal.add(Panel_Ver);

        Panel_Informacion.setBackground(new java.awt.Color(102, 204, 0));
        Panel_Informacion.setLayout(new javax.swing.BoxLayout(Panel_Informacion, javax.swing.BoxLayout.PAGE_AXIS));

        TB_Factura.setFont(new java.awt.Font("Lucida Sans", 0, 18)); // NOI18N
        TB_Factura.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Codigo", "Nombre", "Cantidad", "PrecioUnitario", "PrecioTotal"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(TB_Factura);

        Panel_Informacion.add(jScrollPane1);

        jPanel1.setBackground(new java.awt.Color(102, 102, 102));
        jPanel1.setLayout(new java.awt.GridLayout(6, 2, 0, 30));

        jLabel8.setFont(new java.awt.Font("Lucida Sans", 1, 24)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("Cedula");
        jPanel1.add(jLabel8);

        CEDULA_TA.setEditable(false);
        CEDULA_TA.setColumns(20);
        CEDULA_TA.setFont(new java.awt.Font("Lucida Sans", 0, 36)); // NOI18N
        CEDULA_TA.setRows(5);
        jScrollPane5.setViewportView(CEDULA_TA);

        jPanel1.add(jScrollPane5);

        jLabel11.setFont(new java.awt.Font("Lucida Sans", 1, 24)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setText("Nombre");
        jPanel1.add(jLabel11);

        NOMBRE_TA.setEditable(false);
        NOMBRE_TA.setColumns(20);
        NOMBRE_TA.setFont(new java.awt.Font("Lucida Sans", 0, 36)); // NOI18N
        NOMBRE_TA.setRows(5);
        jScrollPane4.setViewportView(NOMBRE_TA);

        jPanel1.add(jScrollPane4);

        jLabel12.setFont(new java.awt.Font("Lucida Sans", 1, 24)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setText("Direccion");
        jPanel1.add(jLabel12);

        DIRECCION_TA.setEditable(false);
        DIRECCION_TA.setColumns(20);
        DIRECCION_TA.setFont(new java.awt.Font("Lucida Sans", 0, 36)); // NOI18N
        DIRECCION_TA.setRows(5);
        jScrollPane3.setViewportView(DIRECCION_TA);

        jPanel1.add(jScrollPane3);

        jLabel3.setFont(new java.awt.Font("Lucida Sans", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Total a pagar");
        jPanel1.add(jLabel3);

        PTotalJL.setFont(new java.awt.Font("Lucida Sans", 1, 18)); // NOI18N
        PTotalJL.setForeground(new java.awt.Color(255, 255, 255));
        PTotalJL.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        PTotalJL.setText("Total");
        jPanel1.add(PTotalJL);

        jLabel13.setFont(new java.awt.Font("Lucida Sans", 1, 12)); // NOI18N
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel1.add(jLabel13);

        PagarBT.setFont(new java.awt.Font("Segoe UI", 3, 24)); // NOI18N
        PagarBT.setForeground(new java.awt.Color(0, 153, 153));
        PagarBT.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyecto_tienda_electronica/pay_cash_payment_money_dollar_bill_icon_143267.png"))); // NOI18N
        PagarBT.setText("Pagar");
        PagarBT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PagarBTActionPerformed(evt);
            }
        });
        jPanel1.add(PagarBT);

        Panel_Informacion.add(jPanel1);

        Panel_Principal.add(Panel_Informacion);

        getContentPane().add(Panel_Principal);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void CategoriaCBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CategoriaCBActionPerformed
        // TODO add your handling code here:
        //Esta linea setea el modelo de la combo box de productos
        //Tengo una funcion de categoria que devuelve un arr de objetos
        //Para acceder a esta categoria reviso en existenicas y buscao en funcion de lo que se seleccione en la combo box de categoria
       ProductosCB.setModel(new DefaultComboBoxModel(inventariado.getCategoria(CategoriaCB.getSelectedItem().toString()).getListado()));
       mostrarProducto();
    }//GEN-LAST:event_CategoriaCBActionPerformed

    private void PagarBTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PagarBTActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(null, "Gracias por comprar con nosotros "+clientefinal.getNombre(), "Mensaje", JOptionPane.INFORMATION_MESSAGE);
            JFileChooser jFileChooser3 = new JFileChooser();
            jFileChooser3.setDialogTitle("Selecciona una carpeta para guardar la factura");
            if (jFileChooser3.showSaveDialog(null) == JFileChooser.APPROVE_OPTION) {
            File file = jFileChooser3.getSelectedFile();
            try 
            {
                 FileWriter e = new FileWriter(file);
                 Facturafinal.GuardarFactura(e); 
            } 
            catch (IOException e) 
            { 
                JOptionPane.showMessageDialog(null, "Error al ecargar " + e.getMessage(), "Ta mal >:V", JOptionPane.ERROR_MESSAGE);
            }
        }
    }//GEN-LAST:event_PagarBTActionPerformed

    private void ProductosCBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ProductosCBActionPerformed
        // TODO add your handling code here:
        mostrarProducto();
    }//GEN-LAST:event_ProductosCBActionPerformed

    private void CantidadCBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CantidadCBActionPerformed
        // TODO add your handling code here:
        //mostrarProducto();
        System.out.println("Se selecciono"+CantidadCB.getSelectedItem().toString());
        
    }//GEN-LAST:event_CantidadCBActionPerformed

    private void PagarBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PagarBActionPerformed
        // TODO add your handling code here:
        //Reviso que haya stock para dejar agregar al carrito
        if(CantidadCB.getItemCount()!=0)
        {
            //Obtengo el producto que se selecciona en base a las combo box
            Producto aux=inventariado.getCategoria(CategoriaCB.getSelectedItem().toString()).getProducto(ProductosCB.getSelectedItem().toString());
            //Agrego el producto para modifcarlo y agregarlo y paso la cantidad seleccionada
            aux.ReducirCantidad(Integer.parseInt(CantidadCB.getSelectedItem().toString()));
            Facturafinal.agregarProducto(aux,Integer.parseInt(CantidadCB.getSelectedItem().toString()));
            //En base a los productos que esten en la factura muestro el total que se debe pagar
            PTotalJL.setText(String.format("%.2f",Facturafinal.getTotalProd())+"USD");
            //Llamo al metodo msotrat tabla que actualiza la tabla en base a la factura
            Facturafinal.mostratTabla(TC);
        }
        else
        {
            JOptionPane.showMessageDialog(this,"No hay existencias del producto", "Error", JOptionPane.ERROR_MESSAGE);
        }
        
        mostrarProducto();
    }//GEN-LAST:event_PagarBActionPerformed
    //Metodos mios
    public void mostrarProducto()
    {
        //Mismo que arriba, selecciono el producto en bse a los combo box
       Producto aux=inventariado.getCategoria(CategoriaCB.getSelectedItem().toString()).getProducto(ProductosCB.getSelectedItem().toString());
       //Muestro todo lo pertienente
       CODIGO_TA.setText(aux.getCodigo());
       PRODUCTO_TA.setText(aux.getNombre());
       PRECIO_TA.setText(aux.getPrecioUnitario());
       DescripcionTA.setText(aux.getDescripcion());
       //Aqui creo un combo box que va desde 1 hasta las existencias , todo se hace una funcion aparte
       CantidadCB.setModel(ModeloCantidad(aux.getCantidadINT())); 
       mostrarDatos();
    }
    public void mostrarDatos()
    {
        //Muestros los datos del cliente
        CEDULA_TA.setText(clientefinal.getCedula());
        NOMBRE_TA.setText(clientefinal.getNombre());
        DIRECCION_TA.setText(clientefinal.getDireccion());
    }
    //Es una funcion que devuelve un modelo para una combo box desde el 1 hasta el numero de parametro
    public static DefaultComboBoxModel<String> ModeloCantidad(int i) {
        String[] elementos = new String[i];
        for (int x = 0; x < i; x++) {
            elementos[x] = String.valueOf(x + 1);
        }
        return new DefaultComboBoxModel<>(elementos);
    }
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
            java.util.logging.Logger.getLogger(Consulta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Consulta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Consulta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Consulta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Consulta().setVisible(true);
                
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea CEDULA_TA;
    private javax.swing.JScrollPane CODIGO;
    private javax.swing.JTextArea CODIGO_TA;
    private javax.swing.JComboBox<String> CantidadCB;
    private javax.swing.JComboBox<String> CategoriaCB;
    private javax.swing.JTextArea DIRECCION_TA;
    private javax.swing.JTextArea DescripcionTA;
    private javax.swing.JTextArea NOMBRE_TA;
    private javax.swing.JScrollPane PRECIO;
    private javax.swing.JTextArea PRECIO_TA;
    private javax.swing.JTextArea PRODUCTO_TA;
    private javax.swing.JLabel PTotalJL;
    private javax.swing.JButton PagarB;
    private javax.swing.JButton PagarBT;
    private javax.swing.JPanel Panel_Informacion;
    private javax.swing.JPanel Panel_Principal;
    private javax.swing.JPanel Panel_Superior;
    private javax.swing.JPanel Panel_Ver;
    private javax.swing.JComboBox<String> ProductosCB;
    private javax.swing.JTable TB_Factura;
    private javax.swing.JLabel UsuarioTx;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
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
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    // End of variables declaration//GEN-END:variables
    private Inventariado inventariado;
    private Cliente clientefinal;
    private Factura Facturafinal;
    private  DefaultTableModel TC;
}
