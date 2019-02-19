package com.stageiscs.diary.entity;

import javax.persistence.*;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;


@Entity
public class Student {
	
	
	@Id
	@GeneratedValue
	private Long idStudent;
	
	private String name;
	private String surname;
	private String CF;
	private String birth_place;
	
	@OneToOne
	@JoinColumn(name = "user")
	private User user;
	
	@ManyToOne(targetEntity=Classroom.class)
	@JoinColumn(name = "classroom")
	private Classroom classroom;
	
	public Student() {
		super();
	}
	
	public Student(Long idStudent, String name, String surname, String CF, String birth_place) {
		this.idStudent = idStudent;
		this.setName(name);
		this.setSurname(surname);
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
