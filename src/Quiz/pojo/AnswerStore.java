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
public class AnswerStore {
    ArrayList<Answer> AnswerList;
    public AnswerStore()
    {
        AnswerList=new ArrayList<>();
    }
    public void addAnswer(Answer answer)
    {
        AnswerList.add(answer);
    }
    public Answer getAnswer(int pos)
    {
        return AnswerList.get(pos);
    }
    public void removeAnswer(int pos)
    {
        AnswerList.remove(pos);
    }
    public void setAnswerAt(int pos,Answer answer)
    {
        AnswerList.add(pos, answer);
    }
    public ArrayList<Answer> getAllQuestions()
    {
        return AnswerList;
    }
    public int getCount()
    {
        return AnswerList.size();
    }
    public Answer getAnswerByQno(int qno)
    {
        for(Answer a:AnswerList)
        {
            if(a.getQno()==qno)
            {
                return a;
            }
        }
        return null;
    }
    public int removeAnswer(Answer answer)
    {
        int pos=AnswerList.lastIndexOf(answer);
        AnswerList.remove(pos);
        return pos;
    }
    
    
    
}
