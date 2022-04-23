/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author OMEN
 */
public class Conexion {

  private Statement sql;
static String bd="tienda";
static String login="root";
static String password="Septiembre11";
static String url="jdbc:mysql://localhost/" +bd;
static Connection conn=null;

    public static Connection getConn() {
       return conn;
}
public static void conn() throws Exception{
 try {
            Class.forName("com.mysql.jdbc.Driver");
            conn=  DriverManager.getConnection(url, login, password);
if(conn!=null){
System.out.println("Conexion exitosa");
}
}
catch(SQLException ex){
System.out.println("Error al conectar a la base de datos" +url);
}
catch(ClassNotFoundException ex){
System.out.println(ex);
}
}
       }
