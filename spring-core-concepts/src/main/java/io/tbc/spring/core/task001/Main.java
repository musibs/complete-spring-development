package io.tbc.spring.core.task001;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author somnath.musib
 */
public class Main {

    public static void main(String[] args) {

        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(RunIdConfiguration.class);
        RunIdCounter runIdCounter = applicationContext.getBean(RunIdCounter.class);

    }
}
