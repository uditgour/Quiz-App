/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Quiz.pojo;

import java.util.Objects;

/**
 *
 * @author gouru
 */
public class Answer {
    private String examid;
    private String Subject;
    private int qno;
    private String chooseAnswer;
    private String correctAnswer;

    public Answer(String examid, String Subject, int qno, String chooseAnswer, String correctAnswer) {
        this.examid = examid;
        this.Subject = Subject;
        this.qno = qno;
        this.chooseAnswer = chooseAnswer;
        this.correctAnswer = correctAnswer;
    }

    
    
    public String getExamid() {
        return examid;
    }

    public void setExamid(String examid) {
        this.examid = examid;
    }

    public String getSubject() {
        return Subject;
    }

    public void setSubject(String Subject) {
        this.Subject = Subject;
    }

    public int getQno() {
        return qno;
    }

    public void setQno(int qno) {
        this.qno = qno;
    }

    public String getChooseAnswer() {
        return chooseAnswer;
    }

    public void setChooseAnswer(String chooseAnswer) {
        this.chooseAnswer = chooseAnswer;
    }

    public String getCorrectAnswer() {
        return correctAnswer;
    }

    public void setCorrectAnswer(String correctAnswer) {
        this.correctAnswer = correctAnswer;
    }

    @Override
    public String toString() {
        return "Answer{" + "examid=" + examid + ", Subject=" + Subject + ", qno=" + qno + ", chooseAnswer=" + chooseAnswer + ", correctAnswer=" + correctAnswer + '}';
    }

    @Override
    public int hashCode() {
        int hash = 7;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Answer other = (Answer) obj;
        if (this.qno != other.qno) {
            return false;
        }
        if (!Objects.equals(this.examid, other.examid)) {
            return false;
        }
        if (!Objects.equals(this.Subject, other.Subject)) {
            return false;
        }
        if (!Objects.equals(this.chooseAnswer, other.chooseAnswer)) {
            return false;
        }
        if (!Objects.equals(this.correctAnswer, other.correctAnswer)) {
            return false;
        }
        return true;
    }
    
    
}
