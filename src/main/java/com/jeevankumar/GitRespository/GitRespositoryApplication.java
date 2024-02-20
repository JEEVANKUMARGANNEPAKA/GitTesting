package com.jeevankumar.GitRespository;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
@Slf4j
public class GitRespositoryApplication {

	@GetMapping("/hello")
	public String hello(){
		log.info("This logging for application for git repository testing..!");
		return "Hello git repository..!";

	}

	public static void main(String[] args) {
		SpringApplication.run(GitRespositoryApplication.class, args);
	}

}
