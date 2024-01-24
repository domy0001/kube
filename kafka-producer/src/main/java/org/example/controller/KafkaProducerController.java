package org.example.controller;

import org.example.model.KafkaObject;
import org.example.service.KafkaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController("kube-app")
public class KafkaProducerController {

    @Autowired
    KafkaService kafkaService;

    @PostMapping("/sendMessage")
    public ResponseEntity<String> sendMessage(@RequestBody KafkaObject body) {
        try {
            kafkaService.sendMessage(body);
            return new ResponseEntity<>(HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.NOT_ACCEPTABLE);
        }
    }
}
