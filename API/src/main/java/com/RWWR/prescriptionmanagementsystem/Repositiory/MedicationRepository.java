package com.RWWR.prescriptionmanagementsystem.Repositiory;

import com.RWWR.prescriptionmanagementsystem.Model.Medication;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface MedicationRepository extends JpaRepository<Medication, Integer>{
    List<Medication> findByMedName(String medName);
}
