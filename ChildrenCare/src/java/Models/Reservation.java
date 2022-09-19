    /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Models;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author Dell
 */
public class Reservation {
    private int id;
    private User customer;
    private Date reservationDate;
    private String doctor;
    private String phone;
    private String email;
    private float totalCost;

    public Reservation() {
    }

    public Reservation(int id, User customer, Date reservationDate, String phone, String email, float totalCost, String doctor) {
        this.id = id;
        this.customer = customer;
        this.reservationDate = reservationDate;
        this.doctor = doctor;
        this.phone = phone;
        this.email = email;
        this.totalCost = totalCost;
    }

    public Reservation(int id, Date reservationDate, String phone, String email, float totalCost, String doctor) {
        this.id = id;
        this.reservationDate = reservationDate;
        this.phone = phone;
        this.email = email;
        this.totalCost = totalCost;
        this.doctor = doctor;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public User getCustomer() {
        return customer;
    }

    public void setCustomer(User customer) {
        this.customer = customer;
    }

    public Date getReservationDate() {
        return reservationDate;
    }

    public void setReservationDate(Date reservationDate) {
        this.reservationDate = reservationDate;
    }

    public String getDoctor() {
        return doctor;
    }

    public void setDoctor(String doctor) {
        this.doctor = doctor;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public float getTotalCost() {
        return totalCost;
    }

    public void setTotalCost(float totalCost) {
        this.totalCost = totalCost;
    }

 
    
}
