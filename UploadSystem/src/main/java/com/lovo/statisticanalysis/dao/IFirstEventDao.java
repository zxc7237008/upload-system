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
	@Query(value="",nativeQuery=true)
	public List<FirstEventEntity> findFirstEventByEventState(int eventState);
}
