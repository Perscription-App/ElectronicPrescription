package com.RWWR.prescriptionmanagementsystem.Repositiory;

import jakarta.transaction.Transactional;

import java.util.List;

import com.RWWR.prescriptionmanagementsystem.Model.Prescription;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface PrescriptionRepository extends JpaRepository<Prescription, Integer> {
    Prescription findByPrescriptionId(int prescriptionId);
    List<Prescription> findByAccountId(int id);

    @Modifying
    @Transactional
    @Query("UPDATE Prescription i SET i.accountId = :accountId, i.medId = :medId, i.isActive = :isActive WHERE i.prescriptionId = :prescriptionId")
    void updatePrescription(@Param("prescriptionId") int patientId, @Param("accountId") int accountId, @Param("medId") int medId, @Param("isActive") int isActive);
}
