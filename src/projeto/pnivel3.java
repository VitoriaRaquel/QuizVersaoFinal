package projeto;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 20171174010006
 */
public class pnivel3 extends javax.swing.JFrame {

    /**
     * Creates new form pnivel3
     */ 
    private String user;

    public void user(String u) {
        user = u;
    }
    public pnivel3() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        botaoVoltar = new javax.swing.JButton();
        botaoContinuar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(0, 51, 153));
        jPanel1.setPreferredSize(new java.awt.Dimension(832, 545));
        jPanel1.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Sylfaen", 3, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Seja Bem-vindo ao Nível 3");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(291, 36, 343, 33);

        botaoVoltar.setBackground(new java.awt.Color(255, 51, 51));
        botaoVoltar.setFont(new java.awt.Font("Perpetua Titling MT", 0, 11)); // NOI18N
        botaoVoltar.setText("Voltar");
        botaoVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoVoltarActionPerformed(evt);
            }
        });
        jPanel1.add(botaoVoltar);
        botaoVoltar.setBounds(470, 250, 150, 50);

        botaoContinuar.setBackground(new java.awt.Color(0, 204, 0));
        botaoContinuar.setFont(new java.awt.Font("Perpetua Titling MT", 0, 11)); // NOI18N
        botaoContinuar.setText("Continuar");
        botaoContinuar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoContinuarActionPerformed(evt);
            }
        });
        jPanel1.add(botaoContinuar);
        botaoContinuar.setBounds(300, 250, 150, 50);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(-3, -2, 840, 530);

        setSize(new java.awt.Dimension(852, 567));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void botaoVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoVoltarActionPerformed
               // TODO add your handling code here:
               new Quiz().setVisible(true);
               dispose();
    }//GEN-LAST:event_botaoVoltarActionPerformed

    private void botaoContinuarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoContinuarActionPerformed
        // TODO add your handling code here:
        pnivel tela=  new pnivel();
        tela.setVisible(true);
        dispose();
    }//GEN-LAST:event_botaoContinuarActionPerformed

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
            java.util.logging.Logger.getLogger(pnivel3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(pnivel3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(pnivel3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(pnivel3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new pnivel3().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botaoContinuar;
    private javax.swing.JButton botaoVoltar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}