package org.example.pongserver;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

import java.time.LocalDateTime;

@RestController
public class PongController {

    private final PongService pongService;

    @Autowired
    public PongController(PongService pongService) {
        this.pongService = pongService;
    }

    @GetMapping("/pong")
    public Mono<ResponseEntity<String>> getPongResponse() {
        System.out.println("Time: "+ LocalDateTime.now());
        return pongService.respond();
    }
}