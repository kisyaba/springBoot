package com.myProject.firstSpring.repository;

import com.myProject.firstSpring.models.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface userRepository extends JpaRepository<User,Integer> {

}
