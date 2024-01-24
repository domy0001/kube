package org.example.service;

import lombok.extern.slf4j.Slf4j;
import org.example.model.KafkaObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class KafkaService {
    @Autowired
    private KafkaTemplate<String, String> kafkaTemplate;

    public void sendMessage(KafkaObject payload) {
        try {
            log.info("Sending message {} to Kafka Topic {} ...", payload.getMessage(), payload.getTopic());
            kafkaTemplate.send(payload.getTopic(), payload.getMessage());
            log.info("Message sent correctly");
        } catch (Exception e) {
            log.error("Error in sending message {}", e);
        }
    }
}
