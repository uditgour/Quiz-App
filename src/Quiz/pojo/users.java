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
public class users {
    private String Username;
    private String Password;
    private String Usertype;

    public String getUserid() {
        return Username;
    }

    public void setUserid(String Userid) {
        this.Username = Userid;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String Password) {
        this.Password = Password;
    }

    public String getUsertype() {
        return Usertype;
    }

    public void setUsertype(String Usertype) {
        this.Usertype = Usertype;
    }

    
}
