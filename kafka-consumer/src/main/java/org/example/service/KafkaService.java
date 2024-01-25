package org.example.service;

import lombok.extern.slf4j.Slf4j;
import org.example.config.KafkaProperties;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class KafkaService {
    @Autowired
    KafkaProperties kafkaProperties;

    @KafkaListener(topics = {"#{kafkaProperties.topic}"}, groupId = "#{kafkaProperties.groupId}")
    public void kafkaListener(String message) {
        log.info("Received Message in group {}", message);
    }
}
