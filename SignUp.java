/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package blooddonate;

/**
 *
 * @author SR
 */
public class SignUp extends javax.swing.JFrame {

    /**
     * Creates new form SignUp
     */
    public SignUp() {
        initComponents();
        this.setBounds(100,50,900,700);
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
        buttonGroup2 = new javax.swing.ButtonGroup();
        buttonGroup3 = new javax.swing.ButtonGroup();
        buttonGroup4 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jTextField4 = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        jRadioButton3 = new javax.swing.JRadioButton();
        jRadioButton4 = new javax.swing.JRadioButton();
        jRadioButton5 = new javax.swing.JRadioButton();
        jRadioButton6 = new javax.swing.JRadioButton();
        jRadioButton7 = new javax.swing.JRadioButton();
        jRadioButton8 = new javax.swing.JRadioButton();
        jLabel7 = new javax.swing.JLabel();
        jRadioButton9 = new javax.swing.JRadioButton();
        jRadioButton10 = new javax.swing.JRadioButton();
        jLabel8 = new javax.swing.JLabel();
        jTextField5 = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jTextField6 = new javax.swing.JTextField();
        Submit = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        jTextField7 = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jTextField8 = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jTextField9 = new javax.swing.JTextField();
        Back = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();
        jRadioButton11 = new javax.swing.JRadioButton();
        jRadioButton12 = new javax.swing.JRadioButton();
        jRadioButton13 = new javax.swing.JRadioButton();
        jLabel14 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(137, 255, 101));
        jPanel1.setLayout(null);

        jLabel1.setText("Enter Your Name");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(42, 153, 150, 35);
        jPanel1.add(jTextField1);
        jTextField1.setBounds(197, 164, 135, 22);

