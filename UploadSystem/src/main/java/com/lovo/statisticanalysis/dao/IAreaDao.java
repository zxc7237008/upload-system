package com.lovo.statisticanalysis.dao;

import org.springframework.data.repository.CrudRepository;

import com.lovo.statisticanalysis.entity.EventAreaEntity;

public interface IAreaDao  extends CrudRepository<EventAreaEntity, String>{

}
