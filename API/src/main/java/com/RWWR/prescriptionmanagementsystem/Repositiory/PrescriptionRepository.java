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
    List<Prescription> findByPatientId(int patient_id);
    
}
