package com.projectfpt.service;

import com.projectfpt.dto.ChildDTO;

public interface IChildService {
	void Save(ChildDTO dto);
	void Update(ChildDTO dto);
	void Delete(long id);
}
