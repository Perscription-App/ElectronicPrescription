package com.RWWR.prescriptionmanagementsystem.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;

@Entity
public class Account {
    @Id
    @SequenceGenerator(
        name = "account_id_sequence", 
        sequenceName = "account_id_sequence",
        // this sets how much the id increases in the sequence. 
        allocationSize = 1
    )
    @GeneratedValue(
        strategy = GenerationType.SEQUENCE, 
        generator = "account_sequence"
    )
    private int id;

    private String username;
    private String password;
    private int isDoctor;
    private String name; 
    private int age; 
    private Gender gender;

    public Account(){}
    public Account(String username, String password, int isDoctor, String name, int age, Gender gender) {
        this.username = username; 
        this.password = password;
        this.isDoctor = isDoctor;
        this.name = name;
        this.age = age;
        this.gender = gender;
    }
    //---------------getter and setters-----------------------
    public int getAccountId() {
        return id;
    }
    public void setAccountId(int id) {
        this.id = id;
    }
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
    public int getOccupation() {
        return isDoctor;
    }
    public void setOccupation(int isDoctor) {
        this.isDoctor = isDoctor;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public Gender getGender() {
        return gender;
    }
    public void setGender(Gender gender) {
        this.gender = gender;
    }
}
