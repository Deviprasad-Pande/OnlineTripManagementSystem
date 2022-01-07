package com.cg.otms.services;

import com.cg.otms.entities.Admin;

public interface IAdminService {

	public Admin addAdmin(Admin admin);

	public boolean isValidAdmin(String username, String password);
}