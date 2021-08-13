
package HotelReservationSystem;
import java.sql.*;
import java.util.logging.*;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;

public class connect extends javax.swing.JFrame{
    Connection con;
        Statement stmt;
        ResultSet rs;
        DefaultTableModel LoginModel = new DefaultTableModel();
        //yung id sa huli para sa 
        int newId,i,temp_user,curRow,result, id, rn;
        String newPASS, newUSERTYPE, user, s, n, u, temp_pass,temp_usertype;
        //eto yung dinagdag ko prii
        String urt, st,na, cid ,cod, rt,rc, em, add, p, card, cvc;
public void DoConnect(){
        try{
            //palitan nalang yung pangalan pati password
            String host = "jdbc:derby://localhost:1527/UserAccounts";
            String uName= "karl";
            String uPass= "12345678";
            con = DriverManager.getConnection(host, uName, uPass);
            stmt = con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_UPDATABLE);
            String sql = "SELECT * FROM CHECKIN";
            rs = stmt.executeQuery(sql);

        }catch(SQLException err){
            JOptionPane.showMessageDialog(connect.this, err.getMessage());
        }
    }
    public void Refresh_RS_STMT(){
        try {
            stmt.close();
            rs.close();
            stmt = con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
            String sql = "SELECT * FROM CHECKIN";
            rs = stmt.executeQuery(sql);
        }
        catch (SQLException ex){
            Logger.getLogger(connect.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
