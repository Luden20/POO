package proyecto_stringtokenizer;
import java.util.LinkedHashMap;
import javax.swing.DefaultComboBoxModel;
public class Interfaz_Consulta extends javax.swing.JFrame {
    private LinkedHashMap<String,Comentario> ListaDComentarios;
    public Interfaz_Consulta(LinkedHashMap ListaDComentarios) {
        this.ListaDComentarios=ListaDComentarios;
        initComponents();
    }
    private Interfaz_Consulta() {
        throw new UnsupportedOperationException("Not supported yet."); 
    }
    public void Carga(){
        String[] Autor = new String[ListaDComentarios.size()];
        int i=0;
        for (Comentario Informacion:ListaDComentarios.values()) 
        {
            Autor[i++] = Informacion.getAutor();
        }
    
        CB_PERSONAS.setModel(new DefaultComboBoxModel<>(Autor));
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        TT_PMR = new javax.swing.JLabel();
        TT_NUMERO = new javax.swing.JLabel();
        TT_INF = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        CB_PERSONAS = new javax.swing.JComboBox<>();
        Actualizar = new javax.swing.JButton();
        BT_CARGAR = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setLayout(new java.awt.BorderLayout());

        jPanel4.setBackground(new java.awt.Color(0, 255, 204));
        jPanel4.setLayout(new java.awt.GridLayout(3, 1));

        TT_PMR.setFont(new java.awt.Font("Bell MT", 3, 14)); // NOI18N
        TT_PMR.setText("Repeticiones por palabra");
        jPanel4.add(TT_PMR);

        TT_NUMERO.setFont(new java.awt.Font("Bell MT", 3, 14)); // NOI18N
        TT_NUMERO.setText("Numero de palabras: ");
        jPanel4.add(TT_NUMERO);

        TT_INF.setFont(new java.awt.Font("Bell MT", 3, 14)); // NOI18N
        TT_INF.setText("Informacion:");
        jPanel4.add(TT_INF);

        jPanel1.add(jPanel4, java.awt.BorderLayout.CENTER);

        jPanel2.setBackground(new java.awt.Color(0, 102, 102));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Comentarios", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Bell MT", 3, 24), new java.awt.Color(51, 255, 204))); // NOI18N
        jPanel2.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jPanel2.setPreferredSize(new java.awt.Dimension(400, 40));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 390, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 5, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel2, java.awt.BorderLayout.PAGE_START);

        jPanel3.setBackground(new java.awt.Color(0, 102, 102));
        jPanel3.setPreferredSize(new java.awt.Dimension(400, 40));

        CB_PERSONAS.setBackground(new java.awt.Color(51, 255, 204));
        CB_PERSONAS.setFont(new java.awt.Font("Bell MT", 3, 14)); // NOI18N
        CB_PERSONAS.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jPanel3.add(CB_PERSONAS);

        Actualizar.setBackground(new java.awt.Color(0, 255, 204));
        Actualizar.setFont(new java.awt.Font("Bell MT", 3, 14)); // NOI18N
        Actualizar.setText("CONSULTAR");
        Actualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ActualizarActionPerformed(evt);
            }
        });
        jPanel3.add(Actualizar);

        BT_CARGAR.setBackground(new java.awt.Color(0, 255, 204));
        BT_CARGAR.setFont(new java.awt.Font("Bell MT", 3, 14)); // NOI18N
        BT_CARGAR.setText("CARGAR");
        BT_CARGAR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BT_CARGARActionPerformed(evt);
            }
        });
        jPanel3.add(BT_CARGAR);

        jPanel1.add(jPanel3, java.awt.BorderLayout.PAGE_END);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ActualizarActionPerformed
        String Autor = CB_PERSONAS.getSelectedItem().toString();
        Comentario Informacion = ListaDComentarios.get(Autor);
        TT_PMR.setText("Palabra más repetida: "+Informacion.ObtenerRepeticionesPalabrasTotal());
        TT_NUMERO.setText("Numero de palabras: "+Informacion.ContarNumeroPalabras());
        TT_INF.setText("Informacion "+Informacion.getDatos());
    }//GEN-LAST:event_ActualizarActionPerformed

    private void BT_CARGARActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BT_CARGARActionPerformed
        Carga();
    }//GEN-LAST:event_BT_CARGARActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Interfaz_Consulta().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Actualizar;
    private javax.swing.JButton BT_CARGAR;
    private javax.swing.JComboBox<String> CB_PERSONAS;
    private javax.swing.JLabel TT_INF;
    private javax.swing.JLabel TT_NUMERO;
    private javax.swing.JLabel TT_PMR;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    // End of variables declaration//GEN-END:variables
}
