package com.cg.otms.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cg.otms.entities.User;
@Repository
public interface IUserRepository extends JpaRepository<User,Integer>{

}
