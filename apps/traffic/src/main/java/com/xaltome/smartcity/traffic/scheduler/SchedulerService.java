package com.xaltome.smartcity.traffic.scheduler;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xaltome.smartcity.traffic.dbservice.TrafficDatabaseService;


@Service
public class SchedulerService {
	@Autowired
	private TrafficDatabaseService dbService;

}
