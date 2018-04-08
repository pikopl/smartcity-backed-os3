package com.xaltome.smartcity.traffic.dbservice;

import java.sql.Timestamp;
import java.text.ParseException;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Map;

import org.apache.commons.collections4.CollectionUtils;
import org.apache.commons.collections4.Predicate;
import org.jboss.logging.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import com.xaltome.smartcity.traffic.dbservice.model.Commune;
import com.xaltome.smartcity.traffic.dbservice.model.TrafficData;
import com.xaltome.smartcity.traffic.dbservice.repository.CommuneRepository;
import com.xaltome.smartcity.traffic.dbservice.repository.TrafficDataRepository;
import com.xaltome.smartcity.traffic.dbservice.util.predicate.CommunePredicate;

@Service
public class TrafficDatabaseService {
	
	@Autowired
	private TrafficDataRepository trafficDataRepo;
	
	@Autowired
	private CommuneRepository communeRepo;
	
	protected static final Logger LOGGER = Logger.getLogger(TrafficDatabaseService.class);
	
	public void detectChanges(final List<Map<String, Object>> data) throws ParseException{
		if (LOGGER.isTraceEnabled()) {
			LOGGER.tracef("Entering detectChanges(): %s", data);
		} else {
			LOGGER.info("Entering detectChanges()");
		}
		Iterable<Commune> communeList = communeRepo.findAll();
		for(Commune commune : communeList) {
			final String communeName = commune.getName();
			final long communeLegacyId = commune.getLegacyId();
			final Predicate<Map<String, Object>> communePredicate = new CommunePredicate(communeName);
			Collection<Map<String, Object>> selectedCommuneData = CollectionUtils.select(data, communePredicate);
			if (LOGGER.isTraceEnabled()) {
				LOGGER.tracef("detectChanges() selectedCommuneData: %s", selectedCommuneData);
			}
			//TODO: issue warning when legacyId doesn't match
			final TrafficData latestEntry = trafficDataRepo.getLatestEntry(communeName, new PageRequest(0, 1)).get(0);
		}
	}
	

	
}
