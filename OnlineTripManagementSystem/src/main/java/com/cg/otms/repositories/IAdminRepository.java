package com.cg.otms.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import com.cg.otms.entities.Admin;

public interface IAdminRepository extends JpaRepository<Admin, Integer> {

	public Admin findByUsernameAndPassword(String username, String password);

}