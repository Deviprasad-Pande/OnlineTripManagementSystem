package com.cg.otms.services;

import com.cg.otms.entities.Admin;

public interface IAdminService {

	public Admin addAdmin(Admin admin);

	public Admin isValidAdmin(String username, String password);
}