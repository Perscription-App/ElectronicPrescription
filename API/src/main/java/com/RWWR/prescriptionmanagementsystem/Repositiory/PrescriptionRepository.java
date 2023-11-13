package com.RWWR.prescriptionmanagementsystem.Repositiory;

import org.springframework.data.jpa.repository.JpaRepository;

import com.RWWR.prescriptionmanagementsystem.Model.Prescription;
public interface PrescriptionRepository extends JpaRepository<Prescription,Integer> {

}