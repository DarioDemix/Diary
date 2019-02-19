package com.stageiscs.diary.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.stageiscs.diary.entity.*;
import com.stageiscs.diary.repositories.*;

@RestController
public class Index {

	@Autowired
	UserRepo userRepo;
	
	@Autowired
	ParentRepo parentRepo;
	
	@Autowired
	TeacherRepo teacherRepo;
	
	@Autowired
	TaskRepo taskRepo;
	
	@Autowired
	MatterRepo matterRepo;
	
	@Autowired
	ClassroomRepo classroomRepo;

	
	@RequestMapping(value = "/registergenitore", method = RequestMethod.POST, consumes = {
			MediaType.APPLICATION_JSON_VALUE }, produces = { MediaType.APPLICATION_JSON_VALUE })
	public @ResponseBody String registradocente(@RequestBody Parent parent) {
		
		parentRepo.save(parent);
		return "{\"subject\": \"register\", \"desc\":\"true\"}";	
		
	}
	
	
 
	@RequestMapping(value = "/registeruser", method = RequestMethod.POST, consumes = {
			MediaType.APPLICATION_JSON_VALUE }, produces = { MediaType.APPLICATION_JSON_VALUE })
	public @ResponseBody String findByName(@RequestBody User user) {
		List<User> users = userRepo.findByUsername(user.getUsername());
		if (users.isEmpty()) {
			String jwt=JWT.createJWT(user.getIdUtente(), user.getUsername(), -1);
			user.setJwt(jwt);
			userRepo.save(user);
			return "{\"jwt\" : \"" + jwt + "\"}";
		} else {
			return null;
		}

	}
	@RequestMapping(value = "/accessoutente", method = RequestMethod.POST, consumes = {
			MediaType.APPLICATION_JSON_VALUE }, produces = { MediaType.APPLICATION_JSON_VALUE })
	public @ResponseBody String accessoUtente(@RequestBody User utenteProvvisorio) {
		List<User> utenteTrovato = userRepo.findByUsernameAndPassword(utenteProvvisorio.getUsername(), utenteProvvisorio.getPassword());
		if (!utenteTrovato.isEmpty()) {
			utenteProvvisorio=utenteTrovato.get(0);
			String jwt=JWT.createJWT(utenteProvvisorio.getIdUtente(), utenteProvvisorio.getUsername(), -1);
			utenteProvvisorio.setJwt(jwt);
			userRepo.save(utenteProvvisorio);
			return 
					"{\"jwt\" : \"" + jwt + 
					"\", \"usernameUtente\" : \"" + utenteProvvisorio.getUsername() + "\"}";
		} else {
			return null;
		}

	}
	
	@RequestMapping(value = "/inseriscitask", method = RequestMethod.POST, consumes = {
			MediaType.APPLICATION_JSON_VALUE }, produces = { MediaType.APPLICATION_JSON_VALUE })
	public @ResponseBody String inserisciTask(@RequestBody TaskProv taskprov) {
		Task ts = new Task();
		List<Matter> matter = matterRepo.findByName(taskprov.getMatter());
		if(!matter.isEmpty()) {
			ts.setMatter(matter.get(0));			
		}
		else {
			ts.setMatter(new Matter());
		}
		
		List<Teacher> teacher = teacherRepo.findByIdTeacher(taskprov.getTeacher());
		if(!teacher.isEmpty()) {
			ts.setTeacher(teacher.get(0));
		}
		else {
			ts.setTeacher(new Teacher());
		}
		
		ts.setTitle(taskprov.getTitle());
		ts.setTask(taskprov.getTask());
		
		taskRepo.save(ts);
		return "bravo";
	}
	
	
	@RequestMapping(value = "/inserisciDocente", method = RequestMethod.POST, consumes = {
			MediaType.APPLICATION_JSON_VALUE }, produces = { MediaType.APPLICATION_JSON_VALUE })
	public @ResponseBody String inserisciDocente(@RequestBody Teacher teacherprov) {
		teacherRepo.save(teacherprov);
		return "{\"name\":\"" + teacherprov.getName() + 
				"\", \"surname\":\"" + teacherprov.getSurname() + "\"}";
	}
	
	
	@RequestMapping(value = "/inserisciMateria", method = RequestMethod.POST, consumes = {
			MediaType.APPLICATION_JSON_VALUE }, produces = { MediaType.APPLICATION_JSON_VALUE })
	public @ResponseBody String inserisciMateria(@RequestBody Matter matterprov) {
		matterRepo.save(matterprov);
		return "{\"name\":\"" + matterprov.getName() + "\"}";
	}
	
	@RequestMapping(value = "/inserisciClasse", method = RequestMethod.POST, consumes = {
			MediaType.APPLICATION_JSON_VALUE }, produces = { MediaType.APPLICATION_JSON_VALUE })
	public @ResponseBody String inserisciClasse(@RequestBody Classroom classprov) {
		classroomRepo.save(classprov);
		return "{\"anno\":\"" + classprov.getYear() + 
				"\", \"sezione\": \"" + classprov.getSection() + "\"}";
	}
	

}
