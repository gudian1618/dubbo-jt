package com.github.gudian1618.dubbo.jt.controller;

import java.util.List;

import com.github.gudian1618.dubbo.jt.service.UserService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import org.apache.dubbo.config.annotation.Reference;
import com.github.gudian1618.dubbo.jt.pojo.User;

@RestController
public class UserController {
	
	/**
	 * springboot利用dubbo注解实例化接口对象
	 * timeout=3000  定义超时时间
	 * check=true  当服务器启动时检查是否有提供者
	 * 如果没有提供者,则程序启动报错.
	 * check=false  
	 * 当程序启动时不会检查是否有提供者.当程序调用
	 * 时检查.   
	 */
	@Reference(timeout=3000,check=false)
	private UserService userService;
	
	@RequestMapping("/findAll")
	public List<User> findAll(){
		
		return userService.findAll();
	}
	
	@RequestMapping("/saveUser/{name}/{age}/{sex}")
	public String saveUser(User user) {
		
		userService.saveUser(user);
		return "用户入库成功!!!";
	}
}
