package com.projectfpt.service;

import com.projectfpt.dto.ParentDTO;

public interface IParentService {
	void Save(ParentDTO dto);
	void Delete(long id);
	void Update(ParentDTO dto);
}
