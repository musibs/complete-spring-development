package io.tbc.spring.core.task004;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import java.time.LocalDate;

/**
 * @author somnath.musib
 */
@Configuration
@ComponentScan(basePackages = "io.tbc.spring.core.task004")
public class AutowiredPrimaryConfiguration {

    @Bean
    @Primary
    public Account savingsAccount(){
        return new Account("John", AccountType.TERM_DEPOSIT, LocalDate.now());
    }

    @Bean
    public Account currentAccount() {
        return new Account("Doe", AccountType.CURRENT, LocalDate.of(2020, 01, 22));
    }
}
