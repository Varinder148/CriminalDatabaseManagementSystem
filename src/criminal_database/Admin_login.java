/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package criminal_database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author varinder
 */
public class Admin_login extends javax.swing.JFrame {

    /** Creates new form Admin_login */
    public Admin_login() {
        initComponents();
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField1 = new javax.swing.JTextField();
        jPasswordField1 = new javax.swing.JPasswordField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Administrator Log in");
        setMinimumSize(new java.awt.Dimension(1366, 768));
        setPreferredSize(new java.awt.Dimension(1366, 768));
        getContentPane().setLayout(null);
        getContentPane().add(jTextField1);
        jTextField1.setBounds(170, 190, 214, 34);
        getContentPane().add(jPasswordField1);
        jPasswordField1.setBounds(170, 300, 214, 34);

        jLabel2.setFont(new java.awt.Font("Comic Sans MS", 0, 11)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("USERNAME");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(50, 190, 80, 34);

        jLabel3.setFont(new java.awt.Font("Comic Sans MS", 0, 11)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Password");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(50, 300, 80, 34);

        jButton2.setFont(new java.awt.Font("Comic Sans MS", 0, 11)); // NOI18N
        jButton2.setForeground(new java.awt.Color(204, 0, 0));
        jButton2.setText("Change password");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(300, 420, 170, 60);

        jLabel1.setFont(new java.awt.Font("Comic Sans MS", 0, 11)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Or");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(250, 420, 14, 60);

        jButton1.setFont(new java.awt.Font("Comic Sans MS", 0, 11)); // NOI18N
        jButton1.setForeground(new java.awt.Color(204, 0, 0));
        jButton1.setText("Log Me In!");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(110, 420, 111, 60);

        jLabel4.setFont(new java.awt.Font("Comic Sans MS", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("ADMIN LOGIN");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(570, 80, 190, 70);

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/maxresdefault.jpg"))); // NOI18N
        jLabel5.setText("jLabel5");
        jLabel5.setMinimumSize(new java.awt.Dimension(1366, 768));
        jLabel5.setPreferredSize(new java.awt.Dimension(1366, 768));
        getContentPane().add(jLabel5);
        jLabel5.setBounds(0, 0, 1366, 768);

        pack();
    }// </editor-fold>//GEN-END:initComponents
//when submit button will be clicked the data will be saved to database
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        if(jTextField1.getText().equals("") || jPasswordField1.getText().equals(""))
        {
            JOptionPane.showMessageDialog(rootPane,"Username and Password field must not be empty.");
        }
        else
        {
        Connection c=null;
        try {
            c=DriverManager.getConnection(x.path+x.place,x.username,x.pass);
            
            String q="select * from logadmin where Username=? and Password=?";
            PreparedStatement y=c.prepareStatement(q);
            y.setString(1,jTextField1.getText().trim());
            y.setString(2,jPasswordField1.getText().trim());
            ResultSet s=y.executeQuery();
            
            if(s.next())
            {
              
                    Main_Menu m=new Main_Menu();
                    
                    m.setVisible(true);
                  this.dispose();
            }
            else
                    JOptionPane.showMessageDialog(rootPane, "Wrong Username/Password");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(rootPane,"Error Ocooured while connecting to database");
        }
        finally
        {
            try {
                c.close();
            } catch (SQLException ex) {
                Logger.getLogger(Admin_login.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        }
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
       
        Admin_passchange n=new Admin_passchange();
        n.setVisible(true);
         this.setVisible(false);
    }//GEN-LAST:event_jButton2ActionPerformed

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
                if ("Metal".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Admin_login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Admin_login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Admin_login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Admin_login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Admin_login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables

}