package com.project.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.pojo.Treks;
import com.project.repo.TreksRepo;

@Service
public class TreksServices {
	
	@Autowired
	private TreksRepo repo;
	
	public Treks saveTreks(Treks trek) {
		return repo.save(trek);
		
	}
	
	public List<Treks> saveTrek(List<Treks> trek){
		return repo.saveAll(trek);
	}
	public List<Treks> gettreks(){
		return repo.findAll();
	}
	
	public Treks getTreksById(String id) {
		return repo.findById(id).orElse(null);
	}
	
	public List<Treks> getTreksByName(String name) {
		return repo.findByName(name);
	}
	
	public String deletetrek(String id) {
		repo.deleteById(id);
		return "Trek removed" + id;
		
	}
	
	public Treks updateTrek(Treks trek) {
		Treks exiTrek = repo.findById(trek.getT_id()).orElse(null);
		exiTrek.setName(trek.getName());
		exiTrek.setT_desc(trek.getT_desc());
		exiTrek.setT_price(trek.getT_price());
		return repo.save(exiTrek);
	}
}
