package com.RWWR.prescriptionmanagementsystem.Service;
import java.time.LocalDateTime;
import java.util.UUID;
import org.springframework.stereotype.Service;
import com.RWWR.prescriptionmanagementsystem.Model.Prescription;
import com.RWWR.prescriptionmanagementsystem.Repositiory.PrescriptionRepository;
import org.springframework.web.bind.annotation.RequestBody;

@Service
public class PrescriptionService{
    private final PrescriptionRepository repo;


    public PrescriptionService(PrescriptionRepository repo) {
        this.repo = repo;
    }

    public Prescription createPrecription(Prescription prescriptionData){
        if (prescriptionData.getPName() == null) {
            throw new IllegalArgumentException("Patient medication name is required.");
        }
        prescriptionData.setPId(generateUniqueID());
        prescriptionData.setCreationTime(LocalDateTime.now());
        return repo.save(prescriptionData);
    }

    public void addPrescription(@RequestBody Prescription prescriptionData){
        repo.save(prescriptionData);
    }

    private Integer generateUniqueID() {
        UUID uuid = UUID.randomUUID();
        long mostSignificantBits = uuid.getMostSignificantBits();
        long leastSignificantBits = uuid.getLeastSignificantBits();
        return (int) (mostSignificantBits ^ leastSignificantBits);
    }

}