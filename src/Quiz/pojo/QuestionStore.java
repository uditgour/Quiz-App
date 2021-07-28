/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Quiz.pojo;

import java.util.ArrayList;

/**
 *
 * @author gouru
 */
public class QuestionStore {
    ArrayList<Question> QuestionList;
    public QuestionStore()
    {
        QuestionList=new ArrayList<>();       
    }
    public void addQuestion(Question q)
    {
        QuestionList.add(q);
    }
    public Question getQuestion(int pos)
    {
        return QuestionList.get(pos);
    }
    public void removeQuestion(int pos)
    {
        QuestionList.remove(pos);
    }
    public void setQuestionAt(int pos,Question q)
    {
        QuestionList.add(pos,q);
    }
    public ArrayList<Question> getAllQuestions()
    {
        return QuestionList;
    }
    public int getCOunt()
    {
        return QuestionList.size();
    }
}
