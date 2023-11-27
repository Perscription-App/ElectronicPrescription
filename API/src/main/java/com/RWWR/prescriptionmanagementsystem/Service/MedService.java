package com.RWWR.prescriptionmanagementsystem.Service;

import com.RWWR.prescriptionmanagementsystem.Model.Medication;
import com.RWWR.prescriptionmanagementsystem.Repositiory.MedicationRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MedService {
    @Autowired
    private MedicationRepository medicationRepository;
    
    // shows all medicine
    public List<Medication> getAllMedication() {
        return medicationRepository.findAll();
    }

    // search by medicine
    public List<Medication> getMedByMedName(String medName) {
        return medicationRepository.findByMedName(medName);
    }

    // search by brand
    public List<Medication> getMedByBrandName(String brandName) {
        return medicationRepository.findByBrandName(brandName);
    }

    // creates new medicine
    public Medication addMedication(String medName, String brandName, String dosage, String sideEffect) {
        Medication newMed = new Medication();
        newMed.setMedName(medName);
        newMed.setBrand(brandName);
        newMed.setDosage(dosage);
        newMed.setSideEffect(sideEffect);
        return medicationRepository.save(newMed);
    }

    // removes medicine
    public void deleteMed(int med_id) {
        medicationRepository.deleteById(med_id);
    }

    // updates medicine
    public void updateMedicine(Integer med_id, String medName, String brandName, String dosage, String sideEffect) {
        medicationRepository.updateMedName(med_id, medName, brandName, dosage, sideEffect);
    }
}
