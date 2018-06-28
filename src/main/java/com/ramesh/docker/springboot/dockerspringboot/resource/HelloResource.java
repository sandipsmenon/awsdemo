package com.ramesh.docker.springboot.dockerspringboot.resource;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/rest/docker/helloeveryone")
public class HelloResource {

	@GetMapping
	public String helloEveryone() {
		return " Hello Everyone. This is the Application running in Docker container";
	}
}
