package com.stageiscs.diary.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


import com.stageiscs.diary.entity.Teacher;

@Repository
public interface TeacherRepo extends JpaRepository<Teacher, Long> {
	
	List<Teacher> findByIdTeacher(Long idTeacher);
}
