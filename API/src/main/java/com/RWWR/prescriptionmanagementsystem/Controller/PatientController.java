package com.RWWR.prescriptionmanagementsystem.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.RWWR.prescriptionmanagementsystem.Model.Gender;
import com.RWWR.prescriptionmanagementsystem.Model.Account;
import com.RWWR.prescriptionmanagementsystem.Model.Patient;
import com.RWWR.prescriptionmanagementsystem.Service.PatientService;

@RestController
@RequestMapping(path="api/v1/patients")
public class PatientController {
    @Autowired
    private PatientService service; 

    @GetMapping
    public List<Account> getpatients(){
        //System.out.println("We did it");
        return service.getAllPatients(); 
    }

    /**
     * NewPatientRequest
     */
    record NewPatientRequest(String name, Gender gender, int age) {
    }
    @PostMapping
    public void addPatient(@RequestBody NewPatientRequest request){
        Patient patient = new Patient(request.name, request.gender, request.age); 
        service.addPatient(patient); 

    }
}
