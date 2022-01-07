package com.cg.otms.repository;



import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cg.otms.entities.Feedback;

@Repository
public interface IFeedbackRepository extends JpaRepository<Feedback,Integer> {
	
	
	

}
