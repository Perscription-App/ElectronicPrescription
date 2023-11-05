package com.RWWR.prescriptionmanagementsystem.Repositiory;

import org.springframework.data.jpa.repository.JpaRepository;

import com.RWWR.prescriptionmanagementsystem.Model.Patient;

public interface PatientRepository extends JpaRepository<Patient,Integer>{

}
