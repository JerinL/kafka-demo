package com.jerin.kafka_producer_demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    @Autowired
    private KafkaPublisherService publisherService;

    @PostMapping("send/{message}")
    public String sendMessage(@PathVariable("message")String message){
        for (int i = 0; i <=100; i++) {
            publisherService.sendMessage(message+ ""+i+"");
        }
        return "Success";
    }
}
