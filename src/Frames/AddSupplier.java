/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */


package Frames;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.Date;
import javax.swing.JOptionPane;

/**
 *
 * @author admin
 */
public class AddSupplier extends javax.swing.JFrame {

    /**
     * Creates new form AddSupplier
     */
    public AddSupplier() {
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
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        sup1 = new javax.swing.JTextField();
        sup2 = new javax.swing.JTextField();
        sup3 = new javax.swing.JTextField();
        sup4 = new javax.swing.JTextField();
        sup5 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        dateError = new javax.swing.JLabel();
        custError = new javax.swing.JLabel();
        MnoError = new javax.swing.JLabel();
        emailError = new javax.swing.JLabel();
        addError = new javax.swing.JLabel();
        SnoError = new javax.swing.JLabel();
        b2 = new javax.swing.JButton();
        sup6 = new com.toedter.calendar.JDateChooser();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 165, 0));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/Autoking.png"))); // NOI18N
        jLabel1.setText("jLabel1");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 0, 138, 106));

        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3.setFont(new java.awt.Font("Bodoni MT", 1, 28)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 153, 0));
        jLabel3.setText("ADD SUPPLIER");
        jLabel3.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 100, 220, 40));

        jLabel16.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        jLabel16.setText("Supplier id                :");
        jPanel2.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 170, -1, -1));

        jLabel17.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        jLabel17.setText("Supplier name         :");
        jPanel2.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 240, -1, -1));

        jLabel18.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        jLabel18.setText("Mobile                       :");
        jPanel2.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 310, -1, -1));

        jLabel19.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        jLabel19.setText("Email                          :");
        jPanel2.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 390, -1, -1));

        jLabel20.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        jLabel20.setText("Address                     :");
        jPanel2.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 470, -1, -1));

        sup1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jPanel2.add(sup1, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 170, 260, 30));

        sup2.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jPanel2.add(sup2, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 240, 260, 30));

        sup3.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jPanel2.add(sup3, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 310, 260, 30));

        sup4.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        sup4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sup4ActionPerformed(evt);
            }
        });
        jPanel2.add(sup4, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 390, 260, 30));

        sup5.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jPanel2.add(sup5, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 470, 260, 30));

        jButton1.setBackground(new java.awt.Color(255, 165, 0));
        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("SAVE");
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 540, 120, -1));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel5.setText("Date :");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 70, -1, -1));

        dateError.setForeground(new java.awt.Color(255, 0, 0));
        jPanel2.add(dateError, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 100, 160, 20));

        custError.setForeground(new java.awt.Color(255, 0, 0));
        jPanel2.add(custError, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 270, 260, 20));

        MnoError.setForeground(new java.awt.Color(255, 0, 0));
        jPanel2.add(MnoError, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 340, 260, 20));

        emailError.setForeground(new java.awt.Color(255, 0, 0));
        jPanel2.add(emailError, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 420, 260, 20));

        addError.setForeground(new java.awt.Color(255, 0, 0));
        jPanel2.add(addError, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 500, 260, 20));

        SnoError.setForeground(new java.awt.Color(255, 0, 0));
        jPanel2.add(SnoError, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 200, 260, 20));

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
        jPanel2.add(b2, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 540, 120, -1));
        jPanel2.add(sup6, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 70, 140, -1));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 0, 580, 770));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/supplier.png"))); // NOI18N
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(-20, 140, 390, 380));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/backIcon.png"))); // NOI18N
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 950, 630));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void sup4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sup4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_sup4ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        // TODO add your handling code here:
        
       
        //ID
        // sup123
        String strPattern = "^([a-zA-Z_$][a-zA-Z\\d_$]*)$";
          boolean isValid = true;
        String ID=sup1.getText();
        String Cdate = "";
        Connection conn = null;
        if(ID.equals(""))
        {
            SnoError.setText("Supplier id do not empty.");
            isValid = false;
         }
        else
        
         if(!ID.matches(strPattern))
        {
            SnoError.setText("Supplier id invalid.");
            isValid = false;
          
        }
         else
        {
            SnoError.setText("");
        }
         //name
         //Anuja Bhalerao
          String strPattern1 = "[a-zA-Z]+\\.?";
         String Sname=sup2.getText();
          if(Sname.equals(""))
        {
            custError.setText("Supplier name do not empty.");
            isValid = false;
        }
    
           else
              if(!Sname.matches(strPattern1))
        {
            custError.setText("Supplier name is invalid.");
             isValid = false;
        }
          else{
                  custError.setText("");
              }
          //mobile
          String strPattern2=("(0/91)?[7-9][0-9]{9}");
          String mobile=sup3.getText();
           if(mobile.equals(""))
        {
            MnoError.setText("Mobile do not empty.");
            isValid = false;
        }
           else
               if(!mobile.matches(strPattern2))
        {
            MnoError.setText("Mobile number is invalid.");
            isValid = false;
        }
               else{
                   MnoError.setText("");
               }
           //email
         
           String strPattern3="^[A-Za-z0-9+_.-]+@(.+)$";
           String email=sup4.getText();
            if(email.equals(""))
        {
            emailError.setText("Email do not empty.");
            isValid = false;
        }
             else
               if(!email.matches(strPattern3))
        {
            emailError.setText("Email is invalid");
            isValid = false;
        }
               else{
                   emailError.setText("");
               }
            
            
            //Address
            String strPattern4=("\"^(\\\\d{1,}) [a-zA-Z0-9\\\\s]+(\\\\,)? [a-zA-Z]+(\\\\,)? [A-Z]{2} [0-9]{5,6}$\"");
            String Address=sup5.getText();
               if(Address.equals(""))
        {
            addError.setText("Address do not empty.");
            isValid = false;
        }
