package com.example.fileservice.service;

import com.example.fileservice.FileEntityProto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class KafkaCommunicationService {

    @Value("${kafka.topic}")
    private String topicName;

    @Autowired
    private KafkaTemplate<String, byte[]> kafkaTemplate;

    public void sendProtobufToTopic(FileEntityProto.FileEntity data) {
        kafkaTemplate.send(topicName, data.toByteArray());
    }
}
