package HotelReservationSystem;

import java.awt.Color;
import java.text.SimpleDateFormat;
import java.sql.SQLException;
import java.text.DateFormat;
import java.text.ParseException;
import java.time.LocalDate;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import java.sql.Date;
import java.sql.Timestamp;

public class ConfirmationForm extends ConnectRoomBookingandCheckIn{

  ConfirmationForm() {
        initComponents();
        DoConnect();
        cmdcheckin.setBackground(new Color(204,153,0));
        cmdback.setBackground(new Color(204,153,0));
        confirmreserve.setVisible(false);
    }

  private static final SimpleDateFormat sdf3 = new SimpleDateFormat("hh:mm:ss");
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        confirmroomdata = new javax.swing.JLayeredPane();
        jLabel9 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        confirmroomtype = new javax.swing.JLabel();
        confirmcheckindate = new javax.swing.JLabel();
        confirmcheckoutdate = new javax.swing.JLabel();
        confirmroomno = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        confirmcapacity = new javax.swing.JLabel();
        grandtotal = new javax.swing.JLayeredPane();
        jLabel12 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        numnights = new javax.swing.JLabel();
        total = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        roomtypeprice = new javax.swing.JLabel();
        confirmcreditcard = new javax.swing.JLayeredPane();
        jLabel3 = new javax.swing.JLabel();
        mode2 = new javax.swing.JLabel();
        mode1 = new javax.swing.JLabel();
        confirmsample1 = new javax.swing.JLabel();
        confirmsample3 = new javax.swing.JLabel();
        mode3 = new javax.swing.JLabel();
        confirmsample2 = new javax.swing.JLabel();
        confirmpersonaldata = new javax.swing.JLayeredPane();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        confirmidentity = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        confirmname = new javax.swing.JLabel();
        confirmphone = new javax.swing.JLabel();
        confirmemail = new javax.swing.JLabel();
        confirmaddress = new javax.swing.JLabel();
        confirmcity = new javax.swing.JLabel();
        confirmnationality = new javax.swing.JLabel();
        confirmhotel = new javax.swing.JLabel();
        mode5 = new javax.swing.JLabel();
        cmdback = new javax.swing.JButton();
        cmdcheckin = new javax.swing.JButton();
        confirmreserve = new javax.swing.JLabel();
        confirmationbg = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        confirmroomdata.setBackground(new java.awt.Color(0, 0, 0));
        confirmroomdata.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 204, 0), 2));
        confirmroomdata.setOpaque(true);

        jLabel9.setBackground(new java.awt.Color(255, 204, 0));
        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("Room Information");
        jLabel9.setOpaque(true);
        confirmroomdata.add(jLabel9);
        jLabel9.setBounds(10, 10, 340, 30);

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 204, 0));
        jLabel13.setText("Check In Date");
        confirmroomdata.add(jLabel13);
        jLabel13.setBounds(20, 110, 100, 20);

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 204, 0));
        jLabel14.setText("Check Out Date");
        confirmroomdata.add(jLabel14);
        jLabel14.setBounds(20, 140, 110, 20);

        jLabel15.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 204, 0));
        jLabel15.setText("Room ID");
        confirmroomdata.add(jLabel15);
        jLabel15.setBounds(20, 170, 80, 20);

        jLabel19.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(255, 204, 0));
        jLabel19.setText("Room Capacity");
        confirmroomdata.add(jLabel19);
        jLabel19.setBounds(20, 50, 110, 20);

        confirmroomtype.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        confirmroomtype.setForeground(new java.awt.Color(255, 204, 0));
        confirmroomtype.setText("Sample Room Type");
        confirmroomdata.add(confirmroomtype);
        confirmroomtype.setBounds(160, 80, 190, 20);

        confirmcheckindate.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        confirmcheckindate.setForeground(new java.awt.Color(255, 204, 0));
        confirmcheckindate.setText("Sample Check In Date");
        confirmroomdata.add(confirmcheckindate);
        confirmcheckindate.setBounds(160, 110, 190, 20);

        confirmcheckoutdate.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        confirmcheckoutdate.setForeground(new java.awt.Color(255, 204, 0));
        confirmcheckoutdate.setText("Sample Check Out Date");
        confirmroomdata.add(confirmcheckoutdate);
        confirmcheckoutdate.setBounds(160, 140, 190, 20);

        confirmroomno.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        confirmroomno.setForeground(new java.awt.Color(153, 255, 0));
        confirmroomno.setText("0");
        confirmroomdata.add(confirmroomno);
        confirmroomno.setBounds(160, 170, 130, 20);

        jLabel22.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(255, 204, 0));
        jLabel22.setText("Room Type");
        confirmroomdata.add(jLabel22);
        jLabel22.setBounds(20, 80, 90, 20);

        confirmcapacity.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        confirmcapacity.setForeground(new java.awt.Color(255, 204, 0));
        confirmcapacity.setText("Sample");
        confirmroomdata.add(confirmcapacity);
        confirmcapacity.setBounds(160, 50, 190, 20);

        getContentPane().add(confirmroomdata, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 170, 360, 200));

        grandtotal.setBackground(new java.awt.Color(0, 0, 0));
        grandtotal.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 204, 0), 2));
        grandtotal.setOpaque(true);

        jLabel12.setBackground(new java.awt.Color(255, 204, 0));
        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setText("Grand Total");
        jLabel12.setOpaque(true);
        grandtotal.add(jLabel12);
        jLabel12.setBounds(10, 10, 340, 30);

        jLabel17.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 204, 0));
        jLabel17.setText("Php");
        grandtotal.add(jLabel17);
        jLabel17.setBounds(180, 110, 30, 20);

        jLabel18.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(255, 204, 0));
        jLabel18.setText("Number of Nights");
        grandtotal.add(jLabel18);
        jLabel18.setBounds(20, 50, 130, 20);

        numnights.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        numnights.setForeground(new java.awt.Color(255, 204, 0));
        numnights.setText("0");
        grandtotal.add(numnights);
        numnights.setBounds(180, 50, 170, 20);

        total.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        total.setForeground(new java.awt.Color(255, 204, 0));
        total.setText("000,000,000");
        grandtotal.add(total);
        total.setBounds(220, 110, 130, 20);

        jLabel20.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(255, 204, 0));
        jLabel20.setText("Night Cost");
        grandtotal.add(jLabel20);
        jLabel20.setBounds(20, 80, 80, 20);

        jLabel21.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(255, 204, 0));
        jLabel21.setText("Total Price");
        grandtotal.add(jLabel21);
        jLabel21.setBounds(20, 110, 80, 20);

        roomtypeprice.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        roomtypeprice.setForeground(new java.awt.Color(255, 204, 0));
        roomtypeprice.setText("000,000,000");
        grandtotal.add(roomtypeprice);
        roomtypeprice.setBounds(180, 80, 89, 20);

        getContentPane().add(grandtotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 380, 360, 150));

        confirmcreditcard.setBackground(new java.awt.Color(0, 0, 0));
        confirmcreditcard.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 204, 0), 2));
        confirmcreditcard.setOpaque(true);

        jLabel3.setBackground(new java.awt.Color(255, 204, 0));
        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Payment Details");
        jLabel3.setOpaque(true);
        confirmcreditcard.add(jLabel3);
        jLabel3.setBounds(10, 10, 340, 20);

        mode2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        mode2.setForeground(new java.awt.Color(255, 204, 0));
        mode2.setText("Sample");
        confirmcreditcard.add(mode2);
        mode2.setBounds(20, 70, 130, 20);

        mode1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        mode1.setForeground(new java.awt.Color(255, 204, 0));
        mode1.setText("Mode of Payment");
        confirmcreditcard.add(mode1);
        mode1.setBounds(20, 40, 130, 20);

        confirmsample1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        confirmsample1.setForeground(new java.awt.Color(255, 204, 0));
        confirmsample1.setText("Sample Mode of Payment");
        confirmcreditcard.add(confirmsample1);
        confirmsample1.setBounds(160, 40, 190, 20);

        confirmsample3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        confirmsample3.setForeground(new java.awt.Color(255, 204, 0));
        confirmsample3.setText("Sample");
        confirmcreditcard.add(confirmsample3);
        confirmsample3.setBounds(160, 100, 190, 20);

        mode3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        mode3.setForeground(new java.awt.Color(255, 204, 0));
        mode3.setText("Sample");
        confirmcreditcard.add(mode3);
        mode3.setBounds(20, 100, 130, 20);

        confirmsample2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        confirmsample2.setForeground(new java.awt.Color(255, 204, 0));
        confirmsample2.setText("Sample");
        confirmcreditcard.add(confirmsample2);
        confirmsample2.setBounds(160, 70, 190, 20);

        getContentPane().add(confirmcreditcard, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 450, 360, 130));

        confirmpersonaldata.setBackground(new java.awt.Color(0, 0, 0));
        confirmpersonaldata.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 204, 0), 2));
        confirmpersonaldata.setOpaque(true);

        jLabel1.setBackground(new java.awt.Color(255, 204, 0));
        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Personal Data");
        jLabel1.setOpaque(true);
        confirmpersonaldata.add(jLabel1);
        jLabel1.setBounds(10, 10, 340, 20);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 204, 0));
        jLabel2.setText("Identity Card");
        confirmpersonaldata.add(jLabel2);
        jLabel2.setBounds(20, 250, 100, 20);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 204, 0));
        jLabel4.setText("Phone");
        confirmpersonaldata.add(jLabel4);
        jLabel4.setBounds(20, 100, 50, 20);

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 204, 0));
        jLabel5.setText("Email");
        confirmpersonaldata.add(jLabel5);
        jLabel5.setBounds(20, 130, 50, 20);

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 204, 0));
        jLabel6.setText("Address");
        confirmpersonaldata.add(jLabel6);
        jLabel6.setBounds(20, 160, 60, 20);

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 204, 0));
        jLabel7.setText("City");
        confirmpersonaldata.add(jLabel7);
        jLabel7.setBounds(20, 190, 30, 20);

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 204, 0));
        jLabel8.setText("Nationality");
        confirmpersonaldata.add(jLabel8);
        jLabel8.setBounds(20, 220, 80, 20);

        confirmidentity.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        confirmidentity.setForeground(new java.awt.Color(255, 204, 0));
        confirmidentity.setText("Sample Identity Card");
        confirmpersonaldata.add(confirmidentity);
        confirmidentity.setBounds(160, 250, 190, 20);

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 204, 0));
        jLabel11.setText("Name");
        confirmpersonaldata.add(jLabel11);
        jLabel11.setBounds(20, 70, 50, 20);

        confirmname.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        confirmname.setForeground(new java.awt.Color(255, 204, 0));
        confirmname.setText("Sample Name");
        confirmpersonaldata.add(confirmname);
        confirmname.setBounds(160, 70, 190, 20);

        confirmphone.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        confirmphone.setForeground(new java.awt.Color(255, 204, 0));
        confirmphone.setText("Sample Phone");
        confirmpersonaldata.add(confirmphone);
        confirmphone.setBounds(160, 100, 190, 20);

        confirmemail.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        confirmemail.setForeground(new java.awt.Color(255, 204, 0));
        confirmemail.setText("Sample Email");
        confirmpersonaldata.add(confirmemail);
        confirmemail.setBounds(160, 130, 190, 20);

        confirmaddress.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        confirmaddress.setForeground(new java.awt.Color(255, 204, 0));
        confirmaddress.setText("Sample Address");
        confirmpersonaldata.add(confirmaddress);
        confirmaddress.setBounds(160, 160, 190, 20);

        confirmcity.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        confirmcity.setForeground(new java.awt.Color(255, 204, 0));
        confirmcity.setText("Sample City");
        confirmpersonaldata.add(confirmcity);
        confirmcity.setBounds(160, 190, 190, 20);

        confirmnationality.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        confirmnationality.setForeground(new java.awt.Color(255, 204, 0));
        confirmnationality.setText("Sample Nationality");
        confirmpersonaldata.add(confirmnationality);
        confirmnationality.setBounds(160, 220, 190, 20);

        confirmhotel.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        confirmhotel.setForeground(new java.awt.Color(255, 204, 0));
        confirmhotel.setText("Sample ID");
        confirmpersonaldata.add(confirmhotel);
        confirmhotel.setBounds(160, 40, 190, 20);

        mode5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        mode5.setForeground(new java.awt.Color(255, 204, 0));
        mode5.setText("Hotel ID");
        confirmpersonaldata.add(mode5);
        mode5.setBounds(20, 40, 130, 20);

        getContentPane().add(confirmpersonaldata, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 170, 360, 280));

        cmdback.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        cmdback.setText("Back");
        cmdback.setToolTipText("");
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
        getContentPane().add(cmdback, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 540, 90, 30));

        cmdcheckin.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        cmdcheckin.setText("Check In");
        cmdcheckin.setToolTipText("");
        cmdcheckin.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                cmdcheckinMouseMoved(evt);
            }
        });
        cmdcheckin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cmdcheckinMouseClicked(evt);
            }
        });
        cmdcheckin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdcheckinActionPerformed(evt);
            }
        });
        getContentPane().add(cmdcheckin, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 540, 90, 30));

        confirmreserve.setForeground(new java.awt.Color(255, 255, 255));
        confirmreserve.setText("0");
        getContentPane().add(confirmreserve, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 550, 70, -1));

        confirmationbg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/HotelReservationSystem/img/confirmationbg.png"))); // NOI18N
        confirmationbg.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                confirmationbgMouseMoved(evt);
            }
        });
        getContentPane().add(confirmationbg, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 620));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void cmdbackMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cmdbackMouseMoved
        cmdback.setBackground(new Color(255,204,102));
    }//GEN-LAST:event_cmdbackMouseMoved

    private void cmdbackMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cmdbackMouseClicked
      CheckInForm checkinfrm = new CheckInForm();
      SimpleDateFormat dateformat = new SimpleDateFormat("MM-dd-yyyy");
      checkinfrm.hotelidfld.setText(this.confirmhotel.getText());
      checkinfrm.namefld.setText(this.confirmname.getText());
      checkinfrm.phonefld.setText(this.confirmphone.getText());
      checkinfrm.emailfld.setText(this.confirmemail.getText());
      checkinfrm.addressfld.setText(this.confirmaddress.getText());
      checkinfrm.cityfld.setText(this.confirmcity.getText());
      checkinfrm.nationalityfld.setText(this.confirmnationality.getText());
      checkinfrm.cardnofld.setText(this.confirmsample1.getText());
      checkinfrm.cvccodefld.setText(this.confirmsample3.getText());
      checkinfrm.roomtype.setSelectedItem(this.confirmroomtype.getText());
      checkinfrm.roomcapacity.setSelectedItem(this.confirmcapacity.getText());
      checkinfrm.modeofpayment.setSelectedItem(this.confirmsample1.getText());
      checkinfrm.cardnofld.setText(this.confirmsample2.getText());
      checkinfrm.cvccodefld.setText(this.confirmsample3.getText());
      checkinfrm.identificationcard.setSelectedItem(this.confirmidentity.getText());
      checkinfrm.roomnolbl.setText(this.confirmroomno.getText());
      checkinfrm.setVisible(true);
      String stringcheckindateDataBase = confirmcheckindate.getText();
      Date checkInDataBase = Date.valueOf(stringcheckindateDataBase);
      checkinfrm.checkindate.setDate(checkInDataBase);
      String stringcheckoutdateDataBase = confirmcheckoutdate.getText();
      Date checkOutDataBase = Date.valueOf(stringcheckoutdateDataBase);
      checkinfrm.checkoutdate.setDate(checkOutDataBase);
      checkinfrm.reservelbl.setText(this.confirmreserve.getText());
      if(confirmreserve.getText().equals("1")){
          checkinfrm.cmdsearch.setEnabled(false);
          checkinfrm.checkindate.setEnabled(false);
          checkinfrm.checkoutdate.setEnabled(false);
      }
      ConfirmationForm.this.dispose();
    }//GEN-LAST:event_cmdbackMouseClicked

    private void cmdcheckinMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cmdcheckinMouseMoved
       cmdcheckin.setBackground(new Color(255,204,102));
    }//GEN-LAST:event_cmdcheckinMouseMoved

    private void cmdcheckinMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cmdcheckinMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_cmdcheckinMouseClicked

    private void confirmationbgMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_confirmationbgMouseMoved
      cmdcheckin.setBackground(new Color(204,153,0));
      cmdback.setBackground(new Color(204,153,0));
    }//GEN-LAST:event_confirmationbgMouseMoved

    private void cmdcheckinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdcheckinActionPerformed
   
        String nameDataBase = confirmname.getText();
        String stringphoneDataBase = confirmphone.getText();
        String emailDataBase = confirmemail.getText();
        String addressDataBase = confirmaddress.getText();
        String cityDataBase = confirmcity.getText();
        String nationalityDataBase = confirmnationality.getText();
        String stringpassportnoDataBase = confirmidentity.getText();
        String stringcardnumberDataBase = confirmsample1.getText();
        String stringcvccodeDataBase = confirmsample3.getText();
        String roomtypeDataBase = confirmroomtype.getText();
        String stringroomnoDataBase = confirmroomno.getText();
        int roomnoDataBase = Integer.parseInt(stringroomnoDataBase);
        String stringnumnightsDataBase = numnights.getText();
        String stringroomtypepriceDataBase = roomtypeprice.getText();
        String stringtotalDataBase = total.getText();
        String stringcheckindateDataBase = confirmcheckindate.getText();
        Date checkInDataBase = Date.valueOf(stringcheckindateDataBase);
        String stringcheckoutdateDataBase = confirmcheckoutdate.getText();
        Date checkOutDataBase = Date.valueOf(stringcheckoutdateDataBase);
        Timestamp timestamp = new Timestamp(System.currentTimeMillis());
       
        try{
            int iteratorcheck = 0;
            while(rsRoomBooking.next()){
                boolean lastChecker = rsRoomBooking.isLast();
                iteratorcheck++;
                System.out.println("while loop" + iteratorcheck);
                int roomBookingID = rsRoomBooking.getInt("ROOMNO");
                Date roomBookingcheckin = rsRoomBooking.getDate("CHECKINDATE");
                Date roomBookingcheckout = rsRoomBooking.getDate("CHECKOUTDATE");
                if((roomBookingcheckin.equals(checkInDataBase)) && (roomBookingcheckout.equals(checkOutDataBase)) && (roomBookingID == roomnoDataBase) ){
                    System.out.println("may kaparehas");
                    rsRoomBooking.updateString("STATUS", "CHECKEDIN");
                    rsRoomBooking.updateRow();
                    Refresh_RSROOMBOOKING_STMT();
                    System.out.println("refreshed");
                    break;
                }
                if (lastChecker){
                    System.out.println("last row");
                rsRoomBooking.moveToInsertRow();
                rsRoomBooking.updateDate("CHECKINDATE", checkInDataBase);
                rsRoomBooking.updateDate("CHECKOUTDATE", checkOutDataBase);
                rsRoomBooking.updateInt("ROOMNO", roomnoDataBase);
                rsRoomBooking.updateString("NAME", nameDataBase);
                rsRoomBooking.updateString("EMAIL", emailDataBase);
                rsRoomBooking.updateString("PHONE", stringphoneDataBase);
                rsRoomBooking.updateString("ROOMTYPE", roomtypeDataBase);
                rsRoomBooking.updateString("RESERVECODE", "FROM WALK IN CHECKIN");
                rsRoomBooking.updateString("STATUS", "CHECKEDIN");
                rsRoomBooking.insertRow();        
                Refresh_RSROOMBOOKING_STMT();
                break;
                }
            }
            if(iteratorcheck == 0){
                rsRoomBooking.moveToInsertRow();
                rsRoomBooking.updateDate("CHECKINDATE", checkInDataBase);
                rsRoomBooking.updateDate("CHECKOUTDATE", checkOutDataBase);
                rsRoomBooking.updateInt("ROOMNO", roomnoDataBase);
                rsRoomBooking.updateString("NAME", nameDataBase);
                rsRoomBooking.updateString("EMAIL", emailDataBase);
                rsRoomBooking.updateString("PHONE", stringphoneDataBase);
                rsRoomBooking.updateString("ROOMTYPE", roomtypeDataBase);
                rsRoomBooking.updateString("RESERVECODE", "FROM WALK IN CHECKIN");
                rsRoomBooking.updateString("STATUS", "CHECKEDIN");
                rsRoomBooking.insertRow();        
                Refresh_RSROOMBOOKING_STMT();
            }
            System.out.println("While loop counter" +iteratorcheck);
            rsCheckIn.moveToInsertRow();
            rsCheckIn.updateString("NAME", nameDataBase);
            rsCheckIn.updateString("PHONE", stringphoneDataBase);  
            rsCheckIn.updateString("EMAIL", emailDataBase);
            rsCheckIn.updateString("ADDRESS", addressDataBase);
            rsCheckIn.updateString("CITY", cityDataBase);
            rsCheckIn.updateString("NATIONALITY", nationalityDataBase);
            rsCheckIn.updateString("PASSPORTNO", stringpassportnoDataBase);
            rsCheckIn.updateString("CARDNUMBER", stringcardnumberDataBase);
            rsCheckIn.updateString("CVCCODE", stringcvccodeDataBase);
            rsCheckIn.updateString("ROOMTYPE", roomtypeDataBase);
            rsCheckIn.updateDate("CHECKINDATE", checkInDataBase);
            rsCheckIn.updateDate("CHECKOUTDATE", checkOutDataBase);
            rsCheckIn.updateInt("ROOMNO", roomnoDataBase);
            rsCheckIn.updateString("NUMBEROFNIGHTS", stringnumnightsDataBase);
            rsCheckIn.updateString("NIGHTCOST", stringroomtypepriceDataBase);
            rsCheckIn.updateString("TOTALPRICE", stringtotalDataBase);
            rsCheckIn.insertRow();
            Refresh_RSCHECKIN_STMT();
            
            prs.moveToInsertRow();
            prs.updateString("NAME", nameDataBase);
             prs.updateInt("ROOMNO", roomnoDataBase);
            prs.updateString("ROOMTYPE", roomtypeDataBase);
            prs.updateDate("CHECKINDATE", checkInDataBase);
            prs.updateDate("CHECKOUTDATE", checkOutDataBase);
            prs.updateTimestamp("CHECKINTIME", timestamp);
            prs.insertRow();
            Refresh_PAST_STMT ();
            
            JOptionPane.showMessageDialog(null, "You have been checked in, enjoy your stay!");
            MainSystem mainsystem = new MainSystem();
            mainsystem.setVisible(true);
            ConfirmationForm.this.dispose();
        }catch(SQLException err){
            JOptionPane.showMessageDialog(ConfirmationForm.this, err.getMessage());
        }
         
    }//GEN-LAST:event_cmdcheckinActionPerformed

    private void cmdbackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdbackActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmdbackActionPerformed

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
            java.util.logging.Logger.getLogger(ConfirmationForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ConfirmationForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ConfirmationForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ConfirmationForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ConfirmationForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cmdback;
    private javax.swing.JButton cmdcheckin;
    public javax.swing.JLabel confirmaddress;
    private javax.swing.JLabel confirmationbg;
    public javax.swing.JLabel confirmcapacity;
    public javax.swing.JLabel confirmcheckindate;
    public javax.swing.JLabel confirmcheckoutdate;
    public javax.swing.JLabel confirmcity;
    private javax.swing.JLayeredPane confirmcreditcard;
    public javax.swing.JLabel confirmemail;
    public javax.swing.JLabel confirmhotel;
    public javax.swing.JLabel confirmidentity;
    public javax.swing.JLabel confirmname;
    public javax.swing.JLabel confirmnationality;
    private javax.swing.JLayeredPane confirmpersonaldata;
    public javax.swing.JLabel confirmphone;
    public javax.swing.JLabel confirmreserve;
    private javax.swing.JLayeredPane confirmroomdata;
    public javax.swing.JLabel confirmroomno;
    public javax.swing.JLabel confirmroomtype;
    public javax.swing.JLabel confirmsample1;
    public javax.swing.JLabel confirmsample2;
    public javax.swing.JLabel confirmsample3;
    private javax.swing.JLayeredPane grandtotal;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel mode1;
    public javax.swing.JLabel mode2;
    public javax.swing.JLabel mode3;
    private javax.swing.JLabel mode5;
    public javax.swing.JLabel numnights;
    public javax.swing.JLabel roomtypeprice;
    public javax.swing.JLabel total;
    // End of variables declaration//GEN-END:variables
}
