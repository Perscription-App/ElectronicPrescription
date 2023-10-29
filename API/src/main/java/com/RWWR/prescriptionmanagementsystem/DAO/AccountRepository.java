package com.RWWR.prescriptionmanagementsystem.DAO;

import com.RWWR.prescriptionmanagementsystem.Model.Account;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface AccountRepository  extends JpaRepository<Account, String> {
    public Optional<Account> findByUsername(String email);
}
