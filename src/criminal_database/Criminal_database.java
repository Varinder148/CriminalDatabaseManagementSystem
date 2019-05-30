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
import javax.swing.UnsupportedLookAndFeelException;

/**
 *
 * @author varinder
 */
interface x
{

    String username="root";
            String pass="";
            String path="jdbc:mysql://localhost/";
            String place="criminal_database";
}
public class Criminal_database {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws InterruptedException, ClassNotFoundException, UnsupportedLookAndFeelException, InstantiationException, IllegalAccessException {
        // TODO code application logic here
         for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        //welcome screen
        Welcome c1=new Welcome();
        c1.setVisible(true);
        Thread.sleep(1000);
        c1.dispose();
         Connection c = null;
        //check if logadmin table is empty
        try {
            c=DriverManager.getConnection(x.path+x.place,x.username,x.pass);
            
            String q="select * from logadmin";
            PreparedStatement y=c.prepareStatement(q);
            ResultSet s=y.executeQuery();
            if(s.next())
            {
                login in=new login();
        in.setVisible(true);
            }
            else
            {
                Newadmin_login_1 r=new Newadmin_login_1();
                
                r.setVisible(true);
            }
        } catch (SQLException ex) {
          
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
    
}
