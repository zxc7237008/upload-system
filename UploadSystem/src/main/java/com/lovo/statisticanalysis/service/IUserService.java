package com.lovo.statisticanalysis.service;

import com.lovo.statisticanalysis.entity.UserEntity;

public interface IUserService {
	
	/**
	  *  通过用户名Id查找用户
	 * @param userId 用户名Id
	 */
	public UserEntity findUserByUserId(String userId);
}
