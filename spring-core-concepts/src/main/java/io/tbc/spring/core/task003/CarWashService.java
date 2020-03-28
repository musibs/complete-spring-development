package io.tbc.spring.core.task003;

import org.springframework.stereotype.Component;

/**
 * @author somnath.musib
 */

@Component
public class CarWashService implements Washable {

    @Override
    public void wash() {
        System.out.println("Washing car since 1988");
    }
}
