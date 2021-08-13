
package HotelReservationSystem;

import java.awt.Color;
import java.sql.*;
import javax.swing.JOptionPane;


public class LoginForms extends Login_Register_Connection {
int counter=1;

    public LoginForms() {
        initComponents();
        usertype.setBackground(new Color(204,153,0));
        LoginBtn.setBackground(new Color(204,153,0));
        DoConnect();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        usertype = new javax.swing.JComboBox<String>();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        userID = new javax.swing.JTextField();
        LoginBtn = new javax.swing.JButton();
        exitlbl = new javax.swing.JLabel();
        pass = new javax.swing.JPasswordField();
        loginbg = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("EastCity Hotel Login");
        setUndecorated(true);
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        usertype.setBackground(new java.awt.Color(255, 204, 102));
        usertype.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        usertype.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Admin", "Receptionist" }));
        getContentPane().add(usertype, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 400, 130, -1));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 204, 0));
        jLabel1.setText("Enter Password");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 320, 100, 30));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 204, 0));
        jLabel3.setText("Login as ");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 400, 60, 20));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 204, 0));
        jLabel5.setText("Enter Username");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 250, 100, 30));

        userID.setBackground(new java.awt.Color(204, 153, 0));
        userID.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        getContentPane().add(userID, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 280, 230, 30));

        LoginBtn.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        LoginBtn.setText("Login");
        LoginBtn.setOpaque(false);
        LoginBtn.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                LoginBtnMouseMoved(evt);
            }
        });
        LoginBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LoginBtnActionPerformed(evt);
            }
        });
        getContentPane().add(LoginBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 440, 210, 40));

        exitlbl.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        exitlbl.setForeground(new java.awt.Color(255, 255, 255));
        exitlbl.setText("X");
        exitlbl.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                exitlblMouseMoved(evt);
            }
        });
        exitlbl.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                exitlblMouseClicked(evt);
            }
        });
        getContentPane().add(exitlbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 10, 10, 20));

        pass.setBackground(new java.awt.Color(204, 153, 0));
        pass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passActionPerformed(evt);
            }
        });
        getContentPane().add(pass, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 350, 230, 30));

        loginbg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/HotelReservationSystem/img/login.png"))); // NOI18N
        loginbg.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                loginbgMouseMoved(evt);
            }
        });
        getContentPane().add(loginbg, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 500, 550));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void loginbgMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_loginbgMouseMoved
       LoginBtn.setBackground(new Color(204,153,0));
       exitlbl.setForeground(new Color(255,255,255));
    }//GEN-LAST:event_loginbgMouseMoved

    private void LoginBtnMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LoginBtnMouseMoved
       LoginBtn.setBackground(new Color(255,204,102));
    }//GEN-LAST:event_LoginBtnMouseMoved

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
   
    }//GEN-LAST:event_formWindowActivated

    private void exitlblMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitlblMouseClicked
        System.exit(0);
    }//GEN-LAST:event_exitlblMouseClicked

    private void exitlblMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitlblMouseMoved
       exitlbl.setForeground(new Color(153,153,153));
    }//GEN-LAST:event_exitlblMouseMoved

    private void passActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_passActionPerformed

    private void LoginBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LoginBtnActionPerformed
       
       user=userID.getText();
       newID=user;
       newPASS=String.valueOf(pass.getPassword());
       newUSERTYPE=String.valueOf(usertype.getSelectedItem());
       try{
      
           rs=stmt.executeQuery("SELECT * FROM ACCOUNTS");
           while(rs.next()){
               i=rs.getString("USERID");
               s=rs.getString("PASSWORD");
               u=rs.getString("USERTYPE");
               if(newID.equals(i)){
                   if(newPASS.equals(s)){
                       if(newUSERTYPE.equals(u)){
                           temp_user=newID;
                           temp_pass=newPASS;
                           temp_usertype=newUSERTYPE;
                           if(newUSERTYPE.equals("Admin")){
                              
                               new MainSystem().setVisible(true);
                               LoginForms.this.dispose();
                               rs.close();
                             
                               
                               
                                 
                           }
                           else{
                           
                               new MainSystem().setVisible(true);
                               LoginForms.this.dispose();
                               rs.close();
                           }
                       }
                   }
               }
           } 
                   if(!newID.equals(temp_user)){
               if(!newPASS.equals(temp_pass)){
                   if(!newUSERTYPE.equals(temp_usertype)){
                       JOptionPane.showMessageDialog(null,"Incorrect User ID or Password.");
                       userID.setText(null);
                       pass.setText(null);
                      counter++;
                   }
               }
           }
           
        
       }
       catch(SQLException e){
           System.out.println(e);
       }
       
    }//GEN-LAST:event_LoginBtnActionPerformed

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
            java.util.logging.Logger.getLogger(LoginForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LoginForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LoginForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LoginForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LoginForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton LoginBtn;
    private javax.swing.JLabel exitlbl;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel loginbg;
    public static javax.swing.JPasswordField pass;
    public static javax.swing.JTextField userID;
    public static javax.swing.JComboBox<String> usertype;
    // End of variables declaration//GEN-END:variables
}
