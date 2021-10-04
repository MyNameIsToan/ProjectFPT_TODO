package com.projectfpt.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.projectfpt.dto.ChildDTO;
import com.projectfpt.service.IChildService;

@RestController
public class ChildAPI {
	@Autowired
	private IChildService childService;
	
	@PostMapping(value="/Child")
	public void Save(@RequestBody ChildDTO model) {
		childService.Save(model);
	}
	
	@PutMapping(value="/Child")
	public void Update(@RequestBody ChildDTO model) {
	
	}
	
	@DeleteMapping(value="/Child/{id}")
	public void Delete(@RequestParam("id") long id) {
		
	}
}
