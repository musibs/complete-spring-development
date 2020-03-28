package io.tbc.spring.core.task003;

import io.tbc.spring.core.task002.SequenceConfiguration;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author somnath.musib
 */
public class WashMain {

    public static void main(String[] args) {

        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(WashConfiguration.class);
        for(String beanName : applicationContext.getBeanDefinitionNames()){
            System.out.println(beanName);
        }
        CarWashService carWashService = applicationContext.getBean(CarWashService.class);
        carWashService.wash();

        BikeWash bikeWash = applicationContext.getBean(BikeWash.class);
        bikeWash.wash();



    }
}
