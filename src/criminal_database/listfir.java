/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package criminal_database;

import static criminal_database.Main_Menu.jDesktopPane1;
import static criminal_database.x.path;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author varinder
 */
public class listfir extends javax.swing.JInternalFrame {

    /**
     * Creates new form listcomplaints
     */
    public listfir() {
        initComponents();
   
         Connection c = null;
        try {
            c=DriverManager.getConnection(path+x.place, x.username, x.pass);
            String h="Select FID from fir" ;
            PreparedStatement p=c.prepareStatement(h);
            ResultSet s=p.executeQuery();
            while(s.next())
            {
                jComboBox1.addItem(s.getString("FID"));
            }
             String s1;
        
         s1="Select * from fir";
        PreparedStatement x=c.prepareStatement(s1);
        
        ResultSet p1=x.executeQuery();
        
        DefaultTableModel k=(DefaultTableModel) jTable1.getModel();
        k.setRowCount(0);
        while(p1.next()){
            String a=p1.getString("FID");
            String a1=p1.getString("cfname");
            
            String a3=p1.getString("fname");
            String a4=p1.getString("gender");
            String a5=p1.getString("age");
            
            String a7=p1.getString("address");
            String a8=p1.getString("contact");
            
            
            k.addRow(new Object[]{a,a1,a3,a4,a5,a7,a8});
        
                }
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(rootPane,"Error "+e.getMessage());
        }
          finally
        {
            try {
                c.close();
            } catch (SQLException ex) {
           //     Logger.getLogger(Admin_login.class.getName()).log(Level.SEVERE, null, ex);
            }
          }
      
       
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jComboBox1 = new javax.swing.JComboBox<>();

        setClosable(true);
        setIconifiable(true);
        setTitle("List of FIRs (Search or Delete)");

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Complainent first name", "Father's/Husband's name", "Gender", "Age", "Address", "Contact"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable1.getTableHeader().setReorderingAllowed(false);
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jLabel1.setText("Search By :");

        jTextField1.setText("ID");
        jTextField1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTextField1FocusGained(evt);
            }
        });

        jButton1.setText("Search");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jTextField2.setText("Complaintent name");
        jTextField2.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTextField2FocusGained(evt);
            }
        });
        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });

        jTextField3.setText("Father's name");
        jTextField3.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTextField3FocusGained(evt);
            }
        });
        jTextField3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField3ActionPerformed(evt);
            }
        });

        jButton2.setText("Delete");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "---Select ID---" }));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jTextField2, javax.swing.GroupLayout.DEFAULT_SIZE, 136, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26)
                        .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 416, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        Connection c = null;
        try
        {c=DriverManager.getConnection(x.path+x.place, x.username,x.pass);
        String s;
        
         s="Select * from fir where FID=? union select * from fir where cfname like ? union Select * from fir where fname like ? ";
        PreparedStatement x=c.prepareStatement(s);
        
        x.setString(1,jTextField1.getText()+"%");
        x.setString(2,"%"+jTextField2.getText()+"%");
        x.setString(3,jTextField3.getText()+"%");
        ResultSet p=x.executeQuery();
        
        DefaultTableModel k=(DefaultTableModel) jTable1.getModel();
        k.setRowCount(0);
        while(p.next()){
            String a=p.getString("FID");
            String a1=p.getString("cfname");

            String a3=p.getString("fname");
            String a4=p.getString("gender");
            String a5=p.getString("age");

            String a7=p.getString("address");
            String a8=p.getString("contact");
            
            k.addRow(new Object[]{a,a1,a3,a4,a5,a7,a8});
        
                }
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(rootPane, "Error "+e.getMessage());
        }
          finally
        {
            try {
                c.close();
            } catch (SQLException ex) {
           //     Logger.getLogger(Admin_login.class.getName()).log(Level.SEVERE, null, ex);
            }
          }
      
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField2ActionPerformed

    private void jTextField3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField3ActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        // TODO add your handling code here:
        int column=0;
        int row=jTable1.getSelectedRow();
        String val= jTable1.getValueAt(row, column).toString();
        FIRsrchbycomplaint f=new FIRsrchbycomplaint(val);
        jDesktopPane1.add(f);
        f.setVisible(true);
    }//GEN-LAST:event_jTable1MouseClicked

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        if(jComboBox1.getSelectedIndex()>0)
        {
        Connection c = null;
        try {
            c=DriverManager.getConnection(path+x.place, x.username, x.pass);
            String h="Delete from fir where FID =?" ;
            PreparedStatement p=c.prepareStatement(h);
            p.setString(1, jComboBox1.getSelectedItem().toString());
            if(JOptionPane.showConfirmDialog(rootPane, "Do you really want to delete? ")==JOptionPane.YES_OPTION){
            try{
            p.executeUpdate();
            JOptionPane.showMessageDialog(rootPane,"Deleted Successfully!! Please refresh to continue.");
            }
            catch(Exception e)
            {
                JOptionPane.showMessageDialog(rootPane, "Error : "+e.getMessage());
            }
            }
            
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(rootPane,"Error "+e.getMessage());
        }
          finally
        {
            try {
                c.close();
            } catch (SQLException ex) {
           //     Logger.getLogger(Admin_login.class.getName()).log(Level.SEVERE, null, ex);
            }
          }
      }
        else
            JOptionPane.showMessageDialog(rootPane,"Please select a valid FIR ID.");
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jTextField1FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField1FocusGained
       jTextField1.setText("");
       jTextField2.setText("Complaintant's Name");
       jTextField3.setText("Father's Name");
    }//GEN-LAST:event_jTextField1FocusGained

    private void jTextField2FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField2FocusGained
        // TODO add your handling code here:
        jTextField2.setText("");
        jTextField1.setText("FIR ID");
        jTextField3.setText("Father's Name");
    }//GEN-LAST:event_jTextField2FocusGained

    private void jTextField3FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField3FocusGained
        // TODO add your handling code here:
        jTextField3.setText("");
        jTextField2.setText("Complaintant's Name");
        jTextField1.setText("FIR ID");
       
       
    }//GEN-LAST:event_jTextField3FocusGained


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    // End of variables declaration//GEN-END:variables
}
