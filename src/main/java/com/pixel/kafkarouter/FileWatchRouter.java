package com.pixel.kafkarouter;

import org.apache.camel.builder.RouteBuilder;
import org.springframework.stereotype.Component;

@Component
public class FileWatchRouter extends RouteBuilder {

    private String path = "F:\\SpringBoot\\KafkaDemo\\data\\";
    @Override
    public void configure() throws Exception {
        from("file-watch:" +path + "?events=MODIFY")
                .log("Event: ${header.camelFileEventType} aquire :${header.CamelFileName}");
    }
}
