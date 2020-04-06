package com.github.gudian1618.service;

import java.util.List;

import com.github.gudian1618.mapper.UserMapper;
import com.github.gudian1618.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;

import com.alibaba.dubbo.config.annotation.Service;
@Service(timeout=3000)	//3秒超时 接口RPC形式调用\
						//标识提供者
public class UserServiceImpl implements UserService {
	
	@Autowired
	private UserMapper userMapper;
	@Override
	public List<User> findAll() {
		
		System.out.println("我是第一个服务的提供者");
		return userMapper.selectList(null);
	}
	
	//user对象是消费者利用rpc通信传递
	@Override
	public void saveUser(User user) {
		
		userMapper.insert(user);
	}
}
