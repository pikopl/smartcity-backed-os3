package com.xaltome.smartcity.traffic.dbservice;

import org.jboss.logging.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xaltome.smartcity.traffic.dbservice.repository.CommuneRepository;
import com.xaltome.smartcity.traffic.dbservice.repository.TrafficDataRepository;

@Service
public class TrafficDatabaseService {
	
	@Autowired
	private TrafficDataRepository trafficDataRepo;
	
	@Autowired
	private CommuneRepository communeRepo;
	
	protected static final Logger LOGGER = Logger.getLogger(TrafficDatabaseService.class);

}
