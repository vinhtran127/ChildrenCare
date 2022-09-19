/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Models;

import java.sql.Date;
import java.sql.Timestamp;

/**
 *
 * @author Dell
 */
public class ReservationService {
    private int id;
    private Reservation reservation;
    private Service service;
    private int status;
    private Date dob;
    private int numberOfPeople;
    private Date checkUpDate;

    public ReservationService() {
    }

    public ReservationService(int id, Reservation reservation, Service service, int status, Date dob, int numberOfPeople, Date checkUpTime) {
        this.id = id;
        this.reservation = reservation;
        this.service = service;
        this.status = status;
        this.dob = dob;
        this.numberOfPeople = numberOfPeople;
        this.checkUpDate = checkUpTime;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Reservation getReservation() {
        return reservation;
    }

    public void setReservation(Reservation reservation) {
        this.reservation = reservation;
    }

    public Service getService() {
        return service;
    }

    public void setService(Service service) {
        this.service = service;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public Date getDob() {
        return dob;
    }

    public void setDob(Date dob) {
        this.dob = dob;
    }

    public int getNumberOfPeople() {
        return numberOfPeople;
    }

    public void setNumberOfPeople(int numberOfPeople) {
        this.numberOfPeople = numberOfPeople;
    }

    public Date getCheckUpDate() {
        return checkUpDate;
    }

    public void setCheckUpDate(Date checkUpDate) {
        this.checkUpDate = checkUpDate;
    }

   

   
}
