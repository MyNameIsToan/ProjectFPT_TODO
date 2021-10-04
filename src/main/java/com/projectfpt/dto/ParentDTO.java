package com.projectfpt.dto;

import java.util.List;

import lombok.Data;

@Data
public class ParentDTO {
	private long id;
	private String Content;
	private String Username;
	private List<String> ChildContent;
}
