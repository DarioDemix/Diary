package com.stageiscs.diary.entity;



public class TaskProv {

	
	private Long idTask;
	private String title;
	private String task;
	private String matter;
	private Long teacher;
	private Long classroom;
	
	public TaskProv() {
		super();
	}
	
	public TaskProv(Long idTask, String title, String task, String matter, Long teacher, Long classroom) {
		this.setIdTask(idTask);
		this.setTitle(title);
		this.setTask(task);
		this.setMatter(matter);
		this.setTeacher(teacher);
		this.setClassroom(classroom);
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

	public String getMatter() {
		return matter;
	}

	public void setMatter(String matter) {
		this.matter = matter;
	}

	public Long getTeacher() {
		return teacher;
	}

	public void setTeacher(Long teacher) {
		this.teacher = teacher;
	}

	public Long getClassroom() {
		return classroom;
	}

	public void setClassroom(Long classroom) {
		this.classroom = classroom;
	}
	
	
}
