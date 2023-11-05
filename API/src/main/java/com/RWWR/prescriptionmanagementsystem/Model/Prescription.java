package com.RWWR.prescriptionmanagementsystem.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;


/*
 * Prescription Creation: Allow healthcare professionals (doctors, nurses, etc.) to 
 * create electronic prescriptions for patients. Each prescription should include patient 
 * details, medication information (name, dosage, frequency), diagnosis, and doctor's notes.
 */
@Entity
public class Prescription {
    
    @Id
    @SequenceGenerator(
        name = "prescription_id_sequence", 
        sequenceName = "prescription_id_sequence",
        // this sets how much the id increases in the sequence. 
        allocationSize = 1
    )
    @GeneratedValue(
        strategy = GenerationType.SEQUENCE, 
        generator = "prescription_sequence"
    )
    private int id;

    private String patientName; 
    private Integer patient_id; 
    //-------------getter and setters ---------------------
    public Prescription(){}
    public Prescription(String patientName, Integer patient_id) {
        this.patientName = patientName; 
        this.patient_id = patient_id; 
    }

    //---------------getter and setters-----------------------
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getPName() {
        return patientName;
    }
    public void setPName(String patientName) {
        this.patientName = patientName;
    }
    public Integer getPId() {
        return patient_id;
    }
    public void setPId(Integer patient_Id) {
        this.patient_id = patient_Id;
    }

    
    
}
