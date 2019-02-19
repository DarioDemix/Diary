package com.stageiscs.diary.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


import com.stageiscs.diary.entity.User;

@Repository
public interface UserRepo extends JpaRepository<User, Long> {
	List<User> findByUsername(String username);
	List<User> findByUsernameAndPassword(String usernameUtente, String passwordUtente);
}
