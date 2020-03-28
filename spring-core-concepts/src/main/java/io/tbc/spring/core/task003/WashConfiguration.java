package io.tbc.spring.core.task003;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;

/**
 * @author somnath.musib
 */
@Configuration
@ComponentScan(excludeFilters = {
        @ComponentScan.Filter(type = FilterType.REGEX, pattern = {"io.tbc.spring.core.task003.CarWashService"})
})
public class WashConfiguration {


}
