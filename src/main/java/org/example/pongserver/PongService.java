package org.example.pongserver;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Mono;

import java.time.Instant;
import java.util.concurrent.atomic.AtomicLong;

@Service
public class PongService {

    private final AtomicLong lastRequestTime = new AtomicLong(0);

    public Mono<ResponseEntity<String>> respond() {
        long now = Instant.now().getEpochSecond();
        if (lastRequestTime.getAndSet(now) == now) {
            return Mono.just(ResponseEntity.status(HttpStatus.TOO_MANY_REQUESTS).build());
        }
        return Mono.just(ResponseEntity.ok("World"));
    }
}