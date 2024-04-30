package proyecto_hospital;
import java.util.LinkedHashMap;
public class Interfaz_RegPac extends javax.swing.JFrame {
    private LinkedHashMap<String,Paciente> ListaDPacientes;
    public Interfaz_RegPac(LinkedHashMap ListaDPacientes) {
        this.ListaDPacientes=ListaDPacientes;
        initComponents();
    }

    private Interfaz_RegPac() {
        throw new UnsupportedOperationException("Not supported yet."); 
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel4 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        Encabezado = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        BT_REG = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        TT_CED = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        TT_NOM = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        TT_APE = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        TT_CONT = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        TT_NP = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        TT_TSAN = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        TT_TPSEG = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        TT_ALE = new javax.swing.JTextField();

        jPanel4.setBackground(new java.awt.Color(153, 255, 153));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 287, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setLayout(new java.awt.BorderLayout());

        Encabezado.setBackground(new java.awt.Color(0, 102, 102));
        Encabezado.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "REGISTRO DE PACIENTE\n", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tempus Sans ITC", 3, 18), new java.awt.Color(255, 204, 0))); // NOI18N
        Encabezado.setForeground(new java.awt.Color(102, 0, 102));
        Encabezado.setPreferredSize(new java.awt.Dimension(400, 30));

        javax.swing.GroupLayout EncabezadoLayout = new javax.swing.GroupLayout(Encabezado);
        Encabezado.setLayout(EncabezadoLayout);
        EncabezadoLayout.setHorizontalGroup(
            EncabezadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 453, Short.MAX_VALUE)
        );
        EncabezadoLayout.setVerticalGroup(
            EncabezadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jPanel1.add(Encabezado, java.awt.BorderLayout.PAGE_START);

        jPanel5.setBackground(new java.awt.Color(0, 102, 102));
        jPanel5.setPreferredSize(new java.awt.Dimension(498, 30));

        BT_REG.setBackground(new java.awt.Color(0, 255, 204));
        BT_REG.setFont(new java.awt.Font("Bell MT", 3, 14)); // NOI18N
        BT_REG.setText("REGISTRAR");
        BT_REG.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BT_REGActionPerformed(evt);
            }
        });
        jPanel5.add(BT_REG);

        jPanel1.add(jPanel5, java.awt.BorderLayout.PAGE_END);

        jPanel2.setBackground(new java.awt.Color(51, 153, 0));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 443, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel2, java.awt.BorderLayout.LINE_END);

        jPanel3.setBackground(new java.awt.Color(51, 153, 0));
        jPanel3.setForeground(new java.awt.Color(0, 153, 0));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 443, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel3, java.awt.BorderLayout.LINE_START);

        jPanel6.setBackground(new java.awt.Color(204, 255, 204));
        jPanel6.setLayout(new java.awt.GridLayout(8, 2, 30, 30));

        jLabel3.setFont(new java.awt.Font("Bell MT", 3, 14)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Cedula");
        jPanel6.add(jLabel3);

        TT_CED.setFont(new java.awt.Font("Bell MT", 2, 14)); // NOI18N
        jPanel6.add(TT_CED);

        jLabel4.setFont(new java.awt.Font("Bell MT", 3, 14)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Nombre");
        jPanel6.add(jLabel4);

        TT_NOM.setFont(new java.awt.Font("Bell MT", 2, 14)); // NOI18N
        jPanel6.add(TT_NOM);

        jLabel5.setFont(new java.awt.Font("Bell MT", 3, 14)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Apellido");
        jPanel6.add(jLabel5);

        TT_APE.setFont(new java.awt.Font("Bell MT", 2, 14)); // NOI18N
        jPanel6.add(TT_APE);

        jLabel6.setFont(new java.awt.Font("Bell MT", 3, 14)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Contacto");
        jPanel6.add(jLabel6);

        TT_CONT.setFont(new java.awt.Font("Bell MT", 2, 14)); // NOI18N
        jPanel6.add(TT_CONT);

        jLabel7.setFont(new java.awt.Font("Bell MT", 3, 14)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("NPaciente");
        jPanel6.add(jLabel7);

        TT_NP.setFont(new java.awt.Font("Bell MT", 2, 14)); // NOI18N
        jPanel6.add(TT_NP);

        jLabel8.setFont(new java.awt.Font("Bell MT", 3, 14)); // NOI18N
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("Tipo de Sangre");
        jPanel6.add(jLabel8);

        TT_TSAN.setFont(new java.awt.Font("Bell MT", 2, 14)); // NOI18N
        TT_TSAN.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "A+", "A-", "B+", "B-", "C+", "C-", "O+", "O-" }));
        jPanel6.add(TT_TSAN);

        jLabel1.setFont(new java.awt.Font("Bell MT", 3, 14)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Tipo de seguro");
        jPanel6.add(jLabel1);

        TT_TPSEG.setFont(new java.awt.Font("Bell MT", 3, 12)); // NOI18N
        TT_TPSEG.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Privado", "Publico", "Fuerzas Armadas" }));
        jPanel6.add(TT_TPSEG);

        jLabel2.setFont(new java.awt.Font("Bell MT", 3, 14)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Alergias");
        jPanel6.add(jLabel2);

        TT_ALE.setFont(new java.awt.Font("Bell MT", 2, 14)); // NOI18N
        jPanel6.add(TT_ALE);

        jPanel1.add(jPanel6, java.awt.BorderLayout.CENTER);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 463, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BT_REGActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BT_REGActionPerformed
        String NroPC = TT_NP.getText();
        if ((!ListaDPacientes.containsKey(NroPC))){
            ListaDPacientes.put(NroPC, new Paciente(TT_CED.getText(),TT_NOM.getText(),TT_APE.getText(),TT_CONT.getText(),NroPC,TT_TPSEG.getSelectedItem().toString(),TT_TSAN.getSelectedItem().toString(),TT_ALE.getText()));
        }
        Limpiar();
    }//GEN-LAST:event_BT_REGActionPerformed

    public void Limpiar(){
        TT_CED.setText("");
        TT_NOM.setText("");
        TT_APE.setText("");
        TT_NP.setText("");
        TT_CONT.setText("");
        TT_ALE.setText("");
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
            java.util.logging.Logger.getLogger(Interfaz_RegPac.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Interfaz_RegPac.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Interfaz_RegPac.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Interfaz_RegPac.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Interfaz_RegPac().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BT_REG;
    private javax.swing.JPanel Encabezado;
    private javax.swing.JTextField TT_ALE;
    private javax.swing.JTextField TT_APE;
    private javax.swing.JTextField TT_CED;
    private javax.swing.JTextField TT_CONT;
    private javax.swing.JTextField TT_NOM;
    private javax.swing.JTextField TT_NP;
    private javax.swing.JComboBox<String> TT_TPSEG;
    private javax.swing.JComboBox<String> TT_TSAN;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    // End of variables declaration//GEN-END:variables
}
