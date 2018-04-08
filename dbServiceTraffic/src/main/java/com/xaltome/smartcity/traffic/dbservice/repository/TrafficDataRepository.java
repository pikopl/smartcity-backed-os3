package com.xaltome.smartcity.traffic.dbservice.repository;

import java.util.List;

import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;

import com.xaltome.smartcity.traffic.dbservice.model.TrafficData;

public interface TrafficDataRepository extends PagingAndSortingRepository<TrafficData, Long>{
	@Query("SELECT td FROM TrafficData td INNER JOIN td.commune c WHERE c.name = (:communeName) ORDER BY td.timestamp DESC")
	List<TrafficData> getLatestEntry(@Param("communeName") String communeName, Pageable pageable);

}
