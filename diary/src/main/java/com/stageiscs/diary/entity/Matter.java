package com.stageiscs.diary.entity;

import javax.persistence.*;
import java.util.*;

@Entity
public class Matter {
	
	@Id
	@GeneratedValue
	@JoinColumn(name = "id_matter")
	private Long idMatter;
	
	private String name;
	
	@ManyToMany(targetEntity = Teacher.class, mappedBy = "matters")
	private List<Teacher> teachers = new ArrayList<Teacher>();
	
	@OneToMany(targetEntity = Task.class, mappedBy = "matter")
	private List<Task> tasks = new ArrayList<Task>();
	
	public Matter() {
		super();
	}
	
	public Matter(Long idMatter, String name) {
		this.idMatter = idMatter;
		this.name = name;
	}
	
	public Long getIdMatter() {
		return idMatter;
	}
	
	public void setIdMatter(Long idMatter) {
		this.idMatter = idMatter;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
}

