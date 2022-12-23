package com.pixel.service;

import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class Producer {

    KafkaTemplate<String ,String> kafkaTemplate;

    public void sendMessage(String message) {
        kafkaTemplate.send("sampleMsgtopic",message);
    }
}
