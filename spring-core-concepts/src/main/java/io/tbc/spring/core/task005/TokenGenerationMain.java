package io.tbc.spring.core.task005;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author somnath.musib
 */
public class TokenGenerationMain {

    public static void main(String[] args) {

        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(TokenGenerationConfiguration.class);
        System.out.println(applicationContext.getBean(TokenGenerator.class).generateToken());
    }
}
