package com.pixel.kafkarouter;

import org.apache.camel.builder.RouteBuilder;
import org.springframework.stereotype.Component;

@Component
public class RestCamelRoute extends RouteBuilder {

    @Override
    public void configure() throws Exception {
        from("rest:get:hello")
                .transform().constant("Bye World");
    }
}
