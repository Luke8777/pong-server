package org.example.pongserver;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class PongServerApplication {

    private static final Logger logger = LoggerFactory.getLogger(PongServerApplication.class);

    public static void main(String[] args) {
        logger.info("Starting");
        SpringApplication.run(PongServerApplication.class, args);
    }

}
