package com.cg.otms.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cg.otms.entities.Package;

public interface IPackageRepository extends JpaRepository<Package, Integer> {

	public Package findPackageById(int id);

}