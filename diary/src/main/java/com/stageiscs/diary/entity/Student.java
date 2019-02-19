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
	
	private String username;
	private String password;
	private String name;
	private String surname;
	private String CF;
	
	
	@ManyToOne(targetEntity=Classroom.class)
	@JoinColumn(name = "classroom")
	private Classroom classroom;
	
	public Student() {
		super();
	}
	
	public Student(Long idStudent, String username, String password, String name, String surname) {
	
	}
}
