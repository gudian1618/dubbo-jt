package com.github.gudian1618.service;

import java.util.List;

import com.github.gudian1618.pojo.User;
import org.springframework.transaction.annotation.Transactional;


public interface UserService {
	//定义接口一 查询全部的用户数据信息
	List<User> findAll();
	
	@Transactional
	void saveUser(User user);
}
