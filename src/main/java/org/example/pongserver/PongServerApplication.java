package org.example.pongserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class PongServerApplication {

    public static void main(String[] args) {
        System.out.println("starting");
        SpringApplication.run(PongServerApplication.class, args);
    }

}
