/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exrercicio4c2;

import com.sun.glass.events.KeyEvent;
import javax.swing.JTextField;
import static lerexibir.Console.*;

/**
 *
 * @author Camargo
 */
public class MediaMencoes extends javax.swing.JFrame {

    /**
     * Creates new form MediaMencoes
     */
    public MediaMencoes() {
        initComponents();
    }
    public  Mencao lerMencao(JTextField tfMencao){
      String texto = tfMencao.getText();
        switch (texto) {
            case "MB":
                return Mencao.MB;
            case "B":
                return Mencao.B;
            case "R":
                return Mencao.R;
            default:
                return Mencao.I;
        }
    }
    public  String getMencao(int valorMencao){
        if (valorMencao >= Mencao.MB.valorMencao) {
            return Mencao.MB.toString();
        }
        if (valorMencao < Mencao.MB.valorMencao && valorMencao >= Mencao.B.valorMencao) {
            
            return Mencao.B.toString();
        }
        if (valorMencao < Mencao.B.valorMencao && valorMencao >= Mencao.R.valorMencao) {
            
            return Mencao.R.toString();
        }
        else{
            return Mencao.I.toString();
        }
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        tfMencao1Bim = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        tfMencao2Bim = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        tfMencao3Bim = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        tfMencao4Bim = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jlMediaMencao = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Mencão  1° Bimestre:");

        tfMencao1Bim.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                OnKeyReleased1Bim(evt);
            }
        });

        jLabel2.setText("Mencão  2° Bimestre:");

        tfMencao2Bim.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tfMencao2BimKeyReleased(evt);
            }
        });

        jLabel3.setText("Mencão  3° Bimestre:");

        tfMencao3Bim.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tfMencao3BimKeyReleased(evt);
            }
        });

        jLabel4.setText("Mencão  4° Bimestre:");

        tfMencao4Bim.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tfMencao4BimKeyReleased(evt);
            }
        });

        jButton1.setText("CalcularMédia");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonClick(evt);
            }
        });

        jlMediaMencao.setText("    ");

        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        jLabel5.setText("Média:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(tfMencao1Bim, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tfMencao2Bim, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tfMencao3Bim, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jButton1)
                            .addComponent(jLabel4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tfMencao4Bim, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jlMediaMencao, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(tfMencao1Bim, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(38, 38, 38)
                        .addComponent(jLabel2))
                    .addComponent(tfMencao2Bim, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(48, 48, 48)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(tfMencao3Bim, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(48, 48, 48)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfMencao4Bim, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(41, 41, 41)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jlMediaMencao, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addContainerGap(45, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ButtonClick(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonClick
       Mencao mencao1=lerMencao(tfMencao1Bim);
       Mencao mencao2=lerMencao(tfMencao2Bim);
       Mencao mencao3=lerMencao(tfMencao3Bim);
       Mencao mencao4=lerMencao(tfMencao4Bim);
       
     int mediaValor = (mencao1.valorMencao + mencao2.valorMencao + mencao3.valorMencao + mencao4.valorMencao)/4; 
     jTextField1.setText(getMencao(mediaValor));
         
       
    }//GEN-LAST:event_ButtonClick

    private void OnKeyReleased1Bim(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_OnKeyReleased1Bim
       String texto = tfMencao1Bim.getText();
       
        texto = formataCaracteres(texto);
       if(evt.getKeyCode() == KeyEvent.VK_BACKSPACE){
            texto= "";
        }
        tfMencao1Bim.setText(texto);
        
       
    }//GEN-LAST:event_OnKeyReleased1Bim

    private void tfMencao2BimKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfMencao2BimKeyReleased
        String texto = tfMencao2Bim.getText();
        texto = formataCaracteres(texto);
       if(evt.getKeyCode() == KeyEvent.VK_BACKSPACE){
            texto= "";
        }
       tfMencao2Bim.setText(texto);
    }//GEN-LAST:event_tfMencao2BimKeyReleased

    private void tfMencao3BimKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfMencao3BimKeyReleased
        String texto = tfMencao3Bim.getText();
        texto = formataCaracteres(texto);
       if(evt.getKeyCode() == KeyEvent.VK_BACKSPACE){
            texto= "";
        }
       tfMencao3Bim.setText(texto);
    }//GEN-LAST:event_tfMencao3BimKeyReleased

    private void tfMencao4BimKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfMencao4BimKeyReleased
        String texto = tfMencao4Bim.getText();
        texto = formataCaracteres(texto);
       if(evt.getKeyCode() == KeyEvent.VK_BACKSPACE){
            texto= "";
        }
       tfMencao4Bim.setText(texto);
    }//GEN-LAST:event_tfMencao4BimKeyReleased

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

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
            java.util.logging.Logger.getLogger(MediaMencoes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MediaMencoes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MediaMencoes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MediaMencoes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MediaMencoes().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JLabel jlMediaMencao;
    private javax.swing.JTextField tfMencao1Bim;
    private javax.swing.JTextField tfMencao2Bim;
    private javax.swing.JTextField tfMencao3Bim;
    private javax.swing.JTextField tfMencao4Bim;
    // End of variables declaration//GEN-END:variables

    private String validaCaracteres(String texto) {
        switch (texto) {
            case "MB":
                return "MB";
            case "M":
                return "MB";
            case "B":
                 return "B";
            case "R":
                 return "R";  
            default:
                return "I";
                
        }

  
   
    }//main

    private String formataCaracteres(String texto) {
    texto = texto.trim().toUpperCase();
        if (texto.length() > 0) {
           texto = validaCaracteres(texto);
        }

       if (texto.length() > 2) {
            texto = texto.substring(0,2);
        }
        if(texto.equals("M")){
            texto="MB";
        }
        return texto;
    }

 
    
    
    
} 
