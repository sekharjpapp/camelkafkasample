package com.pixel.kafkarouter;

import org.apache.camel.builder.RouteBuilder;
import org.springframework.stereotype.Component;

@Component
public class DebeziumRouter extends RouteBuilder {
    private String offsetStorageFileName = "F:\\SpringBoot\\KafkaDemo\\offset-file.dat";
    private String host = "localhost";
    private String username = "root";
    private String password = "sekhar";
    private String db = "reactcameldb";
    @Override
    public void configure() throws Exception {
        from("debezium-mysql:debezium-mysql?offsetStorageFileName=" + offsetStorageFileName
            + "&databaseHostname=" +host
            + "&databaseUser=" + username
            + "&databasePassword=" + password
            + "&databaseServerName=" +db)
                .log("Event received from Debezium : ${body}")
                .log("    with this identifier ${headers.CamelDebeziumIdentifier}")
                .log("    with these source metadata ${headers.CamelDebeziumSourceMetadata}")
                .log("    the event occured upon this operation '${headers.CamelDebeziumSourceOperation}'") // c= create u = update d= delete
                .log("    on this database '${headers.CamelDebeziumSourceMetadata[db]}' and this table '${headers.CamelDebeziumSourceMetadata[table]}'")
                .log("    with the key ${headers.CamelDebeziumKey}")
                .log("    the previous value is ${headers.CamelDebeziumBefore}")
                .log("    the ddl sql text is ${headers.CamelDebeziumDdlSQL}");

    }
}
