package com.lovo.statisticanalysis.dao;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.lovo.statisticanalysis.entity.FirstEventEntity;

public interface IFirstEventDao extends CrudRepository<FirstEventEntity, String>{
	
	/**
	  *  通过事件状态查找对应状态事件的信息
	 * @param eventState 1---未上报  2---以上报处理中  3---事件结束
	 * @return 对应状态事件信息的集合
	 */
	@Query(value="SELECT * from t_first_event WHERE event_state=?1",nativeQuery=true)
	public List<FirstEventEntity> findFirstEventByEventState(int eventState);
	
	/**
	 * 通过事件名称、事件等级、地区名称模糊查询相关的事件信息
	 * @param typeName 事件名称
	 * @param eventLevel 事件等级
	 * @param areaName 地区名称
	 * @return 相关的事件集合
	 */
//	@Query(value="",nativeQuery=true)
//	public List<FirstEventEntity> findFirstEventslikeEventTypeEventLevelEventArea(String typeName,String eventLevel,String areaName);
}
