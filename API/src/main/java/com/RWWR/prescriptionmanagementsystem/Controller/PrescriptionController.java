package com.RWWR.prescriptionmanagementsystem.Controller;

import com.RWWR.prescriptionmanagementsystem.Model.Prescription;
import com.RWWR.prescriptionmanagementsystem.Service.PatientService;
import com.RWWR.prescriptionmanagementsystem.Service.PrescriptionService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "api/v1/prescription")
public class PrescriptionController {
    private final PrescriptionService service;

    public PrescriptionController(PrescriptionService service){ this.service = service;
    }
}
