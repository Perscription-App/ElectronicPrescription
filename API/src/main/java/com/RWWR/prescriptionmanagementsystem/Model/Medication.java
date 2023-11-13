package com.RWWR.prescriptionmanagementsystem.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;

@Entity
public class Medication {
    @Id
    @SequenceGenerator(
        name = "med_id_sequence", 
        sequenceName = "med_id_sequence",
        // this sets how much the id increases in the sequence. 
        allocationSize = 1
    )
    @GeneratedValue(
        strategy = GenerationType.SEQUENCE, 
        generator = "med_id_sequence"
    )
    private int med_id;

    private String medName;
    private String brandName;
    private String dosage;
    private String sideEffect; 
    //-------------getter and setters ---------------------
    public Medication(){}
    public Medication(String medName, String brandName, String dosage, String sideEffect) {
        this.medName = medName; 
        this.brandName = brandName; 
        this.dosage = dosage;
        this.sideEffect = sideEffect;
    }

    //---------------getter and setters-----------------------
    public int getMedId() {
        return med_id;
    }
    public void setMedId(int id) {
        this.med_id = med_id;
    }
    public String getMedName() {
        return medName;
    }
    public void setMedName(String medName) {
        this.medName = medName;
    }
    public String getBrand() {
        return brandName;
    }
    public void setBrand(String brandName) {
        this.brandName = brandName;
    }
    public String getDosage() {
        return dosage;
    }
    public void setDosage(String dosage) {
        this.dosage = dosage;
    }
    public String getSideEffect() {
        return sideEffect;
    }
    public void setSideEffect(String sideEffect) {
        this.sideEffect = sideEffect;
    }
}
