package com.serheev.datahandlerservice.service;

import com.serheev.datahandlerservice.model.Data;

public interface KafkaDataService {
    void handle(Data data);
}
