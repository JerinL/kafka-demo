package com.jerin.kafka_producer_demo;

import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class KafkaConfig {

    @Bean
    public NewTopic createTopic(){
        return  new NewTopic("my-test-topic-from-java",3,(short)1);
    }
}
