package com.stageiscs.diary.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


import com.stageiscs.diary.entity.Parent;
import com.stageiscs.diary.entity.User;

@Repository
public interface ParentRepo extends JpaRepository<Parent, Long> {
	List<Parent> findByName(String name);
	List<Parent> findByUser(Long user);
}
