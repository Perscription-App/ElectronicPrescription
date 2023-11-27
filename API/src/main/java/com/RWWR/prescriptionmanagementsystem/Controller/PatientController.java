package com.RWWR.prescriptionmanagementsystem.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.RWWR.prescriptionmanagementsystem.Model.Gender;
import com.RWWR.prescriptionmanagementsystem.Model.Patient;
import com.RWWR.prescriptionmanagementsystem.Model.Prescription;
import com.RWWR.prescriptionmanagementsystem.Service.PatientService;

@RestController
@RequestMapping(path="api/v1/patients")
public class PatientController {
    @Autowired
    private PatientService service; 

    // lists all the patients
    @GetMapping
    public List<Patient> getpatients(){
        return service.getAllPatients(); 
    }

    // prescription history
    @GetMapping("/{patient_id}")
    public List<Prescription> getMedByBrandName(@PathVariable int patient_id) {
        return service.getPrescriptionForUser(patient_id);
    }

    // update patient info
    @PutMapping(value="/update/{patient_id}")
    public ResponseEntity<String> updatePatient(
        @PathVariable int patient_id, 
        @RequestBody String name,
        @RequestBody int age,
        @RequestBody Gender gender
    ) {
        service.updatePatientInfo(patient_id, name, age, gender);
        return ResponseEntity.ok("Fields updated seccessfully");
    }
}
