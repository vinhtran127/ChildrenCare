/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Models;

/**
 *
 * @author Dell
 */
public class Feedback {
    private int id;
    private User user;
    private int ratedStar;
    private String content;
    private Service service;

    public Feedback() {
    }

    public Feedback(int id, User user, int ratedStar, String content, Service service) {
        this.id = id;
        this.user = user;
        this.ratedStar = ratedStar;
        this.content = content;
        this.service = service;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public int getRatedStar() {
        return ratedStar;
    }

    public void setRatedStar(int ratedStar) {
        this.ratedStar = ratedStar;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Service getService() {
        return service;
    }

    public void setService(Service service) {
        this.service = service;
    }

    
    
   

    
    
    
}
