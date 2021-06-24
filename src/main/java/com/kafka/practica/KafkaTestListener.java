package com.kafka.practica;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class KafkaTestListener {

    @KafkaListener(topics = "josepat", groupId = "josepa")
    public void listenTopic1(String message) {
        System.out.println("Recieved Message of topic1 in  listener: " + message);
    }

    @KafkaListener(topics = "josepat2", groupId = "josepa")
    public void listenTopic2(String message) {
        System.out.println("Recieved Message of topic2 in  listener "+message);
    }
}