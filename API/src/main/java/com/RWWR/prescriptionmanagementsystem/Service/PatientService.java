package com.RWWR.prescriptionmanagementsystem.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import org.springframework.web.bind.annotation.RequestBody;

import com.RWWR.prescriptionmanagementsystem.Model.Gender;
import com.RWWR.prescriptionmanagementsystem.Model.Patient;
import com.RWWR.prescriptionmanagementsystem.Repositiory.PatientRepository;
import com.RWWR.prescriptionmanagementsystem.Model.Prescription;
import com.RWWR.prescriptionmanagementsystem.Repositiory.PrescriptionRepository;

@Service
public class PatientService {
    @Autowired
    private PatientRepository patientRepository; 
    @Autowired
    private PrescriptionRepository prescriptionRepository; 
    // gathers every patient
    public List<Patient> getAllPatients() {
        return patientRepository.findAll();
    }
    // sees user's prescription history
    public List<Prescription> getPrescriptionForUser(int id) {
        return prescriptionRepository.findByPatientId(id);
    }
    // updates patient info
    public void updatePatientInfo(int patient_id, String name, int age, Gender gender) {
        patientRepository.updatePatient(patient_id, name, age, gender);
    }

}
