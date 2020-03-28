package io.tbc.spring.core.task001;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author somnath.musib
 */
@Configuration
public class RunIdConfiguration {

    @Bean
    public RunIdCounter runIdCounter(){
        return new RunIdCounter();
    }
}
