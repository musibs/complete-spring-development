package io.tbc.spring.core.task004;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.time.LocalDate;

/**
 * @author somnath.musib
 */
public class Account {

    private String accountHolderName;
    private AccountType accountType;
    private LocalDate accountOpeningDate;

    public Account(String accountHolderName, AccountType accountType, LocalDate accountOpeningDate) {
        this.accountHolderName = accountHolderName;
        this.accountType = accountType;
        this.accountOpeningDate = accountOpeningDate;
    }

    @Override
    public String toString() {
        return "Account{" +
                "accountHolderName='" + accountHolderName + '\'' +
                ", accountType=" + accountType +
                ", accountOpeningDate=" + accountOpeningDate +
                '}';
    }
}


enum AccountType{
    SAVINGS,
    CURRENT,
    TERM_DEPOSIT
}