/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Frames;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemListener;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.util.Date;
import javax.swing.JOptionPane;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.PreparedStatement;
import java.util.logging.Level;
import java.util.logging.Logger;

public class signup extends javax.swing.JFrame {
public signup() {
        initComponents();
        this.showeye.setVisible(false);
        this.showeye1.setVisible(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        username = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        password = new javax.swing.JPasswordField();
        confirmpass = new javax.swing.JPasswordField();
        sign = new javax.swing.JButton();
        clear = new javax.swing.JButton();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        login = new javax.swing.JLabel();
        check = new javax.swing.JCheckBox();
        jLabel5 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        mobile = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        text1 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        text4 = new javax.swing.JLabel();
        text3 = new javax.swing.JLabel();
        text6 = new javax.swing.JLabel();
        text5 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        dateError = new javax.swing.JLabel();
        adhar = new javax.swing.JTextField();
        text2 = new javax.swing.JLabel();
        date = new com.toedter.calendar.JDateChooser();
        text7 = new javax.swing.JLabel();
        showeye = new javax.swing.JLabel();
        showeye1 = new javax.swing.JLabel();
        hideeye = new javax.swing.JLabel();
        hideeye1 = new javax.swing.JLabel();
        back = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(950, 768));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 165, 0));
        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setBackground(new java.awt.Color(255, 153, 153));
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/Autoking.png"))); // NOI18N
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 0, 140, 90));

        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3.setFont(new java.awt.Font("Bodoni MT", 1, 30)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 153, 0));
        jLabel3.setText("Signup  Form");
        jLabel3.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 90, 180, 40));

        jLabel4.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        jLabel4.setText("Please fill this form to create an account.");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 130, 230, 30));

        jLabel6.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        jLabel6.setText("Date of birth     :");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 240, -1, -1));

        jLabel7.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        jLabel7.setText("Adhar no.          :");
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 310, 150, -1));

        jLabel8.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        jLabel8.setText("Mobile no.         :");
        jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 380, -1, -1));

        jLabel10.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        jLabel10.setText("Password           :");
        jPanel2.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 450, -1, -1));

        username.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        username.setCaretColor(new java.awt.Color(255, 102, 0));
        username.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                usernameMouseClicked(evt);
            }
        });
        username.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                usernameActionPerformed(evt);
            }
        });
        jPanel2.add(username, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 160, 280, 40));

        jLabel11.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        jLabel11.setText("Confirm password :");
        jPanel2.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 520, -1, 30));

        password.setFont(new java.awt.Font("Segoe UI Emoji", 1, 14)); // NOI18N
        password.setCaretColor(new java.awt.Color(255, 102, 0));
        password.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                passwordMouseClicked(evt);
            }
        });
        password.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passwordActionPerformed(evt);
            }
        });
        jPanel2.add(password, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 440, 280, 40));

        confirmpass.setFont(new java.awt.Font("Segoe UI Emoji", 1, 14)); // NOI18N
        confirmpass.setCaretColor(new java.awt.Color(255, 102, 0));
        confirmpass.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                confirmpassMouseClicked(evt);
            }
        });
        confirmpass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                confirmpassActionPerformed(evt);
            }
        });
        jPanel2.add(confirmpass, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 510, 280, 40));

        sign.setBackground(new java.awt.Color(255, 165, 0));
        sign.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        sign.setForeground(new java.awt.Color(255, 255, 255));
        sign.setText("SIGNUP");
        sign.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        sign.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                signActionPerformed(evt);
            }
        });
        jPanel2.add(sign, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 630, 120, -1));

        clear.setBackground(new java.awt.Color(255, 165, 0));
        clear.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        clear.setForeground(new java.awt.Color(255, 255, 255));
        clear.setText("CLEAR");
        clear.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        clear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearActionPerformed(evt);
            }
        });
        jPanel2.add(clear, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 630, 120, -1));

        jLabel16.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        jLabel16.setText("Username          :");
        jPanel2.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 170, -1, -1));

        jLabel17.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel17.setText("Already have an account ?");
        jPanel2.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 700, -1, -1));

        login.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        login.setForeground(new java.awt.Color(51, 51, 255));
        login.setText("Login here");
        login.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        login.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                loginMouseClicked(evt);
            }
        });
        jPanel2.add(login, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 700, -1, -1));

        check.setBackground(new java.awt.Color(255, 255, 255));
        check.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        check.setText("I accept the terms of use & privacy policy");
        check.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        check.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkActionPerformed(evt);
            }
        });
        jPanel2.add(check, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 570, 320, -1));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 0, 0));
        jLabel5.setText("*");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 150, 20, -1));

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 0, 0));
        jLabel9.setText("*");
        jPanel2.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 220, -1, -1));

        jLabel12.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 0, 0));
        jLabel12.setText("*");
        jPanel2.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 490, 30, 30));

        jLabel13.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 0, 0));
        jLabel13.setText("*");
        jPanel2.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 280, 20, 40));

        mobile.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        mobile.setCaretColor(new java.awt.Color(255, 51, 0));
        mobile.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                mobileMouseClicked(evt);
            }
        });
        jPanel2.add(mobile, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 370, 280, 40));

        jLabel14.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 0, 0));
        jLabel14.setText("*");
        jPanel2.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 360, -1, -1));

        jLabel15.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 0, 0));
        jLabel15.setText("*");
        jPanel2.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 420, -1, -1));

        jLabel19.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel19.setText("__________________________________________________________");
        jPanel2.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 660, 570, 30));

        text1.setForeground(new java.awt.Color(255, 0, 0));
        jPanel2.add(text1, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 200, 280, 20));
        jPanel2.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 280, 280, -1));

        text4.setForeground(new java.awt.Color(255, 0, 0));
        text4.setText("     ");
        jPanel2.add(text4, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 410, 280, 20));

        text3.setForeground(new java.awt.Color(255, 0, 0));
        jPanel2.add(text3, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 340, 280, 20));

        text6.setForeground(new java.awt.Color(255, 0, 0));
        jPanel2.add(text6, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 550, 280, 20));

        text5.setForeground(new java.awt.Color(255, 0, 0));
        text5.setText("       ");
        jPanel2.add(text5, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 480, 270, 20));
        jPanel2.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 280, 280, -1));

        dateError.setForeground(new java.awt.Color(255, 0, 0));
        jPanel2.add(dateError, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 270, 280, 20));

        adhar.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        adhar.setCaretColor(new java.awt.Color(255, 102, 0));
        adhar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                adharMouseClicked(evt);
            }
        });
        adhar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                adharActionPerformed(evt);
            }
        });
        jPanel2.add(adhar, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 300, 280, 40));
        jPanel2.add(text2, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 270, 280, 20));
        jPanel2.add(date, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 230, 280, 40));

        text7.setForeground(new java.awt.Color(255, 0, 0));
        jPanel2.add(text7, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 590, 250, 20));

        showeye.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/eye1.png"))); // NOI18N
        showeye.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                showeyeMousePressed(evt);
            }
        });
        jPanel2.add(showeye, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 480, 20, -1));

        showeye1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/eye1.png"))); // NOI18N
        showeye1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                showeye1MousePressed(evt);
            }
        });
        jPanel2.add(showeye1, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 520, 20, -1));

        hideeye.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/hide1.png"))); // NOI18N
        hideeye.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                hideeyeMousePressed(evt);
            }
        });
        jPanel2.add(hideeye, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 450, 20, 20));

        hideeye1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/hide1.png"))); // NOI18N
        hideeye1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                hideeye1MousePressed(evt);
            }
        });
        jPanel2.add(hideeye1, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 520, 20, 20));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 0, 560, 760));

        back.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/backIcon.png"))); // NOI18N
        back.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        back.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                backMouseClicked(evt);
            }
        });
        jPanel1.add(back, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 40, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/reg.png"))); // NOI18N
        jLabel1.setText("jLabel1");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-40, 100, 410, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 950, 760));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void usernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_usernameActionPerformed
  
    }//GEN-LAST:event_usernameActionPerformed

    private void confirmpassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_confirmpassActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_confirmpassActionPerformed

    private void signActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_signActionPerformed
       
        ///This is for username
        //muskan@123
        String strPattern = "^[a-zA-Z][a-zA-Z0-9_]{8,20}$";
        boolean isValid = true;
        Connection conn = null;
        String username1= username.getText();
        String Cdate;
        Date temp = date.getDate();
         String y = String.valueOf(temp.getYear()+1900);
         String d = String.valueOf(temp.getDate());
         String m = String.valueOf(temp.getMonth()+1);
         Cdate = y+"-"+m+"-"+d;
  
        if(username1.equals(""))
        {
            text1.setText("Username do not empty.");
            isValid = false;
        }
        else
        if(!username1.matches(strPattern))
        {
            text1.setText("Username is invalid.");
            isValid = false;
         }
        else
        {
            text1.setText("");
        }
        
        
        /// This is for calender
    
        try
        {
            temp = date.getDate();
            System.out.println("Date Format:"+temp);
            if(temp == null)
            {
                dateError.setText("Date do not empty.");
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
        
        
        /// This is for Adhar validation
        
        String strpattern1="^[2-9]{1}[0-9]{3}\\s[0-9]{4}\\s[0-9]{4}$";
        String adhar1= adhar.getText();
        
        if(adhar1.equals(""))
        {
            text3.setText(" Aadhar no do not empty.");
            isValid = false;
        }
        else
        if(!adhar1.matches(strpattern1))
        {
            text3.setText(" Aadhar number is invalid.");
            isValid = false;
        }
        else
        {
            text3.setText("");
        }
        
        
        ///This is for Mobile Number validation
        

        
        //String strpattern2=("^(\\+\\d{1,3}()?)?(\\d{3}[]?){2}\\d{3}$");
       // String mobile1= mobile.getText();
        String mobile1= mobile.getText();
         String strpattern2="(0/91)?[7-9][0-9]{9}";
        //String strpattern2=("^(\\+\\d{1,3}()?)?(\\d{3}[]?){2}\\d{3}$");
        if(mobile1.equals(""))
        {
            text4.setText(" Mobile no do not empty.");
            isValid = false;
        }
        else
        if(!mobile1.matches(strpattern2))
        {
            text4.setText(" Mobile number is invalid.");
            isValid = false;
         }
        else
        {
            text4.setText("");
        }
    
        ///This is for Password Field
        /*
            ^ represents starting character of the string.
            (?=.*[0-9]) represents a digit must occur at least once.
            (?=.*[a-z]) represents a lower case alphabet must occur at least once.
            (?=.*[A-Z]) represents an upper case alphabet that must occur at least once.
            (?=.*[@#$%^&-+=()] represents a special character that must occur at least once.
            (?=\\S+$) white spaces don’t allowed in the entire string.
            .{8, 20} represents at least 8 characters and at most 20 characters.
            $ represents the end of the string.
        */
        
        String strpattern3="^(?=.*[0-9])"+ "(?=.*[a-z])(?=.*[A-Z])" + "(?=.*[@#$%^&+=])"+ "(?=\\S+$).{8,20}$";
        String upassword = password.getText();
        if(upassword.equals(""))
        {
            text5.setText(" Password do not empty.");
            isValid = false;
        }
        else
        if(upassword.matches(strpattern3))
        {
            text5.setText("");
        }
        else
        {
            text5.setText(" Enter valid password");
             isValid = false;
        }
        
        ///This is for confirm password
        String confpassword = confirmpass.getText();
        if(confpassword.equals(""))
        {
           text6.setText(" Enter valid password"); 
           isValid = false;
        }
        else
        if(upassword.equals(confpassword))
        {
            text6.setText("");
        }
        else
        {
            text6.setText(" Password do not Match Enter above Password");
            isValid = false;
        }
       
       
        if(check.isSelected())
        {
             text7.setText("");
        }
        else
        {
             text7.setText(" Accept the term and condition");
            isValid = false;
        }
       
  
               
         if(isValid)
        {
           
            try 
            {
                
                System.out.println("Uesername :"+username1);
                System.out.println("User Format:"+Cdate);
                System.out.println("adharno:"+adhar1);
                System.out.println("mobile:"+mobile1);
                System.out.println("pass:"+upassword);
                System.out.println("cpass:"+confpassword);
                System.out.println("Connected to XAMPP MySQL database");
                
                ConnectionClass obj = new ConnectionClass();
                conn = obj.getConnection();
                
                String q = "insert into signup(username,dateofbirth,adharno,mobileno,password,confirmpass) values(?,?,?,?,?,?)";
                PreparedStatement st = conn.prepareStatement(q);
                st.setString(1,username1);
                st.setString(2,Cdate);
                st.setString(3,adhar1);
                st.setString(4,mobile1);
                st.setString(5,upassword);
                st.setString(6,confpassword);
                
                int op = st.executeUpdate();
                
               
                
                if(op>0)
                {
                    JOptionPane.showMessageDialog(this," Registration Successfully.");
                    Login obj2 = new Login();
                    this.hide();
                    obj2.setVisible(true);
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
          
            
//            Login obj = new Login();
//            this.hide();
//            obj.setVisible(true);
            // Database connectivity queries
        }
        
    }//GEN-LAST:event_signActionPerformed

    private void checkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkActionPerformed
    
    }//GEN-LAST:event_checkActionPerformed

    private void clearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearActionPerformed
        /// To clear All data in in textfield
            clear.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    username.setText("");
                    adhar.setText("");
                    mobile.setText("");
                    password.setText("");
                    confirmpass.setText("");
                    date.setCalendar(null);                }
            });
    }//GEN-LAST:event_clearActionPerformed

    private void adharActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_adharActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_adharActionPerformed

    private void passwordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passwordActionPerformed
        // TODO add your handling code here:
      
    }//GEN-LAST:event_passwordActionPerformed

    private void usernameMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_usernameMouseClicked
      
        
    }//GEN-LAST:event_usernameMouseClicked

    private void dateMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dateMouseClicked
       
            
            
           
    }//GEN-LAST:event_dateMouseClicked

    private void adharMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_adharMouseClicked
       
    }//GEN-LAST:event_adharMouseClicked

    private void mobileMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mobileMouseClicked
    
    }//GEN-LAST:event_mobileMouseClicked

    private void passwordMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_passwordMouseClicked
      
    }//GEN-LAST:event_passwordMouseClicked

    private void confirmpassMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_confirmpassMouseClicked
       
    }//GEN-LAST:event_confirmpassMouseClicked

    private void loginMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_loginMouseClicked
        Login obj = new Login();
        this.hide();
        obj.setVisible(true);
    }//GEN-LAST:event_loginMouseClicked

    private void backMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backMouseClicked
        Login l1= new Login();
        this.hide();
        l1.setVisible(true);
        
    }//GEN-LAST:event_backMouseClicked

    private void showeyeMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_showeyeMousePressed
        // TODO add your handling code here:
        password.setEchoChar('*');
        showeye.setVisible(false);
        hideeye.setVisible(true);
    }//GEN-LAST:event_showeyeMousePressed

    private void showeye1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_showeye1MousePressed
        // TODO add your handling code here:
        confirmpass.setEchoChar('*');
        showeye1.setVisible(false);
        hideeye1.setVisible(true);
    }//GEN-LAST:event_showeye1MousePressed

    private void hideeyeMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_hideeyeMousePressed
        // TODO add your handling code here:
        password.setEchoChar((char)0);
        showeye.setVisible(true);
        hideeye.setVisible(false);
    }//GEN-LAST:event_hideeyeMousePressed

    private void hideeye1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_hideeye1MousePressed
        // TODO add your handling code here:
        confirmpass.setEchoChar((char)0);
        showeye1.setVisible(true);
        hideeye1.setVisible(false);
    }//GEN-LAST:event_hideeye1MousePressed

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
            java.util.logging.Logger.getLogger(signup.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(signup.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(signup.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(signup.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new signup().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField adhar;
    private javax.swing.JLabel back;
    private javax.swing.JCheckBox check;
    private javax.swing.JButton clear;
    private javax.swing.JPasswordField confirmpass;
    private com.toedter.calendar.JDateChooser date;
    private javax.swing.JLabel dateError;
    private javax.swing.JLabel hideeye;
    private javax.swing.JLabel hideeye1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel login;
    private javax.swing.JTextField mobile;
    private javax.swing.JPasswordField password;
    private javax.swing.JLabel showeye;
    private javax.swing.JLabel showeye1;
    private javax.swing.JButton sign;
    private javax.swing.JLabel text1;
    private javax.swing.JLabel text2;
    private javax.swing.JLabel text3;
    private javax.swing.JLabel text4;
    private javax.swing.JLabel text5;
    private javax.swing.JLabel text6;
    private javax.swing.JLabel text7;
    private javax.swing.JTextField username;
    // End of variables declaration//GEN-END:variables
}
