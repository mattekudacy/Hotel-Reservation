package HotelReservationSystem;

import java.awt.Color;

public class SettingsForm extends Login_Register_Connection {

    
    public SettingsForm() {
        initComponents();
        DoConnect();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSplitPane1 = new javax.swing.JSplitPane();
        accountsettings = new javax.swing.JLabel();
        accountsettings1 = new javax.swing.JLabel();
        viewallaccounts = new javax.swing.JLabel();
        viewallaccounts1 = new javax.swing.JLabel();
        closelbl = new javax.swing.JLabel();
        settingsbg = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        accountsettings.setIcon(new javax.swing.ImageIcon(getClass().getResource("/HotelReservationSystem/img/accountsettings.png"))); // NOI18N
        accountsettings.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                accountsettingsMouseMoved(evt);
            }
        });
        getContentPane().add(accountsettings, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 150, -1, -1));

        accountsettings1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/HotelReservationSystem/img/accountsettings1.png"))); // NOI18N
        accountsettings1.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                accountsettings1MouseMoved(evt);
            }
        });
        accountsettings1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                accountsettings1MouseClicked(evt);
            }
        });
        getContentPane().add(accountsettings1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 150, -1, -1));

        viewallaccounts.setIcon(new javax.swing.ImageIcon(getClass().getResource("/HotelReservationSystem/img/viewallaccounts.png"))); // NOI18N
        viewallaccounts.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                viewallaccountsMouseMoved(evt);
            }
        });
        getContentPane().add(viewallaccounts, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 150, -1, -1));

        viewallaccounts1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/HotelReservationSystem/img/viewallaccounts1.png"))); // NOI18N
        viewallaccounts1.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                viewallaccounts1MouseMoved(evt);
            }
        });
        viewallaccounts1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                viewallaccounts1MouseClicked(evt);
            }
        });
        getContentPane().add(viewallaccounts1, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 150, -1, -1));

        closelbl.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        closelbl.setForeground(new java.awt.Color(255, 255, 255));
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
        getContentPane().add(closelbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 0, 50, 20));

        settingsbg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/HotelReservationSystem/img/settingsbg.png"))); // NOI18N
        settingsbg.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                settingsbgMouseMoved(evt);
            }
        });
        getContentPane().add(settingsbg, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 500, 400));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void settingsbgMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_settingsbgMouseMoved
        viewallaccounts.setVisible(true);
        accountsettings.setVisible(true);
        closelbl.setForeground(new Color(255,255,255));
       
    }//GEN-LAST:event_settingsbgMouseMoved

    private void accountsettingsMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_accountsettingsMouseMoved
        accountsettings.setVisible(false);
    }//GEN-LAST:event_accountsettingsMouseMoved

    private void accountsettings1MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_accountsettings1MouseMoved
        accountsettings.setVisible(false);
    }//GEN-LAST:event_accountsettings1MouseMoved

    private void viewallaccountsMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_viewallaccountsMouseMoved
        viewallaccounts.setVisible(false);
    }//GEN-LAST:event_viewallaccountsMouseMoved

    private void viewallaccounts1MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_viewallaccounts1MouseMoved
        viewallaccounts.setVisible(false);
    }//GEN-LAST:event_viewallaccounts1MouseMoved

    private void closelblMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_closelblMouseClicked
        MainSystem mainsys = new MainSystem();
        mainsys.setVisible(true);
        SettingsForm.this.dispose();
    }//GEN-LAST:event_closelblMouseClicked

    private void closelblMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_closelblMouseMoved
        closelbl.setForeground(new Color(153,153,153));
    }//GEN-LAST:event_closelblMouseMoved

    private void accountsettings1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_accountsettings1MouseClicked
        AccountsSettingsForm accountsettingsfrm = new AccountsSettingsForm();
        accountsettingsfrm.setVisible(true);
        SettingsForm.this.setVisible(false);
    }//GEN-LAST:event_accountsettings1MouseClicked

    private void viewallaccounts1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_viewallaccounts1MouseClicked
        ViewAccountForm viewaccountfrm = new ViewAccountForm();
        viewaccountfrm.setVisible(true);
        SettingsForm.this.setVisible(false);
    }//GEN-LAST:event_viewallaccounts1MouseClicked

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
            java.util.logging.Logger.getLogger(SettingsForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SettingsForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SettingsForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SettingsForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SettingsForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel accountsettings;
    private javax.swing.JLabel accountsettings1;
    private javax.swing.JLabel closelbl;
    private javax.swing.JSplitPane jSplitPane1;
    private javax.swing.JLabel settingsbg;
    private javax.swing.JLabel viewallaccounts;
    private javax.swing.JLabel viewallaccounts1;
    // End of variables declaration//GEN-END:variables
}
