package io.tbc.spring.core.task002;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author somnath.musib
 */
public class SequenceMain {

    public static void main(String[] args) {

        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(SequenceConfiguration.class);
        Sequencer sequencer = applicationContext.getBean(Sequencer.class);
        System.out.println(sequencer.getCounterValue());
    }
}
