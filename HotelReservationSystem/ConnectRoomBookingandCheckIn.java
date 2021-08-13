
package HotelReservationSystem;
//import Enrollment_System.Connect;
import java.sql.*;
import java.util.logging.*;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;

public class ConnectRoomBookingandCheckIn extends javax.swing.JFrame {   
    Connection con;
    Statement stmt;
    ResultSet rsRoomBooking;
    Statement stmtCheckIn;
    ResultSet rsCheckIn;
    ResultSet prs;
    Statement rstmt;
    //variables
     int newId,i,temp_user,curRow,result, id, rn;
    String newPASS, newUSERTYPE, user, s, n, u, temp_pass,temp_usertype;
    String urt, st,na, cid ,cod, rt,rc, em, add, p, card, cvc;
    Date dcid, dcod;
    Time cit, cot;
    //
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
        rstmt = con.createStatement(ResultSet. TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE);
        String rsql = "SELECT * FROM PASTTABLE";
        prs = rstmt.executeQuery(rsql);
        }
        catch(SQLException err){
            JOptionPane.showMessageDialog(ConnectRoomBookingandCheckIn.this, err.getMessage());
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
            Logger.getLogger(ConnectRoomBookingandCheckIn.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public void Refresh_PAST_STMT (){
        try {
            stmt.close();
            prs.close();
            stmt = con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
            String sql = "SELECT * FROM PASTTABLE";
            prs = stmt.executeQuery(sql);
        }
        catch (SQLException ex){
            Logger.getLogger(ConnectRoomBookingandCheckIn.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    //
    public void Refresh_RSCHECKIN_STMT (){
        try {
            stmtCheckIn.close();
            rsCheckIn.close();
            stmtCheckIn = con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
            String sql = "SELECT * FROM CHECKIN";
            rsCheckIn = stmtCheckIn.executeQuery(sql);
        }
        catch (SQLException ex){
            Logger.getLogger(ConnectRoomBookingandCheckIn.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