        jLabel3.setText("Enter Your Age");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(42, 209, 135, 16);

        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });
        jPanel1.add(jTextField2);
        jTextField2.setBounds(195, 206, 135, 22);

        jLabel4.setText("Enter Your Weight");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(34, 246, 135, 16);
        jPanel1.add(jTextField3);
        jTextField3.setBounds(195, 246, 135, 22);

        jLabel5.setText("Enter Your Profession");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(30, 290, 135, 16);
        jPanel1.add(jTextField4);
        jTextField4.setBounds(190, 290, 135, 22);

        jLabel6.setText("Enter Your Blood Group");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(34, 345, 135, 16);

        buttonGroup3.add(jRadioButton1);
        jRadioButton1.setText("A+");
        jPanel1.add(jRadioButton1);
        jRadioButton1.setBounds(270, 340, 45, 30);

        buttonGroup3.add(jRadioButton2);
        jRadioButton2.setText("A-");
        jPanel1.add(jRadioButton2);
        jRadioButton2.setBounds(270, 380, 41, 25);

        buttonGroup3.add(jRadioButton3);
        jRadioButton3.setText("B+");
        jPanel1.add(jRadioButton3);
        jRadioButton3.setBounds(380, 340, 43, 25);

        buttonGroup3.add(jRadioButton4);
        jRadioButton4.setText("B-");
        jPanel1.add(jRadioButton4);
        jRadioButton4.setBounds(380, 380, 41, 25);

        buttonGroup3.add(jRadioButton5);
        jRadioButton5.setText("O+");
        jRadioButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton5ActionPerformed(evt);
            }
        });
        jPanel1.add(jRadioButton5);
        jRadioButton5.setBounds(200, 340, 50, 25);

        buttonGroup3.add(jRadioButton6);
        jRadioButton6.setText("O-");
        jPanel1.add(jRadioButton6);
        jRadioButton6.setBounds(200, 380, 51, 25);

        buttonGroup3.add(jRadioButton7);
        jRadioButton7.setText("AB+");
        jRadioButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton7ActionPerformed(evt);
            }
        });
        jPanel1.add(jRadioButton7);
        jRadioButton7.setBounds(320, 340, 51, 25);

        buttonGroup3.add(jRadioButton8);
        jRadioButton8.setText("AB-");
        jPanel1.add(jRadioButton8);
        jRadioButton8.setBounds(320, 380, 51, 25);

        jLabel7.setText("Do You Have Any Expreience");
        jPanel1.add(jLabel7);
        jLabel7.setBounds(493, 167, 171, 16);

        buttonGroup4.add(jRadioButton9);
        jRadioButton9.setText("Yes");
        jRadioButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton9ActionPerformed(evt);
            }
        });
        jPanel1.add(jRadioButton9);
        jRadioButton9.setBounds(672, 163, 49, 25);

        buttonGroup4.add(jRadioButton10);
        jRadioButton10.setText("No");
        jRadioButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton10ActionPerformed(evt);
            }
        });
        jPanel1.add(jRadioButton10);
        jRadioButton10.setBounds(739, 163, 43, 25);

        jLabel8.setText("Chose Your UserName");
        jPanel1.add(jLabel8);
        jLabel8.setBounds(493, 209, 152, 16);
        jPanel1.add(jTextField5);
        jTextField5.setBounds(663, 206, 137, 22);

        jLabel9.setText("Enter a Password");
        jPanel1.add(jLabel9);
        jLabel9.setBounds(490, 240, 137, 16);
        jPanel1.add(jTextField6);
        jTextField6.setBounds(660, 270, 137, 22);

        Submit.setBackground(new java.awt.Color(51, 51, 255));
        Submit.setFont(new java.awt.Font("Adobe Garamond Pro", 2, 36)); // NOI18N
        Submit.setForeground(new java.awt.Color(255, 0, 0));
        Submit.setText("Submit");
        Submit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SubmitActionPerformed(evt);
            }
        });
        jPanel1.add(Submit);
        Submit.setBounds(570, 490, 266, 66);

        jLabel10.setText("Enter Your District");
        jPanel1.add(jLabel10);
        jLabel10.setBounds(493, 271, 103, 16);
        jPanel1.add(jTextField7);
        jTextField7.setBounds(660, 240, 137, 22);

        jLabel11.setText("Enter Your Thana Name");
        jPanel1.add(jLabel11);
        jLabel11.setBounds(493, 310, 137, 16);
        jPanel1.add(jTextField8);
        jTextField8.setBounds(660, 310, 137, 22);

        jLabel12.setText("Enter Your Post Code");
        jPanel1.add(jLabel12);
        jLabel12.setBounds(500, 350, 121, 20);
        jPanel1.add(jTextField9);
        jTextField9.setBounds(663, 351, 137, 22);

        Back.setBackground(new java.awt.Color(51, 51, 255));
        Back.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        Back.setForeground(new java.awt.Color(255, 51, 51));
        Back.setText("Back");
        Back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackActionPerformed(evt);
            }
        });
        jPanel1.add(Back);
        Back.setBounds(50, 500, 250, 66);

        jLabel13.setText("Gender");
        jPanel1.add(jLabel13);
        jLabel13.setBounds(508, 387, 137, 27);

        buttonGroup1.add(jRadioButton11);
        jRadioButton11.setText("Male");
        jRadioButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton11ActionPerformed(evt);
            }
        });
        jPanel1.add(jRadioButton11);
        jRadioButton11.setBounds(663, 391, 55, 25);

        buttonGroup1.add(jRadioButton12);
        jRadioButton12.setText("Female");
        jPanel1.add(jRadioButton12);
        jRadioButton12.setBounds(722, 391, 71, 25);

        buttonGroup1.add(jRadioButton13);
        jRadioButton13.setText("Other");
        jRadioButton13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton13ActionPerformed(evt);
            }
        });
        jPanel1.add(jRadioButton13);
        jRadioButton13.setBounds(797, 391, 61, 25);

        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/blooddonate/Signup.jpg"))); // NOI18N
        jLabel14.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                jLabel14AncestorAdded(evt);
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        jPanel1.add(jLabel14);
        jLabel14.setBounds(0, 0, 900, 700);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 900, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 700, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField2ActionPerformed

    private void SubmitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SubmitActionPerformed
        // TODO add your handling code here:
        SignIn obj=new SignIn();
        obj.setVisible(true);   
    }//GEN-LAST:event_SubmitActionPerformed

    private void jRadioButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton5ActionPerformed

    private void jRadioButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton9ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton9ActionPerformed

    private void jRadioButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton10ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton10ActionPerformed

    private void BackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackActionPerformed
        // TODO add your handling code here:
        DonnorPanel obj=new DonnorPanel();
        obj.setVisible(true);
    }//GEN-LAST:event_BackActionPerformed

    private void jRadioButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton7ActionPerformed

    private void jRadioButton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton11ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton11ActionPerformed

    private void jRadioButton13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton13ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton13ActionPerformed

    private void jLabel14AncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_jLabel14AncestorAdded
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel14AncestorAdded

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
            java.util.logging.Logger.getLogger(SignUp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SignUp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SignUp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SignUp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SignUp().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Back;
    private javax.swing.JButton Submit;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.ButtonGroup buttonGroup3;
    private javax.swing.ButtonGroup buttonGroup4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton10;
    private javax.swing.JRadioButton jRadioButton11;
    private javax.swing.JRadioButton jRadioButton12;
    private javax.swing.JRadioButton jRadioButton13;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JRadioButton jRadioButton3;
    private javax.swing.JRadioButton jRadioButton4;
    private javax.swing.JRadioButton jRadioButton5;
    private javax.swing.JRadioButton jRadioButton6;
    private javax.swing.JRadioButton jRadioButton7;
    private javax.swing.JRadioButton jRadioButton8;
    private javax.swing.JRadioButton jRadioButton9;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextField jTextField8;
    private javax.swing.JTextField jTextField9;
    // End of variables declaration//GEN-END:variables
}