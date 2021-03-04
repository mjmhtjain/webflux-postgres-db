package com.simple.webfluxdb.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/api/v1")
public class DataController {

    @GetMapping("")
    Mono<ResponseEntity> testAPI() {

        ResponseEntity<String> res = ResponseEntity
                .ok()
                .body("TestResponse");

        return Mono.just(res);
    }
}
