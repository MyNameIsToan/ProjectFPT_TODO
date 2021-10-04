package com.projectfpt.service.imp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.projectfpt.dto.ChildDTO;
import com.projectfpt.entity.ChildEntity;
import com.projectfpt.entity.ParentEntity;
import com.projectfpt.repository.IChildRepository;
import com.projectfpt.repository.IParentRepository;
import com.projectfpt.service.IChildService;

@Service
public class ChildService implements IChildService{
	@Autowired
	private IParentRepository parentRepository;
	@Autowired
	private IChildRepository childRepository;

	@Override
	public void Save(ChildDTO dto) {
		ChildEntity child = new ChildEntity();
		child.setContent(dto.getContent());
		ParentEntity parent = parentRepository.findOne(dto.getParentID());
		child.setParent(parent);
		childRepository.save(child);
	}

	@Override
	public void Update(ChildDTO dto) {
		
	}

	@Override
	public void Delete(long id) {
		childRepository.delete(id);
	}
}
