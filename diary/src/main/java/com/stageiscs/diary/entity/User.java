package com.stageiscs.diary.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "user")
public class User {
	
	@Id
	@GeneratedValue
	@Column(name = "idUser")
	private Long idUtente;
	
	private String username;
	private String password;
	private int privilege;
	private String jwt;
	
	@OneToOne(mappedBy = "user")
	private Student student;
	
	@OneToOne(mappedBy = "user")
	private Teacher teacher;
	
	@OneToOne(mappedBy = "user")
	private Parent parent;
	
	public User() {
		super();
	}

	public User(Long idUtente, String username,String password, int privilege) {
		super();
		this.idUtente = idUtente;
		this.username = username;
		this.password = password;
		this.privilege = privilege;
	}

	public Long getIdUtente() {
		return idUtente;
	}

	public void setIdUtente(Long idUtente) {
		this.idUtente = idUtente;
	}


	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public int getPrivilege() {
		return privilege;
	}

	public void setPrivilege(int privilege) {
		this.privilege = privilege;
	}

	public String getJwt() {
		return jwt;
	}

	public void setJwt(String jwt) {
		this.jwt = jwt;
	}
	
	
	

}
