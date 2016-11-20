
import java.sql.ResultSet;
import java.sql.Statement;

import java.sql.*;
import javax.swing.JOptionPane;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Signup extends javax.swing.JFrame {
 Connection con;
    Statement st;
    ResultSet rs;
    String host;
        String uName;
        String uPass;
   
    public Signup() {
        initComponents();
        DoConnect();
    }
private void DoConnect() {
    try{ 
        host="jdbc:derby://localhost:1527/log";
        uName="root";
        uPass="root";
        con=DriverManager.getConnection(host,uName,uPass);
     
              }
    catch(SQLException e)
    {
        JOptionPane.showMessageDialog(this,e.getMessage());
    }
}
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        pass2 = new javax.swing.JPasswordField();
        pass = new javax.swing.JPasswordField();
        submit = new javax.swing.JButton();
        textuser = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(null);

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N

        jButton1.setText("LOGIN");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1);
        jButton1.setBounds(280, 300, 100, 30);

        pass2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pass2ActionPerformed(evt);
            }
        });
        jPanel1.add(pass2);
        pass2.setBounds(200, 220, 130, 30);
        jPanel1.add(pass);
        pass.setBounds(200, 160, 130, 30);

        submit.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        submit.setText("SUBMIT");
        submit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitActionPerformed(evt);
            }
        });
        jPanel1.add(submit);
        submit.setBounds(70, 300, 100, 25);
        jPanel1.add(textuser);
        textuser.setBounds(200, 110, 130, 30);

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setText("CONFIRM PASSWORD");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(36, 220, 160, 30);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setText("PASSWORD");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(40, 170, 100, 17);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("USERNAME");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(40, 120, 90, 17);

        jLabel2.setBackground(new java.awt.Color(0, 0, 0));
        jLabel2.setFont(new java.awt.Font("Copperplate Gothic Bold", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("USER SIGNUP");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(120, 40, 210, 30);

        jLabel1.setBackground(new java.awt.Color(51, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/polygonal-texture-background-vector.jpg"))); // NOI18N
        jLabel1.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        jPanel1.add(jLabel1);
        jLabel1.setBounds(0, 0, 450, 380);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 449, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 379, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void submitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitActionPerformed
try{
   
            String user1=textuser.getText();
            String pwd;
            pwd = new String(pass.getPassword());
            String pwd2=new String(pass2.getPassword());
   
            if (!(pwd.equals(pwd2)) || ((textuser.equals("") || (pwd.equals(""))))){
            JOptionPane.showMessageDialog(this,"ERROR:\nFields are empty or your passwords do not match!");
            }
            else
            {
                con=DriverManager.getConnection(host,uName,uPass);
                st=con.createStatement();
                st.executeUpdate("INSERT into ROOT.DETAILS (NAME,PASSWORD) values ('"+user1+"','"+pwd+"')");
                JOptionPane.showMessageDialog(this,"DETAILS INSERTED SUCCESSFULLY\nNOW YOU CAN LOG IN");
             }
    }
     catch(SQLException e)
     {
        JOptionPane.showMessageDialog(this,e.getMessage());
     }

    
    }//GEN-LAST:event_submitActionPerformed

    private void pass2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pass2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pass2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        this.setVisible(false);
        new Signin().setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed
           
    
    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Signup().setVisible(true);
            }
        });
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPasswordField pass;
    private javax.swing.JPasswordField pass2;
    private javax.swing.JButton submit;
    private javax.swing.JTextField textuser;
    // End of variables declaration//GEN-END:variables
}
