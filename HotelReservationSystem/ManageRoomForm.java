/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HotelReservationSystem;

import java.awt.Color;
import javax.swing.JOptionPane;

/**
 *
 * @author Voldemorg
 */
public class ManageRoomForm extends javax.swing.JFrame {

    /**
     * Creates new form ManageRoomForm
     */
    public ManageRoomForm() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        closelbl = new javax.swing.JLabel();
        roomchanges = new javax.swing.JLayeredPane();
        jLabel1 = new javax.swing.JLabel();
        roomtype = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        cmdedit = new javax.swing.JButton();
        roomdetails = new javax.swing.JLayeredPane();
        jLabel2 = new javax.swing.JLabel();
        hotelpics = new javax.swing.JLabel();
        flexibleratelbl = new javax.swing.JLabel();
        roomtypelbl1 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextPane1 = new javax.swing.JTextPane();
        cmdreset = new javax.swing.JButton();
        cmdsave = new javax.swing.JButton();
        changeprice = new javax.swing.JTextField();
        changename = new javax.swing.JTextField();
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

        roomchanges.setBackground(new java.awt.Color(0, 0, 0));
        roomchanges.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2));
        roomchanges.setOpaque(true);

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Select Room Type");
        jLabel1.setOpaque(true);
        roomchanges.add(jLabel1);
        jLabel1.setBounds(10, 10, 280, 30);

        roomtype.setBackground(new java.awt.Color(255, 204, 102));
        roomtype.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        roomtype.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Deluxe", "Premium", "Executive", "Diplomatic", "Presidential" }));
        roomchanges.add(roomtype);
        roomtype.setBounds(110, 60, 160, 30);

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Room Type:");
        roomchanges.add(jLabel5);
        jLabel5.setBounds(10, 60, 90, 30);

        cmdedit.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        cmdedit.setText("Edit");
        cmdedit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cmdeditMouseClicked(evt);
            }
        });
        roomchanges.add(cmdedit);
        cmdedit.setBounds(140, 110, 90, 30);

        getContentPane().add(roomchanges, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 290, 300, 160));

        roomdetails.setBackground(new java.awt.Color(0, 0, 0));
        roomdetails.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2));
        roomdetails.setOpaque(true);

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Edit Room Data");
        jLabel2.setOpaque(true);
        roomdetails.add(jLabel2);
        jLabel2.setBounds(10, 10, 350, 30);

        hotelpics.setIcon(new javax.swing.ImageIcon(getClass().getResource("/HotelReservationSystem/img/Rooms/deluxe.png"))); // NOI18N
        roomdetails.add(hotelpics);
        hotelpics.setBounds(10, 60, 170, 100);

        flexibleratelbl.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        flexibleratelbl.setForeground(new java.awt.Color(255, 255, 255));
        flexibleratelbl.setText("Flexible Rate: ");
        roomdetails.add(flexibleratelbl);
        flexibleratelbl.setBounds(190, 100, 90, 20);

        roomtypelbl1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        roomtypelbl1.setForeground(new java.awt.Color(255, 255, 255));
        roomtypelbl1.setText("per night");
        roomdetails.add(roomtypelbl1);
        roomtypelbl1.setBounds(190, 130, 70, 20);

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("Room Description:");
        roomdetails.add(jLabel14);
        jLabel14.setBounds(10, 170, 130, 30);

        jScrollPane1.setViewportView(jTextPane1);

        roomdetails.add(jScrollPane1);
        jScrollPane1.setBounds(10, 220, 350, 120);

        cmdreset.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        cmdreset.setText("Reset");
        cmdreset.setEnabled(false);
        cmdreset.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cmdresetMouseClicked(evt);
            }
        });
        roomdetails.add(cmdreset);
        cmdreset.setBounds(190, 350, 90, 30);

        cmdsave.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        cmdsave.setText("Save");
        cmdsave.setEnabled(false);
        cmdsave.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cmdsaveMouseClicked(evt);
            }
        });
        roomdetails.add(cmdsave);
        cmdsave.setBounds(90, 350, 90, 30);

        changeprice.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        changeprice.setText("6199.00");
        changeprice.setEnabled(false);
        roomdetails.add(changeprice);
        changeprice.setBounds(280, 100, 80, 21);

        changename.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        changename.setText("East Deluxe Room");
        changename.setEnabled(false);
        roomdetails.add(changename);
        changename.setBounds(190, 70, 170, 21);

        getContentPane().add(roomdetails, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 180, 370, 390));

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

    }//GEN-LAST:event_dashboardbgMouseMoved

    private void closelblMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_closelblMouseMoved
        closelbl.setForeground(new Color(153,153,153));
    }//GEN-LAST:event_closelblMouseMoved

    private void closelblMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_closelblMouseClicked
     int response = JOptionPane.showConfirmDialog(this, "The information you have entered will be forfeited. Proceed?","Proceed?",JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE);
        switch (response) {
            case JOptionPane.YES_OPTION:
               AdminSettings adminsettingsfrm = new AdminSettings();
               adminsettingsfrm.setVisible(true);
               ManageRoomForm.this.dispose();
                break;
            case JOptionPane.NO_OPTION:
                setDefaultCloseOperation(MainSystem.DO_NOTHING_ON_CLOSE);
                break;
            case JOptionPane.CLOSED_OPTION:
                setDefaultCloseOperation(MainSystem.DO_NOTHING_ON_CLOSE);
                break;
            default:
                break;                               
    }       
    }//GEN-LAST:event_closelblMouseClicked

    private void cmdeditMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cmdeditMouseClicked
  //connect sa database. ivview nya lang sa mga text field at text pane yung mga data dun.
  // base sa kung ano yung pinili niyang room type
  //parang yung dun sa account settinga form
  
    }//GEN-LAST:event_cmdeditMouseClicked

    private void cmdresetMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cmdresetMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_cmdresetMouseClicked

    private void cmdsaveMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cmdsaveMouseClicked
        //update yung database
        //dapat kung ano yung inedit dun mavview yun dun sa room booking form
    }//GEN-LAST:event_cmdsaveMouseClicked

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
            java.util.logging.Logger.getLogger(ManageRoomForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ManageRoomForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ManageRoomForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ManageRoomForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ManageRoomForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField changename;
    private javax.swing.JTextField changeprice;
    private javax.swing.JLabel closelbl;
    private javax.swing.JButton cmdedit;
    private javax.swing.JButton cmdreset;
    private javax.swing.JButton cmdsave;
    private javax.swing.JLabel dashboardbg;
    private javax.swing.JLabel flexibleratelbl;
    private javax.swing.JLabel hotelpics;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextPane jTextPane1;
    private javax.swing.JLayeredPane roomchanges;
    private javax.swing.JLayeredPane roomdetails;
    public javax.swing.JComboBox<String> roomtype;
    private javax.swing.JLabel roomtypelbl1;
    // End of variables declaration//GEN-END:variables
}