package proyecto_hospital;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.Map;
import javax.swing.JFileChooser;
import javax.swing.filechooser.FileNameExtensionFilter;
public class Interface_Paciente extends javax.swing.JFrame {
    private LinkedHashMap<String,Medico> ListaDeMedicos;
    private LinkedHashMap<String,Paciente> ListaDePacientes;
    public Interface_Paciente(LinkedHashMap ListaDeMedicos,LinkedHashMap ListaDePacientes) {
        this.ListaDeMedicos=ListaDeMedicos;
        this.ListaDePacientes=ListaDePacientes;
        initComponents();
    }

    private Interface_Paciente() {
        throw new UnsupportedOperationException("Not supported yet."); 
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        Encabezado = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        BotonArcFiMed = new javax.swing.JButton();
        BT_GFM = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setLayout(new java.awt.BorderLayout());

        Encabezado.setBackground(new java.awt.Color(102, 0, 102));
        Encabezado.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "MENU DE PACIENTE", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tw Cen MT", 3, 24), new java.awt.Color(255, 204, 0))); // NOI18N
        Encabezado.setForeground(new java.awt.Color(102, 0, 102));
        Encabezado.setPreferredSize(new java.awt.Dimension(400, 30));

        javax.swing.GroupLayout EncabezadoLayout = new javax.swing.GroupLayout(Encabezado);
        Encabezado.setLayout(EncabezadoLayout);
        EncabezadoLayout.setHorizontalGroup(
            EncabezadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 579, Short.MAX_VALUE)
        );
        EncabezadoLayout.setVerticalGroup(
            EncabezadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jPanel1.add(Encabezado, java.awt.BorderLayout.PAGE_START);

        jPanel7.setBackground(new java.awt.Color(102, 0, 102));
        jPanel7.setPreferredSize(new java.awt.Dimension(498, 30));

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 589, Short.MAX_VALUE)
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 30, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel7, java.awt.BorderLayout.PAGE_END);

        jPanel2.setBackground(new java.awt.Color(153, 255, 255));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyecto_hospital/images (1).jpeg"))); // NOI18N

        jButton2.setBackground(new java.awt.Color(204, 255, 255));
        jButton2.setFont(new java.awt.Font("Tw Cen MT", 0, 24)); // NOI18N
        jButton2.setText("Consultar Fichas");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        BotonArcFiMed.setBackground(new java.awt.Color(204, 255, 255));
        BotonArcFiMed.setFont(new java.awt.Font("Tw Cen MT", 0, 24)); // NOI18N
        BotonArcFiMed.setText("Generar Archivo Pacientes");
        BotonArcFiMed.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonArcFiMedActionPerformed(evt);
            }
        });

        BT_GFM.setBackground(new java.awt.Color(204, 255, 255));
        BT_GFM.setFont(new java.awt.Font("Tw Cen MT", 0, 24)); // NOI18N
        BT_GFM.setText("Generar Ficha Medica");
        BT_GFM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BT_GFMActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(jLabel2)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(82, 82, 82)
                        .addComponent(BT_GFM)
                        .addContainerGap())
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 54, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addComponent(jButton2)
                                .addGap(100, 100, 100))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addComponent(BotonArcFiMed)
                                .addGap(44, 44, 44))))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel2)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jButton2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(BT_GFM)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(BotonArcFiMed)))
                .addContainerGap(49, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel2, java.awt.BorderLayout.CENTER);

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

    private void BT_GFMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BT_GFMActionPerformed
        Interfaz_Ficha a = new Interfaz_Ficha(ListaDeMedicos,ListaDePacientes);
        a.setTitle("Creacion de fichas medicas");
        a.setVisible(true);
    }//GEN-LAST:event_BT_GFMActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        Interfaz_ConFichas b = new Interfaz_ConFichas(ListaDePacientes);
        b.setTitle("Consulta de Fichas");
        b.setVisible(true);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void BotonArcFiMedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonArcFiMedActionPerformed
        JFileChooser jFileChooser3 = new JFileChooser();
        jFileChooser3.setDialogTitle("Selecciona un archivo para cargar los datos");
        jFileChooser3.setAcceptAllFileFilterUsed(false); 
        FileNameExtensionFilter filter = new FileNameExtensionFilter("Archivos de texto (*.txt)", "txt");
        jFileChooser3.addChoosableFileFilter(filter); 
        if (jFileChooser3.showSaveDialog(null) == JFileChooser.APPROVE_OPTION) {
            File file = jFileChooser3.getSelectedFile();
            try {
                FileWriter e = new FileWriter(file);
                BufferedWriter writer = new BufferedWriter(e);
                // Iterar sobre el LinkedHashMap y escribir cada par clave-valor en el archivo
                for (Map.Entry<String, Paciente> entry : ListaDePacientes.entrySet()){
                    writer.write(entry.getValue().getNombre() + " " + 
                            entry.getValue().getApellido() + ": " + 
                            "N de Paciente " + entry.getValue().getNroPaciente() + " " +
                            "CI: " + entry.getValue().getCedula() + " " +
                            "Alergia: " +  entry.getValue().getAlergia() + " " +
                            "Tipo de Sangre" + entry.getValue().getTipoDeSangre().toString() + " " +
                            "Tipo de Seguro: " +  entry.getValue().getTipoDeSeguro().toString() + " " +
                            "\n");
                }
                writer.flush();
                System.out.println("Contenido del LinkedHashMap escrito en el archivo");
            } 
            catch (IOException e) {
                System.err.println("Error al escribir en el archivo: " + e.getMessage());
            }
        }
    }//GEN-LAST:event_BotonArcFiMedActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Interface_Paciente().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BT_GFM;
    private javax.swing.JButton BotonArcFiMed;
    private javax.swing.JPanel Encabezado;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel7;
    // End of variables declaration//GEN-END:variables
}
