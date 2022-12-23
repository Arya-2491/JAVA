/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package atm;
 import java.sql.*;
/**
 *
 * @author Admin
 */
public class conn {
    
    public static Connection getCon(){
        Connection con = null;
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/atmdb","root","root");
            return con;
//  To check for Connection Establishment
//            if(con!=null){
//                System.out.println("Connection Done : "+con);
//            }
//            else{
//                System.out.println("Failed");
//            }
        }
        catch(Exception ex){
//            System.out.println("Exception is : "+ex.toString());
            return null;
        }
    }
    public static void main(String[] args) {
        conn.getCon();
    }
}
