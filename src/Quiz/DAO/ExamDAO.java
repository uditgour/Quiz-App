/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Quiz.DAO;

import Quiz.dbutil.DBConnection;
import Quiz.pojo.ExamProfile;
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
public class ExamDAO {
    public static String getExamId()throws SQLException
    {
        Connection conn=DBConnection.getConnection();
        Statement st=conn.createStatement();
        ResultSet rs=st.executeQuery("select count(*) from exam");
        rs.next();
        int count=rs.getInt(1);
        String newid="EX-"+(count+1);
        return newid;
    }
    public static boolean ExamDetails(String subject,int qno,int time)throws SQLException
    {
        String id=ExamDAO.getExamId();
        ExamProfile.setExamid(id);
        Connection conn=DBConnection.getConnection();
        PreparedStatement ps=conn.prepareStatement("insert into exam values(?,?,?,?)");
        ps.setString(1, id);
        ps.setString(2, subject);
        ps.setInt(3, qno);
        ps.setInt(4, time);
        int a=ps.executeUpdate();
        if(a==1)
            return true;
        else
            return false;
    }         
    public static ArrayList<String> getExamIdbySubject(String subject)throws SQLException{
        ArrayList<String> list=new ArrayList<>();
        Connection conn=DBConnection.getConnection();
        PreparedStatement ps=conn.prepareStatement("select examid from exam where subject=?");
        ps.setString(1, subject);
        ResultSet rs=ps.executeQuery();
        while(rs.next())
        {
            String x=rs.getString(1);
            list.add(x);
        }
        return list;
    }
    
     public static boolean isPaperSet(String subject)throws SQLException{
        ArrayList<String> list=new ArrayList<>();
        Connection conn=DBConnection.getConnection();
        PreparedStatement ps=conn.prepareStatement("select examid from exam where subject=?");
        ps.setString(1, subject);
        ResultSet rs=ps.executeQuery();
        while(rs.next())
        {
            return true;
        }
        return false;
    }
    
     public static ArrayList<String> getExamIdforStudent(String subject,String name)throws SQLException{
        ArrayList<String> list=new ArrayList<>();
        Connection conn=DBConnection.getConnection();
        PreparedStatement ps=conn.prepareStatement("select examid from exam where subject=? minus select examid from performance where subject=? and username=?");
        ps.setString(1, subject);
        ps.setString(2, subject);
        ps.setString(3, name);
        ResultSet rs=ps.executeQuery();
        while(rs.next())
        {
            String x=rs.getString(1);
            list.add(x);
        }
        return list;
    }
     public static String getSubject(String examid)throws SQLException{
        String s=null;
         Connection conn=DBConnection.getConnection();
        PreparedStatement ps=conn.prepareStatement("select subject from exam where examid=?");
        ps.setString(1, examid);
        ResultSet rs=ps.executeQuery();
        while(rs.next())
        {
        return rs.getString(1);
        }
        return null;
     }
     public static int getTime(String Examid)throws SQLException{
         Connection conn=DBConnection.getConnection();
        PreparedStatement ps=conn.prepareStatement("select time from exam where examid=?");
        ps.setString(1, Examid);
        ResultSet rs=ps.executeQuery();
        while(rs.next())
        {
            return rs.getInt(1);
        }
        return -1;
     }
     public static void setTime(int time,String Examid)throws SQLException{
         Connection conn=DBConnection.getConnection();
        PreparedStatement ps=conn.prepareStatement("update exam set time=? where examid=?");
        ps.setInt(1, time);
        ps.setString(2, Examid);
        int a=ps.executeUpdate();
        
     }
}
     






