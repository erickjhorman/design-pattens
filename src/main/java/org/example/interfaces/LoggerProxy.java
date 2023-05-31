package org.example.interfaces;

import java.time.Instant;

public class LoggerProxy implements Logger {

    private static Logger logger;
    @Override
    public void process() {
        System.out.println("Logging request time with Logger proxy " + Instant.now());
        if (logger == null) {
            logger = new LoggerImpl();
        }
        logger.process();
        System.out.println("After method execution Logging" );
    }
}
