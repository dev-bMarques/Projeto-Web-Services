package com.b.dev.webServices.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.b.dev.webServices.entities.Category;

	public interface CategoryRepository extends JpaRepository<Category, Long> {
		
}