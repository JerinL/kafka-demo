package com.jerin.kafka_producer_demo;

import org.apache.kafka.clients.producer.KafkaProducer;
import org.apache.kafka.clients.producer.RecordMetadata;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.kafka.support.SendResult;
import org.springframework.stereotype.Service;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Future;

@Service
public class KafkaPublisherService {

    @Autowired
    private KafkaTemplate<String,Object> template;


    public String sendMessage(String message){
        CompletableFuture<SendResult<String, Object>> send = template.send("my-test-topic-from-java", message);
        return "done";
    }
}
