package com.RWWR.prescriptionmanagementsystem.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.RWWR.prescriptionmanagementsystem.Model.Medication;
import com.RWWR.prescriptionmanagementsystem.Service.MedService;
import org.springframework.web.bind.annotation.PutMapping;


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

    @GetMapping("/byBrandName/{brandName}")
    public List<Medication> getMedByBrandName(@PathVariable String brandName) {
        return medService.getMedByBrandName(brandName);
    }

    @PostMapping("/addMed")
    public ResponseEntity<Medication> addMedication(@RequestBody Medication newMed) {
        Medication createdMed = medService.addMedication(newMed.getMedName(), newMed.getBrand(), newMed.getDosage(), newMed.getSideEffect());
        return ResponseEntity.ok(createdMed);
    }

    @PutMapping(value="/update/{med_id}")
    public ResponseEntity<String> updateMedication(
        @PathVariable Integer med_id, 
        @RequestBody String medName,
        @RequestBody String brandName,
        @RequestBody String dosage,
        @RequestBody String sideEffect
    ) {
        medService.updateMedicine(med_id, medName, brandName, dosage, sideEffect);
        return ResponseEntity.ok("Fields updated seccessfully");
    }

    @DeleteMapping("/{med_id}") 
    public ResponseEntity<String> deleteMed(@PathVariable int med_id) {
        medService.deleteMed(med_id);
        return ResponseEntity.ok("Medication deleted seccessfully");
    }
}
