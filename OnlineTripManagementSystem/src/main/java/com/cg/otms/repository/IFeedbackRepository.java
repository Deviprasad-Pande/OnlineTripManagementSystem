package com.cg.otms.repository;



import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.capg.tms.entities.Feedback;

@Repository
public interface IFeedbackRepository extends JpaRepository<Feedback,Integer> {
	
	
	

}
