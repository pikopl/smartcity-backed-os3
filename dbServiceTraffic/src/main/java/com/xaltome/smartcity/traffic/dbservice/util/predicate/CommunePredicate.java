package com.xaltome.smartcity.traffic.dbservice.util.predicate;

import java.util.Map;

import org.apache.commons.collections4.Predicate;

public class CommunePredicate implements Predicate<Map<String, Object>> {
	
	private final String communeName;

	public CommunePredicate(String communeName) {
		this.communeName = communeName;
	}

	@Override
	public boolean evaluate(Map<String, Object> record) {
		return communeName.equals((String) record.get("GMINA"));
	}

}
