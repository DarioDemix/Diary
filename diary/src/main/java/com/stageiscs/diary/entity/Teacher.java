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

	public Teacher() {
		super();
	}
	
	public Teacher(Long idTeacher, String name, String surname) {
		this.idTeacher = idTeacher;
		this.name = name;
		this.surname = surname;
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
	
}
