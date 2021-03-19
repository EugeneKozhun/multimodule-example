package com.example.service.impl;

import com.example.service.ProducerService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
@RequiredArgsConstructor
public class ProducerServiceImpl implements ProducerService {

    private final RestTemplate restTemplate;

    @Override
    public void callConsumerEndpoint(Integer times) {
        System.out.println(times);
    }
}
