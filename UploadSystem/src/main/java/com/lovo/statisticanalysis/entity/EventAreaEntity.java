package com.lovo.statisticanalysis.entity;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Table(name="t_event_area")
@Entity
public class EventAreaEntity {
	
	@Id
	@Column(length=32)
	@GenericGenerator(name="areaUUid", strategy="org.hibernate.id.UUIDGenerator")
	@GeneratedValue(generator="areaUUid")
	private String areaId;
	
	@Column(length=32)
	private String areaName;
	
	@OneToMany(mappedBy="eventArea")
	private Set<FirstEventEntity> firstEvtSet;

	public String getAreaId() {
		return areaId;
	}

	public void setAreaId(String areaId) {
		this.areaId = areaId;
	}

	public String getAreaName() {
		return areaName;
	}

	public void setAreaName(String areaName) {
		this.areaName = areaName;
	}

	public Set<FirstEventEntity> getFirstEvtSet() {
		return firstEvtSet;
	}

	public void setFirstEvtSet(Set<FirstEventEntity> firstEvtSet) {
		this.firstEvtSet = firstEvtSet;
	}
	
	

}
