package com.projectfpt.entity;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table(name="user")
@Data
public class UserEntity {
	@Id
	@Column(name="username")
	private String username;
	@Column(name="password")
	private String Password;
	@Column(name="email")
	private String Email;
	@Column(name="first_name")
	private String FirstName;
	@Column(name="last_name")
	private String LastName;
	@OneToMany(mappedBy = "user")
    private List<ParentEntity> todoparent;
}
