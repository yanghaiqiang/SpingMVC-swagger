package com.cn.hnust.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.cn.hnust.Exception.BusinessException;
import com.cn.hnust.Exception.CarException;
import com.cn.hnust.dao.IUserDao;
import com.cn.hnust.pojo.User;
import com.cn.hnust.service.IUserService;

@Service("userService")
public class UserServiceImpl implements IUserService {
	
	@Resource
	private IUserDao userDao;
	
	@Override
	public User getUserById(int userId) {
		
		return this.userDao.selectByPrimaryKey(userId);
	}
	
	public void getException(int yang) {
		if(yang == 1){
			throw new BusinessException(null);
		}else if (yang == 2){
			throw new CarException("yanghaiqiang");
		}
		
	}
}
