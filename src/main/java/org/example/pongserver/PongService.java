package org.example.pongserver;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Mono;

import java.time.Instant;
import java.time.LocalDateTime;
import java.util.concurrent.atomic.AtomicLong;

@Service
public class PongService {

    private static final Logger logger = LoggerFactory.getLogger(PongService.class);

    private final AtomicLong lastRequestTime = new AtomicLong(0);

    public Mono<ResponseEntity<String>> respond() {
        long now = Instant.now().getEpochSecond();
        if (lastRequestTime.getAndSet(now) == now) {
            return Mono.just(ResponseEntity.status(HttpStatus.TOO_MANY_REQUESTS).build());
        }
        logger.info("LocalDateTime: " + LocalDateTime.now() + ", Response: " + "World");
        return Mono.just(ResponseEntity.ok("World"));
    }
}