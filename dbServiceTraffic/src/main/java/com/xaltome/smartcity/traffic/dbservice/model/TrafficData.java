package com.xaltome.smartcity.traffic.dbservice.model;

import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

import com.xaltome.smartcity.traffic.dbservice.model.Commune;

@Entity
@Table(name = "trafficdata", uniqueConstraints={
	    @UniqueConstraint(columnNames = {"timestamp", "commune_communeId"})
	})
public class TrafficData {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long trafficDataId;
	
	@Column(nullable=false)
	private Timestamp timestamp;
	
	@Column(nullable=true)
	private long vehicleCount;
	
	@ManyToOne
	@PrimaryKeyJoinColumn
	private Commune commune;

	public long getTrafficDataId() {
		return trafficDataId;
	}

	public void setTrafficDataId(long trafficDataId) {
		this.trafficDataId = trafficDataId;
	}

	public Timestamp getTimestamp() {
		return timestamp;
	}

	public void setTimestamp(Timestamp timestamp) {
		this.timestamp = timestamp;
	}

	public long getVehicleCount() {
		return vehicleCount;
	}

	public void setVehicleCount(long vehicleCount) {
		this.vehicleCount = vehicleCount;
	}

	public Commune getCommune() {
		return commune;
	}

	public void setCommune(Commune commune) {
		this.commune = commune;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("TrafficData [trafficDataId=");
		builder.append(trafficDataId);
		builder.append(", timestamp=");
		builder.append(timestamp);
		builder.append(", vehicleCount=");
		builder.append(vehicleCount);
		builder.append(", commune=");
		builder.append(commune);
		builder.append("]");
		return builder.toString();
	}
	
	
}
