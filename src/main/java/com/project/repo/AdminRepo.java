package com.project.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.project.pojo.Admin;

public interface AdminRepo extends JpaRepository<Admin, String> {

}
