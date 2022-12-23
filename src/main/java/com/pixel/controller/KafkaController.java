package com.pixel.controller;

import com.pixel.model.User;
import com.pixel.service.Producer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class KafkaController {

    @Autowired
    private KafkaTemplate<String, Object> template;
    private String topic = "sampleMsgtopic";

    @GetMapping("/kafkaMsg/{msg}")
    public void getKafkaMessage(@PathVariable String msg) {
        template.send(topic, "Hi " + msg + " Welcome to scala techie");
    }

    @GetMapping("/publishJson")
    public String publishMessage() {
        User user = new User(2532, "User88", new String[] { "Bangalore", "BTM", "house 90" });
        template.send(topic, user);
        return "Json Data published";
    }
}
