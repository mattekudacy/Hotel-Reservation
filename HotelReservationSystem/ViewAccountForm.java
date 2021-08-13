package HotelReservationSystem;

import java.awt.Color;

import java.sql.*;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;

public class ViewAccountForm extends Login_Register_Connection {
DefaultTableModel TABLE_accounts=new DefaultTableModel();
int x=0;
    public ViewAccountForm() {
        initComponents();
        DoConnect();
        Select();
    }
     public void Select(){
        String[] columnNames={"USERID","PASSWORD","USERTYPE"};
       TABLE_accounts.setColumnIdentifiers(columnNames);
        try{
            while(rs.next()){
                i=rs.getString("USERID");
                s=rs.getString("PASSWORD");
           
                u=rs.getString("USERTYPE");
               tb_Account.setVisible(true);
                TABLE_accounts.addRow(new Object[]{i,s,u});
                x++;
            }
        }catch(SQLException err){
            JOptionPane.showMessageDialog(ViewAccountForm.this,err.getMessage());
        }
        
    }
   
        
    
        

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        closelbl = new javax.swing.JLabel();
        useraccountsettings = new javax.swing.JLayeredPane();
        jScrollPane1 = new javax.swing.JScrollPane();
        tb_Account = new javax.swing.JTable();
        jLabel11 = new javax.swing.JLabel();
        tignan = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        viewaccountbg = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        closelbl.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        closelbl.setForeground(new java.awt.Color(255, 255, 255));
        closelbl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        closelbl.setText("< Back");
        closelbl.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                closelblMouseMoved(evt);
            }
        });
        closelbl.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                closelblMouseClicked(evt);
            }
        });
        getContentPane().add(closelbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 0, -1, 20));

        useraccountsettings.setBackground(new java.awt.Color(0, 0, 0));
        useraccountsettings.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 204, 0), 2));
        useraccountsettings.setOpaque(true);

        tb_Account.setBackground(new java.awt.Color(255, 204, 0));
        tb_Account.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        tb_Account.setModel(TABLE_accounts);
        jScrollPane1.setViewportView(tb_Account);

        useraccountsettings.add(jScrollPane1);
        jScrollPane1.setBounds(10, 40, 510, 190);

        jLabel11.setBackground(new java.awt.Color(255, 204, 0));
        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setText("List of Accounts");
        jLabel11.setOpaque(true);
        useraccountsettings.add(jLabel11);
        jLabel11.setBounds(10, 10, 510, 20);

        getContentPane().add(useraccountsettings, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 170, 530, 240));

        tignan.setBackground(new java.awt.Color(255, 204, 0));
        tignan.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        tignan.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tignanKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tignanKeyReleased(evt);
            }
        });
        getContentPane().add(tignan, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 130, 210, 30));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 204, 0));
        jLabel1.setText("Search");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 130, 50, 30));

        viewaccountbg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/HotelReservationSystem/img/listofaccountsbg.png"))); // NOI18N
        viewaccountbg.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                viewaccountbgMouseMoved(evt);
            }
        });
        getContentPane().add(viewaccountbg, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 700, 450));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void closelblMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_closelblMouseMoved
        closelbl.setForeground(new Color(153,153,153));
    }//GEN-LAST:event_closelblMouseMoved

    private void closelblMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_closelblMouseClicked
       try{
            con.close();
        AdminSettings adminsettingsfrm = new AdminSettings();
        adminsettingsfrm.setVisible(true);
        ViewAccountForm.this.dispose();
        }catch(SQLException err ){
            System.out.println(err.getMessage());
        }  
  
    }//GEN-LAST:event_closelblMouseClicked

    private void viewaccountbgMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_viewaccountbgMouseMoved
         closelbl.setForeground(new Color(255,255,255));
    }//GEN-LAST:event_viewaccountbgMouseMoved

    private void tignanKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tignanKeyPressed
        
    }//GEN-LAST:event_tignanKeyPressed

    private void tignanKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tignanKeyReleased
       DefaultTableModel magsaliksik=(DefaultTableModel)tb_Account.getModel();
       TableRowSorter<DefaultTableModel> hatiin=new TableRowSorter<DefaultTableModel>(magsaliksik);
       tb_Account.setRowSorter(hatiin);
       hatiin.setRowFilter(RowFilter.regexFilter(tignan.getText().trim(),0));
    }//GEN-LAST:event_tignanKeyReleased

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
            java.util.logging.Logger.getLogger(ViewAccountForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ViewAccountForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ViewAccountForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ViewAccountForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ViewAccountForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel closelbl;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tb_Account;
    private javax.swing.JTextField tignan;
    private javax.swing.JLayeredPane useraccountsettings;
    private javax.swing.JLabel viewaccountbg;
    // End of variables declaration//GEN-END:variables

}
