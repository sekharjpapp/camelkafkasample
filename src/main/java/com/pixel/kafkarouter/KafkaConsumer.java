package com.pixel.kafkarouter;

import org.apache.camel.builder.RouteBuilder;
import org.springframework.stereotype.Component;

//@Component
public class KafkaConsumer extends RouteBuilder {


    @Override
    public void configure() throws Exception {
            from("")
                    .log("${body}");
    }
}
