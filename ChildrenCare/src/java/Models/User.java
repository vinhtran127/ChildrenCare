/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Models;

import java.sql.Date;

/**
 *
 * @author Dell
 */
public class User {

    private int id;
    private String username;
    private String email;
    private String password;
    private String fullName;
    private boolean gender;
    private String mobile;
    private String address;
    private Role role;
    private int status;
    private String dob;
    private String image;

    public User() {
    }

    public User(String email, String fullName, String mobile, String image) {
        this.email = email;
        this.fullName = fullName;
        this.mobile = mobile;
        this.image = image;
    }

    public User(int id, String fullName, String dob, String image) {
        this.id = id;
        this.fullName = fullName;
        this.dob = dob;
        this.image = image;
    }

    public User(int id, String fullName, String image) {
        this.id = id;
        this.fullName = fullName;
        this.image = image;
    }

    public User(int id, String username, String email, String password, String fullName, boolean gender, String mobile, String address, Role role, int status, String dob, String image) {
        this.id = id;
        this.username = username;
        this.email = email;
        this.password = password;
        this.fullName = fullName;
        this.gender = gender;
        this.mobile = mobile;
        this.address = address;
        this.role = role;
        this.status = status;
        this.dob = dob;
        this.image = image;
    }

    public User(int id, String username, String password, String fullName, boolean gender, String mobile, Role role, int status, String dob, String image) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.fullName = fullName;
        this.gender = gender;
        this.mobile = mobile;
        this.role = role;
        this.status = status;
        this.dob = dob;
        this.image = image;
    }

    public User(String username, String email, String password, String fullName, boolean gender, String mobile, String address, int status, String image) {
        this.username = username;
        this.email = email;
        this.password = password;
        this.fullName = fullName;
        this.gender = gender;
        this.mobile = mobile;
        this.address = address;
        this.status = status;
        this.image = image;
    }

    public User(String username, String email, String password, String fullName, boolean gender, String mobile, String address, int status, String image, Role role) {
        this.username = username;
        this.email = email;
        this.password = password;
        this.fullName = fullName;
        this.gender = gender;
        this.mobile = mobile;
        this.address = address;
        this.status = status;
        this.image = image;
        this.role = role;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public boolean isGender() {
        return gender;
    }

    public void setGender(boolean gender) {
        this.gender = gender;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

}
