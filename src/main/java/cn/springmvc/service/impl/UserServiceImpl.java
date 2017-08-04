package cn.springmvc.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.springmvc.dao.IUserDao;
import cn.springmvc.model.User;
import cn.springmvc.service.IUserService;

@Service
public class UserServiceImpl implements IUserService {

	@Autowired
	private IUserDao userDao;
	
	@Override
	public User getUserById(int userId) {
		return userDao.selectByPrimaryKey(userId);
	}
	
}
