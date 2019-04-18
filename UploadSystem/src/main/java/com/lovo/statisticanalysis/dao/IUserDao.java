package com.lovo.statisticanalysis.dao;

import org.springframework.data.repository.CrudRepository;

import com.lovo.statisticanalysis.entity.UserEntity;

public interface IUserDao extends CrudRepository<UserEntity, String>{

}
