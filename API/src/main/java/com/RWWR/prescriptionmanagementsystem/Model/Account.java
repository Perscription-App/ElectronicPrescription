package com.RWWR.prescriptionmanagementsystem.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Account {
    @Id
    private String username;

    private String password;
    private String roles; // 
    private boolean isLocked;

    public Account(){}
    public Account(String username, String password, String roles, boolean isLocked) {
        this.username = username; 
        this.password = password;
        this.roles = roles;
        this.isLocked = isLocked;
    }
    //---------------getter and setters-----------------------
    public String getUsername() {
        return username;
    }
    public void setUsername(String username) {
        this.username = username;
    }
    public String getPass() {
        return password;
    }
    public void setPass(String password) {
        this.password = password;
    }
    public String getRoles() {
        return roles;
    }
    public void setRoles(String roles) {
        this.roles = roles;
    }
    public boolean getLock() {
        return isLocked;
    }
    public void setLock(boolean isLocked) {
        this.isLocked = isLocked;
    }
}
