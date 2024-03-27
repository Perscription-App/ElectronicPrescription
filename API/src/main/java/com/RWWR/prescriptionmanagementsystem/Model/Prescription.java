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
    private int prescriptionId;
    //-------------foreign keys ---------------------
    private int accountId; 
    private int medId;
    // 0 = inactive 
    // 1 = active
    private int isActive;
    //-------------getter and setters ---------------------
    public Prescription(int isActive){
        this.isActive = isActive;
    }

    public int getAccountId() {
        return accountId;
    }
    public void setAccountId(int patient) {
        this.accountId = patient;
    }
    
    public int getMId() {
        return medId;
    }
    public void setMId(int med) {
        this.medId = med;
    }
    public int getActive() { 
        return isActive;
    }
    public void setActive(int isActive) {
        this.isActive = isActive;
    }
    
}
