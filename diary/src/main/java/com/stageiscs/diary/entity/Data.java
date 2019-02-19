package com.stageiscs.diary.entity;

public class Data {
	
	private String username;
	private String password;
	private String name;
	private String surname;
	private String CF;
	private String birth_place;
	private int privilege;
	
	public Data() {
		super();
	}
	
	public Data(String username, String password, String name, String surname, String CF, String birth_place, int privilege) {
		this.username = username;
		this.password = password;
		this.name = name;
		this.surname = surname;
		this.CF = CF;
		this.birth_place = birth_place;
		this.privilege = privilege;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
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

	public int getPrivilege() {
		return privilege;
	}

	public void setPrivilege(int privilege) {
		this.privilege = privilege;
	}

}
