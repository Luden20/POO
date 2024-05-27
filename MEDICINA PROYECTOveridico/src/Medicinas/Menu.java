package Medicinas;

import Medicinas.ALMACENAMIENTO_CLIENTES;
import javax.swing.JFrame;
import javax.swing.JOptionPane;


public class Menu extends javax.swing.JFrame {
    public Menu(Almacenamiento_Medicinas MEDICINAS, ALMACENAMIENTO_CLIENTES CLIENTES,Almacenamiento_Medicinas FAC) {
        this.MEDICINAS = MEDICINAS;
        this.FACTURA=FAC;
        this.CLIENTES = CLIENTES;
        initComponents();
    }

    private Menu() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        TT_USUARIO = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        INGRESO = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        TT_PASSWORD = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new java.awt.BorderLayout());

        jPanel2.setBackground(new java.awt.Color(0, 0, 0));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "COMPANIA DE TURISMO PEPE'S TRAVELS", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Felix Titling", 3, 24), new java.awt.Color(255, 255, 255))); // NOI18N
        jPanel2.setPreferredSize(new java.awt.Dimension(700, 50));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 689, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 14, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel2, java.awt.BorderLayout.PAGE_START);

        jPanel3.setBackground(new java.awt.Color(153, 204, 255));
        jPanel3.setPreferredSize(new java.awt.Dimension(700, 350));

        jPanel4.setBackground(new java.awt.Color(102, 102, 0));
        jPanel4.setPreferredSize(new java.awt.Dimension(400, 300));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(204, 255, 255));
        jLabel1.setText("USUARIO:");

        TT_USUARIO.setBackground(new java.awt.Color(51, 51, 51));
        TT_USUARIO.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        TT_USUARIO.setForeground(new java.awt.Color(204, 255, 255));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 204));
        jLabel3.setText("BIENVENIDO TURISTA");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(204, 255, 255));
        jLabel4.setText("CONTRASEÑA:");

        INGRESO.setBackground(new java.awt.Color(51, 51, 51));
        INGRESO.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        INGRESO.setForeground(new java.awt.Color(204, 255, 255));
        INGRESO.setText("INGRESAR");
        INGRESO.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                INGRESOActionPerformed(evt);
            }
        });

        jButton2.setBackground(new java.awt.Color(51, 51, 51));
        jButton2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton2.setForeground(new java.awt.Color(204, 255, 255));
        jButton2.setText("No tengo cuenta");
        jButton2.setContentAreaFilled(false);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(99, 99, 99)
                        .addComponent(jLabel3))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(46, 46, 46)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                                        .addComponent(jLabel1)
                                        .addGap(19, 19, 19)))
                                .addGap(44, 44, 44)
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(TT_USUARIO, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(TT_PASSWORD, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(jButton2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(INGRESO)
                                .addGap(25, 25, 25)))))
                .addContainerGap(13, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TT_USUARIO, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addComponent(TT_PASSWORD, javax.swing.GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(INGRESO)
                    .addComponent(jButton2))
                .addGap(34, 34, 34))
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(273, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap(94, Short.MAX_VALUE)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32))
        );

        jPanel1.add(jPanel3, java.awt.BorderLayout.PAGE_END);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 699, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        CreacionCliente a = new CreacionCliente(CLIENTES);
        a.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
        a.setExtendedState(JFrame.MAXIMIZED_BOTH);
        a.setTitle("Regístrate");
        a.setVisible(true);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void INGRESOActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_INGRESOActionPerformed
        boolean administracion = false;
        boolean usuario = false;
        if(TT_USUARIO.getText().length()<13 &&Utilidades.PasswordToString(TT_PASSWORD).length()<8)
        {
            String Usuario = Utilidades.rellenarEspacios(TT_USUARIO.getText(),13);
            String Contrasena = Utilidades.rellenarEspacios(Utilidades.PasswordToString(TT_PASSWORD),8);           
            administracion = comprobadmin(TT_USUARIO.getText(),new String(TT_PASSWORD.getPassword()));
            usuario=CLIENTES.ComprobarPassWord(Usuario, Contrasena);
            if (administracion)
            {
                Ingreso_Productos a = new Ingreso_Productos(MEDICINAS,CLIENTES);
                a.setTitle("Administracion");
                a.setVisible(true);
                a.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
                a.setExtendedState(JFrame.MAXIMIZED_BOTH);
                Setear();
            }
            else if(usuario){
                Consulta a = new Consulta(CLIENTES,MEDICINAS,Usuario,FACTURA);
                a.setTitle("CLIENTE");
                a.setVisible(true);
                a.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
                a.setExtendedState(JFrame.MAXIMIZED_BOTH);
                Setear();
            }
        }  
        else
        {
            JOptionPane.showMessageDialog(this,"Demasiados caracteres", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_INGRESOActionPerformed
    public boolean comprobadmin(String Usuario, String Contrasena)
    {
        if("Admin".equals(Usuario) && "123".equals(Contrasena)){
            return true;
        }
        return false;
    }
    public void Setear(){
        TT_USUARIO.setText("");
        TT_PASSWORD.setText("");
    }
    
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton INGRESO;
    private javax.swing.JPasswordField TT_PASSWORD;
    private javax.swing.JTextField TT_USUARIO;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    // End of variables declaration//GEN-END:variables
    private Almacenamiento_Medicinas MEDICINAS;
    private Almacenamiento_Medicinas FACTURA;
    private ALMACENAMIENTO_CLIENTES CLIENTES;
}
