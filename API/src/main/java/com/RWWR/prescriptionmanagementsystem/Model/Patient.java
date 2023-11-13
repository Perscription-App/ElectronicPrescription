package com.RWWR.prescriptionmanagementsystem.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
/*
 * Patient Management: Enable healthcare professionals to manage patient records, 
 * including personal information, medical history, and prescription history.
 */
@Entity
public class Patient{

    // auto increment id
    @Id
    @SequenceGenerator(
        name = "patient_id_sequence", 
        sequenceName = "patient_id_sequence",
        // this sets how much the id increases in the sequence. 
        allocationSize = 1
    )
    @GeneratedValue(
        strategy = GenerationType.SEQUENCE, 
        generator = "patient_id_sequence"
    )
    private int patient_id; 
    
    // INITIALIZE FIELDS,  patient records, including personal 
    //information, medical history, and prescription history.
    //TO DO: add more fields maybe
    
    private String name; 
    private int age; 
    private Gender gender;

    //no args constructer and 2 args constructor
    public Patient(){}
    public Patient(String name, Gender gender, int age) {
        this.name = name; 
        this.gender = gender; 
        this.age = age; 
    }

    //---------------getter and setters-----------------------
    public int getPatientId() {
        return patient_id;
    }
    public void setPatientId(int patient_id) {
        this.patient_id = patient_id;
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
