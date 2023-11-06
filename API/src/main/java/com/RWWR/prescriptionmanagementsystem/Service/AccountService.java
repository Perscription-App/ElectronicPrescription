package com.RWWR.prescriptionmanagementsystem.Service;

import com.RWWR.prescriptionmanagementsystem.DAO.AccountRepository;
import com.RWWR.prescriptionmanagementsystem.Model.Account;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

@Service
public class AccountService{
    private final AccountRepository repo;
    public AccountService(AccountRepository repo) { this.repo = repo;}
    public Account newAccount (Account account) throws Exception {
        if (repo.findByUsername(account.getUsername()).isPresent()) {
            throw new Exception("username already exists!");
        } else {
            repo.save(account);
        }
        return account;
    }

    public Account accountExists (Account account){
        if (repo.findByUsername(account.getUsername()).isPresent()) {
            return account;
        }
        return null;
    }
}
