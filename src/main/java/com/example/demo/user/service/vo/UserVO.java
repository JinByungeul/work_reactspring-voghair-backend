package com.example.demo.user.service.vo;

import lombok.Data;

@Data
public class UserVO {
	
	String userId;
	String userNm;
	
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getUserNm() {
		return userNm;
	}
	public void setUserNm(String userNm) {
		this.userNm = userNm;
	}
	
	

}
