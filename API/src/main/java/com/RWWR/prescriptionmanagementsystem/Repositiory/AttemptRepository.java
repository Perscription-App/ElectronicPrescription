package com.RWWR.prescriptionmanagementsystem.Repositiory;

import com.RWWR.prescriptionmanagementsystem.Model.Attempt;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


import java.util.Optional;

@Repository
public interface AttemptRepository extends JpaRepository<Attempt, Integer> {
    Optional<Attempt> findAllAttemptsByUsername(String username);
}
