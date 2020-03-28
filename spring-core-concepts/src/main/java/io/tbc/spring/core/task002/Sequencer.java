package io.tbc.spring.core.task002;

import org.springframework.stereotype.Component;

import java.util.concurrent.atomic.AtomicLong;

/**
 * @author somnath.musib
 */
@Component
public class Sequencer {

    private AtomicLong counter = new AtomicLong();

    public long getCounterValue(){
        return counter.incrementAndGet();
    }
}
