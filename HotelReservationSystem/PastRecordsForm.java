
package HotelReservationSystem;
import java.sql.*;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.Color;


public class PastRecordsForm extends ConnectRoomBookingandCheckIn {
DefaultTableModel tbModel = new DefaultTableModel();
int x= 0;
    /**
     * Creates new form PastRecordsForm
     */
    public PastRecordsForm() {
        initComponents();
        DoConnect();
        Select();
    }
 public void Select(){
    String [] columnNames = {"NAME","ROOMTYPE","ROOMNO","CHECKINDATE", "CHECKOUTDATE", "CHECKINTIME", "CHECKOUTTIME"};
    tbModel.setColumnIdentifiers(columnNames);
    try{
        while(prs.next()){
            na = prs.getString("NAME");
            id = prs.getInt("ROOMNO");
            urt = prs.getString("ROOMTYPE");
            cid= prs.getString("CHECKINDATE");
            cod = prs.getString("CHECKOUTDATE");
            cit = prs.getTime("CHECKINTIME");
            cot = prs.getTime("CHECKOUTTIME");
            jTable1.setVisible(true);
            tbModel.addRow(new Object []{na,urt,cod,cid,id,cit,cot});
            x++;        
        }
        Refresh_PAST_STMT ();
    }catch(SQLException err){
            JOptionPane.showMessageDialog(PastRecordsForm.this, err.getMessage());
            
       }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        checkoutpane = new javax.swing.JLayeredPane();
        jLabel9 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        closelbl = new javax.swing.JLabel();
        dashboardbg = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        checkoutpane.setBackground(new java.awt.Color(0, 0, 0));
        checkoutpane.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 204, 0), 2));
        checkoutpane.setOpaque(true);

        jLabel9.setBackground(new java.awt.Color(255, 204, 0));
        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("List of Records");
        jLabel9.setOpaque(true);
        checkoutpane.add(jLabel9);
        jLabel9.setBounds(10, 10, 700, 30);

        jTable1.setModel(tbModel);
        jScrollPane2.setViewportView(jTable1);

        checkoutpane.add(jScrollPane2);
        jScrollPane2.setBounds(0, 40, 720, 350);

        getContentPane().add(checkoutpane, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 190, 720, 380));

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
            AdminSettings adminsettingsfrm = new AdminSettings();
            adminsettingsfrm.setVisible(true);
            PastRecordsForm.this.dispose();
    }//GEN-LAST:event_closelblMouseClicked

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
            java.util.logging.Logger.getLogger(PastRecordsForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PastRecordsForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PastRecordsForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PastRecordsForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PastRecordsForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLayeredPane checkoutpane;
    private javax.swing.JLabel closelbl;
    private javax.swing.JLabel dashboardbg;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
