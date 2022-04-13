package com.example.demo.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.example.demo.vo.UserVO;

@Mapper
public interface UserMapper {

	// 향후 UserVO => EgovMap 으로 변경
	List<UserVO> userList();
	UserVO fetchUserById(String userId);
	void insertUser(UserVO user);
	void updateUser(UserVO user);
	
}
