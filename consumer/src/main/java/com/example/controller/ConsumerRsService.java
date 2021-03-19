package com.example.controller;

import com.example.service.ConsumerService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping(path = "/consumer")
public class ConsumerRsService {

    private final ConsumerService service;

    @GetMapping
    public Object getJmxInfo() {
        return null;
    }

    @PostMapping
    public void saveProducerInfo() {
        System.out.println("LOG INFO");
    }
}
