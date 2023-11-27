package com.RWWR.prescriptionmanagementsystem.Repositiory;

import jakarta.transaction.Transactional;

import java.util.List;

import com.RWWR.prescriptionmanagementsystem.Model.Account;
import com.RWWR.prescriptionmanagementsystem.Model.Medication;
import com.RWWR.prescriptionmanagementsystem.Model.Prescription;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface PrescriptionRepository extends JpaRepository<Prescription, Integer> {
    Prescription findByPrescriptionID(int prescription_id);
    List<Prescription> findByPatientId(int id);

    @Modifying
    @Transactional
    @Query("UPDATE Prescription i SET i.patient = :patient, i.med = :med, i.isActive = :isActive WHERE i.prescription_id = :prescription_id")
    void updatePrescription(@Param("prescription_id") int patient_id, @Param("patient") Account patient, @Param("med") Medication med, @Param("isActive") int isActiver);
}
