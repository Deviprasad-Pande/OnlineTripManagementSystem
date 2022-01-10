package com.cg.otms.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.cg.otms.entities.Admin;
import com.cg.otms.entities.LoginBean;
import com.cg.otms.services.IAdminService;

/**
 * 
 * Controller class for testing AdminServiceImpl
 *
 */
@RestController
//@CrossOrigin("*")
public class AdminController {

	@Autowired   
	private IAdminService adminService;

	@GetMapping("/validateadmin")
	public Admin isValidAdmin(@RequestBody LoginBean loginBean) {
		return adminService.isValidAdmin(loginBean.getUsername(),loginBean.getPassword());
	}

	@PostMapping("/createadmin")
	public ResponseEntity<Admin> createAdmin(@RequestBody Admin admin) {
		return new ResponseEntity<>(adminService.addAdmin(admin), HttpStatus.OK);
	}
}