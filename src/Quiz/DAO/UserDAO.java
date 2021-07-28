/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Quiz.DAO;

import Quiz.dbutil.DBConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author gouru
 */
public class UserDAO {
    public static boolean Login(String username,String password,String usertype)throws SQLException
    {
        
        Connection conn=DBConnection.getConnection();
        PreparedStatement ps=conn.prepareStatement("select * from users where username=? and password=? and usertype=?");
        ps.setString(1, username);
        ps.setString(2, password);
        ps.setString(3, usertype);
        ResultSet rs=ps.executeQuery();
        if(rs.next())
        {
            return true;
        }
        else
        return false;
    }
    public static boolean registerUser(String username,String password)throws SQLException{
        String s="STUDENT";
        Connection conn=DBConnection.getConnection();
        PreparedStatement ps=conn.prepareStatement("insert into users values(?,?,?)");
        ps.setString(1, username);
        ps.setString(2, password);
        ps.setString(3, s);
        int a=ps.executeUpdate();
        if(a==1)
            return true;
        else
            return false;
    }
    public static ArrayList<String> allStudent()throws SQLException{
        ArrayList<String> list=new ArrayList<>();
        Connection conn=DBConnection.getConnection();
        Statement st=conn.createStatement();
        ResultSet rs=st.executeQuery("select username from users where usertype='STUDENT'");
        while(rs.next())
        {
            list.add(rs.getString(1));
        }
        return list;
    }
    public static boolean changePassword(String username,String password)throws SQLException{
        Connection conn=DBConnection.getConnection();
        PreparedStatement ps=conn.prepareStatement("update users set password=? where username=?");
        ps.setString(1, password);
        ps.setString(2, username);
        int a=ps.executeUpdate();
        if(a==1)
            return true;
        else
            return false;
    }
}
