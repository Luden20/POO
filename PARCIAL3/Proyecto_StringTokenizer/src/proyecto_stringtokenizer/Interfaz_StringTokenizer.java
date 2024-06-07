package proyecto_stringtokenizer;
import java.util.LinkedHashMap;
public class Interfaz_StringTokenizer extends javax.swing.JFrame {
    private Comentario Ejemplo;
    private LinkedHashMap<String,Comentario> ListaDComentarios = new LinkedHashMap<String,Comentario>();
    public Interfaz_StringTokenizer() {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        BT_CARGAR = new javax.swing.JButton();
        BT_CONS = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        TT_AUTOR = new javax.swing.JTextField();
        Comentario = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        TT_COMENTARIO = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new java.awt.BorderLayout());

        jPanel2.setBackground(new java.awt.Color(0, 102, 102));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Comentarios", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Bell MT", 3, 24), new java.awt.Color(51, 255, 204))); // NOI18N
        jPanel2.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jPanel2.setPreferredSize(new java.awt.Dimension(400, 40));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 642, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 5, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel2, java.awt.BorderLayout.PAGE_START);

        jPanel3.setBackground(new java.awt.Color(0, 102, 102));
        jPanel3.setPreferredSize(new java.awt.Dimension(400, 40));

        BT_CARGAR.setFont(new java.awt.Font("Bell MT", 3, 14)); // NOI18N
        BT_CARGAR.setText("SUBIR");
        BT_CARGAR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BT_CARGARActionPerformed(evt);
            }
        });
        jPanel3.add(BT_CARGAR);

        BT_CONS.setFont(new java.awt.Font("Bell MT", 3, 14)); // NOI18N
        BT_CONS.setText("CONSULTAR");
        BT_CONS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BT_CONSActionPerformed(evt);
            }
        });
        jPanel3.add(BT_CONS);

        jPanel1.add(jPanel3, java.awt.BorderLayout.PAGE_END);

        jPanel4.setBackground(new java.awt.Color(0, 255, 204));
        jPanel4.setLayout(new java.awt.GridLayout(2, 2));

        jLabel1.setFont(new java.awt.Font("Bell MT", 3, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Autor: ");
        jPanel4.add(jLabel1);

        TT_AUTOR.setFont(new java.awt.Font("Bell MT", 2, 14)); // NOI18N
        jPanel4.add(TT_AUTOR);

        Comentario.setFont(new java.awt.Font("Bell MT", 3, 18)); // NOI18N
        Comentario.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Comentario.setText("Comentario");
        jPanel4.add(Comentario);

        TT_COMENTARIO.setColumns(20);
        TT_COMENTARIO.setFont(new java.awt.Font("Bell MT", 2, 14)); // NOI18N
        TT_COMENTARIO.setRows(5);
        jScrollPane2.setViewportView(TT_COMENTARIO);

        jPanel4.add(jScrollPane2);

        jPanel1.add(jPanel4, java.awt.BorderLayout.CENTER);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 652, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BT_CARGARActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BT_CARGARActionPerformed
        String Autor = TT_AUTOR.getText();
        String Comentario = TT_COMENTARIO.getText();
        ListaDComentarios.put(Autor, new Comentario (Autor,Comentario));
        TT_AUTOR.setText("");
        TT_COMENTARIO.setText("");
    }//GEN-LAST:event_BT_CARGARActionPerformed

    private void BT_CONSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BT_CONSActionPerformed
        Interfaz_Consulta a = new Interfaz_Consulta(ListaDComentarios);
        a.setTitle("Consutla");
        a.setVisible(true);
    }//GEN-LAST:event_BT_CONSActionPerformed
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Interfaz_StringTokenizer().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BT_CARGAR;
    private javax.swing.JButton BT_CONS;
    private javax.swing.JLabel Comentario;
    private javax.swing.JTextField TT_AUTOR;
    private javax.swing.JTextArea TT_COMENTARIO;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane2;
    // End of variables declaration//GEN-END:variables
}
