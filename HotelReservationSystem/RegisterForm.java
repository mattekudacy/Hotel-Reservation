
package HotelReservationSystem;
import java.awt.Color;
import java.sql.*;
import java.util.regex.Pattern;
import javax.swing.*;
public class RegisterForm extends Login_Register_Connection {

    public RegisterForm() {
        initComponents();
        cmdregister.setBackground(new Color(204,153,0));
        cmdback.setBackground(new Color(204,153,0)); 
        DoConnect();
    }

    void Burahin(){
         txt_userid.setText(null);
                 txt_pass1.setText(null);
             txt_pass2.setText(null);
             jLabel1.setText(null);
             jLabel2.setText(null);
             jLabel6.setText(null);
    }
    
 
 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel8 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        cmdback = new javax.swing.JButton();
        cmdregister = new javax.swing.JButton();
        txt_userid = new javax.swing.JTextField();
        txt_pass2 = new javax.swing.JPasswordField();
        txt_pass1 = new javax.swing.JPasswordField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        registerfrmbg = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();

        jLabel8.setText("jLabel8");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 204, 0));
        jLabel5.setText("Confirm Password");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 360, 120, 30));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 204, 0));
        jLabel4.setText("Enter Password");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 300, 100, 30));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 204, 0));
        jLabel3.setText("Enter Username");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 240, 100, 30));

        cmdback.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        cmdback.setText("Back");
        cmdback.setOpaque(false);
        cmdback.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                cmdbackMouseMoved(evt);
            }
        });
        cmdback.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cmdbackMouseClicked(evt);
            }
        });
        cmdback.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdbackActionPerformed(evt);
            }
        });
        getContentPane().add(cmdback, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 440, 110, 30));

        cmdregister.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        cmdregister.setText("Register");
        cmdregister.setOpaque(false);
        cmdregister.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                cmdregisterMouseMoved(evt);
            }
        });
        cmdregister.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdregisterActionPerformed(evt);
            }
        });
        getContentPane().add(cmdregister, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 440, 110, 30));

        txt_userid.setBackground(new java.awt.Color(204, 153, 0));
        txt_userid.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        txt_userid.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txt_useridKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt_useridKeyReleased(evt);
            }
        });
        getContentPane().add(txt_userid, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 270, 230, 30));

        txt_pass2.setBackground(new java.awt.Color(204, 153, 0));
        txt_pass2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        txt_pass2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txt_pass2KeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt_pass2KeyReleased(evt);
            }
        });
        getContentPane().add(txt_pass2, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 390, 230, 30));

        txt_pass1.setBackground(new java.awt.Color(204, 153, 0));
        txt_pass1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        txt_pass1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txt_pass1KeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt_pass1KeyReleased(evt);
            }
        });
        getContentPane().add(txt_pass1, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 330, 230, 30));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 0));
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 240, 180, 30));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 51));
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 300, 180, 30));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 51));
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 360, 170, 30));

        registerfrmbg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/HotelReservationSystem/img/register.png"))); // NOI18N
        registerfrmbg.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                registerfrmbgMouseMoved(evt);
            }
        });
        getContentPane().add(registerfrmbg, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 500, 550));

        jLabel7.setForeground(new java.awt.Color(255, 255, 51));
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 330, 80, 30));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void registerfrmbgMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_registerfrmbgMouseMoved

      cmdregister.setBackground(new Color(204,153,0));
      cmdback.setBackground(new Color(204,153,0));
    }//GEN-LAST:event_registerfrmbgMouseMoved

    private void cmdregisterMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cmdregisterMouseMoved
        cmdregister.setBackground(new Color(255,204,102));
    }//GEN-LAST:event_cmdregisterMouseMoved

    private void cmdbackMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cmdbackMouseMoved
        cmdback.setBackground(new Color(255,204,102));
    }//GEN-LAST:event_cmdbackMouseMoved

    private void cmdregisterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdregisterActionPerformed
        final Pattern pattern = Pattern.compile("^[A-Za-z,0-9]++$");
        i=txt_userid.getText();
        s=txt_pass1.getText();
        pass2=txt_pass2.getText();
        u="Receptionist";
       if(!i.isEmpty()&& !s.isEmpty()&& !pass2.isEmpty()){
          if(pattern.matcher(i).matches()&& pattern.matcher(s).matches()&& pattern.matcher(pass2).matches()){
         if( i.length()>=6 && s.length()>=6 && pass2.length()>=6 ){
            if(i.length()<=15 && s.length()<=15 && pass2.length()<=15  ){  
        try{
           if(s.equals(pass2)){
            rs.moveToInsertRow();
            rs.updateString("USERID",i);
            rs.updateString("PASSWORD",s);
            rs.updateString("USERTYPE",u);
            rs.insertRow();
            Refresh_RS_STMT();
            Burahin();
             AdminSettings adminsettingsfrm = new AdminSettings();
             adminsettingsfrm.setVisible(true);
             RegisterForm.this.dispose();
             JOptionPane.showMessageDialog(RegisterForm.this,"Registration successful.");
            
           }
           
           else if(!s.equals(pass2)){
             JOptionPane.showMessageDialog(null,"Password do not match");
             Burahin();
             
        }
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null,"USERID Already Taken.");
              Burahin();
            
        
        }}else{
               JOptionPane.showMessageDialog(null,"User ID OR Password must be minimum of 6 characters and max 15 characters."); 
                Burahin();
            }
         }else{
         
             JOptionPane.showMessageDialog(null,"User ID OR Password must be minimum of 6 characters and max 15 characters.");
                Burahin();
         }  
             
          }else{
                 JOptionPane.showMessageDialog(null,"Spaces and Special Characters are not allowed.");
                 Burahin();
                
          }  
       }else{
            JOptionPane.showMessageDialog(null,"Blank fields are not allowed.");
            Burahin();
                
       }
       
    }//GEN-LAST:event_cmdregisterActionPerformed

    private void cmdbackMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cmdbackMouseClicked
        AdminSettings adminsettingsfrm = new AdminSettings();
        adminsettingsfrm.setVisible(true);
        RegisterForm.this.dispose();
    }//GEN-LAST:event_cmdbackMouseClicked

    private void txt_useridKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_useridKeyReleased
         i=txt_userid.getText();
         
        if(i.length()<9 && i.length()>=6){
           jLabel1.setText("Weak");
           jLabel1.setForeground(Color.yellow);
        
        }else if(i.length()<13 && i.length()>=10){
              jLabel1.setText("Strong");
              jLabel1.setForeground(Color.green);
        }   
       else if(i.length()<15 && i.length()>=14){
              jLabel1.setText("Very Strong");
              jLabel1.setForeground(Color.green);
        }
        if(i.length()==0){
             jLabel1.setText(null);
        }
    }//GEN-LAST:event_txt_useridKeyReleased

    private void txt_pass1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_pass1KeyReleased
        s=txt_pass1.getText();
          
       if(s.length()<9 && s.length()>=6){
           jLabel2.setText("Weak");
           jLabel2.setForeground(Color.yellow);
        
        }else if(s.length()<13 && s.length()>=10){
              jLabel2.setText("Strong");
              jLabel2.setForeground(Color.green);
        }   
       else if(s.length()<15 && s.length()>=14){
              jLabel2.setText("Very Strong");
              jLabel2.setForeground(Color.green);
        }
        if(s.length()==0){
             jLabel2.setText(null);
        }
    }//GEN-LAST:event_txt_pass1KeyReleased

    private void txt_pass2KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_pass2KeyReleased
          s=txt_pass1.getText();
         pass2=txt_pass2.getText();
         if(pass2.length()>=16){
                 
         }
        if(s.equals(pass2)){
           jLabel6.setText("Password Matched");
           jLabel6.setForeground(Color.green);
        }else if(!s.equals(pass2)) {
              jLabel6.setText("Passwords do not match");
              jLabel6.setForeground(Color.red);
        }   if(pass2.length()==0){
             jLabel6.setText(null);
        }
    }//GEN-LAST:event_txt_pass2KeyReleased

    private void cmdbackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdbackActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmdbackActionPerformed

    private void txt_useridKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_useridKeyPressed
       if(txt_userid.getText().length()>=15)
       {
        txt_userid.setText(txt_userid.getText().substring(0,14));
       }
    }//GEN-LAST:event_txt_useridKeyPressed

    private void txt_pass1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_pass1KeyPressed
        if(txt_pass1.getText().length()>=15)
       {
        txt_pass1.setText(txt_pass1.getText().substring(0,14));
       }
    }//GEN-LAST:event_txt_pass1KeyPressed

    private void txt_pass2KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_pass2KeyPressed
        if(txt_pass2.getText().length()>=15)
       {
        txt_pass2.setText(txt_pass2.getText().substring(0,14));
       }
    }//GEN-LAST:event_txt_pass2KeyPressed

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
            java.util.logging.Logger.getLogger(RegisterForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RegisterForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RegisterForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RegisterForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RegisterForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cmdback;
    private javax.swing.JButton cmdregister;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel registerfrmbg;
    private javax.swing.JPasswordField txt_pass1;
    private javax.swing.JPasswordField txt_pass2;
    private javax.swing.JTextField txt_userid;
    // End of variables declaration//GEN-END:variables
}
