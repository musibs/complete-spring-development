package io.tbc.spring.core.task004;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

/**
 * @author somnath.musib
 */

@Component
public class Person {

    private Account account;

    @Autowired
    public Person(@Qualifier("savings") Account account) {
        this.account = account;
    }

    @Override
    public String toString() {
        return "Person{" +
                "account=" + account +
                '}';
    }
}
