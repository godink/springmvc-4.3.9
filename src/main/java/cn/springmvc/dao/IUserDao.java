package cn.springmvc.dao;

import cn.springmvc.model.User;

public interface IUserDao {

	User selectByPrimaryKey(int userId);
	
}
