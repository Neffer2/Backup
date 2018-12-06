/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class MainHome extends javax.swing.JFrame {

    public MainHome() {
        initComponents();
        setLocationRelativeTo(null);
        Leer();
    }

    public static void Leer(){
        String UserPC = System.getProperty("user.name");
        String SystemO = System.getProperty("os.name").toLowerCase();
        File archivo = null;
        FileReader fr = null;
        BufferedReader br;
        br = null;
        
      
        if(SystemO.indexOf("win") >= 0){
            /*Validar sistema operativo Windows*/
           try{
               try{
                    String url ="C:\\Users\\"+UserPC+"\\Documents\\log.txt"; /* Ruta para windows*/
                    String url2 = "/home/" + UserPC + "/archivo.txt"; /*Ruta para linux*/
                    archivo = new File ("C:\\Users\\"+UserPC+"\\Documents\\log.txt");
                    fr = new FileReader (archivo);
                    br = new BufferedReader(fr);
                    /*Leer el fichero*/
                    String linea;
                    while((linea=br.readLine())!=null){
                        System.out.println(linea);
                    }
               }catch(Exception e){
                   //e.printStackTrace();
                   JOptionPane.showMessageDialog(null, "No se encontro el log.");
               }finally{
                   try{
                       if(null != fr){
                           fr.close();
                       }
                   }catch(Exception e2){
                       //e2.printStackTrace();
                       //System.out.println("error59");
                   }
               }
                
            }catch(Exception e){
                //e.printStackTrace();
                //System.out.println("error65");
            }
        }else if(SystemO.indexOf("mac") >= 0){
            System.out.println("Mac");
        }else if(SystemO.indexOf("nix") >= 0 || SystemO.indexOf("nux") >= 0 || SystemO.indexOf("aix") > 0 ){
           try{
               try{
                    String url ="C:\\Users\\"+UserPC+"\\Documents\\log.txt"; /* Ruta para windows*/
                    String url2 = "/home/" + UserPC + "/archivo.txt"; /*Ruta para linux*/
                    archivo = new File ("/home/" + UserPC + "/archivo.txt");
                    fr = new FileReader (archivo);
                    br = new BufferedReader(fr);
                    /*Leer el fichero*/
                    String linea;
                    while((linea=br.readLine())!=null){
                        System.out.println(linea);
                    }
               }catch(Exception e){
                    e.printStackTrace();
               }finally{
                   try{
                       if(null != fr){
                           fr.close();
                       }
                   }catch(Exception e2){
                       e2.printStackTrace();
                   }
               }
           }catch(Exception e){
                e.printStackTrace();
            }
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();

        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 520, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 410, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 520, 410));

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(MainHome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainHome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainHome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainHome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainHome().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
