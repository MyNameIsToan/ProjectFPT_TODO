package com.projectfpt.dto;

import lombok.Data;

@Data
public class ChildDTO {
	private long id;
	private String Content;
	private long ParentID;
}
