package com.lovo.statisticanalysis.service;

import java.util.List;

import com.lovo.statisticanalysis.entity.EventAreaEntity;

public interface IAreaService {
	
	public List<EventAreaEntity> findAllEventAreaByEventAreaId(String areaId);
}
