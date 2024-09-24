package com.sandre.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sandre.course.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
