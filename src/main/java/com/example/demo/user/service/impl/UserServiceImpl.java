package com.example.demo.user.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.cmmn.dataaccess.util.ParamMap;
import com.example.demo.user.service.UserService;
import com.example.demo.user.service.vo.UserVO;

@Service
public class UserServiceImpl implements UserService {
	
	@Autowired
	UserMapper userMapper;

	@Override
	public List<ParamMap> userList() {
		return userMapper.userList();
	}

	@Override
	public ParamMap fetchUserById(String userId) {
		return userMapper.fetchUserById(userId);
	}

	@Override
	public void insertUser(UserVO user) {
		userMapper.insertUser(user);
	}

	@Override
	public void updateUser(UserVO user) {
		userMapper.updateUser(user);
	}

}
