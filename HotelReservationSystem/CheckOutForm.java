package HotelReservationSystem;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.Timer;
public class CheckOutForm extends ConnectRoomBookingandCheckIn {

  
    public CheckOutForm() {
        initComponents();
        DoConnect();
        showDate();
        showTime();
        checkout.setVisible(false);
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
     private static final SimpleDateFormat sdf3 = new SimpleDateFormat("hh:mm:ss");
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSeparator1 = new javax.swing.JSeparator();
        checkoutpane = new javax.swing.JLayeredPane();
        jLabel9 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        roomnofld = new javax.swing.JTextField();
        cmdcheckout = new javax.swing.JButton();
        cmdclear = new javax.swing.JButton();
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
        todaypane = new javax.swing.JLayeredPane();
        timelbl = new javax.swing.JLabel();
        datelbl = new javax.swing.JLabel();
        profilelbl9 = new javax.swing.JLabel();
        profilelbl10 = new javax.swing.JLabel();
        profilelbl11 = new javax.swing.JLabel();
        checkoutbg = new javax.swing.JLabel();

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
        jLabel9.setText("CHECK OUT");
        jLabel9.setOpaque(true);
        checkoutpane.add(jLabel9);
        jLabel9.setBounds(10, 10, 330, 30);

        jLabel18.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(255, 204, 0));
        jLabel18.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel18.setText("Please enter the Room Number");
        checkoutpane.add(jLabel18);
        jLabel18.setBounds(10, 60, 330, 20);

