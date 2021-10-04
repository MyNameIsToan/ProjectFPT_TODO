package com.projectfpt.service.imp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.projectfpt.dto.ParentDTO;
import com.projectfpt.entity.ChildEntity;
import com.projectfpt.entity.ParentEntity;
import com.projectfpt.entity.UserEntity;
import com.projectfpt.repository.IChildRepository;
import com.projectfpt.repository.IParentRepository;
import com.projectfpt.repository.IUserRepository;
import com.projectfpt.service.IParentService;

@Service
public class ParentService implements IParentService {
	@Autowired
	private IUserRepository userRepository;
	@Autowired
	private IParentRepository parentRepository;
	@Autowired
	private IChildRepository childRespository;

	@Override
	public void Save(ParentDTO dto) {
		ParentEntity parent = new ParentEntity();
		parent.setContent(dto.getContent());
		UserEntity user = userRepository.findOne(dto.getUsername());
		parent.setUser(user);
		parentRepository.save(parent);
	}

	@Override
	public void Delete(long id) {
		ParentEntity parent =  parentRepository.findOne(id);
		List<ChildEntity> ListOfChild = parent.getTodochild();
		for(ChildEntity child:ListOfChild) {
			childRespository.delete(child.getId());
		}
		parentRepository.delete(id);
	}

	@Override
	public void Update(ParentDTO dto) {
		ParentEntity parent = parentRepository.findOne(dto.getId());
		parent.setContent(dto.getContent());
		UserEntity user = userRepository.findOne(dto.getUsername());
		parent.setUser(user);
		parentRepository.save(parent);		
	}
}
