package com.ltimindtree.feignclients;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.ltimindtree.response.CoachResponse;

@FeignClient(value = "api-gateway")
public interface AddressFeignClient {

	@GetMapping("/coach-service/api/coach/getById/{id}")
	public CoachResponse getById(@PathVariable long id);
	
}
