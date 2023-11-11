package com.RWWR.prescriptionmanagementsystem.Repositiory;

import com.RWWR.prescriptionmanagementsystem.Model.Medication;

import jakarta.transaction.Transactional;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;


@Repository
public interface MedicationRepository extends JpaRepository<Medication, Integer>{
    List<Medication> findByMedName(String medName);

    @Modifying
    @Transactional
    @Query("UPDATE Medication i SET i.medName = :medName, i.brandName = :brandName, i.dosage = :dosage, i.sideEffect = :sideEffect WHERE i.med_id = :_med_id")
    void updateMedName(@Param("_med_id") Integer med_id, @Param("medName") String medName, @Param("brandName") String brandName, @Param("dosage") String dosage, @Param("sideEffect") String sideEffect);
}
