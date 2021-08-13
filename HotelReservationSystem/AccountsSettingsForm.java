
package HotelReservationSystem;

import java.awt.Color;
import java.sql.*;
import javax.swing.*;
public class AccountsSettingsForm extends Login_Register_Connection {

    public AccountsSettingsForm() {
        initComponents();
        cmdnext.setBackground(new Color(204,153,0));
        cmdback.setBackground(new Color(204,153,0));
        cmdfirst.setBackground(new Color(204,153,0));
        cmdlast.setBackground(new Color(204,153,0));
        cmdsearch.setBackground(new Color(204,153,0));
        cmddelete.setBackground(new Color(204,153,0));
        cmdcancel1.setBackground(new Color(204,153,0));
        DoConnect();
        showAll();
        deactivate();
    }
 void Get_Set_Records(){
        try{
            i=rs.getString("USERID");
            s=rs.getString("PASSWORD");
            u=rs.getString("USERTYPE");
            txt_userid.setText(i);
            txt_pass1.setText(s);
            txt_usertype.setText(u);
         
        }catch(SQLException err){
            JOptionPane.showMessageDialog(AccountsSettingsForm.this,err.getMessage());
        }
    }
  void showAll(){
            try{
              
                rs.first();
                Get_Set_Records();
            }catch(SQLException e){
                System.out.println("error");
            }
        }
   void activate(){
            txt_userid.setEnabled(true);
            txt_pass1.setEnabled(true);
   
            
                cmddelete.setEnabled(true);
                   cmdsave1.setEnabled(true);
                   cmdcancel1.setEnabled(true);
                    
   }
   void deactivate(){
         txt_userid.setEnabled(false);
            txt_pass1.setEnabled(false);
            txt_usertype.setEnabled(false);
              cmdcancel1.setEnabled(false);
                cmddelete.setEnabled(false);
                   cmdsave1.setEnabled(false);
   }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        useraccountsettings = new javax.swing.JLayeredPane();
        jLabel11 = new javax.swing.JLabel();
        txt_usertype = new javax.swing.JTextField();
        txt_pass1 = new javax.swing.JTextField();
        txt_userid = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        cmdback = new javax.swing.JButton();
        cmdsearch = new javax.swing.JButton();
        cmdcancel1 = new javax.swing.JButton();
        cmddelete = new javax.swing.JButton();
        cmdnext = new javax.swing.JButton();
        cmdlast = new javax.swing.JButton();
        cmdfirst = new javax.swing.JButton();
        jLabel22 = new javax.swing.JLabel();
        cmdsave1 = new javax.swing.JButton();
        cmdedit2 = new javax.swing.JButton();
        closelbl = new javax.swing.JLabel();
        accountsettingsbg = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        useraccountsettings.setBackground(new java.awt.Color(0, 0, 0));
        useraccountsettings.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 204, 0), 2));
        useraccountsettings.setOpaque(true);

        jLabel11.setBackground(new java.awt.Color(255, 204, 0));
        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setText("User Account Settings");
        jLabel11.setOpaque(true);
        useraccountsettings.add(jLabel11);
        jLabel11.setBounds(10, 10, 510, 30);

        txt_usertype.setBackground(new java.awt.Color(255, 204, 0));
        txt_usertype.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txt_usertype.setEnabled(false);
        useraccountsettings.add(txt_usertype);
        txt_usertype.setBounds(130, 150, 230, 23);

        txt_pass1.setBackground(new java.awt.Color(255, 204, 0));
        txt_pass1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txt_pass1.setEnabled(false);
        useraccountsettings.add(txt_pass1);
        txt_pass1.setBounds(130, 110, 230, 23);

        txt_userid.setBackground(new java.awt.Color(255, 204, 0));
        txt_userid.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txt_userid.setEnabled(false);
        useraccountsettings.add(txt_userid);
        txt_userid.setBounds(130, 70, 230, 23);

        jLabel19.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(255, 204, 0));
        jLabel19.setText("Position");
        useraccountsettings.add(jLabel19);
        jLabel19.setBounds(20, 150, 60, 20);

        jLabel24.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(255, 204, 0));
        jLabel24.setText("User ID");
        useraccountsettings.add(jLabel24);
        jLabel24.setBounds(20, 70, 70, 20);

        cmdback.setBackground(new java.awt.Color(255, 204, 0));
        cmdback.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        cmdback.setIcon(new javax.swing.ImageIcon(getClass().getResource("/HotelReservationSystem/img/icon/back.png"))); // NOI18N
        cmdback.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdbackActionPerformed(evt);
            }
        });
        useraccountsettings.add(cmdback);
        cmdback.setBounds(210, 190, 30, 40);

        cmdsearch.setBackground(new java.awt.Color(255, 204, 0));
        cmdsearch.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        cmdsearch.setText("Search");
        cmdsearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdsearchActionPerformed(evt);
            }
        });
        useraccountsettings.add(cmdsearch);
        cmdsearch.setBounds(390, 50, 90, 30);

        cmdcancel1.setBackground(new java.awt.Color(255, 204, 0));
        cmdcancel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        cmdcancel1.setText("Cancel");
        cmdcancel1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdcancel1ActionPerformed(evt);
            }
        });
        useraccountsettings.add(cmdcancel1);
        cmdcancel1.setBounds(390, 210, 90, 30);

        cmddelete.setBackground(new java.awt.Color(255, 204, 0));
        cmddelete.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        cmddelete.setText("Delete");
        cmddelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmddeleteActionPerformed(evt);
            }
        });
        useraccountsettings.add(cmddelete);
        cmddelete.setBounds(390, 90, 90, 30);

        cmdnext.setBackground(new java.awt.Color(255, 204, 0));
        cmdnext.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        cmdnext.setIcon(new javax.swing.ImageIcon(getClass().getResource("/HotelReservationSystem/img/icon/next.png"))); // NOI18N
        cmdnext.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdnextActionPerformed(evt);
            }
        });
        useraccountsettings.add(cmdnext);
        cmdnext.setBounds(250, 190, 30, 40);

        cmdlast.setBackground(new java.awt.Color(255, 204, 0));
        cmdlast.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        cmdlast.setIcon(new javax.swing.ImageIcon(getClass().getResource("/HotelReservationSystem/img/icon/rightright.png"))); // NOI18N
        cmdlast.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdlastActionPerformed(evt);
            }
        });
        useraccountsettings.add(cmdlast);
        cmdlast.setBounds(290, 190, 40, 40);

        cmdfirst.setBackground(new java.awt.Color(255, 204, 0));
        cmdfirst.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        cmdfirst.setIcon(new javax.swing.ImageIcon(getClass().getResource("/HotelReservationSystem/img/icon/lefleft.png"))); // NOI18N
        cmdfirst.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                cmdfirstMouseMoved(evt);
            }
        });
        cmdfirst.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdfirstActionPerformed(evt);
            }
        });
        useraccountsettings.add(cmdfirst);
        cmdfirst.setBounds(160, 190, 40, 40);

        jLabel22.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(255, 204, 0));
        jLabel22.setText("Password");
        useraccountsettings.add(jLabel22);
        jLabel22.setBounds(20, 110, 80, 20);

        cmdsave1.setBackground(new java.awt.Color(255, 204, 0));
        cmdsave1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        cmdsave1.setText("Save");
        cmdsave1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdsave1ActionPerformed(evt);
            }
        });
        useraccountsettings.add(cmdsave1);
        cmdsave1.setBounds(390, 130, 90, 30);

        cmdedit2.setBackground(new java.awt.Color(255, 204, 0));
        cmdedit2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        cmdedit2.setText("Edit");
        cmdedit2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdedit2ActionPerformed(evt);
            }
        });
        useraccountsettings.add(cmdedit2);
        cmdedit2.setBounds(390, 170, 90, 30);

        getContentPane().add(useraccountsettings, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 140, 530, 250));

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

        accountsettingsbg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/HotelReservationSystem/img/useraccountsettingsbg.png"))); // NOI18N
        accountsettingsbg.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                accountsettingsbgMouseMoved(evt);
            }
        });
        getContentPane().add(accountsettingsbg, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 700, 450));

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
        AccountsSettingsForm.this.dispose();
        }catch(SQLException err ){
            System.out.println(err.getMessage());
        }
        
    }//GEN-LAST:event_closelblMouseClicked

    private void accountsettingsbgMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_accountsettingsbgMouseMoved
      
    }//GEN-LAST:event_accountsettingsbgMouseMoved

    private void cmdfirstMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cmdfirstMouseMoved

    }//GEN-LAST:event_cmdfirstMouseMoved

    private void cmdfirstActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdfirstActionPerformed
 try{
            rs.first();
            Get_Set_Records();

        }catch(SQLException err){
            JOptionPane.showMessageDialog(AccountsSettingsForm.this,err.getMessage());

        }        // TODO add your handling code here:
    }//GEN-LAST:event_cmdfirstActionPerformed

    private void cmdbackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdbackActionPerformed
   try{
            if(rs.previous()){
                 Get_Set_Records();
            }else{
                rs.next();
                JOptionPane.showMessageDialog(AccountsSettingsForm.this,"Start of File");

            }

        }catch(SQLException err){
            JOptionPane.showMessageDialog(AccountsSettingsForm.this,err.getMessage());
        }
    }//GEN-LAST:event_cmdbackActionPerformed

    private void cmdnextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdnextActionPerformed
         try{
            if(rs.next()){
                Get_Set_Records();
            }
            else{
                rs.previous();
                JOptionPane.showMessageDialog(AccountsSettingsForm.this,"End of File");
            }

        }catch(SQLException err){
            JOptionPane.showMessageDialog(AccountsSettingsForm.this,err.getMessage());
        }
    }//GEN-LAST:event_cmdnextActionPerformed

    private void cmdlastActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdlastActionPerformed
         try{
            rs.last();
            Get_Set_Records();

        }catch(SQLException err){
            JOptionPane.showMessageDialog(AccountsSettingsForm.this,err.getMessage());

        }
    }//GEN-LAST:event_cmdlastActionPerformed

    private void cmdsearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdsearchActionPerformed
         user=JOptionPane.showInputDialog(null,"Please type the USERID:","Find a record",JOptionPane.QUESTION_MESSAGE);
         newID=user;
        try{
            Refresh_RS_STMT();
            while(rs.next()){
                i=rs.getString("USERID");
                if(newID.equals(i)){
                    temp_user=newID;
                    Get_Set_Records();
                }
            }if(!newID.equals (temp_user)){
                showAll();
                Get_Set_Records();
                JOptionPane.showMessageDialog(null, "Record not found:");
            }
        }catch(SQLException err){
            JOptionPane.showMessageDialog(AccountsSettingsForm.this,err.getMessage());
        }
    }//GEN-LAST:event_cmdsearchActionPerformed

    private void cmddeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmddeleteActionPerformed
 try{
            result=JOptionPane.showConfirmDialog(null,"Are you sure you want to delete this record?"," Confirm Message", JOptionPane.YES_NO_OPTION);
            if(result==JOptionPane.YES_OPTION){
                rs.deleteRow();
                rs.first();
                Refresh_RS_STMT();
                deactivate();
                showAll();
                JOptionPane.showMessageDialog(AccountsSettingsForm.this,"Record has been deleted!");
            }else{
                rs.first();
                Get_Set_Records();
            }
        }catch(SQLException err){
            JOptionPane.showMessageDialog(AccountsSettingsForm.this,err.getMessage());
        }        // TODO add your handling code here:
    }//GEN-LAST:event_cmddeleteActionPerformed

    private void cmdcancel1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdcancel1ActionPerformed
          deactivate();
    }//GEN-LAST:event_cmdcancel1ActionPerformed

    private void cmdsave1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdsave1ActionPerformed
         i=txt_userid.getText();
        s=txt_pass1.getText();
          try{
            rs.updateString("USERID",i);
            rs.updateString("PASSWORD",s);
            rs.updateRow();
            Refresh_RS_STMT();
            showAll();
            JOptionPane.showMessageDialog(AccountsSettingsForm.this,"Record has been updated!");
            deactivate();
        }catch(SQLException err){
            System.out.println(err.getMessage());
        }
    }//GEN-LAST:event_cmdsave1ActionPerformed

    private void cmdedit2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdedit2ActionPerformed
        activate();
    }//GEN-LAST:event_cmdedit2ActionPerformed

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
            java.util.logging.Logger.getLogger(AccountSettingsForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AccountSettingsForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AccountSettingsForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AccountSettingsForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AccountSettingsForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel accountsettingsbg;
    private javax.swing.JLabel closelbl;
    private javax.swing.JButton cmdback;
    private javax.swing.JButton cmdcancel1;
    private javax.swing.JButton cmddelete;
    private javax.swing.JButton cmdedit2;
    private javax.swing.JButton cmdfirst;
    private javax.swing.JButton cmdlast;
    private javax.swing.JButton cmdnext;
    private javax.swing.JButton cmdsave1;
    private javax.swing.JButton cmdsearch;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JTextField txt_pass1;
    private javax.swing.JTextField txt_userid;
    private javax.swing.JTextField txt_usertype;
    private javax.swing.JLayeredPane useraccountsettings;
    // End of variables declaration//GEN-END:variables
}
