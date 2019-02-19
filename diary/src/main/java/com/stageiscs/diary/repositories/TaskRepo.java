package com.stageiscs.diary.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


import com.stageiscs.diary.entity.Task;

@Repository
public interface TaskRepo extends JpaRepository<Task, Long> {
	
}
