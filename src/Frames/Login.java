
package Frames;

import java.sql.Connection;
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;

/**
 *
 * @author Anuja
 */
public class Login extends javax.swing.JFrame {


    public Login() {
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
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        t1 = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        b2 = new javax.swing.JButton();
        t2 = new javax.swing.JPasswordField();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        passError = new javax.swing.JLabel();
        userError = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(920, 520));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 165, 0));
        jPanel1.setForeground(new java.awt.Color(255, 165, 0));
        jPanel1.setPreferredSize(new java.awt.Dimension(920, 520));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setMinimumSize(new java.awt.Dimension(500, 483));
        jPanel2.setPreferredSize(new java.awt.Dimension(500, 520));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/Autoking.png"))); // NOI18N
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 0, -1, -1));

        jLabel3.setFont(new java.awt.Font("Bodoni MT", 1, 28)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 165, 0));
        jLabel3.setText("LOGIN ");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 100, 110, 40));

        jLabel4.setText("Welcome back, Please login to your account.");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 140, -1, -1));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel5.setText("Username :");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 200, -1, -1));

        t1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        t1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                t1ActionPerformed(evt);
            }
        });
        jPanel2.add(t1, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 200, 260, 30));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel6.setText("Password   :");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 260, -1, -1));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 0, 0));
        jLabel8.setText("*");
        jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 250, 20, 30));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 0, 0));
        jLabel7.setText("*");
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 190, -1, -1));

        jButton1.setBackground(new java.awt.Color(255, 165, 0));
        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("LOGIN");
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 370, 100, -1));

        b2.setBackground(new java.awt.Color(255, 165, 0));
        b2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        b2.setForeground(new java.awt.Color(255, 255, 255));
        b2.setText("CLEAR");
        b2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        b2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b2ActionPerformed(evt);
            }
        });
        jPanel2.add(b2, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 370, 100, -1));

        t2.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        t2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                t2ActionPerformed(evt);
            }
        });
        jPanel2.add(t2, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 260, 260, 30));

        jLabel10.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 165, 0));
        jLabel10.setText("Forgot password ?");
        jLabel10.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel10MouseClicked(evt);
            }
        });
        jPanel2.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 320, -1, -1));

        jLabel11.setText("Not a member ? Sign up now ");
        jPanel2.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 420, -1, -1));

        jLabel12.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel12.setText("SIGN UP");
        jLabel12.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel12MouseClicked(evt);
            }
        });
        jPanel2.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 450, -1, -1));

        passError.setForeground(new java.awt.Color(255, 0, 0));
        jPanel2.add(passError, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 290, 260, 20));

        userError.setForeground(new java.awt.Color(255, 0, 0));
        jPanel2.add(userError, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 230, 260, 20));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 0, 530, 510));

        jPanel3.setBackground(new java.awt.Color(255, 165, 0));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/login__img-removebg-preview.png"))); // NOI18N
        jPanel3.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 390, 500));

        jLabel13.setBackground(new java.awt.Color(153, 255, 102));
        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/backIcon.png"))); // NOI18N
        jLabel13.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel13MouseClicked(evt);
            }
        });
        jPanel3.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 40, 40));

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 420, 520));
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-40, 0, 470, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 930, 510));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        String strPattern = "^[a-zA-Z0-9_.]{8,20}$";
        boolean isValid = true;
        Connection conn = null;
           
        String username = t1.getText();
        //boolean isValid=true;
        if(username.equals(""))
        {
            userError.setText("Username do not empty.");
            isValid = false;
        }
        else
        if(!username.matches( strPattern))
        {
            userError.setText("Enter valid username");
            isValid = false;
        }
        else
        {
            userError.setText("");
            // isValid = false;
        }
        
        
        
        String strpattern3="^(?=.*[0-9])"+ "(?=.*[a-z])(?=.*[A-Z])" + "(?=.*[@#$%^&+=])"+ "(?=\\S+$).{8,20}$";
        String password = t2.getText();
        //boolean isValid=true;
        if(password.equals(""))
        {
            passError.setText("Password do not empty.");
            isValid = false;
        }
        else
        if(!password.matches(strpattern3))
        {
            passError.setText("Enter valid password");
            isValid = false;
        }
        else
        {
            passError.setText("");
            // isValid = false;
        }
        
        
        if(isValid)
        {
        try 
            {
                
                //System.out.println("Connected to XAMPP MySQL database");
                
                ConnectionClass obj = new ConnectionClass();
                conn = obj.getConnection();
                
                System.out.println("Connected to XAMPP MySQL database");
                
                String q = "insert into login(username,password) values(?,?)";
                PreparedStatement st = conn.prepareStatement(q);
                st.setString(1,username);
                st.setString(2,password);
                
                
                int op = st.executeUpdate();
                
               
                
                if(op>0)
                {
                    JOptionPane.showMessageDialog(this," login Successfully.");
                    Dashbord obj2 = new Dashbord();
                    this.hide();
                    obj2.setVisible(true);
                }
                else
                {
                    JOptionPane.showMessageDialog(this," login Fail.");
                }
                conn.close();
            } 
            catch (Exception ex) 
            {
               System.out.println(ex);
               JOptionPane.showMessageDialog(this,"This user allready exits.");
               ex.printStackTrace();
            }
        }
          

    
    }//GEN-LAST:event_jButton1ActionPerformed

    private void b2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b2ActionPerformed
        t1.setText("");
        t2.setText("");
    }//GEN-LAST:event_b2ActionPerformed

    private void jLabel13MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel13MouseClicked
        Login obj = new Login();
        this.hide();
        obj.setVisible(true);

        //        JOptionPane.showMessageDialog(this, "Enter a valid Number","ERROR", JOptionPane.ERROR_MESSAGE);
    }//GEN-LAST:event_jLabel13MouseClicked

    private void t1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_t1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_t1ActionPerformed

    private void jLabel12MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel12MouseClicked
        signup obj = new signup();
        this.hide();
        obj.setVisible(true);
    }//GEN-LAST:event_jLabel12MouseClicked

    private void jLabel10MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel10MouseClicked
        Authentication obj = new Authentication();
        this.hide();
        obj.setVisible(true);
    }//GEN-LAST:event_jLabel10MouseClicked

    private void t2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_t2ActionPerformed
        // TODO add your handling code here:
       
    }//GEN-LAST:event_t2ActionPerformed

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
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton b2;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JLabel passError;
    private javax.swing.JTextField t1;
    private javax.swing.JPasswordField t2;
    private javax.swing.JLabel userError;
    // End of variables declaration//GEN-END:variables
}
