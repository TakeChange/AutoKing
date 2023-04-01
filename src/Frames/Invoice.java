
package Frames;

import com.sun.jdi.connect.spi.Connection;
import java.awt.event.KeyEvent;
import java.sql.*;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;


public class Invoice extends javax.swing.JFrame {

    public Invoice() {
        initComponents();
    }
    boolean isValid = true;
    java.sql.Connection conn = null;
    ResultSet rs;
  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        t2 = new javax.swing.JTextField();
        t1 = new javax.swing.JTextField();
        t5 = new javax.swing.JTextField();
        t4 = new javax.swing.JTextField();
        t3 = new javax.swing.JSpinner();
        add = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        text12 = new javax.swing.JLabel();
        text14 = new javax.swing.JLabel();
        text15 = new javax.swing.JLabel();
        text11 = new javax.swing.JLabel();
        text13 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        tt1 = new javax.swing.JTextField();
        pay = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        name = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(102, 102, 102));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(255, 153, 0));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Sales", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 18), new java.awt.Color(255, 255, 255))); // NOI18N
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("sr. no");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, -1, 40));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Description");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 50, -1, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Qty");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 50, -1, -1));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Price");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 50, -1, -1));

        t2.setFont(new java.awt.Font("Segoe UI Emoji", 1, 14)); // NOI18N
        jPanel2.add(t2, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 80, 260, 36));

        t1.setFont(new java.awt.Font("Segoe UI Emoji", 1, 14)); // NOI18N
        t1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                t1KeyPressed(evt);
            }
        });
        jPanel2.add(t1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, 120, 36));

        t5.setFont(new java.awt.Font("Segoe UI Emoji", 1, 14)); // NOI18N
        jPanel2.add(t5, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 80, 160, 36));

        t4.setFont(new java.awt.Font("Segoe UI Emoji", 1, 14)); // NOI18N
        jPanel2.add(t4, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 80, 160, 36));

        t3.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                t3StateChanged(evt);
            }
        });
        jPanel2.add(t3, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 80, 76, 35));

        add.setBackground(new java.awt.Color(0, 102, 51));
        add.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        add.setForeground(new java.awt.Color(255, 255, 255));
        add.setText("Add");
        add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addActionPerformed(evt);
            }
        });
        jPanel2.add(add, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 150, 120, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Amount");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 50, -1, -1));

        text12.setForeground(new java.awt.Color(255, 0, 0));
        jPanel2.add(text12, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 120, 80, 20));

        text14.setForeground(new java.awt.Color(255, 0, 0));
        jPanel2.add(text14, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 120, 110, 20));

        text15.setForeground(new java.awt.Color(255, 0, 0));
        jPanel2.add(text15, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 120, 110, 20));

        text11.setForeground(new java.awt.Color(255, 0, 0));
        jPanel2.add(text11, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 120, 110, 20));

        text13.setForeground(new java.awt.Color(255, 0, 0));
        jPanel2.add(text13, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 120, 70, 20));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, 840, 200));

        jPanel3.setBackground(new java.awt.Color(102, 102, 102));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel6.setBackground(new java.awt.Color(255, 255, 255));
        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel6.setText("Pay");
        jPanel3.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 90, 60, -1));

        tt1.setFont(new java.awt.Font("Segoe UI Emoji", 1, 14)); // NOI18N
        jPanel3.add(tt1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 50, 190, 40));

        pay.setFont(new java.awt.Font("Segoe UI Emoji", 1, 14)); // NOI18N
        pay.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                payActionPerformed(evt);
            }
        });
        jPanel3.add(pay, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 120, 190, 40));

        jLabel7.setBackground(new java.awt.Color(255, 255, 255));
        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel7.setText("Balance");
        jPanel3.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 160, 80, -1));

        jLabel8.setBackground(new java.awt.Color(255, 255, 255));
        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel8.setText("Total");
        jPanel3.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 20, 60, -1));

        jButton2.setBackground(new java.awt.Color(0, 102, 51));
        jButton2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("Print Bill");
        jPanel3.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 240, -1, -1));

        name.setFont(new java.awt.Font("Segoe UI Emoji", 1, 14)); // NOI18N
        name.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nameActionPerformed(evt);
            }
        });
        jPanel3.add(name, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 190, 190, 40));

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 0, 340, 280));

        jTextArea1.setColumns(20);
        jTextArea1.setFont(new java.awt.Font("Segoe UI Emoji", 1, 14)); // NOI18N
        jTextArea1.setRows(5);
        jScrollPane2.setViewportView(jTextArea1);

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 280, 320, 310));

        jLabel9.setBackground(new java.awt.Color(255, 153, 0));
        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("<- Back");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Invoice");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 20, 150, 50));

        table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "sr", "description", "quantity", "price", "amount"
            }
        ));
        jScrollPane3.setViewportView(table);

        jPanel1.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 330, 840, 230));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1200, 600));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void nameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nameActionPerformed

    private void payActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_payActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_payActionPerformed

    private void t1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_t1KeyPressed
        if(evt.getKeyCode()==KeyEvent.VK_ENTER)
        {
            String sr=t1.getText();
            
        if(isValid)
        {
           
            try 
            {
                
                //System.out.println("Connected to XAMPP MySQL database");
                
                ConnectionClass obj = new ConnectionClass();
                conn = obj.getConnection();
                
                System.out.println("Connected to XAMPP MySQL database");
                
                String q ="select * from invoice where sr=?";
                PreparedStatement st = conn.prepareStatement(q);
               
                st.setString(1,sr);
                rs = st.executeQuery();
                
                if(rs.next() == false)
                {
                    text11.setText("Empty");
                }
                else
                {
                    String name1=rs.getString("description");
                    String price1=rs.getString("price");
                    
                    t2.setText(name1.trim());
                    t4.setText(price1.trim());
                    
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
        }
               
             
    }//GEN-LAST:event_t1KeyPressed

    private void addActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addActionPerformed
    DefaultTableModel model=new DefaultTableModel();
    model=(DefaultTableModel)table.getModel();
    model.addRow(new Object[]{
        t1.getText(),
        t2.getText(),
        t3.getValue().toString(),
        t4.getText(),
        t5.getText(),
          
    });
    
    int sum=0;
    for(int i=0;i<table.getRowCount();i++)
    {
        sum=sum+Integer.parseInt(table.getValueAt(i,4).toString());
        tt1.setText(Integer.toString(sum));
    }
    // tt1.setText(Integer.toString(sum));
               
    }//GEN-LAST:event_addActionPerformed

    private void t3StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_t3StateChanged
       int qty11=Integer.parseInt(t3.getValue().toString());
       int price11=Integer.parseInt(t4.getText());
       
       int tot=qty11*price11;
       t5.setText(String.valueOf(tot));
    }//GEN-LAST:event_t3StateChanged

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(Invoice.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Invoice.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Invoice.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Invoice.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Invoice().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton add;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
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
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextField name;
    private javax.swing.JTextField pay;
    private javax.swing.JTextField t1;
    private javax.swing.JTextField t2;
    private javax.swing.JSpinner t3;
    private javax.swing.JTextField t4;
    private javax.swing.JTextField t5;
    private javax.swing.JTable table;
    private javax.swing.JLabel text11;
    private javax.swing.JLabel text12;
    private javax.swing.JLabel text13;
    private javax.swing.JLabel text14;
    private javax.swing.JLabel text15;
    private javax.swing.JTextField tt1;
    // End of variables declaration//GEN-END:variables
}
