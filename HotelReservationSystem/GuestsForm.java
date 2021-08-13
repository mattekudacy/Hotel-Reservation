package HotelReservationSystem;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.Timer;
import java.sql.*;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
public class GuestsForm extends connect{
DefaultTableModel tbModel = new DefaultTableModel();
    int x= 0;
    
  
    public GuestsForm() {
        initComponents();
        showDate();
        showTime();
        DoConnect();
        Select();
        guest.setVisible(false);
    }
     private static final SimpleDateFormat sdf3 = new SimpleDateFormat("hh:mm:ss");
    public void Select(){
    String [] columnNames = {"NAME","ROOMID","ROOMTYPE","ROOM CAPACITY","CHECKINDATE", "CHECKOUTDATE"};
    tbModel.setColumnIdentifiers(columnNames);
    try{
        while(rs.next()){
            id = rs.getInt("ROOMNO");
            na = rs.getString("NAME");
            urt = rs.getString("ROOMTYPE");
            cid= rs.getString("CHECKINDATE");
            cod = rs.getString("CHECKOUTDATE");
            
            if (urt.equals("Deluxe")){
                rc = "3";
            }
            else if (urt.equals("Premium")){
                rc = "3";
            }
            else if (urt.equals("Executive")){
                rc = "3";
            }
            else if (urt.equals("Diplomatic")){
                rc = "4 to 6";
            }
            else if (urt.equals("Presidential")){
                rc = "6";
            }
            jTable1.setVisible(true);
            tbModel.addRow(new Object []{na,id,urt,rc, cid, cod});
            x++;
        }
        Refresh_RS_STMT();
       Timestamp timestamp = new Timestamp(System.currentTimeMillis());
        jLabel1.setText(sdf3.format(timestamp));                     
       
    }catch(SQLException err){
            JOptionPane.showMessageDialog(GuestsForm.this, err.getMessage());
       }
}
    void showDate(){
         Date d = new Date();
         SimpleDateFormat s= new SimpleDateFormat("dd-MM-yyyy");
         datelbl.setText(s.format(d));
    }
           
