package com.RWWR.prescriptionmanagementsystem.Controller;

import com.RWWR.prescriptionmanagementsystem.Model.Account;
import com.RWWR.prescriptionmanagementsystem.Service.AccountService;
import org.springframework.web.bind.annotation.*;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

@RestController
@RequestMapping(path = "api/v1/register")
public class RegistrationController {
    private final AccountService service;

    public RegistrationController(AccountService service) { this.service = service;}

    @PostMapping("/account")
    public ResponseEntity<?> registerAccount(@RequestBody Account request) {
        try {
            Account account = new Account(request.getUsername(), request.getPass(), request.getRoles(), request.getLock());
            Account addedAccount = service.newAccount(account);
            return ResponseEntity.ok(addedAccount);
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("Registration failed: " + e.getMessage());
        }
    }

    @PostMapping("/login")
    public ResponseEntity<String> loginAccount(@RequestBody Account request) {
        try {
            Account account = new Account(request.getUsername(), request.getPass(), request.getRoles(), request.getLock());
            Account existingAccount = service.accountExists(account);
            if (existingAccount != null) {
                return ResponseEntity.ok("Logged in to: " + existingAccount.getUsername());
            } else {
                return ResponseEntity.notFound().build();
            }
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("Login failed: " + e.getMessage());
        }
    }
}