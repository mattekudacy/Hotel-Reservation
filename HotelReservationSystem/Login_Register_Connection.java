
package HotelReservationSystem;
import java.sql.*;
import java.util.logging.*;
import javax.swing.table.DefaultTableModel;
import javax.swing.*;

public class Login_Register_Connection extends javax.swing.JFrame {
    Connection con;
    Statement stmt;
    ResultSet rs;
    
    DefaultTableModel LoginMode1=new DefaultTableModel();
    int curRow,result;
    String newPASS,newUSERTYPE,user,s,pass2,u,i,temp_pass,temp_usertype,newID,temp_user ;
    
           
    public void DoConnect(){
     try{
         String host="jdbc:derby://localhost:1527/Reservation";
         String uName="riel";
         String uPass="roque";
         
         con =DriverManager.getConnection(host,uName,uPass);
         stmt=con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_UPDATABLE);
         String sql="SELECT * FROM ACCOUNTS";
         rs=stmt.executeQuery(sql);
         
    
     }catch(SQLException err){
         JOptionPane.showMessageDialog(Login_Register_Connection.this,err.getMessage());
     }
}
    public void Refresh_RS_STMT(){
         try{
            stmt.close();
            rs.close();
            stmt=con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_UPDATABLE);
             String sql="SELECT * FROM ACCOUNTS";
             rs=stmt.executeQuery(sql);
        }catch(SQLException ex){
            Logger.getLogger(Login_Register_Connection.class.getName()).log(Level.SEVERE,null,ex);
        }
    }
}
