package com.pixel.kafkarouter;

import org.apache.camel.builder.RouteBuilder;

import java.util.Date;

public class StockKafkaProducer extends RouteBuilder {

    @Override
    public void configure() throws Exception {
        from("kafka:sampleMsgtopic?brokers=localhost:9092")
                .log("Message received from Kafka : ${body}")
                .bean(StockPriceEnricher.class)
                .to("kafka:sampleMsgtopic?brokers=localhost:9092");
    }

    private class StockPriceEnricher {
        public String enrichStockEnricher(String stockPrice) {
            return stockPrice + ", " + new Date();
        }
    }
}
