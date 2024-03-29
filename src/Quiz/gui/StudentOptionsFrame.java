/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Quiz.gui;

import Quiz.pojo.UserProfile;
import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author gouru
 */
public class StudentOptionsFrame extends javax.swing.JFrame {

    /**
     * Creates new form StudentOptionsFrame
     */
    public StudentOptionsFrame() {
        initComponents();
        this.setResizable(false);
        this.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
        setLocationRelativeTo(null);
        name.setText("Hello "+UserProfile.getUsername());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        test = new javax.swing.JRadioButton();
        score = new javax.swing.JRadioButton();
        password = new javax.swing.JRadioButton();
        btnDoTask = new javax.swing.JButton();
        name = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        logout = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel1.setText("ONLINE QUIZ STUDENT PANEL ");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(148, 82, 508, 44);

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel2.setText("MAKE A CHOICE");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(390, 190, 173, 29);

        buttonGroup1.add(test);
        test.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        test.setText("TAKE TEST");
        test.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                testActionPerformed(evt);
            }
        });
        jPanel1.add(test);
        test.setBounds(390, 270, 119, 31);

        buttonGroup1.add(score);
        score.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        score.setText("VIEW SCORE");
        jPanel1.add(score);
        score.setBounds(390, 320, 133, 31);

        buttonGroup1.add(password);
        password.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        password.setText("CHANGE PASSWORD");
        jPanel1.add(password);
        password.setBounds(390, 370, 195, 31);

        btnDoTask.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnDoTask.setText("DO TASK");
        btnDoTask.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDoTaskActionPerformed(evt);
            }
        });
        jPanel1.add(btnDoTask);
        btnDoTask.setBounds(390, 440, 107, 31);

        name.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jPanel1.add(name);
        name.setBounds(0, 13, 98, 23);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/stud1.jpg"))); // NOI18N
        jLabel3.setText("jLabel3");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(80, 200, 207, 213);

        logout.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        logout.setText("Logout");
        logout.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                logoutMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                logoutMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                logoutMouseExited(evt);
            }
        });
        jPanel1.add(logout);
        logout.setBounds(680, 10, 55, 22);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 752, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 526, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void testActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_testActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_testActionPerformed

    private void btnDoTaskActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDoTaskActionPerformed
        if(Validate())
        {
            JOptionPane.showMessageDialog(null, "PLEASE SELECT AN OPTION","ERROR!",JOptionPane.ERROR_MESSAGE);
        }
        if(test.isSelected()==true)
        {
            ChoosePaperFrame cpf=new ChoosePaperFrame();
            cpf.setVisible(true);
            this.dispose();
        }
        if(score.isSelected()==true)
        {
            StudentScoreFrame ssf=new StudentScoreFrame();
            ssf.setVisible(true);
            this.dispose();
        }
        if(password.isSelected()==true)
        {
            ChangePasswordFrame cpf=new ChangePasswordFrame();
            cpf.setVisible(true);
            this.dispose();
        }

    }//GEN-LAST:event_btnDoTaskActionPerformed

    private void logoutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logoutMouseClicked
        Login log=new Login();
        log.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_logoutMouseClicked

    private void logoutMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logoutMouseEntered
        logout.setForeground(Color.blue);
    }//GEN-LAST:event_logoutMouseEntered

    private void logoutMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logoutMouseExited
        logout.setForeground(Color.black);
    }//GEN-LAST:event_logoutMouseExited

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
            java.util.logging.Logger.getLogger(StudentOptionsFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(StudentOptionsFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(StudentOptionsFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(StudentOptionsFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new StudentOptionsFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDoTask;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel logout;
    private javax.swing.JLabel name;
    private javax.swing.JRadioButton password;
    private javax.swing.JRadioButton score;
    private javax.swing.JRadioButton test;
    // End of variables declaration//GEN-END:variables

    private boolean Validate() {
        if(test.isSelected()==false&&score.isSelected()==false&&password.isSelected()==false)
        {
            return true;
        }
        else
            return false;
    }
}