        jLabel20.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(255, 204, 0));
        jLabel20.setText("Room Number");
        checkoutpane.add(jLabel20);
        jLabel20.setBounds(20, 100, 110, 20);

        roomnofld.setBackground(new java.awt.Color(255, 204, 0));
        roomnofld.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        checkoutpane.add(roomnofld);
        roomnofld.setBounds(140, 100, 190, 23);

        cmdcheckout.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        cmdcheckout.setText("Check Out");
        cmdcheckout.setToolTipText("");
        cmdcheckout.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                cmdcheckoutMouseMoved(evt);
            }
        });
        cmdcheckout.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cmdcheckoutMouseClicked(evt);
            }
        });
        cmdcheckout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdcheckoutActionPerformed(evt);
            }
        });
        checkoutpane.add(cmdcheckout);
        cmdcheckout.setBounds(200, 140, 100, 30);

        cmdclear.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        cmdclear.setText("Clear");
        cmdclear.setToolTipText("");
        cmdclear.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                cmdclearMouseMoved(evt);
            }
        });
        cmdclear.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cmdclearMouseClicked(evt);
            }
        });
        cmdclear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdclearActionPerformed(evt);
            }
        });
        checkoutpane.add(cmdclear);
        cmdclear.setBounds(80, 140, 90, 30);

        getContentPane().add(checkoutpane, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 260, 350, 190));

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
        guests1.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                guests1MouseMoved(evt);
            }
        });
        guests1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                guests1MouseClicked(evt);
            }
        });
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
        getContentPane().add(checkout, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 260, 160, 50));

        checkout1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/HotelReservationSystem/img/SideIcons/Checkout1.png"))); // NOI18N
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

        checkoutbg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/HotelReservationSystem/img/dashboardbg.png"))); // NOI18N
        checkoutbg.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                checkoutbgMouseMoved(evt);
            }
        });
        getContentPane().add(checkoutbg, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void backlblMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backlblMouseClicked
      int response = JOptionPane.showConfirmDialog(this, "The information you have entered will be forfeited. Proceed?","Proceed?",JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE);
        switch (response) {
            case JOptionPane.YES_OPTION:
                 MainSystem mainsys = new MainSystem();
                 mainsys.setVisible(true);
                 CheckOutForm.this.dispose();
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
    }//GEN-LAST:event_backlblMouseClicked

    private void backlblMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backlblMouseMoved
      backlbl.setForeground(new Color(153,153,153));
    }//GEN-LAST:event_backlblMouseMoved

    private void checkoutbgMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_checkoutbgMouseMoved
      backlbl.setForeground(new Color(255,255,255));
      cmdclear.setBackground(new Color(204,153,0));
      cmdcheckout.setBackground(new Color(204,153,0));
      checkin.setVisible(true);
      roombooking.setVisible(true);
      cancelbooking.setVisible(true);
      rooms.setVisible(true);
      guest.setVisible(true);
     
    }//GEN-LAST:event_checkoutbgMouseMoved

    private void cmdcheckoutMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cmdcheckoutMouseMoved
        cmdcheckout.setBackground(new Color(255,204,102));
    }//GEN-LAST:event_cmdcheckoutMouseMoved

    private void cmdcheckoutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cmdcheckoutMouseClicked
        //connection database delete records in CHECK IN DATABASE
    }//GEN-LAST:event_cmdcheckoutMouseClicked

    private void cmdclearMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cmdclearMouseMoved
         cmdclear.setBackground(new Color(255,204,102));
    }//GEN-LAST:event_cmdclearMouseMoved

    private void cmdclearMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cmdclearMouseClicked
        roomnofld.setText(null);
    }//GEN-LAST:event_cmdclearMouseClicked

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

    private void guests1MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_guests1MouseMoved
        guest.setVisible(false);
    }//GEN-LAST:event_guests1MouseMoved

    private void checkin1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_checkin1MouseClicked
        int response = JOptionPane.showConfirmDialog(this, "The information you have entered will be forfeited. Proceed?","Proceed?",JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE);
        switch (response) {
            case JOptionPane.YES_OPTION:
                 CheckInForm checkinfrm = new CheckInForm();
                 checkinfrm.setVisible(true);
                 CheckOutForm.this.dispose();
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
    }//GEN-LAST:event_checkin1MouseClicked

    private void roombooking1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_roombooking1MouseClicked
        int response = JOptionPane.showConfirmDialog(this, "The information you have entered will be forfeited. Proceed?","Proceed?",JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE);
        switch (response) {
            case JOptionPane.YES_OPTION:
                 RoomBookingForm roombookingfrm = new RoomBookingForm();
                 roombookingfrm.setVisible(true);
                 CheckOutForm.this.dispose();
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
    }//GEN-LAST:event_roombooking1MouseClicked

    private void cancelbooking1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cancelbooking1MouseClicked
            int response = JOptionPane.showConfirmDialog(this, "The information you have entered will be forfeited. Proceed?","Proceed?",JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE);
        switch (response) {
            case JOptionPane.YES_OPTION:
                 CancelBookingForm cancelbookingfrm = new CancelBookingForm();
                 cancelbookingfrm.setVisible(true);
                 CheckOutForm.this.dispose();
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
    }//GEN-LAST:event_cancelbooking1MouseClicked

    private void rooms1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rooms1MouseClicked
            int response = JOptionPane.showConfirmDialog(this, "The information you have entered will be forfeited. Proceed?","Proceed?",JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE);
        switch (response) {
            case JOptionPane.YES_OPTION:
                 RoomsForm roomsfrm = new RoomsForm();
                 roomsfrm.setVisible(true);
                 CheckOutForm.this.dispose();
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
    }//GEN-LAST:event_rooms1MouseClicked

    private void guests1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_guests1MouseClicked
            int response = JOptionPane.showConfirmDialog(this, "The information you have entered will be forfeited. Proceed?","Proceed?",JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE);
        switch (response) {
            case JOptionPane.YES_OPTION:
                 GuestsForm guestfrm = new GuestsForm();
                 guestfrm.setVisible(true);
                 CheckOutForm.this.dispose();
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
    }//GEN-LAST:event_guests1MouseClicked

    private void cmdclearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdclearActionPerformed
        roomnofld.setText(null);
    }//GEN-LAST:event_cmdclearActionPerformed

    private void cmdcheckoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdcheckoutActionPerformed
        Timestamp timestamp = new Timestamp(System.currentTimeMillis());
        int roomNoInput = Integer.valueOf(roomnofld.getText());
        try{
            int roomNoDataBaseCheckIn = 0;
            int iteratorcheck = 0;
            checkinloop:
            while(rsCheckIn.next()){
                iteratorcheck++;
                roomNoDataBaseCheckIn = rsCheckIn.getInt("ROOMNO");
                if(roomNoInput == roomNoDataBaseCheckIn){
                    Date checkinDate = rsCheckIn.getDate("CHECKINDATE");
                    Date checkoutDate = rsCheckIn.getDate("CHECKOUTDATE");
                    rsCheckIn.deleteRow();
                    JOptionPane.showMessageDialog(null, "Room has been checked out");
                    Refresh_RSCHECKIN_STMT ();
                    
                    while(prs.next()){
                    Date cot = prs.getTimestamp("CHECKOUTTIME");
                    if(roomNoInput == roomNoDataBaseCheckIn && cot == null){
                        prs.updateTimestamp("CHECKOUTTIME", timestamp);
                        prs.updateRow();
                 
             }
                }
      
                    while (rsRoomBooking.next()){
                        int roomBookingNumner = rsRoomBooking.getInt("ROOMNO");
                        Date checkinDateRoomBooking = rsRoomBooking.getDate("CHECKINDATE");
                        Date checkoutDateRoomBooking = rsRoomBooking.getDate("CHECKOUTDATE");
                        if((roomNoDataBaseCheckIn == roomBookingNumner) && (checkinDate.equals(checkinDateRoomBooking)) && (checkoutDate.equals(checkoutDateRoomBooking))){
                            rsRoomBooking.deleteRow();
                            Refresh_RSROOMBOOKING_STMT ();
                        }
                    }
                    break checkinloop;
                }
            }
            if (iteratorcheck == 0){
                JOptionPane.showMessageDialog(null, "No rooms with "+ roomNoInput+ " are currently checked in.");
            }
            
            Refresh_RSROOMBOOKING_STMT ();
            Refresh_RSCHECKIN_STMT ();
            
            
              Refresh_PAST_STMT();
        }catch(SQLException err){
            JOptionPane.showMessageDialog(CheckOutForm.this, err.getMessage());
        }
    }//GEN-LAST:event_cmdcheckoutActionPerformed

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
                new CheckOutForm().setVisible(true);
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
    private javax.swing.JLabel checkoutbg;
    private javax.swing.JLayeredPane checkoutpane;
    private javax.swing.JButton cmdcheckout;
    private javax.swing.JButton cmdclear;
    private javax.swing.JLabel datelbl;
    private javax.swing.JLabel guest;
    private javax.swing.JLabel guests1;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel profilelbl10;
    private javax.swing.JLabel profilelbl11;
    private javax.swing.JLabel profilelbl9;
    private javax.swing.JLabel roombooking;
    private javax.swing.JLabel roombooking1;
    private javax.swing.JTextField roomnofld;
    private javax.swing.JLabel rooms;
    private javax.swing.JLabel rooms1;
    private javax.swing.JLabel timelbl;
    private javax.swing.JLayeredPane todaypane;
    // End of variables declaration//GEN-END:variables
}
