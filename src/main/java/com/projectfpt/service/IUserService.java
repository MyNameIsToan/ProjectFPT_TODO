package com.projectfpt.service;

import com.projectfpt.dto.UserDTO;

public interface IUserService {
	int Login(UserDTO dto);
	void Register(UserDTO dto);
	UserDTO Get(String Username);
}