//               else
//               if(!Address.matches(strPattern4))
//              {
//              addError.setText("address is invalid");
//              isValid = false;
//              }
               else
               {
                   addError.setText("");
               }
               
               
               try
        {
            Date temp = sup6.getDate();
            
            if(temp!=null)
            {
                String y = String.valueOf(temp.getYear()+1900);
                String d = String.valueOf(temp.getDate());
                String m = String.valueOf(temp.getMonth()+1);
                Cdate = y+"-"+m+"-"+d;
            }
            System.out.println("Date Format:"+Cdate);
            if(temp == null)
            {
                dateError.setText("Date do not empty.");
                isValid=false;
            }
            else
            {
                dateError.setText("");
                
            }
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
               
         if(isValid)
        {
           
            try 
            {
                
                System.out.println("Connected to XAMPP MySQL database");
                System.out.println("id :"+ID);
                System.out.println("date:"+Cdate);
                System.out.println(""+Sname);
                System.out.println(""+mobile);
                System.out.println(""+email);
                System.out.println(""+Address);
                
                
                ConnectionClass obj = new ConnectionClass();
                conn = obj.getConnection();
                
                String q = "insert into supplier(id,sdate,sname,smobile,emailid,address) values(?,?,?,?,?,?)";
                PreparedStatement st = conn.prepareStatement(q);
                st.setString(1,ID);
                st.setString(2,Cdate);
                st.setString(3,Sname);
                st.setString(4,mobile);
                st.setString(5,email);
                st.setString(6,Address);
                
                int op = st.executeUpdate();
           
                if(op>0)
                {
                    JOptionPane.showMessageDialog(this," Supplier added successfully.");
                    SupplierDetails obj2 = new SupplierDetails();
                    this.hide();
                    obj2.setVisible(true);
                }
                else
                {
                    JOptionPane.showMessageDialog(this,"This supplier allready exits.");
                }
                conn.close();
            } 
            catch (Exception ex) 
            {
               System.out.println(ex);
               JOptionPane.showMessageDialog(this,"This supplier allready exits.");
               ex.printStackTrace();
            }
        
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void b2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b2ActionPerformed
        sup1.setText("");
        sup2.setText("");
        sup3.setText("");
        sup4.setText("");
        sup5.setText("");
        sup6.setCalendar(null);
    }//GEN-LAST:event_b2ActionPerformed

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
            java.util.logging.Logger.getLogger(AddSupplier.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AddSupplier.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AddSupplier.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AddSupplier.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
        

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AddSupplier().setVisible(true);
                
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel MnoError;
    private javax.swing.JLabel SnoError;
    private javax.swing.JLabel addError;
    private javax.swing.JButton b2;
    private javax.swing.JLabel custError;
    private javax.swing.JLabel dateError;
    private javax.swing.JLabel emailError;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField sup1;
    private javax.swing.JTextField sup2;
    private javax.swing.JTextField sup3;
    private javax.swing.JTextField sup4;
    private javax.swing.JTextField sup5;
    private com.toedter.calendar.JDateChooser sup6;
    // End of variables declaration//GEN-END:variables
}
