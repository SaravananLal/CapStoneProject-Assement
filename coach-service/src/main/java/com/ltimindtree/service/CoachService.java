package com.ltimindtree.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ltimindtree.entity.Coach;
import com.ltimindtree.repository.CoachRepository;
import com.ltimindtree.request.CreateCoachRequest;
import com.ltimindtree.response.CoachResponse;

@Service
public class CoachService {

	Logger logger = LoggerFactory.getLogger(CoachService.class);
	
	@Autowired
	CoachRepository coachRepository;

	public CoachResponse createAddress(CreateCoachRequest createCoachRequest) {
		

		Coach coach = new Coach();
		coach.setName(createCoachRequest.getName());
		coach.setPwd(createCoachRequest.getPwd());
		coach.setDob(createCoachRequest.getDob());
		coach.setMobile(createCoachRequest.getGender());
		coach.setMobile(createCoachRequest.getMobile());
		coach.setSpec(createCoachRequest.getSpec());
		
		
		
		coachRepository.save(coach);
		
		return new CoachResponse(coach);
		/*
		 * Coach address = new Coach();
		 * address.setStreet(createAddressRequest.getStreet());
		 * address.setCity(createAddressRequest.getCity());
		 * 
		 * addressRepository.save(address);
		 * 
		 * return new CoachResponse(address);
		 */
		
	}
	
	public CoachResponse getById (long id) {
		
		logger.info("Inside Address Microservice getById " + id);
		
		Coach address = coachRepository.findById(id).get();
		
		return new CoachResponse(address);
	}
	
}
