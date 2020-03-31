package io.tbc.spring.core.task005;

import org.springframework.stereotype.Component;

import java.security.SecureRandom;

/**
 * @author somnath.musib
 */
@Component
public class TokenGenerationStrategy {

    public int generate(){
        return new SecureRandom().nextInt();
    }
}
