package com.projectfpt.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.projectfpt.dto.ParentDTO;
import com.projectfpt.service.IParentService;

@RestController
public class ParentAPI {
	@Autowired
	private IParentService parentService;
	
	@GetMapping(value="/Parent")
	public ParentDTO Get(@RequestBody ParentDTO model) {
		return model;
	}
	
	@PostMapping(value="/Parent")
	public void Save(@RequestBody ParentDTO model) {
		
	}
	
	@PutMapping(value="/Parent")
	public void Update(@RequestBody ParentDTO model) {
		
	}
	
	@DeleteMapping(value="/Parent{id}")
	public void Delete(@RequestParam("id") long id) {
		
	}
}
