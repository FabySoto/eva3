package com.iplacex.Login;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

import utils.Conexion;
/**
 * Unit test for simple .
 */
public class AppTest 
    extends TestCase
{
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public AppTest( String testName )
    {
        super( testName );
    }
    
   
    
    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( AppTest.class );
    }

    /**
     * Rigourous Test :-)
     */
    public void testApp()
    {
    	Conexion cn = new Conexion();
    	cn.conectar();
        
        Conexion a = new Conexion();
        String sql;
        Connection conn;
        PreparedStatement stmt;
        try {
            conn = a.conectar();
            sql = "INSERT INTO banco.usuario(RUT,USUARIO,PASSWORD) VALUES(?,?,?)";
            stmt = conn.prepareStatement(sql);
            stmt.setInt(1, 1);
			stmt.setString(2, "asd");
			stmt.setInt(3, 1);
	        stmt.executeUpdate();
	        stmt.close();
	        conn.close();
	        assertTrue( true );
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
	
			assertTrue( false );
		}
    }
       
    }

