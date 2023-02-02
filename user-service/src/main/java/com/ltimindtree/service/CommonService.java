package com.ltimindtree.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ltimindtree.feignclients.AddressFeignClient;
import com.ltimindtree.response.CoachResponse;

import io.github.resilience4j.circuitbreaker.annotation.CircuitBreaker;

@Service
public class CommonService {
	
	Logger logger = LoggerFactory.getLogger(CommonService.class);
	
	long count = 1;
	
	@Autowired
	AddressFeignClient addressFeignClient;

	@CircuitBreaker(name = "addressService",
			fallbackMethod = "fallbackGetAddressById")
	public CoachResponse getCoachById (long addressId) {
		logger.info("count = " + count);
		count++;
		CoachResponse coachResponse = 
				addressFeignClient.getById(addressId);
		
		return coachResponse;
	}
	
	public CoachResponse fallbackGetAddressById (long addressId, Throwable th) {
		logger.error("Error = " + th);
		return new CoachResponse();
	}
	
}
