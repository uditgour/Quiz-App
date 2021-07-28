package Quiz.pojo;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author gouru
 */
public class ExamProfile {
    private static int qno;
    private static String examid;
    private static String subject;
    private static int time;

    public static int getTime() {
        return time;
    }

    public static void setTime(int time) {
        ExamProfile.time = time;
    }
    
    public static String getSubject() {
        return subject;
    }

    public static void setSubject(String subject) {
        ExamProfile.subject = subject;
    }

    public static String getExamid() {
        return examid;
    }

    public static void setExamid(String examid) {
        ExamProfile.examid = examid;
    }

    public static int getQno() {
        return qno;
    }

    public static void setQno(int qno) {
        ExamProfile.qno = qno;
    }
}
