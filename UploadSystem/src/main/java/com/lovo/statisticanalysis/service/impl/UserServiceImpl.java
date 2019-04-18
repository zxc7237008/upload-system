package com.lovo.statisticanalysis.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lovo.statisticanalysis.dao.IUserDao;
import com.lovo.statisticanalysis.entity.UserEntity;
import com.lovo.statisticanalysis.service.IUserService;
@Service("userService")
public class UserServiceImpl implements IUserService{
	@Autowired
	private IUserDao userDao;
	
	@Override
	public UserEntity findUserByUserId(String userId) {
		
		return userDao.findOne(userId);
	}

}
