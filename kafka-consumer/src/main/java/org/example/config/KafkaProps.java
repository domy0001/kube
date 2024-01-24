package org.example.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties(prefix = "kafkaProps")
public class KafkaProps {
    String bootstrapAddress;
    String groupId;
    String topic;
}
