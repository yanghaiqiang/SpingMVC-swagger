package com.cn.hnust.dao;

import com.cn.hnust.pojo.User;

public interface IUserDao {
	User selectByPrimaryKey(int userId);
}
