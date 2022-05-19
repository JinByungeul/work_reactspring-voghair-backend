package com.example.demo.user.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.cmmn.dataaccess.util.ParamMap;
import com.example.demo.user.service.UserService;
import com.example.demo.user.service.vo.UserVO;

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping("/users")
public class UserController {
	
//	@Autowired
//	UserMapper userMapper;
	
	@Autowired
	UserService userService;
	
	@GetMapping
	public List<ParamMap> userList() {
		System.out.println(userService.userList());
		return userService.userList();
	}
	
	@PostMapping
	public void insertUser(@RequestBody UserVO user) {
		userService.insertUser(user);
		System.out.println("Success insertUser"); 
	}
	
	@GetMapping("/{userId}")
	public ParamMap fetchUserByID(@PathVariable String userId) {
		ParamMap fetchUser = userService.fetchUserById(userId);
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
