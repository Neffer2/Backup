
package Main;

import static com.sun.org.apache.xalan.internal.lib.ExsltDatetime.date;
import java.awt.FileDialog;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;

public class MainBackup extends javax.swing.JFrame {

    public MainBackup() {
        initComponents();
        setLocationRelativeTo(null);
    }
    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        txtGetDestino = new javax.swing.JTextField();
        btnGetDestino = new javax.swing.JButton();
        txtSetDestino = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        btnMakeBack = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        txtGetDestino.setFont(new java.awt.Font("Verdana", 0, 11)); // NOI18N

        btnGetDestino.setFont(new java.awt.Font("Verdana", 2, 11)); // NOI18N
        btnGetDestino.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/folder.png"))); // NOI18N
        btnGetDestino.setBorderPainted(false);
        btnGetDestino.setContentAreaFilled(false);
        btnGetDestino.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnGetDestino.setFocusable(false);
        btnGetDestino.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGetDestinoActionPerformed(evt);
            }
        });

        txtSetDestino.setFont(new java.awt.Font("Verdana", 0, 11)); // NOI18N

        jButton1.setFont(new java.awt.Font("Verdana", 2, 11)); // NOI18N
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/folder (1).png"))); // NOI18N
        jButton1.setBorderPainted(false);
        jButton1.setContentAreaFilled(false);
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1.setFocusable(false);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        btnMakeBack.setBackground(new java.awt.Color(51, 153, 0));
        btnMakeBack.setFont(new java.awt.Font("Verdana", 2, 11)); // NOI18N
        btnMakeBack.setForeground(new java.awt.Color(255, 255, 255));
        btnMakeBack.setText("Hacer backup");
        btnMakeBack.setBorderPainted(false);
        btnMakeBack.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnMakeBack.setFocusPainted(false);
        btnMakeBack.setFocusable(false);
        btnMakeBack.setRequestFocusEnabled(false);
        btnMakeBack.setRolloverEnabled(false);
        btnMakeBack.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                btnMakeBackMouseMoved(evt);
            }
        });
        btnMakeBack.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnMakeBackMouseExited(evt);
            }
        });
        btnMakeBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMakeBackActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Verdana", 2, 10)); // NOI18N
        jLabel1.setText("Ruta de la carpeta a copiar.");

        jLabel2.setFont(new java.awt.Font("Verdana", 2, 10)); // NOI18N
        jLabel2.setText("Ruta de la carpeta destino.");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtSetDestino, javax.swing.GroupLayout.DEFAULT_SIZE, 375, Short.MAX_VALUE)
                            .addComponent(txtGetDestino)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnGetDestino, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(120, 120, 120)
                        .addComponent(btnMakeBack, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(39, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnGetDestino, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtGetDestino))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtSetDestino))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2)
                .addGap(67, 67, 67)
                .addComponent(btnMakeBack, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(140, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnGetDestinoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGetDestinoActionPerformed
        try{
            //Recoger ruta
            JFileChooser dlg = new JFileChooser();
            dlg.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY); 
            dlg.showSaveDialog(null);
            File recoger = dlg.getSelectedFile();  
            txtGetDestino.setText(recoger.toString());
        }catch(Exception e){
            
        }
    }//GEN-LAST:event_btnGetDestinoActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        try{
            //Establecer ruta
            JFileChooser dlg = new JFileChooser();
            dlg.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
            dlg.showSaveDialog(null);
            File estabecer = dlg.getSelectedFile();
            txtSetDestino.setText(estabecer.toString());
        }catch(Exception e){
            
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void btnMakeBackMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnMakeBackMouseExited
        btnMakeBack.setBackground(new java.awt.Color(51, 153, 0));
    }//GEN-LAST:event_btnMakeBackMouseExited

    private void btnMakeBackMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnMakeBackMouseMoved
        btnMakeBack.setBackground(new java.awt.Color(1, 186, 3));
    }//GEN-LAST:event_btnMakeBackMouseMoved

    private void btnMakeBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMakeBackActionPerformed
        Date date = new Date();
        ;
        DateFormat hourdateFormat = new SimpleDateFormat("HH.mm.ss dd-MM-yyyy");
        String Complement = hourdateFormat.format(date);
        char c = (char)92;
        String RutaEst = txtSetDestino.getText() + c + "Backup" + Complement;
    
        File directorio = new File(RutaEst);
        directorio.mkdirs();
        
        String UserPC = System.getProperty("user.name");
        String SystemO = System.getProperty("os.name").toLowerCase();
        
         try {
             
             if (SystemO.indexOf("win") >= 0){
                 
            String ruta = "C:\\Users\\"+UserPC+"\\Documents\\log.txt";
            String contenido = "Back-up succesfully "+RutaEst;
            File file = new File(ruta);
     
            if (!file.exists()) {
                file.createNewFile();
             
            }
           
            FileWriter fw = new FileWriter(file);
            BufferedWriter bw = new BufferedWriter(fw);
            bw.write(contenido);
            bw.close();
                 
 
    
             } else if (SystemO.indexOf("nix") >= 0 || SystemO.indexOf("nux") >= 0 || SystemO.indexOf("aix") > 0){
    
            String ruta =   "/home/" + UserPC + "/archivo.txt";
            String contenido = "Back-up succesfully "+RutaEst;
            File file = new File(ruta);
           
            if (!file.exists()) {
                file.createNewFile();
             
            }
            FileWriter fw = new FileWriter(file);
            BufferedWriter bw = new BufferedWriter(fw);
            bw.write(contenido);
            bw.close();
                      
              
                  
             }
      
         }
         catch (Exception e){
             System.out.println("Tas mal ");
         }
        
        
    }//GEN-LAST:event_btnMakeBackActionPerformed


    public static void main(String args[]) {

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Metal".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MainBackup.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainBackup.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainBackup.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainBackup.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainBackup().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnGetDestino;
    private javax.swing.JButton btnMakeBack;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField txtGetDestino;
    private javax.swing.JTextField txtSetDestino;
    // End of variables declaration//GEN-END:variables
}
