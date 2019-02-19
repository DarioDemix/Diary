package com.stageiscs.diary.entity;

import javax.persistence.*;
@Entity
public class Parent {

	
	@Id
	@GeneratedValue
	private Long idParent;
	
	private String name;
	private String surname;
	private String CF;
	private String birth_place;
	
	
	@OneToOne
	@JoinColumn(name = "user")
	private User user;
	
	
	public Parent() {
		super();
	}
	
	public Parent(Long idParent, String name, String surname, String CF, String birth_place) {
		this.idParent = idParent;
		this.name = name;
		this.surname = surname;
		this.setCF(CF);
		this.setBirth_place(birth_place);
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

	public String getCF() {
		return CF;
	}

	public void setCF(String cF) {
		CF = cF;
	}

	public String getBirth_place() {
		return birth_place;
	}

	public void setBirth_place(String birth_place) {
		this.birth_place = birth_place;
	}
	
	public User getUser() {
		return user;
	}
	
	public void setUser(User user) {
		this.user = user;
	}

}
