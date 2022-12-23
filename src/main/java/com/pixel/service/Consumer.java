package com.pixel.service;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class Consumer {

    @KafkaListener(topics = "sampleMsgtopic", groupId = "grpId1")
    public void listenToTopic(String consumedMessage) {
        System.out.println("Message consumed is : " + consumedMessage);
    }
}
