package com.stageiscs.diary.entity;


import java.util.*;

import javax.persistence.*;

@Entity
public class Teacher {
	
	@Id
	@GeneratedValue
	private Long idTeacher;
	
	private String name;
	private String surname;
	private String CF;
	private String birth_place;
	
	
	@ManyToMany(targetEntity = Matter.class)
	@JoinTable(name = "teacher_matter",
		joinColumns = { @JoinColumn(name = "id_teacher") },
		inverseJoinColumns = { @JoinColumn(name = "id_matter") })
	private List<Matter> matters = new ArrayList<Matter>();
	
	
	@ManyToMany(targetEntity = Classroom.class)
	@JoinTable(name = "teacher_class",
		joinColumns = { @JoinColumn(name = "id_teacher") },
		inverseJoinColumns = { @JoinColumn(name = "id_class") })
	private List<Classroom> classrooms = new ArrayList<Classroom>();

	
	@OneToMany(targetEntity = Task.class, mappedBy = "teacher")
	private List<Task> tasks = new ArrayList<Task>();
	
	@OneToOne
	@JoinColumn(name = "user")
	private User user;

	public Teacher() {
		super();
	}
	
	public Teacher(Long idTeacher, String name, String surname, String CF, String birth_place) {
		this.idTeacher = idTeacher;
		this.name = name;
		this.surname = surname;
		this.setCF(CF);
		this.setBirth_place(birth_place);
	}
	
	public Long getIdTeacher() {
		return idTeacher;
	}
	
	public void setIdTeacher(Long idTeacher) {
		this.idTeacher = idTeacher;
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

	public String getBirth_place() {
		return birth_place;
	}

	public void setBirth_place(String birth_place) {
		this.birth_place = birth_place;
	}

	public String getCF() {
		return CF;
	}

	public void setCF(String cF) {
		CF = cF;
	}
	
	public User getUser() {
		return user;
	}
	
	public void setUser(User user) {
		this.user = user;
	}
	
}
