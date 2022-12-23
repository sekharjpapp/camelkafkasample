# camelkafkasample

Start Zookeeper
---------
.\bin\windows\zookeeper-server-start.bat config\zookeeper.properties

Start Kafka Server
--------
.\bin\windows\kafka-server-start.bat config\server.properties

Create Kafka Topic
-------
.\bin\windows\kafka-topics.bat --bootstrap-server localhost:9092 --topic sampleMsgtopic --create

Consume from the Kafka Topic via Console
---------
.\bin\windows\kafka-console-consumer.bat --bootstrap-server localhost:9092 --topic sampleMsgtopic --from-beginning
