package com.RWWR.prescriptionmanagementsystem.Repositiory;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.RWWR.prescriptionmanagementsystem.Model.Gender;
import com.RWWR.prescriptionmanagementsystem.Model.Patient;

import jakarta.transaction.Transactional;

public interface PatientRepository extends JpaRepository<Patient,Integer>{
    List<Patient> findByPatientId(int id);

    @Modifying
    @Transactional
    @Query("UPDATE Patient i SET i.name = :name, i.age = :age, i.gender = :gender WHERE i.patient_id = :patient_id")
    void updatePatient(@Param("patient_id") int patient_id, @Param("name") String name, @Param("age") int age, @Param("gender") Gender gender);
}
