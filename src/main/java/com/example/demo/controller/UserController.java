package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.mapper.UserMapper;
import com.example.demo.vo.UserVO;

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping("/users")
public class UserController {
	
	@Autowired
	UserMapper userMapper;
	
	@GetMapping
	public List<UserVO> userList() {
		System.out.println(userMapper.userList());
		System.out.println("Success userList!");
		return userMapper.userList();
	}
	
	@PostMapping
	public void insertUser(@RequestBody UserVO user) {
		userMapper.insertUser(user);
		System.out.println("Success insertUser"); 
	}
	
	@GetMapping("/{userId}")
	public UserVO fetchUserByID(@PathVariable String userId) {
		UserVO fetchUser = userMapper.fetchUserById(userId);
		System.out.println(fetchUser);
		return fetchUser;
	}
	
//	@PutMapping("/{userId}")
//	public void updateUser(@PathVariable String userId, @RequestBody UserVO user) {
//		System.out.println("updateUser");
//	}
//	
//	@DeleteMapping("/{userId}")
//	public void deleteUser(@PathVariable String userId) {
//		System.out.println("deleteUser");
//	}
	

}//
