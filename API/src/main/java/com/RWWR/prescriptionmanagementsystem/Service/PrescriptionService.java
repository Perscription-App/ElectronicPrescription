package com.RWWR.prescriptionmanagementsystem.Service;

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
    public Prescription createPrescription(Account account, Medication med, int isActive) {
        Prescription newPrescription = new Prescription(isActive);
        newPrescription.setPrescriptionId(account);
        newPrescription.setMId(med);
        newPrescription.setPrescriptionId(account);
       
        return prescriptionRepository.save(newPrescription);
    }

    // see prescription
    public Prescription getPrescriptionByID(int prescription_id) {
        return prescriptionRepository.findByPrescriptionID(prescription_id);
    }

    // edit prescription
    public void updatePrescription(int prescription_id, Account account, Medication med, int isActive) {
        prescriptionRepository.updatePrescription(prescription_id, account, med, isActive);
    }
}
