package io.tbc.spring.core.task003;

import org.springframework.stereotype.Component;

/**
 * @author somnath.musib
 */
@Component
public class BikeWash implements Washable {
    @Override
    public void wash() {
        System.out.println("We are relatively new, but our services are best in the town.");
    }
}
