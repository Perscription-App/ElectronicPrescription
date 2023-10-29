package com.RWWR.prescriptionmanagementsystem.Controller;

import com.RWWR.prescriptionmanagementsystem.Model.Account;
import com.RWWR.prescriptionmanagementsystem.Service.AccountService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path = "api/v1/register")
public class RegistrationController {
    private final AccountService service;

    public RegistrationController(AccountService service) { this.service = service;}
    record NewAccount (String username, String Password, Integer isDoctor) {}
    @GetMapping
    public Account registerAccount(@RequestBody NewAccount request) throws Exception {
        Account account = new Account(request.username(), request.Password(), request.isDoctor());
        return service.newAccount(account);
    }
}
