package com.projectfpt.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.projectfpt.entity.ChildEntity;

public interface IChildRepository extends JpaRepository<ChildEntity, Long> {
	
}
