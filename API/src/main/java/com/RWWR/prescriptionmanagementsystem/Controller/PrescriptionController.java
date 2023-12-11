package com.RWWR.prescriptionmanagementsystem.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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
        Prescription createdPrescription = service.createPrescription(prescription.getAccountId(), prescription.getMId(), prescription.getActive());
        return ResponseEntity.ok(createdPrescription); 
    }

    // prescription history
    @GetMapping("/{prescription}")
    public Prescription getPrescriptionByID(@PathVariable int prescriptionId) {
        return service.getPrescriptionByID(prescriptionId);
    }

    // update patient info
    @PutMapping(value="/update/{prescriptionId}")
    public ResponseEntity<String> updatePatient(
        @PathVariable int prescriptionId, 
        @RequestBody int account,
        @RequestBody int med,
        @RequestBody int isActive
    ) {
        service.updatePrescription(prescriptionId, account, med, isActive);
        return ResponseEntity.ok("Fields updated seccessfully");
    }
}
