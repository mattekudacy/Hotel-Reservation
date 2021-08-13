package HotelReservationSystem;

import java.awt.Color;

public class AdminSettings extends Login_Register_Connection {

    public AdminSettings() {
        initComponents();
        DoConnect();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        closelbl = new javax.swing.JLabel();
        viewallaccounts = new javax.swing.JLabel();
        viewallaccounts1 = new javax.swing.JLabel();
        accountsettings = new javax.swing.JLabel();
        accountsettings1 = new javax.swing.JLabel();
        pastrecords = new javax.swing.JLabel();
        pastrecords1 = new javax.swing.JLabel();
        manageroom = new javax.swing.JLabel();
        manageroom1 = new javax.swing.JLabel();
        addaccount = new javax.swing.JLabel();
        addaccount1 = new javax.swing.JLabel();
        dashboardbg = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        closelbl.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
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
        getContentPane().add(closelbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(940, 0, 50, 30));

        viewallaccounts.setIcon(new javax.swing.ImageIcon(getClass().getResource("/HotelReservationSystem/img/viewallaccounts.png"))); // NOI18N
        viewallaccounts.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                viewallaccountsMouseMoved(evt);
            }
        });
        getContentPane().add(viewallaccounts, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 380, -1, 180));

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
        getContentPane().add(viewallaccounts1, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 370, 190, 200));

        accountsettings.setIcon(new javax.swing.ImageIcon(getClass().getResource("/HotelReservationSystem/img/accountsettings.png"))); // NOI18N
        accountsettings.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                accountsettingsMouseMoved(evt);
            }
        });
        getContentPane().add(accountsettings, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 380, -1, 180));

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
        getContentPane().add(accountsettings1, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 380, -1, 180));

        pastrecords.setIcon(new javax.swing.ImageIcon(getClass().getResource("/HotelReservationSystem/img/pastrecords.png"))); // NOI18N
        pastrecords.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                pastrecordsMouseMoved(evt);
            }
        });
        getContentPane().add(pastrecords, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 190, 180, 160));

        pastrecords1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/HotelReservationSystem/img/pastrecords1.png"))); // NOI18N
        pastrecords1.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                pastrecords1MouseMoved(evt);
            }
        });
        pastrecords1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pastrecords1MouseClicked(evt);
            }
        });
        getContentPane().add(pastrecords1, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 190, 180, 160));

        manageroom.setIcon(new javax.swing.ImageIcon(getClass().getResource("/HotelReservationSystem/img/manageroom.png"))); // NOI18N
        manageroom.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                manageroomMouseMoved(evt);
            }
        });
        getContentPane().add(manageroom, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 190, 180, 160));

        manageroom1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/HotelReservationSystem/img/manageroom1.png"))); // NOI18N
        manageroom1.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                manageroom1MouseMoved(evt);
            }
        });
        manageroom1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                manageroom1MouseClicked(evt);
            }
        });
        getContentPane().add(manageroom1, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 190, 180, 160));

        addaccount.setIcon(new javax.swing.ImageIcon(getClass().getResource("/HotelReservationSystem/img/addaccount.png"))); // NOI18N
        addaccount.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                addaccountMouseMoved(evt);
            }
        });
        getContentPane().add(addaccount, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 190, 180, 160));

        addaccount1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/HotelReservationSystem/img/addaccount1.png"))); // NOI18N
        addaccount1.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                addaccount1MouseMoved(evt);
            }
        });
        addaccount1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                addaccount1MouseClicked(evt);
            }
        });
        getContentPane().add(addaccount1, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 190, 180, 160));

        dashboardbg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/HotelReservationSystem/img/dashboardbg.png"))); // NOI18N
        dashboardbg.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                dashboardbgMouseMoved(evt);
            }
        });
        getContentPane().add(dashboardbg, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1000, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void dashboardbgMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dashboardbgMouseMoved
        closelbl.setForeground(new Color(255,255,255));  
        addaccount.setVisible(true);
        accountsettings.setVisible(true);
        viewallaccounts.setVisible(true);
        manageroom.setVisible(true);
        pastrecords.setVisible(true);
        
    }//GEN-LAST:event_dashboardbgMouseMoved

    private void closelblMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_closelblMouseMoved
        closelbl.setForeground(new Color(153,153,153));
    }//GEN-LAST:event_closelblMouseMoved

    private void closelblMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_closelblMouseClicked
        MainSystem mainsys = new MainSystem();
        mainsys.setVisible(true);
        AdminSettings.this.dispose();
    }//GEN-LAST:event_closelblMouseClicked

    private void addaccountMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addaccountMouseMoved
        addaccount.setVisible(false);
    }//GEN-LAST:event_addaccountMouseMoved

    private void addaccount1MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addaccount1MouseMoved
        addaccount.setVisible(false);
    }//GEN-LAST:event_addaccount1MouseMoved

    private void manageroomMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_manageroomMouseMoved
        manageroom.setVisible(false);
    }//GEN-LAST:event_manageroomMouseMoved

    private void manageroom1MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_manageroom1MouseMoved
        manageroom.setVisible(false);
    }//GEN-LAST:event_manageroom1MouseMoved

    private void pastrecordsMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pastrecordsMouseMoved
        pastrecords.setVisible(false);
    }//GEN-LAST:event_pastrecordsMouseMoved

    private void pastrecords1MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pastrecords1MouseMoved
        pastrecords.setVisible(false);
    }//GEN-LAST:event_pastrecords1MouseMoved

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

    private void accountsettings1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_accountsettings1MouseClicked
        AccountsSettingsForm accountsettingsfrm = new AccountsSettingsForm();
        accountsettingsfrm.setVisible(true);
        AdminSettings.this.setVisible(false);
    }//GEN-LAST:event_accountsettings1MouseClicked

    private void viewallaccounts1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_viewallaccounts1MouseClicked
        ViewAccountForm viewaccountfrm = new ViewAccountForm();
        viewaccountfrm.setVisible(true);
        AdminSettings.this.setVisible(false);
    }//GEN-LAST:event_viewallaccounts1MouseClicked

    private void addaccount1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addaccount1MouseClicked
        RegisterForm regfrm = new RegisterForm();
        regfrm.setVisible(true);
        AdminSettings.this.dispose();
    }//GEN-LAST:event_addaccount1MouseClicked

    private void manageroom1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_manageroom1MouseClicked
        ManageRoomForm mainroomfrm = new ManageRoomForm();
        mainroomfrm.setVisible(true);
        AdminSettings.this.setVisible(false);
    }//GEN-LAST:event_manageroom1MouseClicked

    private void pastrecords1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pastrecords1MouseClicked
        PastRecordsForm pastfrm = new PastRecordsForm();
        pastfrm.setVisible(true);
        AdminSettings.this.setVisible(false);
    }//GEN-LAST:event_pastrecords1MouseClicked

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
            java.util.logging.Logger.getLogger(AdminSettings.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AdminSettings.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AdminSettings.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AdminSettings.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AdminSettings().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel accountsettings;
    private javax.swing.JLabel accountsettings1;
    private javax.swing.JLabel addaccount;
    private javax.swing.JLabel addaccount1;
    private javax.swing.JLabel closelbl;
    private javax.swing.JLabel dashboardbg;
    private javax.swing.JLabel manageroom;
    private javax.swing.JLabel manageroom1;
    private javax.swing.JLabel pastrecords;
    private javax.swing.JLabel pastrecords1;
    private javax.swing.JLabel viewallaccounts;
    private javax.swing.JLabel viewallaccounts1;
    // End of variables declaration//GEN-END:variables

}