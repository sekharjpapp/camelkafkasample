package com.pixel.kafkarouter;

import org.apache.camel.LoggingLevel;
import org.apache.camel.builder.RouteBuilder;

import java.util.Date;

public class CamelBeanRoute extends RouteBuilder {
    @Override
    public void configure() throws Exception {
        from("timer:myTimer?period=10000")
                .setBody(e->new Date())
                .to("bean:com.pixel.camelroute.MyBean?method=fromClient")
                .log(LoggingLevel.INFO,"${body}");
    }
}
class MyBean {
    public String fromClient(String msg) {
        return "From Client: " + msg;
    }
}