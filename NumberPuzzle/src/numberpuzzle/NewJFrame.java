
package numberpuzzle;

import java.util.Random;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;


public class NewJFrame extends javax.swing.JFrame {

    
    public NewJFrame() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jButton10 = new javax.swing.JButton();
        jButton11 = new javax.swing.JButton();
        jButton12 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jlblNumOFClicks = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jbntExit = new javax.swing.JButton();
        jbtnSolution = new javax.swing.JButton();
        jbtnReset = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 0, 0), 4));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton1.setFont(new java.awt.Font("Segoe UI", 0, 48)); // NOI18N
        jButton1.setText("1");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 80, 80));

        jButton2.setFont(new java.awt.Font("Segoe UI", 0, 48)); // NOI18N
        jButton2.setText("2");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(108, 10, 80, 80));

        jButton3.setFont(new java.awt.Font("Segoe UI", 0, 48)); // NOI18N
        jButton3.setText("3");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(198, 10, 80, 80));

        jButton4.setFont(new java.awt.Font("Segoe UI", 0, 48)); // NOI18N
        jButton4.setText("4");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 10, 80, 80));

        jButton5.setFont(new java.awt.Font("Segoe UI", 0, 48)); // NOI18N
        jButton5.setText("5");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 102, 80, 80));

        jButton6.setFont(new java.awt.Font("Segoe UI", 0, 48)); // NOI18N
        jButton6.setText("6");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(108, 102, 80, 80));

        jButton7.setFont(new java.awt.Font("Segoe UI", 0, 48)); // NOI18N
        jButton7.setText("7");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton7, new org.netbeans.lib.awtextra.AbsoluteConstraints(198, 102, 80, 80));

        jButton8.setFont(new java.awt.Font("Segoe UI", 0, 48)); // NOI18N
        jButton8.setText("8");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton8, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 102, 80, 80));

        jButton9.setFont(new java.awt.Font("Segoe UI", 0, 48)); // NOI18N
        jButton9.setText("9");
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton9, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 194, 80, 80));

        jButton10.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        jButton10.setText("10");
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton10, new org.netbeans.lib.awtextra.AbsoluteConstraints(108, 194, 80, 80));

        jButton11.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        jButton11.setText("11");
        jButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton11ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton11, new org.netbeans.lib.awtextra.AbsoluteConstraints(198, 194, 80, 80));

        jButton12.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        jButton12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton12ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton12, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 194, 80, 80));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 120, 380, 290));

        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 0, 0), 4));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        jLabel1.setText("Number Puzzle - Michael Zapata");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 20, -1, -1));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 820, 100));

        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 0, 0), 4));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jlblNumOFClicks.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        jlblNumOFClicks.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlblNumOFClicks.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 0, 0), 3));
        jPanel3.add(jlblNumOFClicks, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 170, 200, 100));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Clicks");
        jLabel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 0, 0), 3));
        jPanel3.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 200, 150));

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 120, 220, 290));

        jPanel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 0, 0), 4));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jbntExit.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        jbntExit.setText("Salir");
        jbntExit.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 0, 0), 4));
        jbntExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbntExitActionPerformed(evt);
            }
        });
        jPanel4.add(jbntExit, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 200, 170, 80));

        jbtnSolution.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        jbtnSolution.setText("Solucion");
        jbtnSolution.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 0, 0), 4));
        jbtnSolution.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnSolutionActionPerformed(evt);
            }
        });
        jPanel4.add(jbtnSolution, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 170, 80));

        jbtnReset.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        jbtnReset.setText("Reiniciar");
        jbtnReset.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 0, 0), 4));
        jbtnReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnResetActionPerformed(evt);
            }
        });
        jPanel4.add(jbtnReset, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, 170, 80));

        getContentPane().add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 120, 190, 290));

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    int Counter;
    
    void EmptySpotChecker(JButton Butt1, JButton Butt2){
        
        String ShuffleNumber = Butt2.getText();
        
        if(ShuffleNumber == ""){
            
            Butt2.setText(Butt1.getText());
            Butt1.setText("");
        }
    }
    
    public void Shuffle()
    {
            int[] bnum = new int[12];
            int i, j, rowchecker;
            Boolean flag = false;
            i = 1;

            do
            {
                Random rnd = new Random();              
                rowchecker = rnd.nextInt((11) + 1) ;
                for (j = 1; j <= i; j++)
                {
                    if (bnum[j] == rowchecker)
                    {
                        flag = true;
                        break;
                    }
                }

                if (flag == true)
                {
                    flag = false;
                }
                else
                {
                    bnum[i] = rowchecker;
                    i = i + 1;
                }
            }
            while (i <= 11); 
            jButton1.setText(Integer.toString(bnum[1]));
            jButton2.setText(Integer.toString(bnum[2]));
            jButton3.setText(Integer.toString(bnum[3]));
            jButton4.setText(Integer.toString(bnum[4]));
            jButton5.setText(Integer.toString(bnum[5]));
            jButton6.setText(Integer.toString(bnum[6]));
            jButton7.setText(Integer.toString(bnum[7]));
            jButton8.setText(Integer.toString(bnum[8]));
            jButton9.setText(Integer.toString(bnum[9]));
            jButton10.setText(Integer.toString(bnum[10]));
            jButton11.setText(Integer.toString(bnum[11]));            
            jButton12.setText("");
      
    }
    
    public void SolutionChecker()
    {
        String b1 = jButton1.getText();
        String b2 = jButton2.getText();
        String b3 = jButton3.getText();
        String b4 = jButton4.getText();
        String b5 = jButton5.getText();
        String b6 = jButton6.getText();
        String b7 = jButton7.getText();
        String b8 = jButton8.getText();
        String b9 = jButton9.getText();
        String b10 = jButton10.getText();
        String b11 = jButton11.getText();
            
        if (b1 == "1" && b2 == "2" && b3 == "3" && b4 == "4" &&
                b5 == "5" && b6 == "6" && b7 == "3" && b8 == "8" &&
                b9 == "9" && b10 == "10" && b11 == "11" )
            {
                JOptionPane.showMessageDialog(this, "Haz ganado","Number Puzzle",
                JOptionPane.INFORMATION_MESSAGE);
            }
        Counter = Counter+1;
        jlblNumOFClicks.setText(Integer.toString(Counter));           
        
    }
    
    private JFrame frame;
    private void jbntExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbntExitActionPerformed
        frame = new JFrame("Exit");
        
        if (JOptionPane.showConfirmDialog(frame, "Quieres salir ","Number Puzzle",
            JOptionPane.YES_NO_OPTION)== JOptionPane.YES_NO_OPTION)
        {
            System.exit(0);
        }
    }//GEN-LAST:event_jbntExitActionPerformed

    private void jbtnSolutionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnSolutionActionPerformed
        jButton1.setText("1");
        jButton2.setText("2");
        jButton3.setText("3");
        jButton4.setText("4");
        jButton5.setText("5");
        jButton6.setText("6");
        jButton7.setText("7");
        jButton8.setText("8");       
        jButton9.setText("9");
        jButton10.setText("10");
        jButton11.setText("11");
        jButton12.setText("");
    }//GEN-LAST:event_jbtnSolutionActionPerformed

    private void jbtnResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnResetActionPerformed
        Shuffle();
        Counter = 0;
        jlblNumOFClicks.setText(Integer.toString(Counter));
    }//GEN-LAST:event_jbtnResetActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        EmptySpotChecker(jButton1, jButton2);
        EmptySpotChecker(jButton1, jButton5);
        SolutionChecker();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        EmptySpotChecker(jButton2, jButton1);
        EmptySpotChecker(jButton2, jButton3);
        EmptySpotChecker(jButton2, jButton6);
        SolutionChecker();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        EmptySpotChecker(jButton3, jButton2);
        EmptySpotChecker(jButton3, jButton4);
        EmptySpotChecker(jButton3, jButton7);
        SolutionChecker();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        EmptySpotChecker(jButton4, jButton3);
        EmptySpotChecker(jButton4, jButton8);
        SolutionChecker();
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        EmptySpotChecker(jButton5, jButton1);
        EmptySpotChecker(jButton5, jButton6);
        EmptySpotChecker(jButton5, jButton9);
        SolutionChecker();
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        EmptySpotChecker(jButton6, jButton2);
        EmptySpotChecker(jButton6, jButton5);
        EmptySpotChecker(jButton6, jButton7);
        EmptySpotChecker(jButton6, jButton10);
        SolutionChecker();
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        EmptySpotChecker(jButton7, jButton3);
        EmptySpotChecker(jButton7, jButton6);
        EmptySpotChecker(jButton7, jButton8);
        EmptySpotChecker(jButton7, jButton11);
        SolutionChecker();
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        EmptySpotChecker(jButton8, jButton4);
        EmptySpotChecker(jButton8, jButton7);
        EmptySpotChecker(jButton8, jButton12);
        SolutionChecker();
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        EmptySpotChecker(jButton9, jButton5);
        EmptySpotChecker(jButton9, jButton10);
        SolutionChecker();
    }//GEN-LAST:event_jButton9ActionPerformed

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
        EmptySpotChecker(jButton10, jButton6);
        EmptySpotChecker(jButton10, jButton9);
        EmptySpotChecker(jButton10, jButton11);
        SolutionChecker();
    }//GEN-LAST:event_jButton10ActionPerformed

    private void jButton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton11ActionPerformed
        EmptySpotChecker(jButton11, jButton7);
        EmptySpotChecker(jButton11, jButton10);
        EmptySpotChecker(jButton11, jButton12);
        SolutionChecker();
    }//GEN-LAST:event_jButton11ActionPerformed

    private void jButton12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton12ActionPerformed
        EmptySpotChecker(jButton12, jButton8);
        EmptySpotChecker(jButton12, jButton11);
        SolutionChecker();
    }//GEN-LAST:event_jButton12ActionPerformed

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        Shuffle();
    }//GEN-LAST:event_formWindowActivated
    
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
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NewJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JButton jbntExit;
    private javax.swing.JButton jbtnReset;
    private javax.swing.JButton jbtnSolution;
    private javax.swing.JLabel jlblNumOFClicks;
    // End of variables declaration//GEN-END:variables
}
