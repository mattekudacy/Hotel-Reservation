package HotelReservationSystem;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import static HotelReservationSystem.LoginForms.usertype;
import static HotelReservationSystem.LoginForms.userID;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.Timer;
public class MainSystem extends javax.swing.JFrame {
    Connection con;
    Statement stmt;
    ResultSet rsRoomBooking;
    Statement stmtCheckIn;
    ResultSet rsCheckIn;
    public static String USERID;
    public static String USERTYPE;
    
    public MainSystem() {
        initComponents();
        DoConnect();
        showDate();
        showTime();
        set_Labels();
        profilelbl.setBackground(new Color(153,102,0));
        
    }
    public void DoConnect() {
        try {
        //CONNECT TO THE DATABASE
        String host = "jdbc:derby://localhost:1527/UserAccounts";
        String uName = "karl";
        String uPass = "12345678";
        con = DriverManager.getConnection(host, uName, uPass);
            //EXECUTE SOME SQL AND LOAD THE RECORDS INTO THE RESULTSET
        stmt = con.createStatement(ResultSet. TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE);
        String sql = "SELECT * FROM ROOMBOOKING";
        rsRoomBooking = stmt.executeQuery(sql);
        stmtCheckIn = con.createStatement(ResultSet. TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE);
        rsCheckIn = stmtCheckIn.executeQuery("SELECT * FROM CHECKIN");
        }
        catch(SQLException err){
            JOptionPane.showMessageDialog(MainSystem.this, err.getMessage());
        }
    }
    public void Refresh_RSROOMBOOKING_STMT (){
        try {
            stmt.close();
            rsRoomBooking.close();
            stmt = con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
            String sql = "SELECT * FROM ROOMBOOKING";
            rsRoomBooking = stmt.executeQuery(sql);
        }
        catch (SQLException ex){
            Logger.getLogger(MainSystem.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public void Refresh_RSCHECKIN_STMT (){
        try {
            stmtCheckIn.close();
            rsCheckIn.close();
            stmtCheckIn = con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
            String sql = "SELECT * FROM CHECKIN";
            rsCheckIn = stmtCheckIn.executeQuery(sql);
        }
        catch (SQLException ex){
            Logger.getLogger(MainSystem.class.getName()).log(Level.SEVERE, null, ex);
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

        logout = new javax.swing.JLabel();
        logout1 = new javax.swing.JLabel();
        settings = new javax.swing.JLabel();
        settings1 = new javax.swing.JLabel();
        checkin = new javax.swing.JLabel();
        checkin1 = new javax.swing.JLabel();
        roombooking = new javax.swing.JLabel();
        roombooking1 = new javax.swing.JLabel();
        checkout = new javax.swing.JLabel();
        checkout1 = new javax.swing.JLabel();
        cancelbooking = new javax.swing.JLabel();
        cancelbooking1 = new javax.swing.JLabel();
        guest = new javax.swing.JLabel();
        guest1 = new javax.swing.JLabel();
        room = new javax.swing.JLabel();
        room1 = new javax.swing.JLabel();
        availablepane = new javax.swing.JLayeredPane();
        presidentialval = new javax.swing.JLabel();
        premiumval = new javax.swing.JLabel();
        profilelbl2 = new javax.swing.JLabel();
        profilelbl1 = new javax.swing.JLabel();
        profilelbl = new javax.swing.JLabel();
        profilelbl6 = new javax.swing.JLabel();
        profilelbl7 = new javax.swing.JLabel();
        profilelbl8 = new javax.swing.JLabel();
        deluxeval = new javax.swing.JLabel();
        executiveval = new javax.swing.JLabel();
        diplomaticval = new javax.swing.JLabel();
        profilepane = new javax.swing.JLayeredPane();
        position1 = new javax.swing.JLabel();
        employeename1 = new javax.swing.JLabel();
        profilelbl3 = new javax.swing.JLabel();
        profilelbl4 = new javax.swing.JLabel();
        profilelbl5 = new javax.swing.JLabel();
        todaypane = new javax.swing.JLayeredPane();
        timelbl = new javax.swing.JLabel();
        datelbl = new javax.swing.JLabel();
        profilelbl9 = new javax.swing.JLabel();
        profilelbl10 = new javax.swing.JLabel();
        profilelbl11 = new javax.swing.JLabel();
        dashboardbg = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("EastCity Hotel Reservation");
        setUndecorated(true);
        setResizable(false);
        addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                formMouseMoved(evt);
            }
        });
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        logout.setIcon(new javax.swing.ImageIcon(getClass().getResource("/HotelReservationSystem/img/SideIcons/Logout.png"))); // NOI18N
        logout.setText("jLabel2");
        logout.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                logoutMouseMoved(evt);
            }
        });
        getContentPane().add(logout, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 560, 160, 50));

        logout1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/HotelReservationSystem/img/SideIcons/Logout1.png"))); // NOI18N
        logout1.setText("jLabel2");
        logout1.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                logout1MouseMoved(evt);
            }
        });
        logout1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                logout1MouseClicked(evt);
            }
        });
        getContentPane().add(logout1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 560, 160, 50));

        settings.setIcon(new javax.swing.ImageIcon(getClass().getResource("/HotelReservationSystem/img/SideIcons/Settings.png"))); // NOI18N
        settings.setText("jLabel2");
        settings.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                settingsMouseMoved(evt);
            }
        });
        getContentPane().add(settings, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 500, 160, 50));

        settings1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/HotelReservationSystem/img/SideIcons/Settings1.png"))); // NOI18N
        settings1.setText("jLabel2");
        settings1.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                settings1MouseMoved(evt);
            }
        });
        settings1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                settings1MouseClicked(evt);
            }
        });
        getContentPane().add(settings1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 500, 160, 50));

        checkin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/HotelReservationSystem/img/checkin.png"))); // NOI18N
        checkin.setText("jLabel2");
        checkin.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                checkinMouseMoved(evt);
            }
        });
        getContentPane().add(checkin, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 190, 180, 170));

        checkin1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/HotelReservationSystem/img/checkin1.png"))); // NOI18N
        checkin1.setText("jLabel2");
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
        getContentPane().add(checkin1, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 190, 180, 170));

        roombooking.setIcon(new javax.swing.ImageIcon(getClass().getResource("/HotelReservationSystem/img/roombooking.png"))); // NOI18N
        roombooking.setText("jLabel2");
        roombooking.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                roombookingMouseMoved(evt);
            }
        });
        getContentPane().add(roombooking, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 190, 180, 170));

        roombooking1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/HotelReservationSystem/img/roombooking1.png"))); // NOI18N
        roombooking1.setText("jLabel2");
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
        getContentPane().add(roombooking1, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 190, 180, 170));

        checkout.setIcon(new javax.swing.ImageIcon(getClass().getResource("/HotelReservationSystem/img/checkout.png"))); // NOI18N
        checkout.setText("jLabel2");
        checkout.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                checkoutMouseMoved(evt);
            }
        });
        getContentPane().add(checkout, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 390, 180, 170));

        checkout1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/HotelReservationSystem/img/checkout1.png"))); // NOI18N
        checkout1.setText("jLabel2");
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
        getContentPane().add(checkout1, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 390, 180, 170));

        cancelbooking.setIcon(new javax.swing.ImageIcon(getClass().getResource("/HotelReservationSystem/img/cancelbooking.png"))); // NOI18N
        cancelbooking.setText("jLabel2");
        cancelbooking.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                cancelbookingMouseMoved(evt);
            }
        });
        getContentPane().add(cancelbooking, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 390, 180, 170));

        cancelbooking1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/HotelReservationSystem/img/cancelbooking1.png"))); // NOI18N
        cancelbooking1.setText("jLabel2");
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
        getContentPane().add(cancelbooking1, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 390, 180, 170));

        guest.setIcon(new javax.swing.ImageIcon(getClass().getResource("/HotelReservationSystem/img/guest.png"))); // NOI18N
        guest.setText("jLabel2");
        guest.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                guestMouseMoved(evt);
            }
        });
        getContentPane().add(guest, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 390, 180, 170));

        guest1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/HotelReservationSystem/img/guest1.png"))); // NOI18N
        guest1.setText("jLabel2");
        guest1.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                guest1MouseMoved(evt);
            }
        });
        guest1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                guest1MouseClicked(evt);
            }
        });
        getContentPane().add(guest1, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 390, 180, 170));

        room.setIcon(new javax.swing.ImageIcon(getClass().getResource("/HotelReservationSystem/img/rooms.png"))); // NOI18N
        room.setText("jLabel2");
        room.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                roomMouseMoved(evt);
            }
        });
        getContentPane().add(room, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 190, 180, 170));

        room1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/HotelReservationSystem/img/rooms1.png"))); // NOI18N
        room1.setText("jLabel2");
        room1.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                room1MouseMoved(evt);
            }
        });
        room1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                room1MouseClicked(evt);
            }
        });
        getContentPane().add(room1, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 190, 180, 170));

        availablepane.setBackground(new java.awt.Color(204, 153, 0));
        availablepane.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        availablepane.setOpaque(true);

        presidentialval.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        presidentialval.setText("2");
        availablepane.add(presidentialval);
        presidentialval.setBounds(120, 160, 20, 20);

        premiumval.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        premiumval.setText("8");
        availablepane.add(premiumval);
        premiumval.setBounds(100, 70, 20, 20);

        profilelbl2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        profilelbl2.setText("Presidential Suit:");
        availablepane.add(profilelbl2);
        profilelbl2.setBounds(10, 160, 110, 20);

        profilelbl1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        profilelbl1.setText("East Deluxe:");
        availablepane.add(profilelbl1);
        profilelbl1.setBounds(10, 40, 75, 20);

        profilelbl.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        profilelbl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        profilelbl.setText("AVAILABLE ROOMS");
        availablepane.add(profilelbl);
        profilelbl.setBounds(10, 7, 140, 20);

        profilelbl6.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        profilelbl6.setText("East Premium:");
        availablepane.add(profilelbl6);
        profilelbl6.setBounds(10, 70, 90, 20);

        profilelbl7.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        profilelbl7.setText("East Executive:");
        availablepane.add(profilelbl7);
        profilelbl7.setBounds(10, 100, 100, 20);

        profilelbl8.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        profilelbl8.setText("Diplomatic Suit:");
        availablepane.add(profilelbl8);
        profilelbl8.setBounds(10, 130, 100, 20);

        deluxeval.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        deluxeval.setText("12");
        availablepane.add(deluxeval);
        deluxeval.setBounds(90, 40, 20, 20);

        executiveval.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        executiveval.setText("5");
        availablepane.add(executiveval);
        executiveval.setBounds(110, 100, 20, 20);

        diplomaticval.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        diplomaticval.setText("3");
        availablepane.add(diplomaticval);
        diplomaticval.setBounds(110, 130, 20, 20);

        getContentPane().add(availablepane, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 290, 160, 200));

        profilepane.setBackground(new java.awt.Color(204, 153, 0));
        profilepane.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        profilepane.setOpaque(true);

        position1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        position1.setText("Receptionist");
        profilepane.add(position1);
        position1.setBounds(70, 70, 80, 20);

        employeename1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        employeename1.setText("Hokuto Sarayan");
        profilepane.add(employeename1);
        employeename1.setBounds(50, 40, 100, 20);

        profilelbl3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        profilelbl3.setText("Position:");
        profilepane.add(profilelbl3);
        profilelbl3.setBounds(10, 70, 60, 20);

        profilelbl4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        profilelbl4.setText("Name:");
        profilepane.add(profilelbl4);
        profilelbl4.setBounds(10, 40, 40, 20);

        profilelbl5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        profilelbl5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        profilelbl5.setText("PROFILE");
        profilepane.add(profilelbl5);
        profilelbl5.setBounds(10, 7, 140, 20);

        getContentPane().add(profilepane, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 160, 160, 120));

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

        dashboardbg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/HotelReservationSystem/img/dashboardbg.png"))); // NOI18N
        dashboardbg.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                dashboardbgMouseMoved(evt);
            }
        });
        getContentPane().add(dashboardbg, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void checkinMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_checkinMouseMoved
        checkin.setVisible(false);
    }//GEN-LAST:event_checkinMouseMoved

    private void formMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseMoved
        
    }//GEN-LAST:event_formMouseMoved

    private void roombookingMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_roombookingMouseMoved
        roombooking.setVisible(false);
    }//GEN-LAST:event_roombookingMouseMoved

    private void checkoutMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_checkoutMouseMoved
         checkout.setVisible(false);
    }//GEN-LAST:event_checkoutMouseMoved

    private void cancelbookingMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cancelbookingMouseMoved
         cancelbooking.setVisible(false);
    }//GEN-LAST:event_cancelbookingMouseMoved

    private void guestMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_guestMouseMoved
         guest.setVisible(false);
    }//GEN-LAST:event_guestMouseMoved

    private void roomMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_roomMouseMoved
         room.setVisible(false);

    }//GEN-LAST:event_roomMouseMoved

    private void dashboardbgMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dashboardbgMouseMoved
        checkin.setVisible(true);
        roombooking.setVisible(true);
        checkout.setVisible(true);
        cancelbooking.setVisible(true);
        guest.setVisible(true);
        room.setVisible(true);
        logout.setVisible(true);
        settings.setVisible(true);
       
    }//GEN-LAST:event_dashboardbgMouseMoved

    private void logout1MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logout1MouseMoved
        // TODO add your handling code here:
    }//GEN-LAST:event_logout1MouseMoved

    private void logoutMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logoutMouseMoved
        logout.setVisible(false);
    }//GEN-LAST:event_logoutMouseMoved

    private void settingsMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_settingsMouseMoved
        settings.setVisible(false);
    }//GEN-LAST:event_settingsMouseMoved

    private void logout1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logout1MouseClicked
       int response = JOptionPane.showConfirmDialog(this, "Are you sure you want to Logout?","Confirmation",JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE);
        switch (response) {
            case JOptionPane.YES_OPTION:
                LoginForms loginfrm = new LoginForms();
                loginfrm.setVisible(true);
                MainSystem.this.dispose();
                JOptionPane.showMessageDialog(this, "You have been succesfully logged out.","Logout Succesfully",JOptionPane.INFORMATION_MESSAGE);
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
    }//GEN-LAST:event_logout1MouseClicked

    private void checkin1MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_checkin1MouseMoved
        checkin.setVisible(false);
    }//GEN-LAST:event_checkin1MouseMoved

    private void roombooking1MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_roombooking1MouseMoved
        roombooking.setVisible(false);
    }//GEN-LAST:event_roombooking1MouseMoved

    private void room1MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_room1MouseMoved
        room.setVisible(false);
    }//GEN-LAST:event_room1MouseMoved

    private void checkout1MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_checkout1MouseMoved
        checkout.setVisible(false);
    }//GEN-LAST:event_checkout1MouseMoved

    private void cancelbooking1MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cancelbooking1MouseMoved
        cancelbooking.setVisible(false);
    }//GEN-LAST:event_cancelbooking1MouseMoved

    private void guest1MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_guest1MouseMoved
        guest.setVisible(false);
    }//GEN-LAST:event_guest1MouseMoved

    private void settings1MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_settings1MouseMoved
        settings.setVisible(false);
    }//GEN-LAST:event_settings1MouseMoved

    private void checkin1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_checkin1MouseClicked
       int response = JOptionPane.showConfirmDialog(this, "Do you have a reservation code?","Reservation",JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE);
        switch (response) {
            case JOptionPane.YES_OPTION:
                String code;
                code = JOptionPane.showInputDialog("Please enter the reservation code ");
                 CheckInForm checkinfrm1 = new CheckInForm();
                 int iteratorchecker = 0;
                try{
                    boolean lastchecker = rsRoomBooking.isLast();
                    loop:
                    while(rsRoomBooking.next()){
                        iteratorchecker++;
                        String dataBaseCode = rsRoomBooking.getString("RESERVECODE");
                        String statusDataBase = rsRoomBooking.getString("STATUS");
                        if (code.equals(dataBaseCode)){
                            if(statusDataBase.equals("CHECKEDIN")){
                                JOptionPane.showMessageDialog(null, "This reservecode is already checked in.");
                                break loop;
                            }
                            else{
                                String dataBaseName = rsRoomBooking.getString("NAME");
                                String dataBaseEmail = rsRoomBooking.getString("EMAIL");
                                String dataBasePhone = rsRoomBooking.getString("PHONE");
                                String dataBaseRoomType = rsRoomBooking.getString("ROOMTYPE");
                                Date dataBaseCheckinDate = rsRoomBooking.getDate("CHECKINDATE");
                                Date dataBaseCheckoutDate = rsRoomBooking.getDate("CHECKOUTDATE");
                                int dataBaseRoomNo = rsRoomBooking.getInt("ROOMNO");
                                String trueDataBaseRoomNo = String.valueOf(dataBaseRoomNo);
                                checkinfrm1.namefld.setText(dataBaseName);
                                checkinfrm1.namefld.setEnabled(false);
                                checkinfrm1.phonefld.setText(dataBasePhone);
                                checkinfrm1.phonefld.setEnabled(false);
                                checkinfrm1.emailfld.setText(dataBaseEmail);
                                checkinfrm1.emailfld.setEnabled(false);
                                checkinfrm1.roomtype.setSelectedItem(dataBaseRoomType);
                                checkinfrm1.roomtype.setEnabled(false);
                                checkinfrm1.roomnolbl.setText(trueDataBaseRoomNo);
                                checkinfrm1.checkindate.setDate(dataBaseCheckinDate);
                                checkinfrm1.checkoutdate.setDate(dataBaseCheckoutDate);
                                checkinfrm1.checkindate.setEnabled(false);
                                checkinfrm1.checkoutdate.setEnabled(false);
                                checkinfrm1.cmdsearch.setEnabled(false);
                                checkinfrm1.reservelbl.setText("1");
                                break loop;
                            }
                        }
                    }
                    if (lastchecker){
                        JOptionPane.showMessageDialog(null, "Sorry, reserve code does not exist. Please input an existing reserve code");
                    }
                    Refresh_RSROOMBOOKING_STMT ();
                        
                }catch (SQLException err){
                    JOptionPane.showMessageDialog(MainSystem.this, err.getMessage());
                }
                 
                if(iteratorchecker == 0){
                        JOptionPane.showMessageDialog(null, "Reservation Database is empty, please reserve in the Room Booking page first");    
                }
                else{
                    
                    checkinfrm1.setVisible(true);
                    MainSystem.this.setVisible(false);
                }
//                 checkinfrm1.setVisible(true);
//                 MainSystem.this.setVisible(false);

                break;
            case JOptionPane.NO_OPTION:
                 CheckInForm checkinfrm = new CheckInForm();
                 Date date=java.util.Calendar.getInstance().getTime();
                 checkinfrm.checkindate.setDate(date);
                 checkinfrm.checkindate.setEnabled(false);
                 checkinfrm.setVisible(true);
                 MainSystem.this.setVisible(false);
                break;
            case JOptionPane.CLOSED_OPTION:
                setDefaultCloseOperation(MainSystem.DO_NOTHING_ON_CLOSE);
                break;
            default:
                break;
        }
                              
        
        
        
    
        
        
        
        
       
       
    }//GEN-LAST:event_checkin1MouseClicked

    private void checkout1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_checkout1MouseClicked
        CheckOutForm checkoutfrm = new CheckOutForm();
        checkoutfrm.setVisible(true);
        MainSystem.this.setVisible(false);
    }//GEN-LAST:event_checkout1MouseClicked

    private void roombooking1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_roombooking1MouseClicked
        RoomBookingForm roombookingfrm = new RoomBookingForm();
        roombookingfrm.setVisible(true);
        MainSystem.this.setVisible(false);
    }//GEN-LAST:event_roombooking1MouseClicked

    private void cancelbooking1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cancelbooking1MouseClicked
        CancelBookingForm cancelbookingfrm = new CancelBookingForm();
        cancelbookingfrm.setVisible(true);
        MainSystem.this.setVisible(false);
    }//GEN-LAST:event_cancelbooking1MouseClicked

    private void room1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_room1MouseClicked
        RoomsForm roomsfrm = new RoomsForm();
        roomsfrm.setVisible(true);
        MainSystem.this.setVisible(false);
    }//GEN-LAST:event_room1MouseClicked

    private void guest1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_guest1MouseClicked
        GuestsForm guestfrm = new GuestsForm();
        guestfrm.setVisible(true);
        MainSystem.this.setVisible(false);
    }//GEN-LAST:event_guest1MouseClicked

    private void settings1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_settings1MouseClicked
    if (position1.getText()== "Receptionist"){
        JOptionPane.showMessageDialog(this, "Access Denied. Only admin can access this section","Access Denied",JOptionPane.ERROR_MESSAGE);
        setDefaultCloseOperation(MainSystem.DO_NOTHING_ON_CLOSE);
        
    }else if (position1.getText()== "Admin"){
        AdminSettings adminsettingsfrm = new AdminSettings();
        adminsettingsfrm.setVisible(true);
        MainSystem.this.setVisible(false);
    }
    }//GEN-LAST:event_settings1MouseClicked

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
         employeename1.setText(userID.getText());
       position1.setText(String.valueOf(usertype.getSelectedItem()));
       if(usertype.getSelectedItem()=="Receptionist"){
                        MainSystem.this.settings.setVisible(true);
                           MainSystem.this.settings1.setVisible(true);
 
        }
    }//GEN-LAST:event_formWindowActivated
    
    void set_Labels(){
        int deluxeValue = 12;
        int premiumValue = 8;
        int executiveValue = 5;
        int diplomaticValue = 3;
        int presidentialValue = 2;
        
        try{
            while(rsCheckIn.next()){
                String roomType = rsCheckIn.getString("ROOMTYPE");   
                if(roomType.equals("Deluxe")){
                    deluxeValue = deluxeValue - 1;
                }
                else if (roomType.equals("Premium")){
                    premiumValue = premiumValue - 1;
                }
                else if (roomType.equals("Executive")){
                    executiveValue = executiveValue - 1;
                }
                else if (roomType.equals("Diplomatic")){
                    diplomaticValue = diplomaticValue - 1;
                }
                else if (roomType.equals("Presidential")){
                    presidentialValue = presidentialValue - 1;
                }
        }
        }catch(SQLException err){
            JOptionPane.showMessageDialog(MainSystem.this, err.getMessage());
        }
        
        String truedeluxeValue = String.valueOf(deluxeValue);
        String truepremiumValue = String.valueOf(premiumValue);
        String trueexecutiveValue = String.valueOf(executiveValue);
        String truediplomaticValue = String.valueOf(diplomaticValue);
        String truepresidentialValue = String.valueOf(presidentialValue);
        
        deluxeval.setText(truedeluxeValue);
        premiumval.setText(truepremiumValue);
        executiveval.setText(trueexecutiveValue);
        diplomaticval.setText(truediplomaticValue);
        presidentialval.setText(truepresidentialValue);
        Refresh_RSCHECKIN_STMT ();
    }
    
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
            java.util.logging.Logger.getLogger(MainSystem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainSystem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainSystem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainSystem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainSystem().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLayeredPane availablepane;
    private javax.swing.JLabel cancelbooking;
    private javax.swing.JLabel cancelbooking1;
    private javax.swing.JLabel checkin;
    private javax.swing.JLabel checkin1;
    private javax.swing.JLabel checkout;
    private javax.swing.JLabel checkout1;
    private javax.swing.JLabel dashboardbg;
    private javax.swing.JLabel datelbl;
    private javax.swing.JLabel deluxeval;
    private javax.swing.JLabel diplomaticval;
    private javax.swing.JLabel employeename1;
    private javax.swing.JLabel executiveval;
    private javax.swing.JLabel guest;
    private javax.swing.JLabel guest1;
    private javax.swing.JLabel logout;
    private javax.swing.JLabel logout1;
    private javax.swing.JLabel position1;
    private javax.swing.JLabel premiumval;
    private javax.swing.JLabel presidentialval;
    private javax.swing.JLabel profilelbl;
    private javax.swing.JLabel profilelbl1;
    private javax.swing.JLabel profilelbl10;
    private javax.swing.JLabel profilelbl11;
    private javax.swing.JLabel profilelbl2;
    private javax.swing.JLabel profilelbl3;
    private javax.swing.JLabel profilelbl4;
    private javax.swing.JLabel profilelbl5;
    private javax.swing.JLabel profilelbl6;
    private javax.swing.JLabel profilelbl7;
    private javax.swing.JLabel profilelbl8;
    private javax.swing.JLabel profilelbl9;
    private javax.swing.JLayeredPane profilepane;
    private javax.swing.JLabel room;
    private javax.swing.JLabel room1;
    private javax.swing.JLabel roombooking;
    private javax.swing.JLabel roombooking1;
    private javax.swing.JLabel settings;
    private javax.swing.JLabel settings1;
    private javax.swing.JLabel timelbl;
    private javax.swing.JLayeredPane todaypane;
    // End of variables declaration//GEN-END:variables

    private SettingsForm SettingsForm() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
