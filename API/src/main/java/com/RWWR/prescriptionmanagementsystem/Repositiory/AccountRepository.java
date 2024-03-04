package com.RWWR.prescriptionmanagementsystem.Repositiory;

import com.RWWR.prescriptionmanagementsystem.Model.Account;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface AccountRepository extends JpaRepository<Account, String> {
    public Optional<Account> findByUsername(String username);

    public default boolean checkPassword(String username, String password) {
        Optional<Account> optionalAccount = findByUsername(username);
        if (optionalAccount.isPresent()) {
            Account account = optionalAccount.get();
            return password.equals(account.getPass());
        }

        return false;
    }
}
