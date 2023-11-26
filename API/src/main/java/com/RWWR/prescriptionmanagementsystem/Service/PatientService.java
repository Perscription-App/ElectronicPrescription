package com.RWWR.prescriptionmanagementsystem.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import org.springframework.web.bind.annotation.RequestBody;

import com.RWWR.prescriptionmanagementsystem.Model.Account;
import com.RWWR.prescriptionmanagementsystem.Repositiory.AccountRepository;
import com.RWWR.prescriptionmanagementsystem.Model.Prescription;
import com.RWWR.prescriptionmanagementsystem.Repositiory.PrescriptionRepository;

@Service
public class PatientService {
    @Autowired
    private AccountRepository accountRepository; 
    @Autowired
    private PrescriptionRepository prescriptionRepository; 

    public List<Account> getAllPatients() {
        return accountRepository.findAll();
    }

    public List<Prescription> getPrescriptionForUser(int id) {
        return prescriptionRepository.findByPatientId(id);
    }

}
