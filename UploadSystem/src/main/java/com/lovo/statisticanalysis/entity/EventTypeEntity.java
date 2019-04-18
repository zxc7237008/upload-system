package com.lovo.statisticanalysis.entity;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Table(name="t_event_type")
@Entity
public class EventTypeEntity {

	@Id
	@Column(length=32)
	@GenericGenerator(name="typeUUid", strategy="uuid")
	@GeneratedValue(generator="typeUUid")
	private String typeId;//事件类型主键id
	
	@Column(length=20)
	private String typeName;//事件类型名
	
	@Column(length=16)
	private String typeCode;//事件类型代码
	
	@OneToMany(mappedBy="eventType")
	private Set<FirstEventEntity> firstEvtSet;//事件初报集合
	
	@OneToMany(mappedBy="eventType")
	private Set<FormKeyEntity> keySet;//表单名集合
	
	@OneToMany(mappedBy="eventType")
	private Set<FormValueEntity> valueSet;//表单值集合

	public String getTypeId() {
		return typeId;
	}

	public void setTypeId(String typeId) {
		this.typeId = typeId;
	}

	public String getTypeName() {
		return typeName;
	}

	public void setTypeName(String typeName) {
		this.typeName = typeName;
	}

	public String getTypeCode() {
		return typeCode;
	}

	public void setTypeCode(String typeCode) {
		this.typeCode = typeCode;
	}

	public Set<FirstEventEntity> getFirstEvtSet() {
		return firstEvtSet;
	}

	public void setFirstEvtSet(Set<FirstEventEntity> firstEvtSet) {
		this.firstEvtSet = firstEvtSet;
	}

	public Set<FormKeyEntity> getKeySet() {
		return keySet;
	}

	public void setKeySet(Set<FormKeyEntity> keySet) {
		this.keySet = keySet;
	}

	public Set<FormValueEntity> getValueSet() {
		return valueSet;
	}

	public void setValueSet(Set<FormValueEntity> valueSet) {
		this.valueSet = valueSet;
	}
	
	
}
