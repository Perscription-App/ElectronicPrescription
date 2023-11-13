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
    record NewAccount (@NotBlank String username, @NotBlank String password, @Min(0) Integer isDoctor) {}

    @PostMapping("/account"}
    public ResponseEntity<?> registerAccount(@RequestBody NewAccount request) {
        try {
            Account account = new Account(request.getUsername(), request.getPassword(), request.getIsDoctor());
            Account addedAccount = service.newAccount(account);
            return ResponseEntity.ok(addedAccount);
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("Registration failed: " + e.getMessage());
        }
    }

    @PostMapping("/login")
    public ResponseEntity<Account> loginAccount(@RequestBody NewAccount request) {
        try {
            Account account = new Account(request.getUsername(), request.getPassword(), request.getIsDoctor());
            Account existingAccount = service.accountExists(account);
            if (existingAccount != null) {
                return ResponseEntity.ok(existingAccount);
            } else {
                return ResponseEntity.notFound().build();
            }
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("Login failed: " + e.getMessage());
        }
    }




}


