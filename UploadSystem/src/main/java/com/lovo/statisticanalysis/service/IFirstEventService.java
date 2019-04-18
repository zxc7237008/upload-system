package com.lovo.statisticanalysis.service;

import java.util.List;

import com.lovo.statisticanalysis.entity.FirstEventEntity;

public interface IFirstEventService {
	
	/**
	  *  通过事件状态查找对应状态事件的信息
	 * @param eventState 1---未上报  2---以上报处理中  3---事件结束
	 * @return 对应状态事件信息的集合
	 */
	public List<FirstEventEntity> findFirstEventByEventState(int eventState);
	
	//public List<FirstEventEntity> findFirstEventLike
}
