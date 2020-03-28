package io.tbc.spring.core.task001;

import java.util.concurrent.atomic.AtomicLong;

/**
 * @author somnath.musib
 */
public class RunIdCounter {

    public final AtomicLong counter = new AtomicLong();

    public long getCounter(){
        return counter.incrementAndGet();
    }
}
