package org.example.pongserver;

import java.time.Instant;

public class Main {

    public static void main(String[] args) {
        long now = Instant.now().getEpochSecond();
        System.out.println(now);
    }
}
