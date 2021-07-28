/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Quiz.DAO;

import Quiz.dbutil.DBConnection;
import Quiz.pojo.ExamProfile;
import Quiz.pojo.Question;
import Quiz.pojo.QuestionStore;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author gouru
 */
public class QuestionDAO {
    public static void setQuestions(QuestionStore qStore)throws SQLException
    {
        Connection conn=DBConnection.getConnection();
        PreparedStatement ps=conn.prepareStatement("insert into question values(?,?,?,?,?,?,?,?,?)");
        ArrayList<Question> list=qStore.getAllQuestions();
        for(Question q:list)
        {
        ps.setString(1, q.getExamid());
        ps.setInt(2, q.getQno());
        ps.setString(3, q.getQuestion());
        ps.setString(4, q.getAnswer1());
        ps.setString(5, q.getAnswer2());
        ps.setString(6, q.getAnswer3());
        ps.setString(7, q.getAnswer4());
        ps.setString(8, q.getCorrectanswer());
        ps.setString(9, q.getSubject());
        
        int a=ps.executeUpdate();
        }
        
    }
        public static ArrayList<Question> getQuestions(String examid)throws SQLException{
            
            ArrayList<Question> list=new ArrayList<Question>();
            Connection conn=DBConnection.getConnection();
            PreparedStatement ps=conn.prepareStatement("select * from question where examid=?");
            ps.setString(1, examid);
            ResultSet rs=ps.executeQuery();
            while(rs.next())
            {
                Question q=new Question(rs.getString(1),rs.getInt(2),rs.getString(3),rs.getString(4),rs.getString(5),rs.getString(6),rs.getString(7),rs.getString(8),rs.getString(9));
                list.add(q);
            }
            Collections.sort(list);
            return list;
        }
        
        public static void updateQuestion(QuestionStore qs)throws SQLException
        {
            int a;
            Connection conn=DBConnection.getConnection();
        PreparedStatement ps=conn.prepareStatement("update question set question=?,answer1=?,answer2=?,answer3=?,answer4=?,correct_answer=? where qno=? and examid=?");
        ArrayList<Question> list=qs.getAllQuestions();
        for(Question q:list)
        {
        ps.setString(1, q.getQuestion());
        ps.setString(2, q.getAnswer1());
        ps.setString(3, q.getAnswer2());
        ps.setString(4, q.getAnswer3());
        ps.setString(5, q.getAnswer4());
        ps.setString(6, q.getCorrectanswer());
        ps.setInt(7, q.getQno());
        ps.setString(8, ExamProfile.getExamid());
        
         a=ps.executeUpdate();
        
        }
        
}
        public static ArrayList<String> getAnswers(String examid)throws SQLException{
            
            ArrayList<String> list=new ArrayList<String>();
            Connection conn=DBConnection.getConnection();
            PreparedStatement ps=conn.prepareStatement("select correct_answer from question where examid=?");
            ps.setString(1, examid);
            ResultSet rs=ps.executeQuery();
            while(rs.next())
            {
                list.add(rs.getString(1));
            }
           
            return list;
        }
}



