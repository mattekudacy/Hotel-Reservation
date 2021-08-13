package HotelReservationSystem;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.temporal.ChronoUnit;
import java.util.Date;
import java.util.concurrent.TimeUnit;
import javax.swing.JOptionPane;
import javax.swing.Timer;
import java.util.ArrayList;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.GregorianCalendar;

public class CheckInForm extends ConnectRoomBookingandCheckIn {


    public CheckInForm() {
        initComponents();
        Date date=java.util.Calendar.getInstance().getTime();
        checkindate.setDate(date);
        checkindate.setEnabled(false);
        checkindate.setMinSelectableDate(date);
        checkoutdate.setMinSelectableDate(date);
        DoConnect();
        showDate();
        showTime();
        roomtype.setBackground(new Color(204,153,0));
        roomcapacity.setBackground(new Color(204,153,0));
        modeofpayment.setBackground(new Color(204,153,0));
        identificationcard.setBackground(new Color(204,153,0));
        cmdsearch.setBackground(new Color(204,153,0));
        cmdclear.setBackground(new Color(204,153,0));
        cmdsubmit.setBackground(new Color(204,153,0));
        checkin.setVisible(false);       
        reservelbl.setVisible(false);
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
        roomtype = new javax.swing.JComboBox<String>();
        jLabel13 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        cmdsearch = new javax.swing.JButton();
        checkoutdate = new com.toedter.calendar.JDateChooser();
        checkindate = new com.toedter.calendar.JDateChooser();
        reservelbl = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        roomcapacity = new javax.swing.JComboBox<String>();
        personaldata = new javax.swing.JLayeredPane();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        nationalityfld = new javax.swing.JTextField();
        cityfld = new javax.swing.JTextField();
        addressfld = new javax.swing.JTextField();
        emailfld = new javax.swing.JTextField();
        hotelidfld = new javax.swing.JTextField();
        phonefld = new javax.swing.JTextField();
        namefld = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        identificationcard = new javax.swing.JComboBox<String>();
        jLabel11 = new javax.swing.JLabel();
        payment = new javax.swing.JLayeredPane();
        jLabel9 = new javax.swing.JLabel();
        mode2 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        mode1 = new javax.swing.JLabel();
        cvccodefld = new javax.swing.JTextField();
        cardnofld = new javax.swing.JTextField();
        modeofpayment = new javax.swing.JComboBox<String>();
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
        roomnolbl.setBounds(120, 200, 30, 20);

        jLabel12.setBackground(new java.awt.Color(255, 204, 0));
        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setText("Room Data");
        jLabel12.setOpaque(true);
        roomdata.add(jLabel12);
        jLabel12.setBounds(10, 10, 330, 20);

        roomtype.setBackground(new java.awt.Color(255, 204, 102));
        roomtype.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        roomtype.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Deluxe", "Premium", "Executive", "Diplomatic", "Presidential" }));
        roomdata.add(roomtype);
        roomtype.setBounds(160, 70, 160, 30);

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 204, 0));
        jLabel13.setText("Room Capacity");
        roomdata.add(jLabel13);
        jLabel13.setBounds(20, 40, 110, 20);

        jLabel15.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 204, 0));
        jLabel15.setText("Check in date");
        roomdata.add(jLabel15);
        jLabel15.setBounds(20, 110, 100, 30);

        jLabel16.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 204, 0));
        jLabel16.setText("Check out date");
        roomdata.add(jLabel16);
        jLabel16.setBounds(20, 150, 110, 30);

        jLabel17.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 204, 0));
        jLabel17.setText("Room No");
        roomdata.add(jLabel17);
        jLabel17.setBounds(20, 200, 80, 20);

        cmdsearch.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        cmdsearch.setText("Search");
        cmdsearch.setToolTipText("");
        cmdsearch.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                cmdsearchMouseMoved(evt);
            }
        });
        cmdsearch.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cmdsearchMouseClicked(evt);
            }
        });
        cmdsearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdsearchActionPerformed(evt);
            }
        });
        roomdata.add(cmdsearch);
        cmdsearch.setBounds(190, 190, 90, 30);

        checkoutdate.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        checkoutdate.setMaxSelectableDate(new java.util.Date(253402286399000L));
        checkoutdate.setMinSelectableDate(new java.util.Date(1609488000000L));
        roomdata.add(checkoutdate);
        checkoutdate.setBounds(160, 150, 160, 30);

        checkindate.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        checkindate.setMaxSelectableDate(new java.util.Date(253402286399000L));
        checkindate.setMinSelectableDate(new java.util.Date(1609488000000L));
        checkindate.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                checkindateMouseClicked(evt);
            }
        });
        roomdata.add(checkindate);
        checkindate.setBounds(160, 110, 160, 30);

        reservelbl.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        reservelbl.setForeground(new java.awt.Color(255, 255, 255));
        reservelbl.setText("0");
        roomdata.add(reservelbl);
        reservelbl.setBounds(310, 200, 20, 20);

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 204, 0));
        jLabel14.setText("Room Type");
        roomdata.add(jLabel14);
        jLabel14.setBounds(20, 70, 90, 30);

        roomcapacity.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        roomcapacity.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "2 to 3", "4 to 6", "7 to 9", "10-12" }));
        roomcapacity.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                roomcapacityActionPerformed(evt);
            }
        });
        roomdata.add(roomcapacity);
        roomcapacity.setBounds(160, 40, 160, 23);

        getContentPane().add(roomdata, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 350, 350, 230));

        personaldata.setBackground(new java.awt.Color(0, 0, 0));
        personaldata.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 204, 0), 2));
        personaldata.setOpaque(true);

        jLabel1.setBackground(new java.awt.Color(255, 204, 0));
        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Personal Data");
        jLabel1.setOpaque(true);
        personaldata.add(jLabel1);
        jLabel1.setBounds(10, 10, 340, 30);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 204, 0));
        jLabel2.setText("Identity Card");
        personaldata.add(jLabel2);
        jLabel2.setBounds(20, 360, 100, 30);

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 204, 0));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Welcome to EastCity Hotel. Please fill in the below info.");
        personaldata.add(jLabel3);
        jLabel3.setBounds(10, 50, 340, 20);

        nationalityfld.setBackground(new java.awt.Color(255, 204, 0));
        nationalityfld.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        nationalityfld.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                nationalityfldKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                nationalityfldKeyTyped(evt);
            }
        });
        personaldata.add(nationalityfld);
        nationalityfld.setBounds(130, 320, 210, 23);

        cityfld.setBackground(new java.awt.Color(255, 204, 0));
        cityfld.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        cityfld.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                cityfldKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                cityfldKeyTyped(evt);
            }
        });
        personaldata.add(cityfld);
        cityfld.setBounds(130, 280, 210, 23);

        addressfld.setBackground(new java.awt.Color(255, 204, 0));
        addressfld.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        addressfld.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                addressfldKeyPressed(evt);
            }
        });
        personaldata.add(addressfld);
        addressfld.setBounds(130, 240, 210, 23);

        emailfld.setBackground(new java.awt.Color(255, 204, 0));
        emailfld.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        emailfld.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                emailfldKeyPressed(evt);
            }
        });
        personaldata.add(emailfld);
        emailfld.setBounds(130, 200, 210, 23);

        hotelidfld.setBackground(new java.awt.Color(255, 204, 0));
        hotelidfld.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        hotelidfld.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                hotelidfldKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                hotelidfldKeyTyped(evt);
            }
        });
        personaldata.add(hotelidfld);
        hotelidfld.setBounds(130, 80, 210, 23);

        phonefld.setBackground(new java.awt.Color(255, 204, 0));
        phonefld.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        phonefld.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                phonefldKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                phonefldKeyTyped(evt);
            }
        });
        personaldata.add(phonefld);
        phonefld.setBounds(130, 160, 210, 23);

        namefld.setBackground(new java.awt.Color(255, 204, 0));
        namefld.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        namefld.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                namefldKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                namefldKeyTyped(evt);
            }
        });
        personaldata.add(namefld);
        namefld.setBounds(130, 120, 210, 23);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 204, 0));
        jLabel4.setText("Phone");
        personaldata.add(jLabel4);
        jLabel4.setBounds(20, 160, 50, 20);

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 204, 0));
        jLabel5.setText("Email");
        personaldata.add(jLabel5);
        jLabel5.setBounds(20, 200, 50, 20);

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 204, 0));
        jLabel6.setText("Address");
        personaldata.add(jLabel6);
        jLabel6.setBounds(20, 240, 60, 20);

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 204, 0));
        jLabel7.setText("City");
        personaldata.add(jLabel7);
        jLabel7.setBounds(20, 280, 30, 20);

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 204, 0));
        jLabel8.setText("Nationality");
        personaldata.add(jLabel8);
        jLabel8.setBounds(20, 320, 80, 20);

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 204, 0));
        jLabel10.setText("Hotel ID");
        personaldata.add(jLabel10);
        jLabel10.setBounds(20, 80, 60, 20);

        identificationcard.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        identificationcard.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "SSS", "PhilHealth", "GSIS", "UMID", "Driver's License" }));
        personaldata.add(identificationcard);
        identificationcard.setBounds(130, 360, 210, 30);

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 204, 0));
        jLabel11.setText("Name");
        personaldata.add(jLabel11);
        jLabel11.setBounds(20, 120, 50, 20);

        getContentPane().add(personaldata, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 180, 360, 400));

        payment.setBackground(new java.awt.Color(0, 0, 0));
        payment.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 204, 0), 2));
        payment.setOpaque(true);

        jLabel9.setBackground(new java.awt.Color(255, 204, 0));
        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("Payment");
        jLabel9.setOpaque(true);
        payment.add(jLabel9);
        jLabel9.setBounds(10, 10, 330, 30);

        mode2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        mode2.setForeground(new java.awt.Color(255, 204, 0));
        mode2.setText("CVC Code");
        payment.add(mode2);
        mode2.setBounds(20, 120, 120, 20);

        jLabel19.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(255, 204, 0));
        jLabel19.setText("Mode of Payment:");
        payment.add(jLabel19);
        jLabel19.setBounds(20, 50, 130, 30);

        mode1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        mode1.setForeground(new java.awt.Color(255, 204, 0));
        mode1.setText("Card Number");
        payment.add(mode1);
        mode1.setBounds(20, 90, 120, 20);

        cvccodefld.setBackground(new java.awt.Color(255, 204, 0));
        cvccodefld.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        cvccodefld.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                cvccodefldKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                cvccodefldKeyTyped(evt);
            }
        });
        payment.add(cvccodefld);
        cvccodefld.setBounds(140, 120, 190, 23);

        cardnofld.setBackground(new java.awt.Color(255, 204, 0));
        cardnofld.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        cardnofld.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                cardnofldKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                cardnofldKeyTyped(evt);
            }
        });
        payment.add(cardnofld);
        cardnofld.setBounds(140, 90, 190, 23);

        modeofpayment.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        modeofpayment.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Credit Card", "Cash", "GCash", "PayMaya" }));
        modeofpayment.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modeofpaymentActionPerformed(evt);
            }
        });
        payment.add(modeofpayment);
        modeofpayment.setBounds(160, 50, 170, 30);

        getContentPane().add(payment, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 180, 350, 160));

        cmdsubmit.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        cmdsubmit.setText("Submit");
        cmdsubmit.setToolTipText("");
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
        getContentPane().add(cmdsubmit, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 590, 90, 30));

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
        getContentPane().add(cmdclear, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 590, 90, 30));

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
        getContentPane().add(checkin, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 200, 160, 50));

        checkin1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/HotelReservationSystem/img/SideIcons/CheckIn1.png"))); // NOI18N
        checkin1.addMouseWheelListener(new java.awt.event.MouseWheelListener() {
            public void mouseWheelMoved(java.awt.event.MouseWheelEvent evt) {
                checkin1MouseWheelMoved(evt);
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
                 CheckInForm.this.dispose();
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
      roombooking.setVisible(true);
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
     if(reservelbl.getText().equals("1")){
      addressfld.setText(null);
      cityfld.setText(null);
      nationalityfld.setText(null);
      cardnofld.setText(null);
      cvccodefld.setText(null);
     }else{
      
      namefld.setText(null);
      phonefld.setText(null);
      emailfld.setText(null);
      addressfld.setText(null);
      cityfld.setText(null);
      nationalityfld.setText(null);
      cardnofld.setText(null);
      cvccodefld.setText(null);
      roomtype.setSelectedIndex(0);
      identificationcard.setSelectedIndex(0);
      modeofpayment.setSelectedIndex(0);
      roomcapacity.setSelectedIndex(0);
      roomnolbl.setText("0");
      Date date=java.util.Calendar.getInstance().getTime();
      checkindate.setDate(date);
      checkindate.setMinSelectableDate(date);
      checkoutdate.setMinSelectableDate(date);
      checkoutdate.setCalendar(null);
     }
    }//GEN-LAST:event_cmdclearMouseClicked

    private void cmdclearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdclearActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmdclearActionPerformed

    private void cmdsubmitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cmdsubmitMouseClicked
try{
       ConfirmationForm confirmationfrm = new ConfirmationForm();
       SimpleDateFormat dateformat = new SimpleDateFormat("yyyy-MM-dd");
       String datecheckin = dateformat.format(checkindate.getDate());
       String datecheckout = dateformat.format(checkoutdate.getDate());
       Date firstDate = checkindate.getDate();
       Date secondDate = checkoutdate.getDate();
       long diffInMillies = Math.abs(secondDate.getTime() - firstDate.getTime());
       long diff = TimeUnit.DAYS.convert(diffInMillies,TimeUnit.MILLISECONDS);
       if(secondDate.getTime()< firstDate.getTime()){
           JOptionPane.showMessageDialog(null,"Please make sure the check in date is before the checkout date","Error",JOptionPane.ERROR_MESSAGE);
           setDefaultCloseOperation(CheckInForm.DO_NOTHING_ON_CLOSE);
       
       }else if(namefld.getText().equals("") || phonefld.getText().equals("") || emailfld.getText().equals("") || addressfld.getText().equals("") || cityfld.getText().equals("") || nationalityfld.getText().equals("") || cardnofld.getText().equals("") || cvccodefld.getText().equals("") || hotelidfld.getText().equals("") ){
           JOptionPane.showMessageDialog(null,"Blank fields are not allowed.","Error",JOptionPane.ERROR_MESSAGE);
           setDefaultCloseOperation(CheckInForm.DO_NOTHING_ON_CLOSE);
           
       }else if(roomnolbl.getText().equals("0")){
           JOptionPane.showMessageDialog(null,"Please search for room first.","Error",JOptionPane.ERROR_MESSAGE);
           setDefaultCloseOperation(CheckInForm.DO_NOTHING_ON_CLOSE);
           
       }else{
       confirmationfrm.setVisible(true);
       confirmationfrm.confirmhotel.setText(this.hotelidfld.getText());
       confirmationfrm.confirmname.setText(this.namefld.getText());
       confirmationfrm.confirmphone.setText(this.phonefld.getText());
       confirmationfrm.confirmemail.setText(this.emailfld.getText());
       confirmationfrm.confirmaddress.setText(this.addressfld.getText());
       confirmationfrm.confirmcity.setText(this.cityfld.getText());
       confirmationfrm.confirmnationality.setText(this.nationalityfld.getText());
       confirmationfrm.confirmsample1.setText(this.cardnofld.getText());
       confirmationfrm.confirmsample3.setText(this.cvccodefld.getText());
       confirmationfrm.confirmroomtype.setText(this.roomtype.getSelectedItem().toString());
       confirmationfrm.confirmcapacity.setText(this.roomcapacity.getSelectedItem().toString());
       confirmationfrm.confirmidentity.setText(this.identificationcard.getSelectedItem().toString());
       confirmationfrm.confirmsample1.setText(this.modeofpayment.getSelectedItem().toString());
       confirmationfrm.confirmsample2.setText(this.cardnofld.getText());
       confirmationfrm.mode2.setText(this.mode1.getText());
       confirmationfrm.mode3.setText(this.mode2.getText());
       confirmationfrm.confirmcheckindate.setText(datecheckin);
       confirmationfrm.confirmcheckoutdate.setText(datecheckout);
       confirmationfrm.numnights.setText(String.valueOf(diff));
       confirmationfrm.confirmroomno.setText(this.roomnolbl.getText());
       confirmationfrm.confirmreserve.setText(this.reservelbl.getText());
       CheckInForm.this.dispose();
       float total;
       if(roomtype.getSelectedIndex()==0){
           confirmationfrm.roomtypeprice.setText("6199.00"); //connect sa database depende sa kung ano yung price
           total = Float.parseFloat(confirmationfrm.roomtypeprice.getText()) * Float.parseFloat(confirmationfrm.numnights.getText());
           confirmationfrm.total.setText(String.valueOf(total));
       }
       else if(roomtype.getSelectedIndex()==1){
           confirmationfrm.roomtypeprice.setText("8050.00");
           total = Float.parseFloat(confirmationfrm.roomtypeprice.getText()) * Float.parseFloat(confirmationfrm.numnights.getText());
           confirmationfrm.total.setText(String.valueOf(total));
       }
       else if(roomtype.getSelectedIndex()==2){
           confirmationfrm.roomtypeprice.setText("10805.00");
           total = Float.parseFloat(confirmationfrm.roomtypeprice.getText()) * Float.parseFloat(confirmationfrm.numnights.getText());
           confirmationfrm.total.setText(String.valueOf(total));
       }
       else if(roomtype.getSelectedIndex()==3){
           confirmationfrm.roomtypeprice.setText("14410.00");
           total = Float.parseFloat(confirmationfrm.roomtypeprice.getText()) * Float.parseFloat(confirmationfrm.numnights.getText());
           confirmationfrm.total.setText(String.valueOf(total));
       }
       else if(roomtype.getSelectedIndex()==4){
           confirmationfrm.roomtypeprice.setText("268199.00");
           total = Float.parseFloat(confirmationfrm.roomtypeprice.getText()) * Float.parseFloat(confirmationfrm.numnights.getText());
           confirmationfrm.total.setText(String.valueOf(total));      
       }
               
       }
}catch (Exception e){
    JOptionPane.showMessageDialog(null,"Please make sure the check in date is before the checkout date","Error",JOptionPane.ERROR_MESSAGE);
        Date date=java.util.Calendar.getInstance().getTime();
        checkindate.setDate(date);
        checkindate.setEnabled(false);
        checkindate.setMinSelectableDate(date);
        checkoutdate.setMinSelectableDate(date);
}        
    }//GEN-LAST:event_cmdsubmitMouseClicked

    private void checkoutMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_checkoutMouseMoved
         checkout.setVisible(false);
    }//GEN-LAST:event_checkoutMouseMoved

    private void roombookingMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_roombookingMouseMoved
         roombooking.setVisible(false);
    }//GEN-LAST:event_roombookingMouseMoved

    private void cancelbookingMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cancelbookingMouseMoved
        cancelbooking.setVisible(false);
    }//GEN-LAST:event_cancelbookingMouseMoved

    private void roomsMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_roomsMouseMoved
        rooms.setVisible(false);
    }//GEN-LAST:event_roomsMouseMoved

    private void guestMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_guestMouseMoved
        guest.setVisible(false);
    }//GEN-LAST:event_guestMouseMoved

    private void checkin1MouseWheelMoved(java.awt.event.MouseWheelEvent evt) {//GEN-FIRST:event_checkin1MouseWheelMoved
        checkin.setVisible(false);
    }//GEN-LAST:event_checkin1MouseWheelMoved

    private void checkout1MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_checkout1MouseMoved
        checkout.setVisible(false);
    }//GEN-LAST:event_checkout1MouseMoved

    private void roombooking1MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_roombooking1MouseMoved
        roombooking.setVisible(false);
    }//GEN-LAST:event_roombooking1MouseMoved

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
                 CheckInForm.this.dispose();
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

    private void roombooking1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_roombooking1MouseClicked
        int response = JOptionPane.showConfirmDialog(this, "The information you have entered will be forfeited. Proceed?","Proceed?",JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE);
        switch (response) {
            case JOptionPane.YES_OPTION:
                 RoomBookingForm roombookingfrm = new RoomBookingForm();
                 roombookingfrm.setVisible(true);
                 CheckInForm.this.dispose();
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
                 CancelBookingForm cancelbookfrm = new CancelBookingForm();
                 cancelbookfrm.setVisible(true);
                 CheckInForm.this.dispose();
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
                 CheckInForm.this.dispose();
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
                 CheckInForm.this.dispose();
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

    private void checkindateMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_checkindateMouseClicked
 
    }//GEN-LAST:event_checkindateMouseClicked

    private void cmdsearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdsearchActionPerformed
        
    }//GEN-LAST:event_cmdsearchActionPerformed

    private void cmdsubmitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdsubmitActionPerformed

    }//GEN-LAST:event_cmdsubmitActionPerformed

    private void cmdsearchMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cmdsearchMouseClicked
        boolean valuen =! namefld.getText().trim().isEmpty();
        boolean valuee =! emailfld.getText().trim().isEmpty();
        boolean valuep =! phonefld.getText().trim().isEmpty();
        boolean valuea =! addressfld.getText().trim().isEmpty();
        boolean valuec =! cityfld.getText().trim().isEmpty();
        boolean valuent =! nationalityfld.getText().trim().isEmpty();;
        boolean valuecn =! cardnofld.getText().trim().isEmpty();
        boolean valuecc =! cvccodefld.getText().trim().isEmpty();
        
        if (valuen != true){ 
        JOptionPane.showMessageDialog(null, "please fill up name first");}       
            else if(valuep!=true){
            JOptionPane.showMessageDialog(null, "please fill up phone first");}
                else if(valuee!=true){
                JOptionPane.showMessageDialog(null, "please fill up email first");}
                    else if (valuea != true){ 
                    JOptionPane.showMessageDialog(null, "please fill up address first");} 
                        else if (valuec != true){ 
                        JOptionPane.showMessageDialog(null, "please fill up city first");} 
                            else if (valuent != true){ 
                            JOptionPane.showMessageDialog(null, "please fill up nationality first");} 
                                    else if (valuecn != true){ 
                                    JOptionPane.showMessageDialog(null, "please fill up card number first");} 
                                        else if (valuecc != true){ 
                                         JOptionPane.showMessageDialog(null, "please fill up cvc code first");} 
               
        if (valuen!= false){
         if (valuee!=false){
            if(valuep!=false){
               if(valuea!=false){
                    if(valuec!=false){
                         if(valuent!=false){
                                   if(valuecn!=false){
                                        if(valuecc!=false){
                 
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
        try{
            
            if (roomType.equals("Deluxe")){
                int[] roomTypeArray = {101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112};
                outerloop:
                for (int i = 0; i < roomTypeArray.length; i++) {
                    System.out.println(roomTypeArray[i]);
                    boolean breakChecker = false;
                    int tempRoom = roomTypeArray[i];
                    while(rsRoomBooking.next()){
                        iteratorCheck = iteratorCheck + 1;
                        int dataBaseRoomNumber = rsRoomBooking.getInt("ROOMNO");
                        boolean lastChecker = rsRoomBooking.isLast();

                        
                        if (tempRoom == dataBaseRoomNumber) {
                            Date dataBaseCheckIn = rsRoomBooking.getDate("CHECKINDATE");
                            Date dataBaseCheckOut = rsRoomBooking.getDate("CHECKOUTDATE");
                            System.out.println("temproom == databaseroomnumber");
                            if (checkInInput.after(dataBaseCheckOut)) {
                                ;
                            }
                            else{
                                if((checkOutInput.before(dataBaseCheckIn)) || (checkOutInput.equals(dataBaseCheckIn))){
                                    ;
                                }
                                else{
                                    System.out.println("3");
                                    Refresh_RSROOMBOOKING_STMT();
                                    break;
                                }
                            }
                        }
                        if (lastChecker){
                            JOptionPane.showMessageDialog(null, "We have found a room for you, your room number is: " + roomTypeArray[i]);
                            roomnolbl.setText(String.valueOf(roomTypeArray[i]));
                            Refresh_RSROOMBOOKING_STMT();
                            break outerloop;
                            //bibigay yung room number
                        }
                    }
                    if (iteratorCheck == 0){
                        JOptionPane.showMessageDialog(null, "You are the first to have checked in, welcome");
                        //bibigay yung room number
                        JOptionPane.showMessageDialog(null, "Your Room Number is: " + roomTypeArray[i]);
                        roomnolbl.setText(String.valueOf(roomTypeArray[i]));
                        Refresh_RSROOMBOOKING_STMT();
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
                int[] roomTypeArray = {201, 202, 203, 204, 205, 206, 207, 208, 209};
                outerloop:
                for (int i = 0; i < roomTypeArray.length; i++) {
                    boolean breakChecker = false;
                    int tempRoom = roomTypeArray[i];

                    
                    while(rsRoomBooking.next()){
                        iteratorCheck = iteratorCheck + 1;
                        int dataBaseRoomNumber = rsRoomBooking.getInt("ROOMNO");
                        boolean lastChecker = rsRoomBooking.isLast();

                        
                        if (tempRoom == dataBaseRoomNumber) {
                            Date dataBaseCheckIn = rsRoomBooking.getDate("CHECKINDATE");
                            Date dataBaseCheckOut = rsRoomBooking.getDate("CHECKOUTDATE");
                            if (checkInInput.after(dataBaseCheckOut)) {
                                ;
                            }
                            else{
                                if(checkOutInput.before(dataBaseCheckIn)){
                                    ;
                                }
                                else{
                                    Refresh_RSROOMBOOKING_STMT();
                                    break;
                                }
                            }
                        }
                        if (lastChecker){
                            JOptionPane.showMessageDialog(null, "We have found a room for you, your room number is: " + roomTypeArray[i]);
                            roomnolbl.setText(String.valueOf(roomTypeArray[i]));
                            Refresh_RSROOMBOOKING_STMT();
                            break outerloop;
                            //bibigay yung room number
                        }
                    }
                    if (iteratorCheck == 0){
                        JOptionPane.showMessageDialog(null, "You are the first to have checked in, welcome");
                        roomnolbl.setText(String.valueOf(roomTypeArray[i]));
                        //bibigay yung room number
                        JOptionPane.showMessageDialog(null, "Your Room Number is: " + roomTypeArray[i]);
                        Refresh_RSROOMBOOKING_STMT();
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

                    
                    while(rsRoomBooking.next()){
                        iteratorCheck = iteratorCheck + 1;
                        int dataBaseRoomNumber = rsRoomBooking.getInt("ROOMNO");
                        boolean lastChecker = rsRoomBooking.isLast();

                        
                        if (tempRoom == dataBaseRoomNumber) {
                            Date dataBaseCheckIn = rsRoomBooking.getDate("CHECKINDATE");
                            Date dataBaseCheckOut = rsRoomBooking.getDate("CHECKOUTDATE");
                            if (checkInInput.after(dataBaseCheckOut)) {
                                ;
                            }
                            else{
                                if(checkOutInput.before(dataBaseCheckIn)){
                                    ;
                                }
                                else{
                                    Refresh_RSROOMBOOKING_STMT();
                                    break;
                                }
                            }
                        }
                        if (lastChecker){
                            JOptionPane.showMessageDialog(null, "We have found a room for you, your room number is: " + roomTypeArray[i]);
                            roomnolbl.setText(String.valueOf(roomTypeArray[i]));
                            Refresh_RSROOMBOOKING_STMT();
                            break outerloop;
                            //bibigay yung room number
                        }
                    }
                    if (iteratorCheck == 0){
                        JOptionPane.showMessageDialog(null, "You are the first to have checked in, welcome");
                        roomnolbl.setText(String.valueOf(roomTypeArray[i]));
                        //bibigay yung room number
                        JOptionPane.showMessageDialog(null, "Your Room Number is: " + roomTypeArray[i]);
                        Refresh_RSROOMBOOKING_STMT();
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

                    
                    while(rsRoomBooking.next()){
                        iteratorCheck = iteratorCheck + 1;
                        int dataBaseRoomNumber = rsRoomBooking.getInt("ROOMNO");
                        boolean lastChecker = rsRoomBooking.isLast();

                        
                        if (tempRoom == dataBaseRoomNumber) {
                            Date dataBaseCheckIn = rsRoomBooking.getDate("CHECKINDATE");
                            Date dataBaseCheckOut = rsRoomBooking.getDate("CHECKOUTDATE");
                            if (checkInInput.after(dataBaseCheckOut)) {
                                ;
                            }
                            else{
                                if(checkOutInput.before(dataBaseCheckIn)){
                                    ;
                                }
                                else{
                                    Refresh_RSROOMBOOKING_STMT();
                                    break;
                                }
                            }
                        }
                        if (lastChecker){
                            JOptionPane.showMessageDialog(null, "We have found a room for you, your room number is: " + roomTypeArray[i]);
                            roomnolbl.setText(String.valueOf(roomTypeArray[i]));
                            Refresh_RSROOMBOOKING_STMT();
                            break outerloop;
                            //bibigay yung room number
                        }
                    }
                    if (iteratorCheck == 0){
                        JOptionPane.showMessageDialog(null, "You are the first to have checked in, welcome");
                        //bibigay yung room number
                        roomnolbl.setText(String.valueOf(roomTypeArray[i]));
                        JOptionPane.showMessageDialog(null, "Your Room Number is: " + roomTypeArray[i]);
                        Refresh_RSROOMBOOKING_STMT();
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
                System.out.println("presidential");
                int[] roomTypeArray = {501, 502};
                outerloop:
                for (int i = 0; i < roomTypeArray.length; i++) {
                    boolean breakChecker = false;
                    int tempRoom = roomTypeArray[i];

                    System.out.println("presidential");
                    while(rsRoomBooking.next()){
                        System.out.println("while");
                        iteratorCheck = iteratorCheck + 1;
                        int dataBaseRoomNumber = rsRoomBooking.getInt("ROOMNO");
                        boolean lastChecker = rsRoomBooking.isLast();

                        if (tempRoom == dataBaseRoomNumber) {
                            System.out.println("temproom == dataBaseRoomNumber");
                            Date dataBaseCheckIn = rsRoomBooking.getDate("CHECKINDATE");
                            Date dataBaseCheckOut = rsRoomBooking.getDate("CHECKOUTDATE");
                            System.out.println(dataBaseCheckOut + "checkout");
                            System.out.println(checkInInput+"checkinput");
//                            if(checkInInput.equals(dataBaseCheckOut)){
//                                System.out.println("eqal");
//                                break outerloop;
//                            }
                            if (checkInInput.after(dataBaseCheckOut)) {
                                System.out.println("1");
                                
                            }
                            else{
                                if(checkOutInput.before(dataBaseCheckIn)){
                                    System.out.println("2");
                                }
                                else{
                                    System.out.println("3");
                                    Refresh_RSROOMBOOKING_STMT();
                                    break ;
                                }
                            }
                        }
                        if (lastChecker){
                            JOptionPane.showMessageDialog(null, "We have found a room for you, your room number is: " + roomTypeArray[i]);
                            roomnolbl.setText(String.valueOf(roomTypeArray[i]));
                            Refresh_RSROOMBOOKING_STMT();
                            break outerloop;
                            //bibigay yung room number
                        }
                    }
                    if (iteratorCheck == 0){
                        JOptionPane.showMessageDialog(null, "You are the first to have checked in, welcome");
                        roomnolbl.setText(String.valueOf(roomTypeArray[i]));
                        Refresh_RSROOMBOOKING_STMT();
                        //bibigay yung room number
                        JOptionPane.showMessageDialog(null, "Your Room Number is: " + roomTypeArray[i]);
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
        
     
        }catch (SQLException err){
            JOptionPane.showMessageDialog(CheckInForm.this, err.getMessage()); 
            
            }
        }}}}}}}
        }
    }//GEN-LAST:event_cmdsearchMouseClicked

    private void modeofpaymentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modeofpaymentActionPerformed
         if(modeofpayment.getSelectedIndex()==0) {
           mode1.setText("Card Number");
           mode2.setText("CVC Code");
           cvccodefld.setEnabled(true);
           cardnofld.setText(null);
           cvccodefld.setText(null);
       }
       
       else if(modeofpayment.getSelectedIndex()==1){
           mode1.setText("Amount");
           mode2.setText("Change");
           cvccodefld.setEnabled(false);
           cardnofld.setText(null);
           cvccodefld.setText(null);
       }
       
       else if(modeofpayment.getSelectedIndex()==2){
           mode1.setText("Account Name");
           mode2.setText("Account No");
           cvccodefld.setEnabled(true);
           cardnofld.setText(null);
           cvccodefld.setText(null);
       }
       else if(modeofpayment.getSelectedIndex()==3){
           mode1.setText("Account Name");
           mode2.setText("Account No");
           mode2.setEnabled(true);
           cvccodefld.setEnabled(true);
           cardnofld.setText(null);
           cvccodefld.setText(null);
       }
       
       
    
       
    }//GEN-LAST:event_modeofpaymentActionPerformed

    private void cardnofldKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cardnofldKeyPressed
         if(modeofpayment.getSelectedIndex()==0) {
             if(cardnofld.getText().length()>=16){
                cardnofld.setText(cardnofld.getText().substring(0,15));}
         }
         if(modeofpayment.getSelectedIndex()==1) {
             if(cardnofld.getText().length()>=9){
                cardnofld.setText(cardnofld.getText().substring(0,8));}
         }
         if(modeofpayment.getSelectedIndex()==2) {
             if(cardnofld.getText().length()>=30){
                cardnofld.setText(cardnofld.getText().substring(0,29));}
         }
         if(modeofpayment.getSelectedIndex()==3) {
             if(cardnofld.getText().length()>=30){
                cardnofld.setText(cardnofld.getText().substring(0,29));}
         }
         
    }//GEN-LAST:event_cardnofldKeyPressed

    private void cardnofldKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cardnofldKeyTyped
        if(modeofpayment.getSelectedIndex()==0) {
        char c = evt.getKeyChar();
        if(!Character.isDigit(c)){
            evt.consume();
        }  
    }
        if(modeofpayment.getSelectedIndex()==1) {
        char c = evt.getKeyChar();
        if(!Character.isDigit(c)){
            evt.consume();
        }  
    }
        if(modeofpayment.getSelectedIndex()==2) {
        char c = evt.getKeyChar();
        if(Character.isDigit(c)){
            evt.consume();
        }  
    }
        if(modeofpayment.getSelectedIndex()==3) {
        char c = evt.getKeyChar();
        if(Character.isDigit(c)){
            evt.consume();
        }  
    }
          
          
    }//GEN-LAST:event_cardnofldKeyTyped

    private void cvccodefldKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cvccodefldKeyPressed
         if(modeofpayment.getSelectedIndex()==0) {
             if(cvccodefld.getText().length()>=3){
                cvccodefld.setText(cvccodefld.getText().substring(0,2));}
         }
         
          if(modeofpayment.getSelectedIndex()==2) {
             if(cvccodefld.getText().length()>=11){
                cvccodefld.setText(cvccodefld.getText().substring(0,10));}
         }
          
           if(modeofpayment.getSelectedIndex()==3) {
             if(cvccodefld.getText().length()>=11){
                cvccodefld.setText(cvccodefld.getText().substring(0,10));}
         }
           
   
         
         
    }//GEN-LAST:event_cvccodefldKeyPressed

    private void cvccodefldKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cvccodefldKeyTyped
        if(modeofpayment.getSelectedIndex()==0) {
        char c = evt.getKeyChar();
        if(!Character.isDigit(c)){
            evt.consume();
        }  
    }
        if(modeofpayment.getSelectedIndex()==1) {
        char c = evt.getKeyChar();
        if(!Character.isDigit(c)){
            evt.consume();
        }  
    }
        if(modeofpayment.getSelectedIndex()==2) {
        char c = evt.getKeyChar();
        if(!Character.isDigit(c)){
            evt.consume();
        }  
    }
        if(modeofpayment.getSelectedIndex()==3) {
        char c = evt.getKeyChar();
        if(!Character.isDigit(c)){
            evt.consume();
        }  
    }
        
        
    }//GEN-LAST:event_cvccodefldKeyTyped

    private void namefldKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_namefldKeyPressed
          if(namefld.getText().length()>=30){
                namefld.setText(namefld.getText().substring(0,29));
          }
    }//GEN-LAST:event_namefldKeyPressed

    private void phonefldKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_phonefldKeyPressed
          if(phonefld.getText().length()>=11){
                phonefld.setText(phonefld.getText().substring(0,10));
          }
    }//GEN-LAST:event_phonefldKeyPressed

    private void emailfldKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_emailfldKeyPressed
          if(emailfld.getText().length()>=30){
                emailfld.setText(emailfld.getText().substring(0,29));
          }
    }//GEN-LAST:event_emailfldKeyPressed

    private void addressfldKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_addressfldKeyPressed
         if(addressfld.getText().length()>=30){
                addressfld.setText(addressfld.getText().substring(0,29));
          }
    }//GEN-LAST:event_addressfldKeyPressed

    private void cityfldKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cityfldKeyPressed
         if(cityfld.getText().length()>=30){
                cityfld.setText(cityfld.getText().substring(0,29));
          }
    }//GEN-LAST:event_cityfldKeyPressed

    private void nationalityfldKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_nationalityfldKeyPressed
         if(nationalityfld.getText().length()>=30){
                nationalityfld.setText(nationalityfld.getText().substring(0,29));
          }
    }//GEN-LAST:event_nationalityfldKeyPressed

    private void namefldKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_namefldKeyTyped
        char c = evt.getKeyChar();
        if(Character.isDigit(c)){
            evt.consume();
        }  
    }//GEN-LAST:event_namefldKeyTyped

    private void phonefldKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_phonefldKeyTyped
        char c = evt.getKeyChar();
        if(!Character.isDigit(c)){
            evt.consume();
        }  
    }//GEN-LAST:event_phonefldKeyTyped

    private void cityfldKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cityfldKeyTyped
        char c = evt.getKeyChar();
        if(Character.isDigit(c)){
            evt.consume();
        }  
    }//GEN-LAST:event_cityfldKeyTyped

    private void nationalityfldKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_nationalityfldKeyTyped
        char c = evt.getKeyChar();
        if(Character.isDigit(c)){
            evt.consume();
        }  
    }//GEN-LAST:event_nationalityfldKeyTyped

    private void roomcapacityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_roomcapacityActionPerformed
        if(roomcapacity.getSelectedIndex()==0) {
           roomtype.removeAllItems();
           roomtype.addItem("Deluxe");
           roomtype.addItem("Premium");
           roomtype.addItem("Executive");
           roomtype.addItem("Diplomatic");
           roomtype.addItem("Presidential");
        }
        else if(roomcapacity.getSelectedIndex()==1) {
           roomtype.removeAllItems();
           roomtype.addItem("Executive");
           roomtype.addItem("Diplomatic");
           roomtype.addItem("Presidential");
        }
        else if(roomcapacity.getSelectedIndex()==2) {
           roomtype.removeAllItems();
           roomtype.addItem("Diplomatic");
           roomtype.addItem("Presidential");
        }
        
        else if(roomcapacity.getSelectedIndex()==3) {
           roomtype.removeAllItems();
           roomtype.addItem("Presidential");
        
        

        }
    }//GEN-LAST:event_roomcapacityActionPerformed

    private void hotelidfldKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_hotelidfldKeyPressed
         if(hotelidfld.getText().length()>=5){
            hotelidfld.setText(hotelidfld.getText().substring(0,4));
            }
                        }//GEN-LAST:event_hotelidfldKeyPressed

    private void hotelidfldKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_hotelidfldKeyTyped
        char c = evt.getKeyChar();
        if(!Character.isDigit(c)){
            evt.consume();
        }  
    }//GEN-LAST:event_hotelidfldKeyTyped
         
    
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
                new CheckInForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JTextField addressfld;
    private javax.swing.JLabel backlbl;
    private javax.swing.JLabel cancelbooking;
    private javax.swing.JLabel cancelbooking1;
    public javax.swing.JTextField cardnofld;
    private javax.swing.JLabel checkin;
    private javax.swing.JLabel checkin1;
    private javax.swing.JLabel checkinbg;
    public com.toedter.calendar.JDateChooser checkindate;
    private javax.swing.JLabel checkout;
    private javax.swing.JLabel checkout1;
    public com.toedter.calendar.JDateChooser checkoutdate;
    public javax.swing.JTextField cityfld;
    private javax.swing.JButton cmdclear;
    public javax.swing.JButton cmdsearch;
    private javax.swing.JButton cmdsubmit;
    public javax.swing.JTextField cvccodefld;
    private javax.swing.JLabel datelbl;
    public javax.swing.JTextField emailfld;
    private javax.swing.JLabel guest;
    private javax.swing.JLabel guests1;
    public javax.swing.JTextField hotelidfld;
    public javax.swing.JComboBox<String> identificationcard;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel mode1;
    private javax.swing.JLabel mode2;
    public javax.swing.JComboBox<String> modeofpayment;
    public javax.swing.JTextField namefld;
    public javax.swing.JTextField nationalityfld;
    private javax.swing.JLayeredPane payment;
    private javax.swing.JLayeredPane personaldata;
    public javax.swing.JTextField phonefld;
    private javax.swing.JLabel profilelbl10;
    private javax.swing.JLabel profilelbl11;
    private javax.swing.JLabel profilelbl9;
    public javax.swing.JLabel reservelbl;
    private javax.swing.JLabel roombooking;
    private javax.swing.JLabel roombooking1;
    public javax.swing.JComboBox<String> roomcapacity;
    private javax.swing.JLayeredPane roomdata;
    public javax.swing.JLabel roomnolbl;
    private javax.swing.JLabel rooms;
    private javax.swing.JLabel rooms1;
    public javax.swing.JComboBox<String> roomtype;
    private javax.swing.JLabel timelbl;
    private javax.swing.JLayeredPane todaypane;
    // End of variables declaration//GEN-END:variables

    private DateFormat newSimpleDateFormat(String yyyyMMdd) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
