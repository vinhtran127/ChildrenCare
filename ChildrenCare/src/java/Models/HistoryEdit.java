/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Models;

import java.sql.Date;

/**
 *
 * @author Nguyen Minh Hoang
 */
public class HistoryEdit {
    private int id;
    private Function function;
    private User user;
    private Date dob;

    public HistoryEdit() {
    }

    public HistoryEdit(int id, Function function, User user, Date dob) {
        this.id = id;
        this.function = function;
        this.user = user;
        this.dob = dob;
    }

    public Date getDob() {
        return dob;
    }

    public void setDob(Date dob) {
        this.dob = dob;
    }

    

   

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Function getFunction() {
        return function;
    }

    public void setFunction(Function function) {
        this.function = function;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
    
}
