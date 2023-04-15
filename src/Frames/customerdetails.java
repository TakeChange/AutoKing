/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Frames;

import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;


import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

import java.sql.*;
import java.util.Vector;



/**
 *
 * @author vaish
 */
public class Customerdetails extends javax.swing.JFrame {

     private Object txtProductid;
    private Object JoptionPane;

    public Customerdetails() {
        initComponents();
    }
    Connection conn;
    PreparedStatement st=null;
    ResultSet rs=null;
    ConnectionClass obj;
    DefaultTableModel d;
    String s;
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();
        search = new javax.swing.JButton();
        update = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        show = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        delete1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        t2 = new javax.swing.JTextPane();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        t3 = new javax.swing.JTextPane();
        jScrollPane4 = new javax.swing.JScrollPane();
        t5 = new javax.swing.JTextPane();
        jScrollPane5 = new javax.swing.JScrollPane();
        t1 = new javax.swing.JTextPane();
        jScrollPane6 = new javax.swing.JScrollPane();
        t4 = new javax.swing.JTextPane();
        jLabel9 = new javax.swing.JLabel();
        jScrollPane7 = new javax.swing.JScrollPane();
        t6 = new javax.swing.JTextPane();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 165, 0));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Customerid", "Customername", "Mobile", "Email", "Address", "date"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        table.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(table);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 120, 700, 390));

        search.setBackground(new java.awt.Color(0, 153, 153));
        search.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        search.setText("SEARCH");
        search.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchActionPerformed(evt);
            }
        });
        jPanel1.add(search, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 70, 120, -1));

        update.setBackground(new java.awt.Color(0, 153, 153));
        update.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        update.setText("UPDATE");
        update.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateActionPerformed(evt);
            }
        });
        jPanel1.add(update, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 530, 130, -1));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel2.setText("Search by name  :");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 70, 150, 30));

        jTextField1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        jPanel1.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 70, 300, 30));

        show.setBackground(new java.awt.Color(0, 153, 153));
        show.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        show.setText("SHOW");
        show.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        show.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                showActionPerformed(evt);
            }
        });
        jPanel1.add(show, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 530, 140, -1));

        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3.setFont(new java.awt.Font("Bodoni MT", 1, 28)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText(" CUSTOMER DETAILS");
        jLabel3.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 10, 300, 40));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/backIcon.png"))); // NOI18N
        jLabel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel4MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        delete1.setBackground(new java.awt.Color(0, 153, 153));
        delete1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        delete1.setText("DELETE");
        delete1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        delete1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                delete1ActionPerformed(evt);
            }
        });
        jPanel1.add(delete1, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 530, 140, -1));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setText("Name:");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 190, -1, -1));

        jScrollPane2.setViewportView(t2);

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 190, 170, 40));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel5.setText("Mobile:");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 260, -1, -1));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel6.setText("Email :");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 330, -1, -1));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel7.setText("Address :");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 400, -1, -1));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel8.setText("Id :");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, 40, -1));

        jScrollPane3.setViewportView(t3);

        jPanel1.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 260, 170, 40));

        jScrollPane4.setViewportView(t5);

        jPanel1.add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 460, 170, 40));

        jScrollPane5.setViewportView(t1);

        jPanel1.add(jScrollPane5, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 120, 170, 40));

        jScrollPane6.setViewportView(t4);

        jPanel1.add(jScrollPane6, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 330, 170, 40));

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel9.setText("Address :");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 460, -1, -1));

        jScrollPane7.setViewportView(t6);

        jPanel1.add(jScrollPane7, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 400, 170, 40));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1050, 600));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void searchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_searchActionPerformed

    private void updateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateActionPerformed
       try 
            {
                 obj = new ConnectionClass();
                conn = obj.getConnection();
               
                String cust_id=t1.getText();
                String cust_name=t2.getText();
                String cust_mobile=t3.getText();
                String cust_email=t4.getText();
                String cust_address=t5.getText();
                String date=t6.getText();
               
                String sql = ("UPDATE addcustomer set cust_name=?,cust_mobile=?,cust_email=?,cust_address=?,date=? where cust_id = ?");
                PreparedStatement ps = conn.prepareStatement(sql);
                //pstmt.setInt(1,Integer.parseInt(t1.getText()));
                ps.setString(1,cust_name);
                ps.setString(2,cust_mobile);
                ps.setString(3,cust_email);
                ps.setString(4,cust_address);
                ps.setString(5,date);
                ps.setString(6,cust_id);
                ps.executeUpdate();
                JOptionPane.showMessageDialog(null,"Record Updated Successfully");
                conn.close();      
            } 
            catch (Exception ex) 
            {
               System.out.println(ex);
               JOptionPane.showMessageDialog(this,"This user allready exits.");
               ex.printStackTrace();
            }
    }//GEN-LAST:event_updateActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jLabel4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseClicked
        // TODO add your handling code here:
        Dashbord obj;
        try {
            obj = new Dashbord();
               this.hide();
        obj.setVisible(true);
        } catch (SQLException ex) {
            Logger.getLogger(Customerdetails.class.getName()).log(Level.SEVERE, null, ex);
        }
     
    }//GEN-LAST:event_jLabel4MouseClicked

    private void delete1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_delete1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_delete1ActionPerformed

    private void tableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableMouseClicked
        d=(DefaultTableModel)table.getModel();
        String a1=d.getValueAt(table.getSelectedRow(),0).toString();
        String b1=d.getValueAt(table.getSelectedRow(),1).toString();
        String c1=d.getValueAt(table.getSelectedRow(),2).toString();
        String d1=d.getValueAt(table.getSelectedRow(),3).toString();
        String e1=d.getValueAt(table.getSelectedRow(),4).toString();
        String f1=d.getValueAt(table.getSelectedRow(),5).toString();
        //String g1=d.getValueAt(table.getSelectedRow(),6).toString();
        
        t1.setText(a1);
        t2.setText(b1);
        t3.setText(c1);
        t4.setText(d1);
        t5.setText(e1);
        t6.setText(f1);     
    }//GEN-LAST:event_tableMouseClicked

    private void showActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_showActionPerformed
        // TODO add your handling code here:
        try 
            {
                //System.out.println("Connected to XAMPP MySQL database");
                
                obj = new ConnectionClass();
                conn = obj.getConnection();
                
                System.out.println("Connected to XAMPP MySQL database");
                
                String q = "select * from addcustomer";
                st = conn.prepareStatement(q);
                rs=st.executeQuery();
                

                ResultSetMetaData rsmd=(ResultSetMetaData) rs.getMetaData();
                int n=rsmd.getColumnCount();
                
                d=(DefaultTableModel)table.getModel();
                d.setRowCount(0);
                while(rs.next())
                {
                    Vector v=new Vector();
                    for(int i=1;i<=n;i++)
                    {
                        v.add(rs.getString("cust_id"));
                        v.add(rs.getString("cust_name"));
                        v.add(rs.getString("cust_mobile"));
                        v.add(rs.getString("cust_email"));
                        v.add(rs.getString("cust_address"));
                        v.add(rs.getString("date"));
                     }
                    d.addRow(v);       
                }
            }
            catch (Exception ex) 
            {
               System.out.println(ex);
             //  JOptionPane.showMessageDialog(this,"This user allready exits.");
               ex.printStackTrace();
            }   
        

    }//GEN-LAST:event_showActionPerformed

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
            java.util.logging.Logger.getLogger(Customerdetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Customerdetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Customerdetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Customerdetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Customerdetails().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton delete1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JButton search;
    private javax.swing.JButton show;
    private javax.swing.JTextPane t1;
    private javax.swing.JTextPane t2;
    private javax.swing.JTextPane t3;
    private javax.swing.JTextPane t4;
    private javax.swing.JTextPane t5;
    private javax.swing.JTextPane t6;
    private javax.swing.JTable table;
    private javax.swing.JButton update;
    // End of variables declaration//GEN-END:variables
}
