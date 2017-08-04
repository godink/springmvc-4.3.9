package cn.springmvc.test;

import javax.annotation.Resource;

import org.apache.log4j.Logger;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.alibaba.fastjson.JSON;

import cn.springmvc.model.User;
import cn.springmvc.service.IUserService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"classpath:spring-mybatis.xml"})
public class UserTest {
	
	private static Logger log = Logger.getLogger(UserTest.class);
	
	@Resource
	private IUserService userService;

	@Test
	public void addUser() {
		User user = userService.getUserById(40);
		log.info(JSON.toJSONString(user));
	}

}