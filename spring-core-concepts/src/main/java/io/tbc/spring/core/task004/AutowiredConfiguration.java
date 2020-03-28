package io.tbc.spring.core.task004;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;

/**
 * @author somnath.musib
 */
@Configuration
@ComponentScan(basePackages = "io.tbc.spring.core.task004")
public class AutowiredConfiguration {

    @Bean(name = "savings")
    public Account savingsAccount(){
        return new Account("Somnath", AccountType.SAVINGS, LocalDate.now());
    }

    @Bean(name = "current")
    public Account currentAccount() {
        return new Account("Musib", AccountType.CURRENT, LocalDate.of(2020, 01, 22));
    }
}
