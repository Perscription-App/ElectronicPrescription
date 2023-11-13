package com.RWWR.prescriptionmanagementsystem.Service;

import com.RWWR.prescriptionmanagementsystem.Model.Account;
import com.RWWR.prescriptionmanagementsystem.Model.Medication;
import com.RWWR.prescriptionmanagementsystem.Repositiory.AccountRepository;
import com.RWWR.prescriptionmanagementsystem.Repositiory.MedicationRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MedService {
    @Autowired
    private MedicationRepository medicationRepository;

    public List<Medication> getAllMedication() {
        return medicationRepository.findAll();
    }

    public Medication createMed(Medication med) {
        return medicationRepository.save(med);
    }

    public List<Medication> getMedByMedName(String name) {
        return medicationRepository.findByMedName(name);
    }

    public Medication addMedication(String medName, String brandName, String dosage, String sideEffect) {
        Medication newMed = new Medication();
        newMed.setMedName(medName);
        newMed.setBrand(brandName);
        newMed.setDosage(dosage);
        newMed.setSideEffect(sideEffect);
        return medicationRepository.save(newMed);
    }

    public void deleteMed(int med_id) {
        medicationRepository.deleteById(med_id);
    }

    public void updateMedicine(Integer med_id, String medName, String brandName, String dosage, String sideEffect) {
        medicationRepository.updateMedName(med_id, medName, brandName, dosage, sideEffect);
    }
}
