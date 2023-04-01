/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Frames;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;


public class AddAcceseries extends javax.swing.JFrame {
 
    Connection conn = null;
   
    public AddAcceseries() throws SQLException {
        initComponents();
        addData();
    }

    public void addData() throws SQLException
    {
         ConnectionClass obj = new ConnectionClass();
         conn = obj.getConnection();
         
         String q = "select *from supplier";
         PreparedStatement st = conn.prepareStatement(q);
         
         ResultSet rs = st.executeQuery();
         
         while(rs.next())
         {
             acc7.addItem(rs.getString("sname"));
         }  
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        acc3 = new javax.swing.JTextField();
        acc1 = new javax.swing.JTextField();
        acc4 = new javax.swing.JTextField();
        acc5 = new javax.swing.JTextField();
        acc2 = new javax.swing.JTextField();
        Clear1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        text1 = new javax.swing.JLabel();
        text2 = new javax.swing.JLabel();
        text3 = new javax.swing.JLabel();
        text4 = new javax.swing.JLabel();
        text5 = new javax.swing.JLabel();
        text6 = new javax.swing.JLabel();
        text7 = new javax.swing.JLabel();
        acc7 = new javax.swing.JComboBox<>();
        acc6 = new com.toedter.calendar.JDateChooser();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setPreferredSize(new java.awt.Dimension(1020, 650));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(255, 165, 0));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/Accesaries.png"))); // NOI18N
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, 490, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/backIcon.png"))); // NOI18N
        jLabel2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
        });
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, -1, -1));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 490, 640));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/Autoking.png"))); // NOI18N
        jLabel3.setText("jLabel3");
        jPanel3.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(196, 0, 137, -1));

        jLabel5.setBackground(new java.awt.Color(255, 255, 255));
        jLabel5.setFont(new java.awt.Font("Bodoni MT", 1, 30)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 153, 0));
        jLabel5.setText("Add Accessories");
        jLabel5.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jPanel3.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 90, 220, 40));

        jLabel4.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        jLabel4.setText("add accesaries here");
        jPanel3.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 120, 110, 30));

        jLabel16.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        jLabel16.setText("Accesories price                   :");
        jPanel3.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 280, -1, -1));

        jLabel17.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        jLabel17.setText("Accessories name                :");
        jPanel3.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 220, -1, -1));

        jLabel18.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        jLabel18.setText("Accesories company name  :");
        jPanel3.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 400, -1, -1));

        jLabel19.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        jLabel19.setText("Supplier name                     :");
        jPanel3.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 520, 230, -1));

        jLabel20.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        jLabel20.setText("Accesories quantity             :");
        jPanel3.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 340, -1, -1));

        jLabel21.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        jLabel21.setText("Accesories issue date           :");
        jPanel3.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 460, -1, -1));

        jLabel22.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        jLabel22.setText("Product id                            :");
        jPanel3.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 160, -1, 20));

        acc3.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        acc3.setCaretColor(new java.awt.Color(255, 102, 0));
        acc3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                acc3ActionPerformed(evt);
            }
        });
        jPanel3.add(acc3, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 280, 240, 30));

        acc1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        acc1.setCaretColor(new java.awt.Color(255, 102, 0));
        jPanel3.add(acc1, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 160, 240, 30));

        acc4.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        acc4.setCaretColor(new java.awt.Color(255, 102, 0));
        acc4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                acc4ActionPerformed(evt);
            }
        });
        jPanel3.add(acc4, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 340, 240, 30));

        acc5.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        acc5.setCaretColor(new java.awt.Color(255, 102, 0));
        acc5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                acc5ActionPerformed(evt);
            }
        });
        jPanel3.add(acc5, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 400, 240, 30));

        acc2.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        acc2.setCaretColor(new java.awt.Color(255, 102, 0));
        acc2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                acc2ActionPerformed(evt);
            }
        });
        jPanel3.add(acc2, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 220, 240, 30));

        Clear1.setBackground(new java.awt.Color(255, 165, 0));
        Clear1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        Clear1.setForeground(new java.awt.Color(255, 255, 255));
        Clear1.setText("CLEAR");
        Clear1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Clear1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Clear1ActionPerformed(evt);
            }
        });
        jPanel3.add(Clear1, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 580, 120, 30));

        jButton2.setBackground(new java.awt.Color(255, 165, 0));
        jButton2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("SUBMIT");
        jButton2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 580, 120, 30));

        text1.setForeground(new java.awt.Color(255, 0, 0));
        jPanel3.add(text1, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 190, 240, 20));

        text2.setForeground(new java.awt.Color(255, 0, 0));
        jPanel3.add(text2, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 250, 240, 20));

        text3.setForeground(new java.awt.Color(255, 0, 0));
        jPanel3.add(text3, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 310, 240, 20));

        text4.setForeground(new java.awt.Color(255, 0, 0));
        jPanel3.add(text4, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 370, 240, 20));

        text5.setForeground(new java.awt.Color(255, 0, 0));
        jPanel3.add(text5, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 430, 240, 20));

        text6.setForeground(new java.awt.Color(255, 0, 0));
        jPanel3.add(text6, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 490, 240, 20));

        text7.setForeground(new java.awt.Color(255, 0, 0));
        jPanel3.add(text7, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 550, 240, 20));

        acc7.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "select" }));
        acc7.setToolTipText("");
        jPanel3.add(acc7, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 520, 240, 30));
        jPanel3.add(acc6, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 450, 240, 40));

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 0, 530, 640));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1020, 640));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void acc3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_acc3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_acc3ActionPerformed

    private void acc4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_acc4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_acc4ActionPerformed

    private void acc5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_acc5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_acc5ActionPerformed

    private void acc2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_acc2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_acc2ActionPerformed

    private void Clear1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Clear1ActionPerformed
                Clear1.addActionListener((ActionEvent e) -> {
                    acc1.setText("");
                    acc2.setText("");
                    acc3.setText("");
                    acc4.setText("");
                    acc5.setText("");
                    acc6.setCalendar(null);
                    acc7.addItem("Select");
                });        // TODO add your handling code here:
    }//GEN-LAST:event_Clear1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
      
    //For id Accesaries id 
        String str1="^([a-zA-Z_$][a-zA-Z\\d_$]*)$";
        boolean isValid = true;
        String id= acc1.getText();
        if(id.equals(""))
        {
            text1.setText(" Accesaries id do not empty.");
        }
        else
        if(!id.matches(str1))
        {
            text1.setText("  Accesaries id is invalid.");
            isValid = false;
         }
        else
            {
                text1.setText("");
                
            }

      //For id Accesaries name 
      
        String str2= "[a-zA-Z]+\\.?";
        String name= acc2.getText();
        if(name.equals(""))
        {
            text2.setText(" Accesaries name do not empty.");
        }
        else
        if(!name.matches(str2))
        {
            text2.setText("  Accesaries name is invalid.");
            isValid = false;
        }
        else
            {
                text2.setText("");
                
            }
 
        //For id Accesaries price 
        String str3="[0-9]+([,.][0-9]{1,2})?";
        String price= acc3.getText();
        if(price.equals(""))
        {
            text3.setText(" Accesaries price do not empty.");
        }
        else
        if(!price.matches(str3))
        {
            text3.setText("  Accesaries price is invalid.");
            isValid = false;
        }
        else
        {
                text3.setText("");
                
        }

        //For id Accesaries Quantity
        String str4="^[0-9]*$";
        String quantity= acc4.getText();
        
        if(quantity.equals(""))
        {
            text4.setText(" Accesaries Quantity do not empty.");
        }
        else
        if(!quantity.matches(str4))
        {
            text4.setText("  Accesaries Quantityis invalid.");
            isValid = false;
        }
        else
        {
                text4.setText("");
                
        }

        //For id company name
        String str5="[a-zA-Z]+\\.?";
        String cname= acc5.getText();
        if(cname.equals(""))
        {
            text5.setText(" Company name do not empty.");
        }
        else
        if(!cname.matches(str5))
        {
            text5.setText(" Company name is invalid.");
            isValid = false;
        }
        else
        {
                text5.setText("");
                
        }
        
        
        String Cdate ="";
        Date temp = acc6.getDate();
        if(temp!=null)
        {
            String y = String.valueOf(temp.getYear()+1900);
            String d = String.valueOf(temp.getDate());
            String m = String.valueOf(temp.getMonth()+1);
            Cdate = y+"-"+m+"-"+d;
        }

       try
        {
            //Date temp = acc6.getDate();
            System.out.println("Date Format:"+temp);
            if(temp == null)
            {
                text6.setText("Date do not empty.");
            }
            else
            {
                text6.setText("");
                
            }
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
        
        //For id custumer name
        String str7="[a-zA-Z]+\\.?";
        String sname= acc7.getSelectedItem().toString();
        System.out.println("supplier text:"+sname);
        if(sname.equals(""))
        {
            text7.setText(" Supplier name do not empty.");
        }
        else
        if(!sname.matches(str7))
        {
            text7.setText(" Supplier name is invalid.");
            isValid = false;
        }
        else
        {
                text7.setText("");  
        }
        
        
        //
        if(isValid)
        {
           
            try 
            {
                
                //System.out.println("Connected to XAMPP MySQL database");
                
                ConnectionClass obj = new ConnectionClass();
                conn = obj.getConnection();
                
                System.out.println("Connected to XAMPP MySQL database");
                
                String q = "insert into addaccessories(product_id,acce_name,acce_price,acce_quantity,acce_comp_name,acce_issue_date,supplier_name) values(?,?,?,?,?,?,?)";
                PreparedStatement st = conn.prepareStatement(q);
                st.setString(1,id);
                st.setString(2,name);
                st.setString(3,price);
                st.setString(4,quantity);
                st.setString(5,cname);
                st.setString(6,Cdate);
                st.setString(7,sname);
                
                int op = st.executeUpdate();
                
               
                
                if(op>0)
                {
                    JOptionPane.showMessageDialog(this," Registration Successfully.");
                        Dashbord d = new Dashbord();
                        this.hide();
                        d.setVisible(true);  
                }
                else
                {
                    JOptionPane.showMessageDialog(this," Registration Fail.");
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
        
                                        
        
        //
        
        
        
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
        Dashbord obj = new Dashbord();
        this.hide();
        obj.setVisible(true);        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel2MouseClicked

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
            java.util.logging.Logger.getLogger(AddAcceseries.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AddAcceseries.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AddAcceseries.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AddAcceseries.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new AddAcceseries().setVisible(true);
                } catch (SQLException ex) {
                    Logger.getLogger(AddAcceseries.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Clear1;
    private javax.swing.JTextField acc1;
    private javax.swing.JTextField acc2;
    private javax.swing.JTextField acc3;
    private javax.swing.JTextField acc4;
    private javax.swing.JTextField acc5;
    private com.toedter.calendar.JDateChooser acc6;
    private javax.swing.JComboBox<String> acc7;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JLabel text1;
    private javax.swing.JLabel text2;
    private javax.swing.JLabel text3;
    private javax.swing.JLabel text4;
    private javax.swing.JLabel text5;
    private javax.swing.JLabel text6;
    private javax.swing.JLabel text7;
    // End of variables declaration//GEN-END:variables
}
