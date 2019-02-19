package com.stageiscs.diary.entity;


import javax.persistence.*;
import java.util.*;

@Entity
public class Classroom {
	
	@Id
	@JoinColumn(name = "id_classroom")
	private Long idClassroom;
	
	private int year;
	private String section;
	
	private String art;
	
	@ManyToMany(targetEntity = Teacher.class, mappedBy="classrooms")
	private List<Teacher> teachers = new ArrayList<Teacher>();
	
	@OneToMany(targetEntity = Student.class, mappedBy="classroom")
	private List<Student> students = new ArrayList<Student>();
	
	@OneToMany(targetEntity = Task.class, mappedBy="classroom")
	private List<Task> tasks = new ArrayList<Task>();
	
	public Classroom() {
		super();
	}
	
	public Classroom(Long idClassroom, int year, String section, String art) {
		this.idClassroom = idClassroom;
		this.year = year;
		this.section = section;
		this.art = art;
	}
	
	public Classroom(Long idClassroom, int year, String section) {
		this.idClassroom = idClassroom;
		this.year = year;
		this.section = section;
		this.art = null;
	}
	
	public Long getIdClassroom() {
		return idClassroom;
	}
	
	public void setIdClassroom(Long idClassroom) {
		this.idClassroom = idClassroom;
	}
	
	public int getYear() {
		return year;
	}
	
	public void setYear(int year) {
		this.year = year;
	}
	
	public String getSection() {
		return section;
	}
	
	public void setSection(String section) {
		this.section = section;
	}
	
	public String getArt() {
		return art;
	}
	
	public void setArt(String art) {
		this.art = art;
	}
}
