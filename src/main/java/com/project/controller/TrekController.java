package com.project.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.*;

import com.project.pojo.Treks;
import com.project.service.TreksServices;

@RestController
@RequestMapping("/api")
@CrossOrigin("http://localhost:3000/")
public class TrekController {
	@Autowired
 private TreksServices services;
 
 @PostMapping("/addtrek")
 public Treks addTrek(@RequestBody Treks trek) {
	 return services.saveTreks(trek);
	 
	 
 }
 @PostMapping("/addtreks")
 public List<Treks> addTreks(@RequestBody List<Treks> trek) {
	 return services.saveTrek(trek);
	 
	 
 }
 @GetMapping("/trek")
 public List<Treks> findAllTreks(){
	 return services.gettreks();
 }
 @GetMapping("/trekbyID/{id}")
 public Treks findTrekById(@PathVariable String id) {
	 return services.getTreksById(id);
 }
 @GetMapping("/trek/{name}")
 public List<Treks> findTrekByName(@PathVariable String name) {
	 return services.getTreksByName(name);
 }
 @PutMapping("/update")
 public Treks updateTrek(@RequestBody Treks trek) {
	 return services.updateTrek(trek);
	 
 }
 
 @DeleteMapping("/delete/{id}")
 public String deleteTrek(@PathVariable String id) {
	 return services.deletetrek(id);
 }
}
