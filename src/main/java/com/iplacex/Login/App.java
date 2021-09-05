package com.iplacex.Login;
import utils.Conexion;

import java.sql.*;

import Models.Persona;
/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
      
        Conexion a = new Conexion();
        String sql;
        Connection conn;
        PreparedStatement stmt;
        try {
            conn = a.conectar();
            sql = "INSERT INTO bdinsumos.insumos(CODIGO,NOMBRE,VALOR) VALUES(?,?,?)";
            stmt = conn.prepareStatement(sql);
            stmt.setInt(1, 1);
			stmt.setString(2, "asd");
			stmt.setInt(3, 1);
	        stmt.executeUpdate();
	        stmt.close();
	        conn.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println( "Hello World!" );
		}
    }
}
