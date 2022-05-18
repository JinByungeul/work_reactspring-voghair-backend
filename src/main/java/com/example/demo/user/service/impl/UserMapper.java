package com.example.demo.user.service.impl;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.example.demo.cmmn.dataaccess.util.ParamMap;
import com.example.demo.user.service.vo.UserVO;

@Mapper
public interface UserMapper {

	// 향후 UserVO => EgovMap 으로 변경
	List<ParamMap> userList();
	ParamMap fetchUserById(String userId);
	void insertUser(UserVO user);
	void updateUser(UserVO user);
	
}
