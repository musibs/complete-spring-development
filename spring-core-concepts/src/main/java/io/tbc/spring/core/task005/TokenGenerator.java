package io.tbc.spring.core.task005;

import org.springframework.stereotype.Component;

import javax.annotation.Resource;

/**
 * @author somnath.musib
 */
@Component
public class TokenGenerator {

    @Resource
    private TokenGenerationStrategy tokenGenerationStrategy;

    public int generateToken(){
        return tokenGenerationStrategy.generate();
    }
}
