/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Quiz.dbutil;

import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

/**
 *
 * @author gouru
 */
public class DBConnection {
    private static Connection conn;
    static
    {
        try
        {
            Class.forName("oracle.jdbc.OracleDriver");
            conn=DriverManager.getConnection("jdbc:oracle:thin:@//udit:1521/XE","project","0000");
            
        }
        catch(Exception ex)
        {
             JOptionPane.showMessageDialog(null, "Cannot connect to DB");
             ex.printStackTrace();
             System.exit(1);
        }
    }
    public static Connection getConnection()
    {
        return conn;
    }
    public static void closeConnection()
    {
        try{
        conn.close();
        }
        catch(Exception ex)
        {
            JOptionPane.showMessageDialog(null, "Cannot close to connection");
             ex.printStackTrace();
        }
    }
}
