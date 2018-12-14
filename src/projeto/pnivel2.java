package projeto;

import java.util.ArrayList;
import javax.swing.JOptionPane;

public class pnivel2 extends javax.swing.JFrame {

    private String user;
    questoes2 q2 = new questoes2();

    public void user(String u) {
        user = u;
    }

    public pnivel2() {
        initComponents();
        buttonGroup1.add(rA2);
        buttonGroup1.add(rB2);
        buttonGroup1.add(rC2);
        buttonGroup1.add(rD2);
        buttonGroup1.add(rE2);

        novaQuestao();

    }
    Questao q;

    public void novaQuestao() {

        int numeroSorteado = q2.randomizar();
        q = q2.questao.get(numeroSorteado);
        campoTexto.setText(q.enunciado);
        rA2.setText(q.getA());
        rB2.setText(q.getB());
        rC2.setText(q.getC());
        rD2.setText(q.getD());
        rE2.setText(q.getE());
    }

    public boolean verificar() {
        if (rA2.isSelected() == true && rA2.getText().equals(q.questaoCorreta)) {
            System.out.println("Acertou A");
            return true;
        } else if (rB2.isSelected() == true && rB2.getText().equals(q.questaoCorreta)) {
            System.out.println("Acertou B");
            return true;
        } else if (rC2.isSelected() == true && rC2.getText().equals(q.questaoCorreta)) {
            System.out.println("Acertou C");
            return true;
        } else if (rD2.isSelected() == true && rD2.getText().equals(q.questaoCorreta)) {
            System.out.println("Acertou D");
            return true;
        } else if (rE2.isSelected() == true && rE2.getText().equals(q.questaoCorreta)) {
            System.out.println("Acertou E");
            return true;
        } else {
            return false;
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        rD2 = new javax.swing.JRadioButton();
        rC2 = new javax.swing.JRadioButton();
        rB2 = new javax.swing.JRadioButton();
        rE2 = new javax.swing.JRadioButton();
        rA2 = new javax.swing.JRadioButton();
        jButton1 = new javax.swing.JButton();
        enunciado2 = new javax.swing.JLabel();
        NQ2 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        usertext = new javax.swing.JLabel();
        numeroQ2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        campoTexto = new javax.swing.JTextPane();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 51, 153));
        jPanel1.setPreferredSize(new java.awt.Dimension(832, 545));
        jPanel1.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Sylfaen", 3, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Questão");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(360, 20, 120, 50);

        rD2.setBackground(new java.awt.Color(0, 51, 153));
        rD2.setForeground(new java.awt.Color(255, 255, 255));
        rD2.setText("D");
        rD2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rD2ActionPerformed(evt);
            }
        });
        jPanel1.add(rD2);
        rD2.setBounds(510, 330, 120, 23);

        rC2.setBackground(new java.awt.Color(0, 51, 153));
        rC2.setForeground(new java.awt.Color(255, 255, 255));
        rC2.setText("C");
        rC2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rC2ActionPerformed(evt);
            }
        });
        jPanel1.add(rC2);
        rC2.setBounds(380, 330, 120, 23);

        rB2.setBackground(new java.awt.Color(0, 51, 153));
        rB2.setForeground(new java.awt.Color(255, 255, 255));
        rB2.setText("B");
        rB2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rB2ActionPerformed(evt);
            }
        });
        jPanel1.add(rB2);
        rB2.setBounds(240, 330, 120, 23);

        rE2.setBackground(new java.awt.Color(0, 51, 153));
        rE2.setForeground(new java.awt.Color(255, 255, 255));
        rE2.setText("E");
        jPanel1.add(rE2);
        rE2.setBounds(650, 330, 150, 23);

        rA2.setBackground(new java.awt.Color(0, 51, 153));
        rA2.setForeground(new java.awt.Color(255, 255, 255));
        rA2.setText("A");
        rA2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rA2ActionPerformed(evt);
            }
        });
        jPanel1.add(rA2);
        rA2.setBounds(100, 330, 120, 23);

        jButton1.setBackground(new java.awt.Color(51, 153, 0));
        jButton1.setText("Confirma");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1);
        jButton1.setBounds(328, 380, 140, 38);

        enunciado2.setFont(new java.awt.Font("Arial", 3, 18)); // NOI18N
        enunciado2.setForeground(new java.awt.Color(255, 255, 255));
        enunciado2.setText("ENUNCIADO2");
        jPanel1.add(enunciado2);
        enunciado2.setBounds(50, 70, 140, 50);

        NQ2.setFont(new java.awt.Font("Arial", 3, 18)); // NOI18N
        NQ2.setForeground(new java.awt.Color(255, 255, 255));
        NQ2.setText("Qustões respondidas:");
        jPanel1.add(NQ2);
        NQ2.setBounds(6, 459, 194, 39);

        jButton2.setBackground(new java.awt.Color(255, 0, 0));
        jButton2.setFont(new java.awt.Font("Arial", 1, 10)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("Desistir");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2);
        jButton2.setBounds(732, 11, 90, 30);
        jPanel1.add(usertext);
        usertext.setBounds(665, 455, 148, 43);

        numeroQ2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        numeroQ2.setForeground(new java.awt.Color(204, 0, 0));
        numeroQ2.setText("0");
        jPanel1.add(numeroQ2);
        numeroQ2.setBounds(206, 455, 43, 39);

        campoTexto.setEditable(false);
        campoTexto.setBackground(new java.awt.Color(0, 51, 153));
        jScrollPane1.setViewportView(campoTexto);

        jPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(50, 120, 700, 170);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 509, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void rC2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rC2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rC2ActionPerformed

    private void rD2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rD2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rD2ActionPerformed

    private void rB2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rB2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rB2ActionPerformed

    private void rA2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rA2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rA2ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        new Quiz().setVisible(true);
        dispose();
    }//GEN-LAST:event_jButton2ActionPerformed
    int x = 0;
    int acertos = 0;

    ArrayList<Questao> questoesCorretas = new ArrayList<>();

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        if (rA2.isSelected() == false && rB2.isSelected() == false && rC2.isSelected() == false && rD2.isSelected() == false && rE2.isSelected() == false) {
            JOptionPane.showMessageDialog(null, "Você deve selecionar alguma opção!!");

        } else {

            if (x < q2.questao.size()) {
                if (verificar()) {
                    acertos++;
                    questoesCorretas.add(q);
                } else {
                    System.out.println("errou");
                }

            } else {
                campoTexto.setText("");
                buttonGroup1.clearSelection();
                JOptionPane.showMessageDialog(null, "Limite de questoes atingidas");

                Resultado tela = new Resultado(questoesCorretas);
                tela.setVisible(true);
                tela.lblResultado.setText("Resultado do NÍVEL 2");
                if (acertos == 0) {
                    tela.campoTexto.setText("          Você não acertou nenhuma questão!"
                            + "\n                TENTE NOVAMENTE!!!");
                    tela.lblAvaliacao.setText("UM FIASCO");
                } else if (acertos <= 4) {
                    tela.lblAvaliacao.setText("RUIM");
                } else if (acertos <= 7) {
                    tela.lblAvaliacao.setText("MEDIANO");
                } else if (acertos <= 9) {
                    tela.lblAvaliacao.setText("EXECELENTE");

                } else {
                    tela.lblAvaliacao.setText("GENIAL");
                }
                tela.lblAcertos.setText(String.valueOf(acertos));

            }
            numeroQ2.setText(String.valueOf(++x));
            campoTexto.setText("");
            novaQuestao();
            buttonGroup1.clearSelection();
        }

    }//GEN-LAST:event_jButton1ActionPerformed
    // }

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
            java.util.logging.Logger.getLogger(pnivel2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(pnivel2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(pnivel2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(pnivel2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new pnivel2().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel NQ2;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JTextPane campoTexto;
    private javax.swing.JLabel enunciado2;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel numeroQ2;
    private javax.swing.JRadioButton rA2;
    private javax.swing.JRadioButton rB2;
    private javax.swing.JRadioButton rC2;
    private javax.swing.JRadioButton rD2;
    private javax.swing.JRadioButton rE2;
    private javax.swing.JLabel usertext;
    // End of variables declaration//GEN-END:variables
}
