package org.example.config;

import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties(prefix = "kafka-properties")
@Getter
@Setter
public class KafkaProperties {
    String bootstrapAddress;
    String groupId;
    String topic;
}
