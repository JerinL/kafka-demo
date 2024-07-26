package com.kafka.consumer.demo;

import org.apache.kafka.clients.consumer.KafkaConsumer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

import java.util.logging.Logger;

@Service
public class KafkaConsumerService {

    private static final Logger logger = Logger.getLogger(KafkaConsumerService.class.getName());
//
//    @Autowired
//    private KafkaConsumer<String,Object> consumer;

    @KafkaListener(topics ="my-test-topic-from-java",groupId = "my-group")
    public void getMessage1(String message){
        logger.info("consumer-1 message getting from producer "+message);
    }

    @KafkaListener(topics ="my-test-topic-from-java",groupId = "my-group")
    public void getMessage2(String message){
        logger.info("consumer-2 message getting from producer "+message);
    }

    @KafkaListener(topics ="my-test-topic-from-java",groupId = "my-group")
    public void getMessage3(String message){
        logger.info("consumer-3 message getting from producer "+message);
    }

    @KafkaListener(topics ="my-test-topic-from-java",groupId = "my-group")
    public void getMessage4(String message){
        logger.info("consumer-4 message getting from producer "+message);
    }



}