    void showTime(){
         new Timer(0, new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                Date d = new Date();
                SimpleDateFormat s= new SimpleDateFormat("hh:mm:ss a");
                timelbl.setText(s.format(d));
            }
        }
        ).start();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSeparator1 = new javax.swing.JSeparator();
        backlbl = new javax.swing.JLabel();
        guest = new javax.swing.JLabel();
        guests1 = new javax.swing.JLabel();
        rooms = new javax.swing.JLabel();
        rooms1 = new javax.swing.JLabel();
        cancelbooking = new javax.swing.JLabel();
        cancelbooking1 = new javax.swing.JLabel();
        roombooking = new javax.swing.JLabel();
        roombooking1 = new javax.swing.JLabel();
        checkout = new javax.swing.JLabel();
        checkout1 = new javax.swing.JLabel();
        checkin = new javax.swing.JLabel();
        checkin1 = new javax.swing.JLabel();
        checkoutpane = new javax.swing.JLayeredPane();
        jLabel1 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        todaypane = new javax.swing.JLayeredPane();
        timelbl = new javax.swing.JLabel();
        datelbl = new javax.swing.JLabel();
        profilelbl9 = new javax.swing.JLabel();
        profilelbl10 = new javax.swing.JLabel();
        profilelbl11 = new javax.swing.JLabel();
        guestbg = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        backlbl.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        backlbl.setForeground(new java.awt.Color(255, 255, 255));
        backlbl.setText("< Home");
        backlbl.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                backlblMouseMoved(evt);
            }
        });
        backlbl.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                backlblMouseClicked(evt);
            }
        });
        getContentPane().add(backlbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(930, 0, 60, 30));

        guest.setIcon(new javax.swing.ImageIcon(getClass().getResource("/HotelReservationSystem/img/SideIcons/Guests.png"))); // NOI18N
        guest.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                guestMouseMoved(evt);
            }
        });
        getContentPane().add(guest, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 500, 160, 50));

        guests1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/HotelReservationSystem/img/SideIcons/Guests1.png"))); // NOI18N
        getContentPane().add(guests1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 500, 160, 50));

        rooms.setIcon(new javax.swing.ImageIcon(getClass().getResource("/HotelReservationSystem/img/SideIcons/Rooms.png"))); // NOI18N
        rooms.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                roomsMouseMoved(evt);
            }
        });
        getContentPane().add(rooms, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 440, 160, 50));

        rooms1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/HotelReservationSystem/img/SideIcons/Rooms1.png"))); // NOI18N
        rooms1.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                rooms1MouseMoved(evt);
            }
        });
        rooms1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                rooms1MouseClicked(evt);
            }
        });
        getContentPane().add(rooms1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 440, 160, 50));

        cancelbooking.setIcon(new javax.swing.ImageIcon(getClass().getResource("/HotelReservationSystem/img/SideIcons/CancelBooking.png"))); // NOI18N
        cancelbooking.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                cancelbookingMouseMoved(evt);
            }
        });
        getContentPane().add(cancelbooking, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 380, 160, 50));

        cancelbooking1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/HotelReservationSystem/img/SideIcons/CancelBooking1.png"))); // NOI18N
        cancelbooking1.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                cancelbooking1MouseMoved(evt);
            }
        });
        cancelbooking1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cancelbooking1MouseClicked(evt);
            }
        });
        getContentPane().add(cancelbooking1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 380, 160, 50));

        roombooking.setIcon(new javax.swing.ImageIcon(getClass().getResource("/HotelReservationSystem/img/SideIcons/RoomBooking.png"))); // NOI18N
        roombooking.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                roombookingMouseMoved(evt);
            }
        });
        getContentPane().add(roombooking, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 320, 160, 50));

        roombooking1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/HotelReservationSystem/img/SideIcons/RoomBooking1.png"))); // NOI18N
        roombooking1.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                roombooking1MouseMoved(evt);
            }
        });
        roombooking1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                roombooking1MouseClicked(evt);
            }
        });
        getContentPane().add(roombooking1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 320, 160, 50));

        checkout.setIcon(new javax.swing.ImageIcon(getClass().getResource("/HotelReservationSystem/img/SideIcons/Checkout.png"))); // NOI18N
        checkout.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                checkoutMouseMoved(evt);
            }
        });
        getContentPane().add(checkout, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 260, 160, 50));

        checkout1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/HotelReservationSystem/img/SideIcons/Checkout1.png"))); // NOI18N
        checkout1.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                checkout1MouseMoved(evt);
            }
        });
        checkout1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                checkout1MouseClicked(evt);
            }
        });
        getContentPane().add(checkout1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 260, 160, 50));

        checkin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/HotelReservationSystem/img/SideIcons/CheckIn.png"))); // NOI18N
        checkin.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                checkinMouseMoved(evt);
            }
        });
        getContentPane().add(checkin, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 200, 160, 50));

        checkin1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/HotelReservationSystem/img/SideIcons/CheckIn1.png"))); // NOI18N
        checkin1.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                checkin1MouseMoved(evt);
            }
        });
        checkin1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                checkin1MouseClicked(evt);
            }
        });
        getContentPane().add(checkin1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 200, 160, 50));

        checkoutpane.setBackground(new java.awt.Color(0, 0, 0));
        checkoutpane.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 204, 0), 2));
        checkoutpane.setOpaque(true);

        jLabel1.setText("jLabel1");
        checkoutpane.add(jLabel1);
        jLabel1.setBounds(450, 20, 90, 14);

        jLabel9.setBackground(new java.awt.Color(255, 204, 0));
        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("Guests List");
        jLabel9.setOpaque(true);
        checkoutpane.add(jLabel9);
        jLabel9.setBounds(10, 10, 700, 30);

        jTable1.setModel(tbModel);
        jScrollPane2.setViewportView(jTable1);

        checkoutpane.add(jScrollPane2);
        jScrollPane2.setBounds(0, 40, 720, 402);

        getContentPane().add(checkoutpane, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 190, 720, 380));

        todaypane.setBackground(new java.awt.Color(0, 0, 0));
        todaypane.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 204, 0), 2));
        todaypane.setForeground(new java.awt.Color(255, 255, 255));
        todaypane.setOpaque(true);

        timelbl.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        timelbl.setForeground(new java.awt.Color(255, 204, 0));
        timelbl.setText("00:00");
        todaypane.add(timelbl);
        timelbl.setBounds(50, 70, 100, 20);

        datelbl.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        datelbl.setForeground(new java.awt.Color(255, 204, 0));
        datelbl.setText("dd-mm-yyyy");
        todaypane.add(datelbl);
        datelbl.setBounds(50, 40, 100, 20);

        profilelbl9.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        profilelbl9.setForeground(new java.awt.Color(255, 204, 0));
        profilelbl9.setText("Time:");
        todaypane.add(profilelbl9);
        profilelbl9.setBounds(10, 70, 40, 20);

        profilelbl10.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        profilelbl10.setForeground(new java.awt.Color(255, 204, 0));
        profilelbl10.setText("Date:");
        todaypane.add(profilelbl10);
        profilelbl10.setBounds(10, 40, 33, 20);

        profilelbl11.setBackground(new java.awt.Color(0, 0, 0));
        profilelbl11.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        profilelbl11.setForeground(new java.awt.Color(255, 204, 0));
        profilelbl11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        profilelbl11.setText("TODAY IS");
        todaypane.add(profilelbl11);
        profilelbl11.setBounds(10, 7, 140, 20);

        getContentPane().add(todaypane, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 40, 160, 100));

        guestbg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/HotelReservationSystem/img/dashboardbg.png"))); // NOI18N
        guestbg.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                guestbgMouseMoved(evt);
            }
        });
        getContentPane().add(guestbg, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void backlblMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backlblMouseClicked
    MainSystem mainsys = new MainSystem();
    mainsys.setVisible(true);
    GuestsForm.this.dispose();
    }//GEN-LAST:event_backlblMouseClicked

    private void backlblMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backlblMouseMoved
      backlbl.setForeground(new Color(153,153,153));
    }//GEN-LAST:event_backlblMouseMoved

    private void guestbgMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_guestbgMouseMoved
      backlbl.setForeground(new Color(255,255,255));;
      checkin.setVisible(true);
      roombooking.setVisible(true);
      cancelbooking.setVisible(true);
      rooms.setVisible(true);
      checkout.setVisible(true);
     
    }//GEN-LAST:event_guestbgMouseMoved

    private void checkinMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_checkinMouseMoved
        checkin.setVisible(false);
    }//GEN-LAST:event_checkinMouseMoved

    private void checkin1MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_checkin1MouseMoved
        checkin.setVisible(false);
    }//GEN-LAST:event_checkin1MouseMoved

    private void roombookingMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_roombookingMouseMoved
        roombooking.setVisible(false);
    }//GEN-LAST:event_roombookingMouseMoved

    private void roombooking1MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_roombooking1MouseMoved
        roombooking.setVisible(false);
    }//GEN-LAST:event_roombooking1MouseMoved

    private void cancelbookingMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cancelbookingMouseMoved
        cancelbooking.setVisible(false);
    }//GEN-LAST:event_cancelbookingMouseMoved

    private void cancelbooking1MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cancelbooking1MouseMoved
        cancelbooking.setVisible(false);
    }//GEN-LAST:event_cancelbooking1MouseMoved

    private void roomsMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_roomsMouseMoved
        rooms.setVisible(false);
    }//GEN-LAST:event_roomsMouseMoved

    private void rooms1MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rooms1MouseMoved
        rooms.setVisible(false);
    }//GEN-LAST:event_rooms1MouseMoved

    private void guestMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_guestMouseMoved
        guest.setVisible(false);
    }//GEN-LAST:event_guestMouseMoved

    private void checkin1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_checkin1MouseClicked
        CheckInForm checkinfrm = new CheckInForm();
        checkinfrm.setVisible(true);
        GuestsForm.this.dispose();                    
    }//GEN-LAST:event_checkin1MouseClicked

    private void roombooking1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_roombooking1MouseClicked
        RoomBookingForm roombookingfrm = new RoomBookingForm();
        roombookingfrm.setVisible(true);
        GuestsForm.this.dispose();  
    }//GEN-LAST:event_roombooking1MouseClicked

    private void checkoutMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_checkoutMouseMoved
        checkout.setVisible(false);
    }//GEN-LAST:event_checkoutMouseMoved

    private void checkout1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_checkout1MouseClicked
        CheckOutForm checkoutfrm = new CheckOutForm();
        checkoutfrm.setVisible(true);
        GuestsForm.this.dispose();  
    }//GEN-LAST:event_checkout1MouseClicked

    private void checkout1MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_checkout1MouseMoved
        checkout.setVisible(false);
    }//GEN-LAST:event_checkout1MouseMoved

    private void cancelbooking1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cancelbooking1MouseClicked
        CancelBookingForm cancelbookingfrm = new CancelBookingForm();
        cancelbookingfrm.setVisible(true);
        GuestsForm.this.dispose();  
    }//GEN-LAST:event_cancelbooking1MouseClicked

    private void rooms1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rooms1MouseClicked
        RoomsForm roomsfrm = new RoomsForm();
        roomsfrm.setVisible(true);
        GuestsForm.this.dispose();  
    }//GEN-LAST:event_rooms1MouseClicked

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
            java.util.logging.Logger.getLogger(CheckInForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CheckInForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CheckInForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CheckInForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GuestsForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel backlbl;
    private javax.swing.JLabel cancelbooking;
    private javax.swing.JLabel cancelbooking1;
    private javax.swing.JLabel checkin;
    private javax.swing.JLabel checkin1;
    private javax.swing.JLabel checkout;
    private javax.swing.JLabel checkout1;
    private javax.swing.JLayeredPane checkoutpane;
    private javax.swing.JLabel datelbl;
    private javax.swing.JLabel guest;
    private javax.swing.JLabel guestbg;
    private javax.swing.JLabel guests1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel profilelbl10;
    private javax.swing.JLabel profilelbl11;
    private javax.swing.JLabel profilelbl9;
    private javax.swing.JLabel roombooking;
    private javax.swing.JLabel roombooking1;
    private javax.swing.JLabel rooms;
    private javax.swing.JLabel rooms1;
    private javax.swing.JLabel timelbl;
    private javax.swing.JLayeredPane todaypane;
    // End of variables declaration//GEN-END:variables
}
