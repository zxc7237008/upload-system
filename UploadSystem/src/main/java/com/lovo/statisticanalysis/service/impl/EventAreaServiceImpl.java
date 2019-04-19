package com.lovo.statisticanalysis.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lovo.statisticanalysis.dao.IEventAreaDao;
import com.lovo.statisticanalysis.entity.EventAreaEntity;
import com.lovo.statisticanalysis.service.IEventAreaService;

@Service(value="eventAreaService")
public class EventAreaServiceImpl implements IEventAreaService {
	
	@Autowired
	private IEventAreaDao eventAreaDao;

	@Override
	public List<EventAreaEntity> getArea() {
		// TODO Auto-generated method stub
		return null;
	}

}
