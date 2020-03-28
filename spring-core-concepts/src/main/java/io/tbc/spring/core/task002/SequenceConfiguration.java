package io.tbc.spring.core.task002;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * @author somnath.musib
 */
@Configuration
@ComponentScan(basePackageClasses = {io.tbc.spring.core.task002.Sequencer.class})
public class SequenceConfiguration {
}
