/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Frames;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;
/**
 *
 * @author vaish
 */
public class Addcustomer extends javax.swing.JFrame {

    /**
     * Creates new form Addcustomer
     */
    public Addcustomer() {
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
        cust1 = new javax.swing.JTextField();
        cust2 = new javax.swing.JTextField();
        cust3 = new javax.swing.JTextField();
        cust4 = new javax.swing.JTextField();
        cust5 = new javax.swing.JTextField();
        save = new javax.swing.JButton();
        jLabel21 = new javax.swing.JLabel();
        t1 = new javax.swing.JLabel();
        t2 = new javax.swing.JLabel();
        t3 = new javax.swing.JLabel();
        t4 = new javax.swing.JLabel();
        t5 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        t6 = new javax.swing.JLabel();
        clear = new javax.swing.JButton();
        cust6 = new com.toedter.calendar.JDateChooser();
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
        jLabel3.setText("Add Customer");
        jLabel3.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 100, 220, 40));

        jLabel16.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jLabel16.setText("Date    :");
        jPanel2.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 30, 60, 20));

        jLabel17.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        jLabel17.setText("Customer name         :");
        jPanel2.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 240, -1, -1));

        jLabel18.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        jLabel18.setText("Mobile                         :");
        jPanel2.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 310, -1, -1));

        jLabel19.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        jLabel19.setText("Email                           :");
        jPanel2.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 390, -1, -1));

        jLabel20.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        jLabel20.setText("Address                       :");
        jPanel2.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 470, -1, -1));

        cust1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jPanel2.add(cust1, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 170, 260, 30));

        cust2.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jPanel2.add(cust2, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 240, 260, 30));

        cust3.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jPanel2.add(cust3, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 310, 260, 30));

        cust4.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        cust4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cust4ActionPerformed(evt);
            }
        });
        jPanel2.add(cust4, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 390, 260, 30));

        cust5.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jPanel2.add(cust5, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 470, 260, 30));

        save.setBackground(new java.awt.Color(255, 165, 0));
        save.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        save.setForeground(new java.awt.Color(255, 255, 255));
        save.setText("SAVE");
        save.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveActionPerformed(evt);
            }
        });
        jPanel2.add(save, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 540, 120, -1));

        jLabel21.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        jLabel21.setText("Customer  id              :");
        jPanel2.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 170, 190, 30));

        t1.setForeground(new java.awt.Color(255, 0, 0));
        jPanel2.add(t1, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 200, 260, 20));

        t2.setForeground(new java.awt.Color(255, 0, 0));
        jPanel2.add(t2, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 270, 260, 20));

        t3.setForeground(new java.awt.Color(255, 0, 0));
        jPanel2.add(t3, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 340, 260, 20));

        t4.setForeground(new java.awt.Color(255, 0, 0));
        jPanel2.add(t4, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 420, 260, 20));

        t5.setForeground(new java.awt.Color(255, 0, 0));
        jPanel2.add(t5, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 500, 260, 20));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 0, 0));
        jLabel5.setText("*");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 460, 40, 30));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 0, 0));
        jLabel6.setText("*");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 160, 40, 30));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 0, 0));
        jLabel7.setText("*");
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 230, 40, 30));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 0, 0));
        jLabel8.setText("*");
        jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 300, 40, 30));

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 0, 0));
        jLabel9.setText("*");
        jPanel2.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 380, 40, 30));

        t6.setForeground(new java.awt.Color(255, 51, 51));
        jPanel2.add(t6, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 60, 110, 20));

        clear.setBackground(new java.awt.Color(255, 165, 0));
        clear.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        clear.setForeground(new java.awt.Color(255, 255, 255));
        clear.setText("CLEAR");
        clear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearActionPerformed(evt);
            }
        });
        jPanel2.add(clear, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 540, 120, -1));
        jPanel2.add(cust6, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 30, -1, -1));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 0, 580, 770));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/addcustomer.png"))); // NOI18N
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 120, -1, 380));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/backIcon.png"))); // NOI18N
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 950, 630));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void cust4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cust4ActionPerformed
    }//GEN-LAST:event_cust4ActionPerformed
    private void saveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveActionPerformed
        // TODO add your handling code here:
        boolean isValid = true;
        



         String id= cust1.getText();
        
        //For id Customer id 
        if(id.equals(""))
        {
            t1.setText("Customer id do not empty.");
        }
        else
        {
            t1.setText("");
        }
        //For id Customer name 
        String name= cust2.getText();
        if(name.equals(""))
        {
            t2.setText("Customer name do not empty.");
        }
        else
       {
            t2.setText("");
        }
        
        //For id Customer Mobile
        String mobile= cust3.getText();
        if(mobile.equals(""))
        {
            t3.setText("Mobile do not empty.");
        }
        else
        {
            t3.setText("");
        }
        
        
        //For id Customer Email
        String quantity= cust4.getText();
        if(quantity.equals(""))
        {
            t4.setText("Email do not empty.");
        }
        else
        {
            t4.setText("");
        }
        
        
        //For id Customer Address
        String cname= cust5.getText();
        if(cname.equals(""))
        {
            t5.setText("Address do not empty.");
        }
        else
        {
            t5.setText("");
        }
        
       //For id Date
      
       try
        {
            Date temp = cust6.getDate();
            System.out.println("Date Format:"+temp);
           if(temp == null)
           {
               t6.setText("Date do not empty.");
            }
            else
            {
                t6.setText("");
                
           }
      }
       catch(Exception e)
       {
           System.out.println(e);
       }
        
        
        
    }//GEN-LAST:event_saveActionPerformed

    private void clearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearActionPerformed
        
               clear.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                     cust1.setText("");
                     cust2.setText("");
                     cust3.setText("");
                     cust4.setText("");
                     cust5.setText("");
                     cust6.setCalendar(null);
                }
                });      // TODO add your handling code here: 
               
    }//GEN-LAST:event_clearActionPerformed

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
            java.util.logging.Logger.getLogger(Addcustomer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Addcustomer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Addcustomer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Addcustomer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Addcustomer().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton clear;
    private javax.swing.JTextField cust1;
    private javax.swing.JTextField cust2;
    private javax.swing.JTextField cust3;
    private javax.swing.JTextField cust4;
    private javax.swing.JTextField cust5;
    private com.toedter.calendar.JDateChooser cust6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JButton save;
    private javax.swing.JLabel t1;
    private javax.swing.JLabel t2;
    private javax.swing.JLabel t3;
    private javax.swing.JLabel t4;
    private javax.swing.JLabel t5;
    private javax.swing.JLabel t6;
    // End of variables declaration//GEN-END:variables
}
