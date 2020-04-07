package com.github.gudian1618.dubbo.jt.service;

import com.github.gudian1618.dubbo.jt.pojo.User;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

public interface UserService {
	/**
	 * 	定义接口一 查询全部的用户数据信息
	 */
    List<User> findAll();

    @Transactional
    void saveUser(User user);
}
