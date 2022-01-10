package com.cg.otms.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.cg.otms.entities.Admin;
import com.cg.otms.exceptions.CustomerNotFoundException;
import com.cg.otms.repositories.IAdminRepository;

/**
 * 
 * Class to implement CRUD operations from IHotleRepository
 * 
 */
@Service
public class AdminServiceImpl implements IAdminService {

	@Autowired
	private IAdminRepository adminRepository;

	/**
	 * 
	 * @param admin of Admin type
	 */
	public Admin addAdmin(Admin admin) {
		return adminRepository.save(admin);
	}

	/**
	 * to Validate Admin
	 * 
	 * @param username
	 * @param password
	 * @return true if username and password is correct
	 */
	public Admin isValidAdmin(String username, String password) {
		Admin admin = adminRepository.findByUsernameAndPassword(username, password);
	if (admin!= null) {
		return admin;
	}
	else {
		throw new CustomerNotFoundException("invalid user and pass");
		
	}
	
	}

}
