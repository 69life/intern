package com.teamTwo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@SpringBootApplication
public class TeamTwoApplication {

	public static void main(String[] args) {
		System.out.print("Hello");

		SpringApplication.run(TeamTwoApplication.class, args);
	}


}
