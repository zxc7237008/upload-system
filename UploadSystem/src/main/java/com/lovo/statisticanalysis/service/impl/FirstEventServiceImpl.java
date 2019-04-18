package com.lovo.statisticanalysis.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lovo.statisticanalysis.dao.IFirstEventDao;
import com.lovo.statisticanalysis.entity.FirstEventEntity;
import com.lovo.statisticanalysis.service.IFirstEventService;

@Service("firstEventService")
public class FirstEventServiceImpl implements IFirstEventService{
	
	@Autowired
	private IFirstEventDao firstEventDao;

	@Override
	public List<FirstEventEntity> findFirstEventByEventState(int eventState) {
		
		return firstEventDao.findFirstEventByEventState(eventState);
	}
	
	
}
