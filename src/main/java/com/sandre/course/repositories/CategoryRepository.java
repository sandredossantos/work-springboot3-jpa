package com.sandre.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sandre.course.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {

}
