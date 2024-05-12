package proyecto_hospital;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.Map;
import javax.swing.JFileChooser;
import javax.swing.filechooser.FileNameExtensionFilter;
import proyecto_hospital.Medico;
public class Interface_Medico extends javax.swing.JFrame {
    private LinkedHashMap<String,Medico> ListaDMedicos;
    public Interface_Medico(LinkedHashMap ListaDMedicos) {
        this.ListaDMedicos = ListaDMedicos;
        initComponents();
    }
    private Interface_Medico() {
        throw new UnsupportedOperationException("Not supported yet."); 
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        Encabezado = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        BotonGenArchivoDoc = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setPreferredSize(new java.awt.Dimension(1605, 1631));
        jPanel1.setLayout(new java.awt.BorderLayout());

        Encabezado.setBackground(new java.awt.Color(102, 0, 0));
        Encabezado.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "MENU DE DOCTORES", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tw Cen MT", 3, 24), new java.awt.Color(255, 204, 0))); // NOI18N
        Encabezado.setForeground(new java.awt.Color(102, 0, 102));
        Encabezado.setPreferredSize(new java.awt.Dimension(400, 30));

        javax.swing.GroupLayout EncabezadoLayout = new javax.swing.GroupLayout(Encabezado);
        Encabezado.setLayout(EncabezadoLayout);
        EncabezadoLayout.setHorizontalGroup(
            EncabezadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 486, Short.MAX_VALUE)
        );
        EncabezadoLayout.setVerticalGroup(
            EncabezadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jPanel1.add(Encabezado, java.awt.BorderLayout.PAGE_START);

        jPanel5.setBackground(new java.awt.Color(102, 0, 0));
        jPanel5.setPreferredSize(new java.awt.Dimension(498, 30));

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 496, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 30, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel5, java.awt.BorderLayout.PAGE_END);

        jPanel6.setBackground(new java.awt.Color(255, 153, 102));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyecto_hospital/bonita-ilustracion-de-vector-medico-aislada-sobre-fondo-blanco-ilustracion-de-dibujos-animados-del-medico-2gfeb67 (3).jpg"))); // NOI18N

        jButton3.setBackground(new java.awt.Color(255, 204, 204));
        jButton3.setFont(new java.awt.Font("Tw Cen MT", 0, 24)); // NOI18N
        jButton3.setText("Consultar Doctores ");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton2.setBackground(new java.awt.Color(255, 204, 204));
        jButton2.setFont(new java.awt.Font("Tw Cen MT", 0, 24)); // NOI18N
        jButton2.setText("Generar Doctor");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        BotonGenArchivoDoc.setBackground(new java.awt.Color(255, 204, 204));
        BotonGenArchivoDoc.setFont(new java.awt.Font("Tw Cen MT", 0, 24)); // NOI18N
        BotonGenArchivoDoc.setText("Generar Archivo de Doctores");
        BotonGenArchivoDoc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonGenArchivoDocActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(jLabel2)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addComponent(BotonGenArchivoDoc)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                                .addComponent(jButton3)
                                .addGap(56, 56, 56))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                                .addComponent(jButton2)
                                .addGap(76, 76, 76))))))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addComponent(jLabel2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(0, 43, Short.MAX_VALUE)
                .addComponent(jButton2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(BotonGenArchivoDoc)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton3)
                .addGap(39, 39, 39))
        );

        jPanel1.add(jPanel6, java.awt.BorderLayout.CENTER);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 496, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 268, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
       Interface_REG a = new Interface_REG(ListaDMedicos);
       a.setTitle("Menu Reg Medico");
       a.setVisible(true);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
       Interface_ConMed b = new Interface_ConMed(ListaDMedicos);
       b.setTitle("Medicos Existentes");
       b.setVisible(true);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void BotonGenArchivoDocActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonGenArchivoDocActionPerformed
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
                for (Map.Entry<String, Medico> entry : ListaDMedicos.entrySet()){
                    writer.write(entry.getValue().getNombre() + " " + 
                            entry.getValue().getApellido() + ": " + 
                            "CI: " + entry.getValue().getCedula() + " " +
                            "N Licencia: " +entry.getValue().getNLicencia() + " " +
                            "Especialidad: " +  entry.getValue().getEspecialidad() + "\n");
                }
                writer.flush();
                System.out.println("Contenido del LinkedHashMap escrito en el archivo");
            } 
            catch (IOException e) {
                System.err.println("Error al escribir en el archivo: " + e.getMessage());
        }
        }
    }//GEN-LAST:event_BotonGenArchivoDocActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Interface_Medico().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotonGenArchivoDoc;
    private javax.swing.JPanel Encabezado;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    // End of variables declaration//GEN-END:variables
}
