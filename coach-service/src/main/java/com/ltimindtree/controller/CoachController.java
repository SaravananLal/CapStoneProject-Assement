package com.ltimindtree.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ltimindtree.request.CreateCoachRequest;
import com.ltimindtree.response.CoachResponse;
import com.ltimindtree.service.CoachService;

@RestController
@RequestMapping("/api/coach")
public class CoachController {

	@Autowired
	CoachService addressService;

	@PostMapping("/create")
	public CoachResponse createAddress (@RequestBody CreateCoachRequest createAddressRequest) {
		return addressService.createAddress(createAddressRequest);
	}
	
	@GetMapping("/getById/{id}")
	public CoachResponse getById(@PathVariable long id) {
		return addressService.getById(id);
	}
	
}
