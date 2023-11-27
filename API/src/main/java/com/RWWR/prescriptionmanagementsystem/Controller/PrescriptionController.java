package com.RWWR.prescriptionmanagementsystem.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.RWWR.prescriptionmanagementsystem.Model.Account;
import com.RWWR.prescriptionmanagementsystem.Model.Medication;
import com.RWWR.prescriptionmanagementsystem.Model.Prescription;
import com.RWWR.prescriptionmanagementsystem.Service.PrescriptionService;

import org.springframework.web.bind.annotation.PutMapping;

@RestController
@RequestMapping(path="api/prescription")
public class PrescriptionController {
    @Autowired
    private PrescriptionService service; 

    @PostMapping("/addPrescription")
    public ResponseEntity<Prescription> createPrescription(@RequestBody Prescription prescription){
        Prescription createdPrescription = service.createPrescription(prescription.getPatient(), prescription.getMId(), prescription.getActive());
        return ResponseEntity.ok(createdPrescription); 
    }

    // prescription history
    @GetMapping("/{prescription}")
    public Prescription getPrescriptionByID(@PathVariable int prescription_id) {
        return service.getPrescriptionByID(prescription_id);
    }

    // update patient info
    @PutMapping(value="/update/{prescription_id}")
    public ResponseEntity<String> updatePatient(
        @PathVariable int prescription_id, 
        @RequestBody Account account,
        @RequestBody Medication med,
        @RequestBody int isActive
    ) {
        service.updatePrescription(prescription_id, account, med, isActive);
        return ResponseEntity.ok("Fields updated seccessfully");
    }
}
