package com.example.demo.user.service;

import java.util.List;

import com.example.demo.cmmn.dataaccess.util.ParamMap;
import com.example.demo.user.service.vo.UserVO;

public interface UserService {
	// 향후 UserVO => EgovMap (= ParamMap) 으로 변경
	List<ParamMap> userList();
	ParamMap fetchUserById(String userId);
	void insertUser(UserVO user);
	void updateUser(UserVO user);
}
