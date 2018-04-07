package com.xaltome.smartcity.traffic.dbservice.repository;

import org.springframework.data.repository.PagingAndSortingRepository;

import com.xaltome.smartcity.traffic.dbservice.model.TrafficData;

public interface TrafficDataRepository extends PagingAndSortingRepository<TrafficData, Long>{

}
