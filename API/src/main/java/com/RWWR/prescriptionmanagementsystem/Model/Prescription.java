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
        generator = "prescription_id_sequence"
    )
    private int prescription_id;

    private String patientName; 
    private int patient_id; 
    private int med_id;
    //-------------getter and setters ---------------------
    public Prescription(){}
    public Prescription(String patientName, int patient_id) {
        this.patientName = patientName; 
        this.patient_id = patient_id; 
    }

    //---------------getter and setters-----------------------
    public int getPrescriptionId() {
        return prescription_id;
    }
    public void setPrescriptionId(int prescription_id) {
        this.prescription_id = prescription_id;
    }
    public String getPName() {
        return patientName;
    }
    public void setPName(String patientName) {
        this.patientName = patientName;
    }
    public int getPId() {
        return patient_id;
    }
    public void setPId(int patient_Id) {
        this.patient_id = patient_Id;
    }
    public int getMId() {
        return med_id;
    }
    public void setMId(int med_id) {
        this.med_id = med_id;
    }

    
    
}
