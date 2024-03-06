package com.serheev.datahandlerservice.service;

import com.serheev.datahandlerservice.model.Data;
import org.springframework.stereotype.Service;

@Service
public class KafkaDataServiceImpl implements KafkaDataService {
    @Override
    public void handle(Data data) {
        System.out.println("Data is received: " + data.toString());
    }
}
