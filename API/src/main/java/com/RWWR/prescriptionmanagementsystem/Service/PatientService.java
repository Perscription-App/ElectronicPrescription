package com.RWWR.prescriptionmanagementsystem.Service;


import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import com.RWWR.prescriptionmanagementsystem.Model.Patient;
import com.RWWR.prescriptionmanagementsystem.Repositiory.PatientRepository;

@Service
public class PatientService {
    private final PatientRepository repo; 

    public PatientService(PatientRepository repo){
        this.repo = repo; 
    }
    public List<Patient> getpatients() {
        return repo.findAll();
    }
    public void addPatient(@RequestBody Patient patient) {
        repo.save(patient); 
    }

}
