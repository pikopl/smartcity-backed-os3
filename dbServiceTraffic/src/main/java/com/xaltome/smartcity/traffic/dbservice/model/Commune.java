package com.xaltome.smartcity.traffic.dbservice.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.Size;

@Entity
public class Commune {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long communeId;
	
	@Column(unique = true, nullable=false)
	private long legacyId;
	
	@Size(min=1, max=100, message="Name is 1-100 chars")
	@Column(unique = true, nullable=false)
	private String name;

	@Size(min=1, max=3, message="Plate prefix is 1-3 chars")
	@Column(unique = true, nullable=true)
	private String platePrefix;

	public long getCommuneId() {
		return communeId;
	}

	public void setCommuneId(long communeId) {
		this.communeId = communeId;
	}

	public long getLegacyId() {
		return legacyId;
	}

	public void setLegacyId(long legacyId) {
		this.legacyId = legacyId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPlatePrefix() {
		return platePrefix;
	}

	public void setPlatePrefix(String platePrefix) {
		this.platePrefix = platePrefix;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Commune [communeId=");
		builder.append(communeId);
		builder.append(", legacyId=");
		builder.append(legacyId);
		builder.append(", name=");
		builder.append(name);
		builder.append(", platePrefix=");
		builder.append(platePrefix);
		builder.append("]");
		return builder.toString();
	}
	
}
