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
public class SignIn extends javax.swing.JFrame {

    /**
     * Creates new form SignIn
     */
    public SignIn() {
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

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        UN = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        P = new javax.swing.JPasswordField();
        SI = new javax.swing.JButton();
        Back = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        wrong = new javax.swing.JLabel();
        enteruser = new javax.swing.JLabel();
        enterpass = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(25, 240, 57));
        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(0, 51, 255), new java.awt.Color(0, 255, 204), new java.awt.Color(255, 51, 0), new java.awt.Color(204, 255, 0)));
        jPanel1.setLayout(null);

        jLabel2.setFont(new java.awt.Font("Adobe Garamond Pro", 0, 18)); // NOI18N
        jLabel2.setText("Enter Your UserName");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(120, 160, 168, 20);
        jPanel1.add(UN);
        UN.setBounds(300, 160, 168, 22);

        jLabel3.setFont(new java.awt.Font("Adobe Garamond Pro", 0, 18)); // NOI18N
        jLabel3.setText("Enter Your Password");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(120, 250, 168, 18);

        P.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PActionPerformed(evt);
            }
        });
        jPanel1.add(P);
        P.setBounds(300, 250, 168, 22);

        SI.setText("Sign In");
        SI.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SIActionPerformed(evt);
            }
        });
        jPanel1.add(SI);
        SI.setBounds(450, 510, 288, 55);

        Back.setText("Back");
        Back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackActionPerformed(evt);
            }
        });
        jPanel1.add(Back);
        Back.setBounds(80, 510, 254, 55);

        jPanel2.setBackground(new java.awt.Color(255, 255, 51));
        jPanel2.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setText("Sign In With Username And Password");
        jPanel2.add(jLabel1);
        jLabel1.setBounds(195, 29, 470, 57);

        jPanel1.add(jPanel2);
        jPanel2.setBounds(0, 0, 900, 110);
        jPanel1.add(wrong);
        wrong.setBounds(280, 330, 360, 20);
        jPanel1.add(enteruser);
        enteruser.setBounds(300, 190, 180, 10);
        jPanel1.add(enterpass);
        enterpass.setBounds(290, 320, 170, 20);

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/blooddonate/sign in.jpg"))); // NOI18N
        jPanel1.add(jLabel4);
        jLabel4.setBounds(0, 110, 770, 510);

        jPanel3.setBackground(new java.awt.Color(0, 0, 255));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 900, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 80, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel3);
        jPanel3.setBounds(0, 620, 900, 80);

        jPanel4.setBackground(new java.awt.Color(255, 0, 51));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 130, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 510, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel4);
        jPanel4.setBounds(770, 110, 130, 510);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 900, 700);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackActionPerformed
        // TODO add your handling code here:
        DonnorPanel donnor= new DonnorPanel();
        donnor.setVisible(true);
    }//GEN-LAST:event_BackActionPerformed

    private void PActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PActionPerformed

    private void SIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SIActionPerformed
        // TODO add your handling code here:
        if(UN.getText().trim().isEmpty()&& P.getText().trim().isEmpty()){
            enteruser.setText("enter something");
            enterpass.setText("enter something");
        }
        else if(UN.getText().trim().isEmpty()){
            enteruser.setText("enter something");
        }
        else if(P.getText().trim().isEmpty()){
            enterpass.setText("enter something");
        }
        else if(UN.getText().equalsIgnoreCase("Admin")){
            if(P.getText().equals("1")){
                AdminDeshboard objd=new AdminDeshboard();
                objd.setVisible(true);
            } 

        else{
            wrong.setText("Wrong UserName Or Password");
        }
    }//GEN-LAST:event_SIActionPerformed

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
            java.util.logging.Logger.getLogger(SignIn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SignIn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SignIn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SignIn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SignIn().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Back;
    private javax.swing.JPasswordField P;
    private javax.swing.JButton SI;
    private javax.swing.JTextField UN;
    private javax.swing.JLabel enterpass;
    private javax.swing.JLabel enteruser;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JLabel wrong;
    // End of variables declaration//GEN-END:variables
}
