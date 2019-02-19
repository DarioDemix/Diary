package com.stageiscs.diary.entity;

import javax.persistence.*;
import java.util.*;


@Entity
public class Task {

	@Id
	@GeneratedValue
	private Long idTask;
	
	private String title;
	
	private String task;
	
	@ManyToOne(targetEntity = Teacher.class)
	@JoinColumn(name = "teacher")
	private Teacher teacher;
	
	@ManyToOne(targetEntity = Classroom.class)
	@JoinColumn(name = "classroom")
	private Classroom classroom;
	
	@ManyToOne(targetEntity = Matter.class)
	@JoinColumn(name = "matter")
	private Matter matter;
	
	public Task() {
		super();
	}
	
	public Task(Long idTask, String title, String task, Teacher teacher, Classroom classroom, Matter matter) {
		this.idTask = idTask;
		this.title = title;
		this.task = task;
		this.teacher = teacher;
		this.classroom = classroom;
		this.matter = matter;
	}
	
	public Long getIdTask() {
		return idTask;
	}
	
	public void setIdTask(Long idTask) {
		this.idTask = idTask;
	}
	
	public String getTitle() {
		return title;
	}
	
	public void setTitle(String title) {
		this.title = title;
	}
	
	public String getTask() {
		return task;
	}
	
	public void setTask(String task) {
		this.task = task;
	}
	
	public Teacher getTeacher() {
		return teacher;	
	}
	
	public void setTeacher(Teacher teacher) {
		this.teacher = teacher;
	}
	
	public Classroom getClassroom() {
		return classroom;
	}
	
	public void setClassroom(Classroom classroom) {
		this.classroom = classroom;
	}
	
	public Matter getMatter() {
		return matter;
	}
	
	public void setMatter(Matter matter) {
		this.matter = matter;
	}
	
}
