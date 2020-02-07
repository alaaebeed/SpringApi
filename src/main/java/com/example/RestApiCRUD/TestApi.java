package com.example.RestApiCRUD;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestApi {
	
	@RequestMapping("/test")
	public String testApi() {
		return "test";
	}

}
