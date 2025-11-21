package com.example.demo;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/ping")
public class PingController {

    @PostMapping
    public PingResponse ping(@RequestBody PingRequest request) {
        return new PingResponse("ok", request.getMessage());
    }
}