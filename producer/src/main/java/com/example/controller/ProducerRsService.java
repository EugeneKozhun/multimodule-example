package com.example.controller;

import com.example.service.ProducerService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping(path = "/producer")
public class ProducerRsService {

    private final ProducerService service;

    @PostMapping
    public void triggerConsumer(@RequestParam Integer callTimes) {
        service.callConsumerEndpoint(callTimes);
    }
}
