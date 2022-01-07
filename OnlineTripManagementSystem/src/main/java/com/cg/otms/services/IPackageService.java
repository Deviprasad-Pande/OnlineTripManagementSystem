package com.cg.otms.services;

import java.util.List;

import com.cg.otms.entities.Package;

public interface IPackageService {

	public Package addPackage(Package pack);

	public List<Package> getAllPackage();

	public Package updatePackage(Package pack);

	public String delete(int id);

	public Package getPackageById(int id);

}