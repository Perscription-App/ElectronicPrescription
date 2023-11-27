package com.RWWR.prescriptionmanagementsystem.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.RWWR.prescriptionmanagementsystem.Model.Account;
import com.RWWR.prescriptionmanagementsystem.Model.Medication;
import com.RWWR.prescriptionmanagementsystem.Model.Prescription;
import com.RWWR.prescriptionmanagementsystem.Repositiory.PrescriptionRepository;

@Service
public class PrescriptionService {
    @Autowired
    private PrescriptionRepository prescriptionRepository; 
    
    // create prescription
    public Prescription createPrescription(Prescription prescription) {
        return prescriptionRepository.save(prescription);
    }

    // see prescription
    public Prescription getMedByMedName(int prescription_id) {
        return prescriptionRepository.findByPrescriptionID(prescription_id);
    }

    // edit prescription
    public void updatePrescription(int prescription_id, Account account, Medication med, int isActive) {
        prescriptionRepository.updatePrescription(prescription_id, account, med, isActive);
    }
}
