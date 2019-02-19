package com.stageiscs.diary.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


import com.stageiscs.diary.entity.Student;

@Repository
public interface StudentRepo extends JpaRepository<Student, Long> {
	
	List<Student> findByName(String name);
}
