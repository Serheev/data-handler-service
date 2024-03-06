package com.serheev.datahandlerservice.repository;

import com.serheev.datahandlerservice.model.Data;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DataRepository extends JpaRepository<Data, Long> {
}
