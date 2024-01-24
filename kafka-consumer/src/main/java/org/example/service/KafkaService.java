package org.example.service;

import lombok.extern.slf4j.Slf4j;
import org.example.config.KafkaProps;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class KafkaService {
    @Autowired
    KafkaProps kafkaProps;
    @KafkaListener(topics = {"#{kafkaProps.topic}"}, groupId = "#{kafkaProps.groupId}")
    public void kafkaListener(String message) {
        log.info("Received Message in group {}", message);
    }
}
