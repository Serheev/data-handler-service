package com.serheev.datahandlerservice.service;

import com.serheev.datahandlerservice.model.Data;
import com.serheev.datahandlerservice.repository.DataRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@Slf4j
@RequiredArgsConstructor
public class KafkaDataServiceImpl implements KafkaDataService {
    private final DataRepository dataRepository;
    @Override
    public void handle(Data data) {
        log.info("Data {} was received: ", data);
        dataRepository.save(data);
    }
}
