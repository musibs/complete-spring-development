package io.tbc.spring.core.task004;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

/**
 * @author somnath.musib
 */
@Component
public class Banker {
    private Account account;

    /**
     * Qualifier is added to 'qualify savings bean as there are multiple account
     * bean is present'.
     * @param account
     */
    @Autowired
    public Banker(Account account) {
        this.account = account;
    }

    @Override
    public String toString() {
        return "Banker{" +
                "account=" + account +
                '}';
    }
}
