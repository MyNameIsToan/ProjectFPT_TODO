package com.projectfpt.entity;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table(name="parentlist")
@Data
public class ParentEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	
	@Column(name="content")
	private String content;
	
	@ManyToOne
    @JoinColumn(name = "user")
    private UserEntity user;
	
	@OneToMany(mappedBy = "parent")
    private List<ChildEntity> todochild;
	
}
