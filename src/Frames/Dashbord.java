/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Frames;

/**
 *
 * @author acer
 */
public class Dashbord extends javax.swing.JFrame {

    /**
     * Creates new form dashbord
     */
    public Dashbord() {
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
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        invoice = new javax.swing.JLabel();
        Accesaries1 = new javax.swing.JLabel();
        panel1 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        panal2 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        customer1 = new javax.swing.JLabel();
        panal3 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        supplier1 = new javax.swing.JLabel();
        panal4 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1200, 700));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(0, 102, 102));
        jPanel1.setMinimumSize(new java.awt.Dimension(1000, 625));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setBackground(new java.awt.Color(255, 153, 0));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/Dashbord image.png"))); // NOI18N
        jPanel3.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1200, 120));

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 120, 950, 580));

        jLabel3.setFont(new java.awt.Font("Yu Gothic Medium", 1, 17)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Add Accesaries");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, 30));

        invoice.setFont(new java.awt.Font("Segoe UI Emoji", 1, 22)); // NOI18N
        invoice.setForeground(new java.awt.Color(255, 255, 255));
        invoice.setText("Invoice");
        invoice.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                invoiceMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                invoiceMouseExited(evt);
            }
        });
        jPanel1.add(invoice, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 530, 110, 30));

        Accesaries1.setFont(new java.awt.Font("Segoe UI Emoji", 1, 22)); // NOI18N
        Accesaries1.setForeground(new java.awt.Color(255, 255, 255));
        Accesaries1.setText("Accesaries");
        Accesaries1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Accesaries1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Accesaries1MouseExited(evt);
            }
        });
        jPanel1.add(Accesaries1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 150, 130, 30));

        panel1.setBackground(new java.awt.Color(0, 102, 102));
        panel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                panel1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                panel1MouseExited(evt);
            }
        });
        panel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setFont(new java.awt.Font("Yu Gothic Medium", 1, 17)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText(" Accesaries Detail");
        panel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 160, 40));

        jLabel6.setFont(new java.awt.Font("Yu Gothic Medium", 1, 17)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText(" Add Accesaries");
        panel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 160, 40));

        jPanel1.add(panel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 170, 190, 0));

        panal2.setBackground(new java.awt.Color(0, 102, 102));
        panal2.setForeground(new java.awt.Color(0, 102, 102));
        panal2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                panal2MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                panal2MouseExited(evt);
            }
        });
        panal2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setFont(new java.awt.Font("Yu Gothic Medium", 1, 17)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText(" Add Accesaries");
        panal2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 420, 160, 40));

        jLabel7.setFont(new java.awt.Font("Yu Gothic Medium", 1, 17)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("customer Detail");
        panal2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 160, 40));

        jLabel2.setFont(new java.awt.Font("Yu Gothic Medium", 1, 17)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Add Custumer");
        panal2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        jPanel1.add(panal2, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 300, 190, 0));

        customer1.setFont(new java.awt.Font("Segoe UI Emoji", 1, 22)); // NOI18N
        customer1.setForeground(new java.awt.Color(255, 255, 255));
        customer1.setText("Customer");
        customer1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                customer1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                customer1MouseExited(evt);
            }
        });
        jPanel1.add(customer1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 270, 130, 30));

        panal3.setBackground(new java.awt.Color(0, 102, 102));
        panal3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                panal3MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                panal3MouseExited(evt);
            }
        });
        panal3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel8.setFont(new java.awt.Font("Yu Gothic Medium", 1, 17)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Add Custumer");
        panal3.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(26, 10, 120, -1));

        jLabel9.setFont(new java.awt.Font("Yu Gothic Medium", 1, 17)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText(" customer Detail");
        panal3.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, 170, 40));

        jPanel1.add(panal3, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 430, 190, 0));

        supplier1.setFont(new java.awt.Font("Segoe UI Emoji", 1, 22)); // NOI18N
        supplier1.setForeground(new java.awt.Color(255, 255, 255));
        supplier1.setText("Supplier");
        supplier1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                supplier1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                supplier1MouseExited(evt);
            }
        });
        jPanel1.add(supplier1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 400, 110, 30));

        panal4.setBackground(new java.awt.Color(0, 102, 102));
        panal4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                panal4MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                panal4MouseExited(evt);
            }
        });
        panal4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel10.setFont(new java.awt.Font("Yu Gothic Medium", 1, 17)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Invoice Detail");
        panal4.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, 120, -1));

        jLabel11.setFont(new java.awt.Font("Yu Gothic Medium", 1, 17)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Add Invoice");
        panal4.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 120, -1));

        jPanel1.add(panal4, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 550, 180, 0));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 700));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void invoiceMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_invoiceMouseEntered
        // TODO add your handling code here:
           panal4.setSize(180,100);
    }//GEN-LAST:event_invoiceMouseEntered

    private void invoiceMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_invoiceMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_invoiceMouseExited

    private void Accesaries1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Accesaries1MouseEntered
        // TODO add your handling code here:
          panel1.setSize(170,80);
    }//GEN-LAST:event_Accesaries1MouseEntered

    private void Accesaries1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Accesaries1MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_Accesaries1MouseExited

    private void panel1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panel1MouseEntered
        // TODO add your handling code here:
         panel1.setSize(170,80);
    }//GEN-LAST:event_panel1MouseEntered

    private void panel1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panel1MouseExited
        // TODO add your handling code here:
         panel1.setSize(0,0);
    }//GEN-LAST:event_panel1MouseExited

    private void panal2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panal2MouseEntered
        // TODO add your handling code here:
         panal2.setSize(190,90);
    }//GEN-LAST:event_panal2MouseEntered

    private void panal2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panal2MouseExited
         panal2.setSize(0,0);        //TODO add your handling code here:
    }//GEN-LAST:event_panal2MouseExited

    private void customer1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_customer1MouseEntered
        // TODO add your handling code here:
          panal2.setSize(190,100);
    }//GEN-LAST:event_customer1MouseEntered

    private void customer1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_customer1MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_customer1MouseExited

    private void panal3MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panal3MouseEntered
        // TODO add your handling code here:
          panal3.setSize(190,100);
    }//GEN-LAST:event_panal3MouseEntered

    private void panal3MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panal3MouseExited
        // TODO add your handling code here:
          panal3.setSize(0,0);
    }//GEN-LAST:event_panal3MouseExited

    private void supplier1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_supplier1MouseEntered
        // TODO add your handling code here:
                   panal3.setSize(190,100);

    }//GEN-LAST:event_supplier1MouseEntered

    private void supplier1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_supplier1MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_supplier1MouseExited

    private void panal4MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panal4MouseEntered
        // TODO add your handling code here:
                   panal4.setSize(180,100);

    }//GEN-LAST:event_panal4MouseEntered

    private void panal4MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panal4MouseExited
        // TODO add your handling code here:
                   panal4.setSize(0,0);

    }//GEN-LAST:event_panal4MouseExited

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
            java.util.logging.Logger.getLogger(Dashbord.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Dashbord.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Dashbord.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Dashbord.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Dashbord().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Accesaries1;
    private javax.swing.JLabel customer1;
    private javax.swing.JLabel invoice;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel panal2;
    private javax.swing.JPanel panal3;
    private javax.swing.JPanel panal4;
    private javax.swing.JPanel panel1;
    private javax.swing.JLabel supplier1;
    // End of variables declaration//GEN-END:variables
}
