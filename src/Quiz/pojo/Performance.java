/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Quiz.pojo;

/**
 *
 * @author gouru
 */
public class Performance {
    
    private String userid;
    private String Examid;
    private int right;
    private int wrong;
    private int unttempted;
    private double per;
    private String subject;

    public Performance(String userid, String Examid, int right, int wrong, int unttempted, double per, String subject) {
        this.userid = userid;
        this.Examid = Examid;
        this.right = right;
        this.wrong = wrong;
        this.unttempted = unttempted;
        this.per = per;
        this.subject = subject;
    }

    

    
    
    public String getExamid() {
        return Examid;
    }

    public void setExamid(String Examid) {
        this.Examid = Examid;
    }

    public String getUserid() {
        return userid;
    }

    public void setUserid(String userid) {
        this.userid = userid;
    }

    public int getRight() {
        return right;
    }

    public void setRight(int right) {
        this.right = right;
    }

    public int getWrong() {
        return wrong;
    }

    public void setWrong(int wrong) {
        this.wrong = wrong;
    }

    public int getUnttempted() {
        return unttempted;
    }

    public void setUnttempted(int unttempted) {
        this.unttempted = unttempted;
    }

    public double getPer() {
        return per;
    }

    public void setPer(double per) {
        this.per = per;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }
    
    
}
