package com.RWWR.prescriptionmanagementsystem.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.RWWR.prescriptionmanagementsystem.Model.Medication;
import com.RWWR.prescriptionmanagementsystem.Service.MedService;

@RestController
@RequestMapping(path="api/v1/medication")
public class MedicationController {
    @Autowired
    private MedService medService;
    
    @GetMapping
    public List<Medication> getAllMed() {
        return medService.getAllMedication();
    }

    @GetMapping("/byMedName/{medName}")
    public List<Medication> getMedByMedName(@PathVariable String medName) {
        return medService.getMedByMedName(medName);
    }
}
