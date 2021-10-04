package com.projectfpt.dto;

import java.util.List;

import lombok.Data;

@Data
public class UserDTO {
	private String Username;
	private String Password;
	private String Email;
	private String FirstName;
	private String LastName;
	private long ParentID;
	private List<String> ParentContent;	
}
