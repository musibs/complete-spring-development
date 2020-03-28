package io.tbc.spring.core.task004;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author somnath.musib
 */
public class AutowireMain {

    public static void main(String[] args) {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(AutowiredConfiguration.class);
        System.out.println(applicationContext.getBean(Person.class).toString());
    }
}
