package com.RWWR.prescriptionmanagementsystem.Security;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.RWWR.prescriptionmanagementsystem.Model.Account;
import com.RWWR.prescriptionmanagementsystem.Model.MyUserDetails;
import com.RWWR.prescriptionmanagementsystem.Repositiory.AccountRepository;

@Service
public class MyUserDetailService implements UserDetailsService {
    @Autowired
    AccountRepository accountRepository;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        Optional<Account> user = accountRepository.findByUsername(username);

        user.orElseThrow(() -> new UsernameNotFoundException("Username not found"));
        
        return user.map(MyUserDetails::new).get();
    }
}