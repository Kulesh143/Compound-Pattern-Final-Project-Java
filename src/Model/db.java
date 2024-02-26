/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import com.mysql.jdbc.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;

/**
 *
 * @author Lenovo
 */
public class db {
  private static Connection c=null;
  public static Connection getConnection(){
        try {
            if(c==null){
                Class.forName("com.mysql.jdbc.Driver");
                c=(Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/kids","root","");
            }
        } catch (Exception e) {
        }return c;
        
    }
  public static void SUD(String Query){
      Connection c=getConnection();
      try {
          c.createStatement().executeUpdate(Query);
      } catch (Exception e) {
      e.printStackTrace();}
  }
public static ResultSet search(String Query){
    Connection c=getConnection();
    ResultSet rs=null;
    try {
        rs=c.createStatement().executeQuery(Query);
    } catch (Exception e) {
    e.printStackTrace();}return rs;
}
}
