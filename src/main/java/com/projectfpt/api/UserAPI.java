package com.projectfpt.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.projectfpt.dto.UserDTO;
import com.projectfpt.service.IUserService;

@RestController
public class UserAPI {
	@Autowired
	private IUserService userService;
	@Autowired
	public JavaMailSender emailSender;
	
	
	@PostMapping(value = "/Register") // Chức Năng Đăng Kí
	public void Register(@RequestBody UserDTO model) {
//		SimpleMailMessage message = new SimpleMailMessage();
//		message.setTo(model.getEmail());
//		message.setSubject("Confirm your Account");
//		message.setText("Hello, Im testing Simple Email");
//		this.emailSender.send(message);
		userService.Register(model);
	}

	@PutMapping(value = "/Login") // Chức Năng Đăng Nhập
	public void Login(@RequestBody UserDTO model) {
		if(userService.Login(model) == 1) {
			
		}else {
			
		}
	}
}
