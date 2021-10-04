package com.projectfpt.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.projectfpt.entity.UserEntity;

public interface IUserRepository extends JpaRepository<UserEntity, String>{
	
}
