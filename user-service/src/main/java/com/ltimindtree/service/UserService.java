package com.ltimindtree.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;

import com.ltimindtree.entity.User;
import com.ltimindtree.feignclients.AddressFeignClient;
import com.ltimindtree.repository.UserRepository;
import com.ltimindtree.request.CreateUserRequest;
import com.ltimindtree.response.UserResponse;

@Service
public class UserService {
	
	Logger logger = LoggerFactory.getLogger(UserService.class);

	@Autowired
	UserRepository userRepository;
	
	@Autowired
	WebClient webClient;
	
	@Autowired
	AddressFeignClient addressFeignClient;
	
	@Autowired
	CommonService commonService;

	public UserResponse createUser(CreateUserRequest createUserRequest) {

		User user = new User();
		user.setName(createUserRequest.getName());
		user.setPwd(createUserRequest.getPwd());
		user.setDob(createUserRequest.getDob());
		user.setMobile(createUserRequest.getMobile());
		user.setMail(createUserRequest.getMail());
		user.setPin(createUserRequest.getPin());
		user.setCity(createUserRequest.getCity());
		user.setState(createUserRequest.getState());
		user.setCountry(createUserRequest.getCountry());
		user = userRepository.save(user);
		
		UserResponse userResponse = new UserResponse(user);
		
		//studentResponse.setAddressResponse(getAddressById(student.getAddressId()));
		
		userResponse.setCoachResponse(commonService.getCoachById(user.getAddressId()));

		return userResponse;
	}
	
	public UserResponse getById (long id) {
		
		logger.info("Inside Student getById");
		
		User student = userRepository.findById(id).get();
		UserResponse studentResponse = new UserResponse(student);
		
		//studentResponse.setAddressResponse(getAddressById(student.getAddressId()));
		
		studentResponse.setCoachResponse(commonService.getCoachById(student.getAddressId()));
		
		return studentResponse;
	}
	
	/*
	 * @CircuitBreaker(name = "addressService", fallbackMethod =
	 * "fallbackGetAddressById") public AddressResponse getAddressById (long
	 * addressId) { AddressResponse addressResponse =
	 * addressFeignClient.getById(addressId);
	 * 
	 * return addressResponse; }
	 * 
	 * public AddressResponse fallbackGetAddressById (long addressId, Throwable th)
	 * { return new AddressResponse(); }
	 */
}
