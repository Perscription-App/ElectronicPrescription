package com.RWWR.prescriptionmanagementsystem.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;

@Entity
public class Attempt {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String username;
    private int attempts;

    public Attempt(){}
    public Attempt(String username, int attempts) {
        this.username = username; 
        this.attempts = attempts;
    }
    //---------------getter and setters-----------------------
    public int getAttemptId() {
        return id;
    }
    public void setAttemptId(int id) {
        this.id = id;
    }
    public String getUsername() {
        return username;
    }
    public void setUsername(String username) {
        this.username = username;
    }
    public int getAttempt() {
        return attempts;
    }
    public void setAttempt(int attempts) {
        this.attempts = attempts;
    }
}

