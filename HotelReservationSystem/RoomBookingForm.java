
package HotelReservationSystem;
import java.text.DateFormat;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.Timer;


public class RoomBookingForm extends ConnectRoomBookingForm {
    public RoomBookingForm() {
        initComponents();
        Date date=java.util.Calendar.getInstance().getTime();
        checkindate.setDate(date);
        checkindate.setMinSelectableDate(date);
        checkoutdate.setMinSelectableDate(date);
        DoConnect();
        showDate();
        showTime();
        roomtype.setBackground(new Color(204,153,0));
        cmdsearch.setBackground(new Color(204,153,0));
        cmdclear.setBackground(new Color(204,153,0));
        cmdsubmit.setBackground(new Color(204,153,0));
        roombooking.setVisible(false);
           
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
        roomdata = new javax.swing.JLayeredPane();
        roomnolbl = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        roomtype = new javax.swing.JComboBox<>();
        jLabel13 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        cmdsearch = new javax.swing.JButton();
        checkoutdate = new com.toedter.calendar.JDateChooser();
        checkindate = new com.toedter.calendar.JDateChooser();
        roomdetails = new javax.swing.JLayeredPane();
        jLabel1 = new javax.swing.JLabel();
        hotelpics = new javax.swing.JLabel();
        flexibleratelbl = new javax.swing.JLabel();
        roomtypelbl1 = new javax.swing.JLabel();
        roomtypelbl = new javax.swing.JLabel();
        descriptionlbl = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        cmdsubmit = new javax.swing.JButton();
        cmdclear = new javax.swing.JButton();
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
        intialinformation = new javax.swing.JLayeredPane();
        jLabel11 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        emailfld = new javax.swing.JTextField();
        phonefld = new javax.swing.JTextField();
        namefld = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        todaypane = new javax.swing.JLayeredPane();
        timelbl = new javax.swing.JLabel();
        datelbl = new javax.swing.JLabel();
        profilelbl9 = new javax.swing.JLabel();
        profilelbl10 = new javax.swing.JLabel();
        profilelbl11 = new javax.swing.JLabel();
        checkinbg = new javax.swing.JLabel();

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

        roomdata.setBackground(new java.awt.Color(0, 0, 0));
        roomdata.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 204, 0), 2));
        roomdata.setOpaque(true);

        roomnolbl.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        roomnolbl.setForeground(new java.awt.Color(153, 255, 51));
        roomnolbl.setText("0");
        roomdata.add(roomnolbl);
        roomnolbl.setBounds(110, 180, 30, 20);

        jLabel12.setBackground(new java.awt.Color(255, 204, 0));
        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setText("Preferred Room");
        jLabel12.setOpaque(true);
        roomdata.add(jLabel12);
        jLabel12.setBounds(10, 10, 340, 30);

        roomtype.setBackground(new java.awt.Color(255, 204, 102));
        roomtype.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        roomtype.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Deluxe", "Premium", "Executive", "Diplomatic", "Presidential" }));
        roomtype.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                roomtypeActionPerformed(evt);
            }
        });
        roomdata.add(roomtype);
        roomtype.setBounds(160, 50, 160, 30);

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 204, 0));
        jLabel13.setText("Room Type");
        roomdata.add(jLabel13);
        jLabel13.setBounds(20, 50, 90, 30);

        jLabel15.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 204, 0));
        jLabel15.setText("Check in date");
        roomdata.add(jLabel15);
        jLabel15.setBounds(20, 90, 100, 30);

        jLabel16.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 204, 0));
        jLabel16.setText("Check out date");
        roomdata.add(jLabel16);
        jLabel16.setBounds(20, 130, 110, 30);

        jLabel17.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 204, 0));
        jLabel17.setText("Room No");
        roomdata.add(jLabel17);
        jLabel17.setBounds(20, 180, 80, 20);

        cmdsearch.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        cmdsearch.setText("Search");
        cmdsearch.setToolTipText("");
        cmdsearch.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                cmdsearchMouseMoved(evt);
            }
        });
        cmdsearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdsearchActionPerformed(evt);
            }
        });
        roomdata.add(cmdsearch);
        cmdsearch.setBounds(190, 170, 80, 30);

        checkoutdate.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        checkoutdate.setMaxSelectableDate(new java.util.Date(253402286399000L));
        checkoutdate.setMinSelectableDate(new java.util.Date(1609488000000L));
        roomdata.add(checkoutdate);
        checkoutdate.setBounds(160, 130, 160, 30);

        checkindate.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        checkindate.setMaxSelectableDate(new java.util.Date(253402286399000L));
        checkindate.setMinSelectableDate(new java.util.Date(1609488000000L));
        roomdata.add(checkindate);
        checkindate.setBounds(160, 90, 160, 30);

        getContentPane().add(roomdata, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 370, 360, 210));

        roomdetails.setBackground(new java.awt.Color(0, 0, 0));
        roomdetails.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 204, 0), 2));
        roomdetails.setOpaque(true);

        jLabel1.setBackground(new java.awt.Color(255, 204, 0));
        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Room Details");
        jLabel1.setOpaque(true);
        roomdetails.add(jLabel1);
        jLabel1.setBounds(10, 10, 340, 30);

        hotelpics.setIcon(new javax.swing.ImageIcon(getClass().getResource("/HotelReservationSystem/img/Rooms/deluxe.png"))); // NOI18N
        roomdetails.add(hotelpics);
        hotelpics.setBounds(10, 60, 170, 100);

        flexibleratelbl.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        flexibleratelbl.setForeground(new java.awt.Color(255, 204, 0));
        flexibleratelbl.setText("Flexible Rate: 6199.00");
        roomdetails.add(flexibleratelbl);
        flexibleratelbl.setBounds(190, 100, 160, 20);

        roomtypelbl1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        roomtypelbl1.setForeground(new java.awt.Color(255, 204, 0));
        roomtypelbl1.setText("per night");
        roomdetails.add(roomtypelbl1);
        roomtypelbl1.setBounds(190, 130, 70, 20);

        roomtypelbl.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        roomtypelbl.setForeground(new java.awt.Color(255, 204, 0));
        roomtypelbl.setText("East Deluxe Room");
        roomdetails.add(roomtypelbl);
        roomtypelbl.setBounds(190, 70, 160, 20);

        descriptionlbl.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        descriptionlbl.setForeground(new java.awt.Color(255, 204, 0));
        descriptionlbl.setText("<html> Standard Package:  <br> - 3 person (Family Room) <br> - 40 square meter room <br> - 42 inch TV with Bluetooth enabled speaker <br> - Standard Wifi <br> - Mini Refrigerator <br> - Separate Shower and Toilet Area <br> - Scald-proof shower <br> - Seating Area with Sofa <br> - Individually Controlled Air Conditioning </html)");
        roomdetails.add(descriptionlbl);
        descriptionlbl.setBounds(10, 200, 340, 170);

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 204, 0));
        jLabel14.setText("Room Description:");
        roomdetails.add(jLabel14);
        jLabel14.setBounds(10, 170, 130, 30);

        getContentPane().add(roomdetails, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 180, 360, 380));

        cmdsubmit.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        cmdsubmit.setText("Submit");
        cmdsubmit.setToolTipText("");
        cmdsubmit.setEnabled(false);
        cmdsubmit.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                cmdsubmitMouseMoved(evt);
            }
        });
        cmdsubmit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cmdsubmitMouseClicked(evt);
            }
        });
        cmdsubmit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdsubmitActionPerformed(evt);
            }
        });
        getContentPane().add(cmdsubmit, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 570, 90, 30));

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
        getContentPane().add(cmdclear, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 570, 90, 30));

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
        getContentPane().add(roombooking, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 320, 160, 50));

        roombooking1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/HotelReservationSystem/img/SideIcons/RoomBooking1.png"))); // NOI18N
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

        intialinformation.setBackground(new java.awt.Color(0, 0, 0));
        intialinformation.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 204, 0), 2));
        intialinformation.setOpaque(true);

        jLabel11.setBackground(new java.awt.Color(255, 204, 0));
        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setText("Initial Information");
        jLabel11.setOpaque(true);
        intialinformation.add(jLabel11);
        jLabel11.setBounds(10, 10, 340, 30);

        jLabel18.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(255, 204, 0));
        jLabel18.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel18.setText("Welcome to EastCity Hotel. Please fill in the below info.");
        intialinformation.add(jLabel18);
        jLabel18.setBounds(10, 50, 340, 20);

        emailfld.setBackground(new java.awt.Color(255, 204, 0));
        emailfld.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        intialinformation.add(emailfld);
        emailfld.setBounds(130, 140, 210, 23);

        phonefld.setBackground(new java.awt.Color(255, 204, 0));
        phonefld.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        intialinformation.add(phonefld);
        phonefld.setBounds(130, 110, 210, 23);

        namefld.setBackground(new java.awt.Color(255, 204, 0));
        namefld.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        intialinformation.add(namefld);
        namefld.setBounds(130, 80, 210, 23);

        jLabel19.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(255, 204, 0));
        jLabel19.setText("Phone");
        intialinformation.add(jLabel19);
        jLabel19.setBounds(20, 110, 50, 20);

        jLabel20.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(255, 204, 0));
        jLabel20.setText("Email");
        intialinformation.add(jLabel20);
        jLabel20.setBounds(20, 140, 50, 20);

        jLabel24.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(255, 204, 0));
        jLabel24.setText("Name");
        intialinformation.add(jLabel24);
        jLabel24.setBounds(20, 80, 50, 20);

        getContentPane().add(intialinformation, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 180, 360, 180));

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

        checkinbg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/HotelReservationSystem/img/dashboardbg.png"))); // NOI18N
        checkinbg.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                checkinbgMouseMoved(evt);
            }
        });
        getContentPane().add(checkinbg, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void backlblMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backlblMouseClicked
        int response = JOptionPane.showConfirmDialog(this, "The information you have entered will be forfeited. Proceed?","Proceed?",JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE);
        switch (response) {
            case JOptionPane.YES_OPTION:
                 MainSystem mainsys = new MainSystem();
                 mainsys.setVisible(true);
                 RoomBookingForm.this.dispose();
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

    private void checkinbgMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_checkinbgMouseMoved
      backlbl.setForeground(new Color(255,255,255));
      cmdsearch.setBackground(new Color(204,153,0));
      cmdclear.setBackground(new Color(204,153,0));
      cmdsubmit.setBackground(new Color(204,153,0));
      checkout.setVisible(true);
      checkin.setVisible(true);
      cancelbooking.setVisible(true);
      rooms.setVisible(true);
      guest.setVisible(true);
    }//GEN-LAST:event_checkinbgMouseMoved

    private void cmdsearchMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cmdsearchMouseMoved
      cmdsearch.setBackground(new Color(255,204,102));
    }//GEN-LAST:event_cmdsearchMouseMoved

    private void cmdsubmitMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cmdsubmitMouseMoved
      cmdsubmit.setBackground(new Color(255,204,102));
    }//GEN-LAST:event_cmdsubmitMouseMoved

    private void cmdclearMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cmdclearMouseMoved
      cmdclear.setBackground(new Color(255,204,102));
    }//GEN-LAST:event_cmdclearMouseMoved

    private void cmdclearMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cmdclearMouseClicked
      roomtype.setSelectedIndex(0);
      roomnolbl.setText("0");
      namefld.setText(null);
      phonefld.setText(null);
      emailfld.setText(null);
      Date date=java.util.Calendar.getInstance().getTime();
      cmdsubmit.setEnabled(false);
      checkindate.setDate(date);
      checkindate.setMinSelectableDate(date);
      checkoutdate.setMinSelectableDate(date);
      checkoutdate.setCalendar(null);
    }//GEN-LAST:event_cmdclearMouseClicked

    private void cmdclearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdclearActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmdclearActionPerformed

    private void cmdsubmitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cmdsubmitMouseClicked

    }//GEN-LAST:event_cmdsubmitMouseClicked

    private void checkoutMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_checkoutMouseMoved
         checkout.setVisible(false);
    }//GEN-LAST:event_checkoutMouseMoved

    private void cancelbookingMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cancelbookingMouseMoved
        cancelbooking.setVisible(false);
    }//GEN-LAST:event_cancelbookingMouseMoved

    private void roomsMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_roomsMouseMoved
        rooms.setVisible(false);
    }//GEN-LAST:event_roomsMouseMoved

    private void guestMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_guestMouseMoved
        guest.setVisible(false);
    }//GEN-LAST:event_guestMouseMoved

    private void checkout1MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_checkout1MouseMoved
        checkout.setVisible(false);
    }//GEN-LAST:event_checkout1MouseMoved

    private void cancelbooking1MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cancelbooking1MouseMoved
        cancelbooking.setVisible(false);
    }//GEN-LAST:event_cancelbooking1MouseMoved

    private void rooms1MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rooms1MouseMoved
        rooms.setVisible(false);
    }//GEN-LAST:event_rooms1MouseMoved

    private void guests1MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_guests1MouseMoved
        guest.setVisible(false);
    }//GEN-LAST:event_guests1MouseMoved

    private void checkout1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_checkout1MouseClicked
         int response = JOptionPane.showConfirmDialog(this, "The information you have entered will be forfeited. Proceed?","Proceed?",JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE);
        switch (response) {
            case JOptionPane.YES_OPTION:
                 CheckOutForm checkoutfrm = new CheckOutForm();
                 checkoutfrm.setVisible(true);
                 RoomBookingForm.this.dispose();
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
    }//GEN-LAST:event_checkout1MouseClicked

    private void checkinMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_checkinMouseMoved
        checkin.setVisible(false);
    }//GEN-LAST:event_checkinMouseMoved

    private void checkin1MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_checkin1MouseMoved
        checkin.setVisible(false);
    }//GEN-LAST:event_checkin1MouseMoved

    private void checkin1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_checkin1MouseClicked
         int response = JOptionPane.showConfirmDialog(this, "The information you have entered will be forfeited. Proceed?","Proceed?",JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE);
        switch (response) {
            case JOptionPane.YES_OPTION:
                 CheckInForm checkinfrm = new CheckInForm();
                 checkinfrm.setVisible(true);
                 RoomBookingForm.this.dispose();
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

    private void roomtypeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_roomtypeActionPerformed
       if(roomtype.getSelectedIndex()==0) {
       ImageIcon img = new ImageIcon("src/HotelReservationSystem/img/Rooms/deluxe.png");
       hotelpics.setIcon(img); 
       roomtypelbl.setText("East Deluxe Room");
       flexibleratelbl.setText("Flexible Rate: 6199.00");
       descriptionlbl.setText("<html> Standard Package:  <br> - 2-3 person (Family Room) <br> - 40 square meter room <br> - 42 inch TV with Bluetooth enabled speaker <br> - Standard Wifi <br> - Mini Refrigerator <br> - Separate Shower and Toilet Area <br> - Scald-proof shower <br> - Seating Area with Sofa <br> - Individually Controlled Air Conditioning </html)");
       }
       
       else if(roomtype.getSelectedIndex()==1){
       ImageIcon img = new ImageIcon("src/HotelReservationSystem/img/Rooms/premium.png");
       hotelpics.setIcon(img); 
       roomtypelbl.setText("East Premium Room");
       flexibleratelbl.setText("Flexible Rate: 8050.00");
       descriptionlbl.setText("<html> Standard Package:  <br> - 2-3 person (Family Room) <br> - 60 square meter room <br> - 42 inch TV with Bluetooth enabled speaker <br> - Standard Wifi <br> - Mini Refrigerator <br> - Separate Shower and Toilet Area <br> - Scald-proof shower <br> - Seating Area with Sofa <br> - Individually Controlled Air Conditioning <br> - City/Garden/Pool Ocean View </html)");
       }
       
       else if(roomtype.getSelectedIndex()==2){
       ImageIcon img = new ImageIcon("src/HotelReservationSystem/img/Rooms/executive.png");
       hotelpics.setIcon(img); 
        roomtypelbl.setText("East Executive Room");
       flexibleratelbl.setText("Flexible Rate: 10805.00");
       descriptionlbl.setText("<html> - 4 to 6 person (Family Room) <br> - 60 square meter room <br> - Exclusive Access to Executive Lounge: <br> - Check-In and Check-Out Express <br> - Complimentary Breakfast Buffets <br> - Refreshments throughout the day <br> - Scald-Proof Tub <br> - High Floor Area <br> - Standard Package </html>");
       }
       
       else if(roomtype.getSelectedIndex()==3){
       ImageIcon img = new ImageIcon("src/HotelReservationSystem/img/Rooms/diplomatic.png");
       hotelpics.setIcon(img); 
       roomtypelbl.setText("Diplomatic Suite");
       flexibleratelbl.setText("Flexible Rate: 14410.00");
       descriptionlbl.setText("<html> - 7 to 9 person capacity <br> - 95 square meter room <br> - Exclusive Access to the Executive Lounge: <br> - Check-In and Check-Out Express <br> - Complimentary Breakfast Buffets <br> - Refreshments throughout the day <br> - Separate Bathtub <br> - Separate Shower <br> - Separate Toilet Area <br> - Standard Package </html>");
       }
       
       else if(roomtype.getSelectedIndex()==4){
       ImageIcon img = new ImageIcon("src/HotelReservationSystem/img/Rooms/presidential.png");
       hotelpics.setIcon(img); 
       roomtypelbl.setText("Presidential Suite");
       flexibleratelbl.setText("Flexible Rate: 268,199.00");
       descriptionlbl.setText("<html> - 10 to 12 person capacity <br> - 1100 square meter room <br> - Private Terrace, Pool and a Whirlpool <br> - Personal Butler will be available <br> - Exclusive Access to the Executive Lounge: <br> - Check-In and Check-Out Express <br> - Complimentary Breakfast Buffets <br> - Refreshments throughout the day <br> - Dining Table <br> - Separate Bathtub, Shower and Toilet Area <br> - Standard Package </html>");
       }
       
    }//GEN-LAST:event_roomtypeActionPerformed

    private void cancelbooking1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cancelbooking1MouseClicked
           int response = JOptionPane.showConfirmDialog(this, "The information you have entered will be forfeited. Proceed?","Proceed?",JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE);
        switch (response) {
            case JOptionPane.YES_OPTION:
                 CancelBookingForm cancelbookingfrm = new CancelBookingForm();
                 cancelbookingfrm.setVisible(true);
                 RoomBookingForm.this.dispose();
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
                 RoomBookingForm.this.dispose();
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
                 RoomBookingForm.this.dispose();
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

    private void cmdsearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdsearchActionPerformed
        try{
             boolean valuen =! namefld.getText().trim().isEmpty();
        boolean valuee =! emailfld.getText().trim().isEmpty();
        boolean valuep =! phonefld.getText().trim().isEmpty();
        if (valuen != true){ 
        JOptionPane.showMessageDialog(null, "please fill up name first");}       
            else if(valuep!=true){
            JOptionPane.showMessageDialog(null, "please fill up phone first");}
                else if(valuee!=true){
                JOptionPane.showMessageDialog(null, "please fill up email first");
                }
               
        if (valuen!= false){
         if (valuee!=false){
            if(valuep!=false){
                
                 
        Date checkInInput = checkindate.getDate();
            Date checkOutInput = checkoutdate.getDate();
            if((checkInInput == null) || (checkOutInput == null) ){
            JOptionPane.showMessageDialog(null, "please input date", "warning", JOptionPane.ERROR_MESSAGE);
            return;
        }
            if(checkInInput.after(checkOutInput)){
            JOptionPane.showMessageDialog(null, "Please make sure the check in date is before the checkout date");
            return;
        }
            String roomType = String.valueOf(roomtype.getSelectedItem());
            int iteratorCheck = 0;
            if (roomType.equals("Deluxe")){
                int[] roomTypeArray = {101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112};
                outerloop:
                for (int i = 0; i < roomTypeArray.length; i++) {
                    boolean breakChecker = false;
                    int tempRoom = roomTypeArray[i];

                    
                    while(rs.next()){
                        iteratorCheck = iteratorCheck + 1;
                        int dataBaseRoomNumber = rs.getInt("ROOMNO");
                        boolean lastChecker = rs.isLast();

                        
                        if (tempRoom == dataBaseRoomNumber) {
                            Date dataBaseCheckIn = rs.getDate("CHECKINDATE");
                            Date dataBaseCheckOut = rs.getDate("CHECKOUTDATE");
                            if (checkInInput.after(dataBaseCheckOut)) {
                                continue;
                            }
                            else{
                                if(checkOutInput.before(dataBaseCheckIn)){
                                    continue;
                                }
                                else{
                                    Refresh_RS_STMT();
                                    break;
                                }
                            }
                        }
                        if (lastChecker){
                            JOptionPane.showMessageDialog(null, "We have found a room for you, your room number is: " + roomTypeArray[i]);
                            roomnolbl.setText(String.valueOf(roomTypeArray[i]));
                            cmdsubmit.setEnabled(true);
                            Refresh_RS_STMT();
                            break outerloop;
                            //bibigay yung room number
                        }
                    }
                    if (iteratorCheck == 0){
                        JOptionPane.showMessageDialog(null, "You are the first to have checked in, welcome");
                        //bibigay yung room number
                        JOptionPane.showMessageDialog(null, "Your Room Number is: " + roomTypeArray[i]);
                         roomnolbl.setText(String.valueOf(roomTypeArray[i]));
                         Refresh_RS_STMT();
                         cmdsubmit.setEnabled(true);
                        break;
                    }

                    if ((i + 1) == roomTypeArray.length ){
                        checkindate.setDate(null);
                        checkoutdate.setDate(null);
                        roomnolbl.setText(null);
                        roomtype.setSelectedItem(null);
                        JOptionPane.showMessageDialog(null, "Sorry, no rooms are available for your inputted roomtype and checkin and checkout dates");
                    }
                    
                }
            }
            else if (roomType.equals("Premium")){
                int[] roomTypeArray = {201, 202, 203, 204, 205, 206, 207, 208};
                outerloop:
                for (int i = 0; i < roomTypeArray.length; i++) {
                    boolean breakChecker = false;
                    int tempRoom = roomTypeArray[i];

                    
                    while(rs.next()){
                        iteratorCheck = iteratorCheck + 1;
                        int dataBaseRoomNumber = rs.getInt("ROOMNO");
                        boolean lastChecker = rs.isLast();

                        
                        if (tempRoom == dataBaseRoomNumber) {
                            Date dataBaseCheckIn = rs.getDate("CHECKINDATE");
                            Date dataBaseCheckOut = rs.getDate("CHECKOUTDATE");
                            if (checkInInput.after(dataBaseCheckOut)) {
                                continue;
                            }
                            else{
                                if(checkOutInput.before(dataBaseCheckIn)){
                                    continue;
                                }
                                else{
                                    Refresh_RS_STMT();
                                    break;
                                }
                            }
                        }
                        if (lastChecker){
                            JOptionPane.showMessageDialog(null, "We have found a room for you, your room number is: " + roomTypeArray[i]);
                            roomnolbl.setText(String.valueOf(roomTypeArray[i]));
                            cmdsubmit.setEnabled(true);
                            Refresh_RS_STMT();
                            break outerloop;
                            //bibigay yung room number
                        }
                    }
                    if (iteratorCheck == 0){
                        JOptionPane.showMessageDialog(null, "You are the first to have checked in, welcome");
                        //bibigay yung room number
                        JOptionPane.showMessageDialog(null, "Your Room Number is: " + roomTypeArray[i]);
                        roomnolbl.setText(String.valueOf(roomTypeArray[i]));
                        cmdsubmit.setEnabled(true);
                        Refresh_RS_STMT();
                        break;
                    }

                    if ((i + 1) == roomTypeArray.length ){
                        checkindate.setDate(null);
                        checkoutdate.setDate(null);
                        roomnolbl.setText(null);
                        roomtype.setSelectedItem(null);
                        JOptionPane.showMessageDialog(null, "Sorry, no rooms are available for your inputted roomtype and checkin and checkout dates");
                    }
                }
            }    
            else if (roomType.equals("Executive")){
                int[] roomTypeArray = {301, 302, 303, 304, 305};
                outerloop:
                for (int i = 0; i < roomTypeArray.length; i++) {
                    boolean breakChecker = false;
                    int tempRoom = roomTypeArray[i];

                    
                    while(rs.next()){
                        iteratorCheck = iteratorCheck + 1;
                        int dataBaseRoomNumber = rs.getInt("ROOMNO");
                        boolean lastChecker = rs.isLast();

                        
                        if (tempRoom == dataBaseRoomNumber) {
                            Date dataBaseCheckIn = rs.getDate("CHECKINDATE");
                            Date dataBaseCheckOut = rs.getDate("CHECKOUTDATE");
                            if (checkInInput.after(dataBaseCheckOut)) {
                                continue;
                            }
                            else{
                                if(checkOutInput.before(dataBaseCheckIn)){
                                    continue;
                                }
                                else{
                                    Refresh_RS_STMT();
                                    break;
                                }
                            }
                        }
                        if (lastChecker){
                            JOptionPane.showMessageDialog(null, "We have found a room for you, your room number is: " + roomTypeArray[i]);
                            roomnolbl.setText(String.valueOf(roomTypeArray[i]));
                            Refresh_RS_STMT();
                            cmdsubmit.setEnabled(true);
                            break outerloop;
                            //bibigay yung room number
                        }
                    }
                    if (iteratorCheck == 0){
                        JOptionPane.showMessageDialog(null, "You are the first to have checked in, welcome");
                        //bibigay yung room number
                        JOptionPane.showMessageDialog(null, "Your Room Number is: " + roomTypeArray[i]);
                        Refresh_RS_STMT();
                        cmdsubmit.setEnabled(true);
                        roomnolbl.setText(String.valueOf(roomTypeArray[i]));
                        break;
                    }

                    if ((i + 1) == roomTypeArray.length ){
                        checkindate.setDate(null);
                        checkoutdate.setDate(null);
                        roomnolbl.setText(null);
                        roomtype.setSelectedItem(null);
                        JOptionPane.showMessageDialog(null, "Sorry, no rooms are available for your inputted roomtype and checkin and checkout dates");
                    }
                }
            }
            else if (roomType.equals("Diplomatic")){
                int[] roomTypeArray = {401, 402, 403};
                outerloop:
                for (int i = 0; i < roomTypeArray.length; i++) {
                    boolean breakChecker = false;
                    int tempRoom = roomTypeArray[i];

                    
                    while(rs.next()){
                        iteratorCheck = iteratorCheck + 1;
                        int dataBaseRoomNumber = rs.getInt("ROOMNO");
                        boolean lastChecker = rs.isLast();

                        
                        if (tempRoom == dataBaseRoomNumber) {
                            Date dataBaseCheckIn = rs.getDate("CHECKINDATE");
                            Date dataBaseCheckOut = rs.getDate("CHECKOUTDATE");
                            if (checkInInput.after(dataBaseCheckOut)) {
                                continue;
                            }
                            else{
                                if(checkOutInput.before(dataBaseCheckIn)){
                                    continue;
                                }
                                else{
                                    Refresh_RS_STMT();
                                    break;
                                }
                            }
                        }
                        if (lastChecker){
                            JOptionPane.showMessageDialog(null, "We have found a room for you, your room number is: " + roomTypeArray[i]);
                            roomnolbl.setText(String.valueOf(roomTypeArray[i]));
                            cmdsubmit.setEnabled(true);
                            Refresh_RS_STMT();
                            break outerloop;
                            //bibigay yung room number
                        }
                    }
                    if (iteratorCheck == 0){
                        JOptionPane.showMessageDialog(null, "You are the first to have checked in, welcome");
                        //bibigay yung room number
                        JOptionPane.showMessageDialog(null, "Your Room Number is: " + roomTypeArray[i]);
                        cmdsubmit.setEnabled(true);
                        roomnolbl.setText(String.valueOf(roomTypeArray[i]));
                        Refresh_RS_STMT();
                        break;
                    }

                    if ((i + 1) == roomTypeArray.length ){
                        checkindate.setDate(null);
                        checkoutdate.setDate(null);
                        roomnolbl.setText(null);
                        roomtype.setSelectedItem(null);
                        JOptionPane.showMessageDialog(null, "Sorry, no rooms are available for your inputted roomtype and checkin and checkout dates");
                    }
                }
            }
            else if (roomType.equals("Presidential")){
                int[] roomTypeArray = {501, 502};
                outerloop:
                for (int i = 0; i < roomTypeArray.length; i++) {
                    boolean breakChecker = false;
                    int tempRoom = roomTypeArray[i];

                    
                    while(rs.next()){
                        iteratorCheck = iteratorCheck + 1;
                        int dataBaseRoomNumber = rs.getInt("ROOMNO");
                        boolean lastChecker = rs.isLast();

                        
                        if (tempRoom == dataBaseRoomNumber) {
                            Date dataBaseCheckIn = rs.getDate("CHECKINDATE");
                            Date dataBaseCheckOut = rs.getDate("CHECKOUTDATE");
                            if (checkInInput.after(dataBaseCheckOut)) {
                                continue;
                            }
                            else{
                                if(checkOutInput.before(dataBaseCheckIn)){
                                    continue;
                                }
                                else{
                                    Refresh_RS_STMT();
                                    break;
                                }
                            }
                        }
                        if (lastChecker){
                            JOptionPane.showMessageDialog(null, "We have found a room for you, your room number is: " + roomTypeArray[i]);
                            roomnolbl.setText(String.valueOf(roomTypeArray[i]));
                            cmdsubmit.setEnabled(true);
                            Refresh_RS_STMT();
                            break outerloop;
                            //bibigay yung room number
                        }
                    }
                    if (iteratorCheck == 0){
                        JOptionPane.showMessageDialog(null, "You are the first to have checked in, welcome");
                        //bibigay yung room number
                        JOptionPane.showMessageDialog(null, "Your Room Number is: " + roomTypeArray[i]);
                        roomnolbl.setText(String.valueOf(roomTypeArray[i]));
                        cmdsubmit.setEnabled(true);
                        Refresh_RS_STMT();
                        break;
                    }

                    if ((i + 1) == roomTypeArray.length ){
                        checkindate.setDate(null);
                        checkoutdate.setDate(null);
                        roomnolbl.setText(null);
                        roomtype.setSelectedItem(null);
                        JOptionPane.showMessageDialog(null, "Sorry, no rooms are available for your inputted roomtype and checkin and checkout dates");
                    }
                }
            }}}}
        Refresh_RS_STMT();
        }catch(SQLException err){
        JOptionPane.showMessageDialog(null,"Check In and Check Out date must be indicated properly","Error",JOptionPane.ERROR_MESSAGE);
                                       
        
        }
    }//GEN-LAST:event_cmdsearchActionPerformed

    private void cmdsubmitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdsubmitActionPerformed
        String alphabet = "123456789abcdefghijklmnpqrstuvwxyzABCDEFGHIJKLMNPQRSTUVWXYZ";
        int N = alphabet.length();

        Random r = new Random();

        String text = "";
    for (int i = 0; i < 8; i++) {
       text += String.valueOf(alphabet.charAt(r.nextInt(N))); 
       
        }
        cmdsubmit.setEnabled(false);
    String names=namefld.getText();
    String phones=phonefld.getText();
    String emails=emailfld.getText();
    String roomtypes=roomnolbl.getText();
    String roomtypec=String.valueOf(roomtype.getSelectedItem());
    Date checkInInput = checkindate.getDate();
    Date checkOutInput = checkoutdate.getDate();
    try{       
        while(rs.next()){

                        
                        String dataBaseReservationCode = rs.getString("RESERVECODE");
                        boolean lastChecker = rs.isLast();


		if (dataBaseReservationCode != text) {
                    rs.updateString("RESERVECODE", text);
                    break;
                    
                }else
                    continue;
                
                    }
        
    rs.moveToInsertRow();
    rs.updateString("RESERVECODE", text);
    rs.updateString("NAME",names);
    rs.updateString("PHONE", phones);   
    rs.updateString("EMAIL",emails);
    rs.updateString("ROOMTYPE",roomtypec);
    rs.updateString("ROOMNO",roomtypes );
    rs.updateString("STATUS", "BOOKED");
    java.sql.Date checkInInputDataBase = new java.sql.Date(checkInInput.getTime());
    rs.updateDate("CHECKINDATE",checkInInputDataBase);
    java.sql.Date checkOutInputDataBase = new java.sql.Date(checkOutInput.getTime());
    rs.updateDate("CHECKOUTDATE",checkOutInputDataBase);
    rs.insertRow();
    Refresh_RS_STMT();
    
    JOptionPane.showMessageDialog(RoomBookingForm.this, "You already reserved!");
    JOptionPane.showMessageDialog(null, "Your ReservationCode is: " + text);
    RoomBookingForm.this.dispose();
    MainSystem mainsys = new MainSystem();
    mainsys.setVisible(true);
    }catch(SQLException err){
        System.out.println(err.getMessage());
        }
    }//GEN-LAST:event_cmdsubmitActionPerformed

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
                new RoomBookingForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel backlbl;
    private javax.swing.JLabel cancelbooking;
    private javax.swing.JLabel cancelbooking1;
    private javax.swing.JLabel checkin;
    private javax.swing.JLabel checkin1;
    private javax.swing.JLabel checkinbg;
    private com.toedter.calendar.JDateChooser checkindate;
    private javax.swing.JLabel checkout;
    private javax.swing.JLabel checkout1;
    private com.toedter.calendar.JDateChooser checkoutdate;
    private javax.swing.JButton cmdclear;
    private javax.swing.JButton cmdsearch;
    private javax.swing.JButton cmdsubmit;
    private javax.swing.JLabel datelbl;
    private javax.swing.JLabel descriptionlbl;
    private javax.swing.JTextField emailfld;
    private javax.swing.JLabel flexibleratelbl;
    private javax.swing.JLabel guest;
    private javax.swing.JLabel guests1;
    private javax.swing.JLabel hotelpics;
    private javax.swing.JLayeredPane intialinformation;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField namefld;
    private javax.swing.JTextField phonefld;
    private javax.swing.JLabel profilelbl10;
    private javax.swing.JLabel profilelbl11;
    private javax.swing.JLabel profilelbl9;
    private javax.swing.JLabel roombooking;
    private javax.swing.JLabel roombooking1;
    private javax.swing.JLayeredPane roomdata;
    private javax.swing.JLayeredPane roomdetails;
    private javax.swing.JLabel roomnolbl;
    private javax.swing.JLabel rooms;
    private javax.swing.JLabel rooms1;
    private javax.swing.JComboBox<String> roomtype;
    private javax.swing.JLabel roomtypelbl;
    private javax.swing.JLabel roomtypelbl1;
    private javax.swing.JLabel timelbl;
    private javax.swing.JLayeredPane todaypane;
    // End of variables declaration//GEN-END:variables
}
