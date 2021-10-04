package com.projectfpt.service.imp;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.projectfpt.dto.UserDTO;
import com.projectfpt.entity.ParentEntity;
import com.projectfpt.entity.UserEntity;
import com.projectfpt.repository.IUserRepository;
import com.projectfpt.service.IUserService;

@Service
public class UserService implements IUserService {
	@Autowired
	private IUserRepository userRepository;
	@Override
	public int Login(UserDTO dto) {
		UserEntity user = new UserEntity();
		user = userRepository.findOne(dto.getUsername());
		if(user.getPassword().equals(dto.getPassword())) {
			return 1;
		}else {
			return 0;
		}
	}

	@Override
	public void Register(UserDTO dto) {
		UserEntity user = new UserEntity();
		user.setUsername(dto.getUsername());
		user.setPassword(dto.getPassword());
		user.setFirstName(dto.getFirstName());
		user.setLastName(dto.getLastName());
		user.setEmail(dto.getEmail());
		userRepository.save(user);
	}

	@Override
	public UserDTO Get(String Username) {
		UserDTO dto = new UserDTO();
		UserEntity user = userRepository.findOne(Username);
		dto.setUsername(Username);
		dto.setPassword(user.getPassword());
		dto.setEmail(user.getEmail());
		dto.setFirstName(user.getFirstName());
		dto.setLastName(user.getLastName());
		List<String> ParentContent = new ArrayList<>();
		for(ParentEntity parent : user.getTodoparent()) {
			ParentContent.add(parent.getContent());
		}
		dto.setParentContent(ParentContent);
		return dto;
	}
}
