/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author RONNY PANTOJA
 */
public class ConsultarHangar extends javax.swing.JFrame {

    /**
     * Creates new form ConsultarHangar
     */
    public ConsultarHangar() {
        initComponents();
        setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        Txt_Hangar = new javax.swing.JTextField();
        Btn_BuscarHangar = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        Txt_Ancho = new javax.swing.JTextField();
        Txt_Alto = new javax.swing.JTextField();
        Txt_Largo = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        Txt_Estado = new javax.swing.JTextField();
        Btn_modificar = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        Txt_tarifa = new javax.swing.JTextField();

        jButton1.setText("jButton1");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setText("CONSULTAR HANGAR");

        jLabel2.setText("ID HANGAR");

        Txt_Hangar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Txt_HangarActionPerformed(evt);
            }
        });
        Txt_Hangar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                Txt_HangarKeyTyped(evt);
            }
        });

        Btn_BuscarHangar.setText("Buscar");

        jLabel3.setText("Alto");

        jLabel4.setText("Largo");

        jLabel5.setText("Ancho");

        Txt_Ancho.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                Txt_AnchoKeyTyped(evt);
            }
        });

        Txt_Alto.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                Txt_AltoKeyTyped(evt);
            }
        });

        Txt_Largo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                Txt_LargoKeyTyped(evt);
            }
        });

        jLabel6.setText("Estado");

        Btn_modificar.setText("MODIFICAR");
        Btn_modificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_modificarActionPerformed(evt);
            }
        });

        jLabel7.setText("Tarifa");

        Txt_tarifa.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                Txt_tarifaKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(168, 168, 168)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(67, 67, 67)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel5)
                                        .addComponent(jLabel4)
                                        .addComponent(jLabel3))
                                    .addGap(69, 69, 69)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(Txt_Ancho, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(Btn_BuscarHangar)
                                        .addComponent(Txt_Largo, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(Txt_Alto, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                            .addComponent(jLabel6)
                                            .addGap(69, 69, 69))
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(jLabel7)
                                            .addGap(74, 74, 74)))
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(Txt_Estado, javax.swing.GroupLayout.DEFAULT_SIZE, 144, Short.MAX_VALUE)
                                        .addComponent(Txt_tarifa))))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(31, 31, 31)
                                .addComponent(Txt_Hangar, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(142, 142, 142)
                        .addComponent(Btn_modificar, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(109, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel1)
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(Txt_Hangar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addComponent(Btn_BuscarHangar)
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Txt_Alto, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Txt_Largo, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Txt_Ancho, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Txt_Estado, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 23, Short.MAX_VALUE)
                        .addComponent(Txt_tarifa, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(29, 29, 29)))
                .addComponent(Btn_modificar)
                .addGap(33, 33, 33))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Btn_modificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_modificarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Btn_modificarActionPerformed

    private void Txt_AltoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Txt_AltoKeyTyped
        char validar=evt.getKeyChar();
        if (Character.isLetter(validar)){
            getToolkit().beep();
            evt.consume();
            
            JOptionPane.showMessageDialog(rootPane, "Ingresar solo numeros");
        }
    }//GEN-LAST:event_Txt_AltoKeyTyped

    private void Txt_LargoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Txt_LargoKeyTyped
        char validar=evt.getKeyChar();
        if (Character.isLetter(validar)){
            getToolkit().beep();
            evt.consume();
            
            JOptionPane.showMessageDialog(rootPane, "Ingresar solo numeros");
        }
    }//GEN-LAST:event_Txt_LargoKeyTyped

    private void Txt_AnchoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Txt_AnchoKeyTyped
        char validar=evt.getKeyChar();
        if (Character.isLetter(validar)){
            getToolkit().beep();
            evt.consume();
            
            JOptionPane.showMessageDialog(rootPane, "Ingresar solo numeros");
        }
    }//GEN-LAST:event_Txt_AnchoKeyTyped

    private void Txt_tarifaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Txt_tarifaKeyTyped
        char validar=evt.getKeyChar();
        if (Character.isLetter(validar)){
            getToolkit().beep();
            evt.consume();
            
            JOptionPane.showMessageDialog(rootPane, "Ingresar solo numeros");
        }
    }//GEN-LAST:event_Txt_tarifaKeyTyped

    private void Txt_HangarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Txt_HangarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Txt_HangarActionPerformed

    private void Txt_HangarKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Txt_HangarKeyTyped
        char validar=evt.getKeyChar();
        if (Character.isLetter(validar)){
            getToolkit().beep();
            evt.consume();
            
            JOptionPane.showMessageDialog(rootPane, "Ingresar solo numeros");
        }
    }//GEN-LAST:event_Txt_HangarKeyTyped

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
            java.util.logging.Logger.getLogger(ConsultarHangar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ConsultarHangar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ConsultarHangar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ConsultarHangar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ConsultarHangar().setVisible(true);
            }
        });
    }

    public JButton getBtn_BuscarHangar() {
        return Btn_BuscarHangar;
    }

    public void setBtn_BuscarHangar(JButton Btn_BuscarHangar) {
        this.Btn_BuscarHangar = Btn_BuscarHangar;
    }

    public JTextField getTxt_Alto() {
        return Txt_Alto;
    }

    public void setTxt_Alto(JTextField Txt_Alto) {
        this.Txt_Alto = Txt_Alto;
    }

    public JTextField getTxt_Ancho() {
        return Txt_Ancho;
    }

    public void setTxt_Ancho(JTextField Txt_Ancho) {
        this.Txt_Ancho = Txt_Ancho;
    }

    public JTextField getTxt_Estado() {
        return Txt_Estado;
    }

    public void setTxt_Estado(JTextField Txt_Estado) {
        this.Txt_Estado = Txt_Estado;
    }

    public JTextField getTxt_Hangar() {
        return Txt_Hangar;
    }

    public void setTxt_Hangar(JTextField Txt_Hangar) {
        this.Txt_Hangar = Txt_Hangar;
    }

    public JTextField getTxt_Largo() {
        return Txt_Largo;
    }

    public void setTxt_Largo(JTextField Txt_Largo) {
        this.Txt_Largo = Txt_Largo;
    }

    public JButton getBtn_modificar() {
        return Btn_modificar;
    }

    public void setBtn_modificar(JButton Btn_modificar) {
        this.Btn_modificar = Btn_modificar;
    }

    public JTextField getTxt_tarifa() {
        return Txt_tarifa;
    }

    public void setTxt_tarifa(JTextField Txt_tarifa) {
        this.Txt_tarifa = Txt_tarifa;
    }
    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Btn_BuscarHangar;
    private javax.swing.JButton Btn_modificar;
    private javax.swing.JTextField Txt_Alto;
    private javax.swing.JTextField Txt_Ancho;
    private javax.swing.JTextField Txt_Estado;
    private javax.swing.JTextField Txt_Hangar;
    private javax.swing.JTextField Txt_Largo;
    private javax.swing.JTextField Txt_tarifa;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    // End of variables declaration//GEN-END:variables
}