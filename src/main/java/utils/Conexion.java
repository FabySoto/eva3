package utils;

import java.sql.Connection;
import java.sql.DriverManager;

public class Conexion {
    public Connection conectar(){

        final String JDBC_DRIVER = "org.mariadb.jdbc.Driver";
        final String DB_URL = "jdbc:mariadb://192.168.100.174/db";

        //  Database credentials
        final String USER = "root";
        final String PASS = "root";
        Connection conn = null;
        try{
            Class.forName(JDBC_DRIVER);
            conn = DriverManager.getConnection(DB_URL, USER, PASS);
            return conn;       
        }catch(Exception ex){
         return null;   
        }
    }   
}
