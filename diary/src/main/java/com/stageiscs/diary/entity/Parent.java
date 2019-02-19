package com.stageiscs.diary.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class Parent {

	
	@Id
	@GeneratedValue
	private Long idParent;
	
	private String name;
	private String surname;
	
	private Long user;
	
	
	public Parent() {
		super();
	}
	
	public Parent(Long idParent, String name, String surname) {
		super();
		this.idParent = idParent;
		this.setName(name);
		this.setSurname(surname);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}
	
	public Long getUser() {
		return user;
	}
	
	public void setUser(Long user) {
		this.user = user;
	}
}
