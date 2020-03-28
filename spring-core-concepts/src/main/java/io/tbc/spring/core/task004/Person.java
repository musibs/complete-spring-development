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

    /**
     * Qualifier is added to 'qualify savings bean as there are multiple account
     * bean is present'.
     * @param account
     */
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
