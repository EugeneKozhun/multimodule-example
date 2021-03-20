package com.example.service.impl;

import com.example.config.ConsumerConfig;
import com.example.service.ProducerService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import static java.util.stream.IntStream.range;

@Service
@RequiredArgsConstructor
public class ProducerServiceImpl implements ProducerService {

    private static final String CONSUMER_PATH = "/consumer";

    private final RestTemplate restTemplate;
    private final ConsumerConfig config;

    @Override
    public void callConsumerEndpoint(Integer times) {
        range(0, times).forEach(i -> callConsumerEndpoint());
    }

    private void callConsumerEndpoint() {
        restTemplate.postForEntity(config.getHost() + CONSUMER_PATH, null, String.class);
    }
}
