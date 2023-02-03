package com.thecoinkarma.blog.services;

import java.util.List;

import com.thecoinkarma.blog.payloads.UserDto;

public interface UserService {
	
	UserDto registerNewUser(UserDto userDto);
	
	UserDto createUser(UserDto user);
	
	UserDto getUserById(Integer userId);
	
	List<UserDto> getAllUsers();
	
	UserDto updateUser(UserDto user, Integer userId);
	
	void deleteUser(Integer userId);
	
}
