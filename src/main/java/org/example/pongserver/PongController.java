package org.example.pongserver;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

@RestController
public class PongController {

    private static final Logger logger = LoggerFactory.getLogger(PongController.class);

    @Autowired
    private PongService pongService;

    @GetMapping("/pong")
    public Mono<ResponseEntity<String>> getPongResponse() {
        return pongService.respond();
    }
}