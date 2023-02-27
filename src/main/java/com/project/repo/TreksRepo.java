package com.project.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.project.pojo.Treks;

public interface TreksRepo extends JpaRepository<Treks, String> {

	List<Treks> findByName(String name);

	
	
	

	

}
