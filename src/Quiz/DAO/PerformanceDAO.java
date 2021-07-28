/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Quiz.DAO;

import Quiz.dbutil.DBConnection;
import Quiz.pojo.Performance;
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
public class PerformanceDAO {
    public static void addPerformance(Performance p)throws SQLException
    {
        Connection conn=DBConnection.getConnection();
        PreparedStatement ps=conn.prepareStatement("insert into performance values(?,?,?,?,?,?,?)");
        ps.setString(1, p.getUserid());
        ps.setString(2, p.getExamid());
        ps.setInt(3, p.getRight());
        ps.setInt(4, p.getWrong());
        ps.setInt(5, p.getUnttempted());
        ps.setDouble(6,p.getPer());
        ps.setString(7, p.getSubject());
        ps.executeUpdate();
    }
    public static ArrayList<String> getExamid(String name)throws SQLException{
        ArrayList<String> examid=new ArrayList<>();
        Connection conn=DBConnection.getConnection();
        PreparedStatement ps=conn.prepareStatement("select examid from performance where username=?");
        ps.setString(1, name);
        ResultSet rs=ps.executeQuery();
        while(rs.next())
        {
            examid.add(rs.getString(1));
        }
        return examid;
    }
    public static double getPercentage(String examid,String name)throws SQLException{
        
        Connection conn=DBConnection.getConnection();
        PreparedStatement ps=conn.prepareStatement("select per from performance where examid=? and username=?");
        ps.setString(1, examid);
        ps.setString(2, name);
        ResultSet rs=ps.executeQuery();
        while(rs.next())
        {
            return rs.getDouble(1);
        }
        return -1;
    }
    public static ArrayList<Performance> getAllData()throws SQLException{
        ArrayList<Performance> list=new ArrayList<>();
        Connection conn=DBConnection.getConnection();
        Statement st=conn.createStatement();
        ResultSet rs=st.executeQuery("select * from performance");
        while(rs.next())
        {
            Performance p=new Performance(rs.getString(1),rs.getString(2),rs.getInt(3),rs.getInt(4),rs.getInt(5),rs.getDouble(6),rs.getString(7));
            list.add(p);
        }
        return list;
    }
}
