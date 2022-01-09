package com.cg.otms.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import com.cg.otms.entities.Category;

public interface ICategoryRepository extends JpaRepository<Category, Integer> {

	public Category findByName(String name);

}