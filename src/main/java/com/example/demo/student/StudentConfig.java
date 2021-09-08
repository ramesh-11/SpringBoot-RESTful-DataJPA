package com.example.demo.student;

import java.time.LocalDate;
import java.util.List;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class StudentConfig {
	
	@Bean
	CommandLineRunner commandLineRunner(StudentRepository repository) {
		return args -> {
			Student ramesh = new Student(
					"Ramesh",
					"ramesh@gmail.com",
					LocalDate.of(2000, 1, 5)
			);
			
			Student ravi = new Student(
					"Ravi",
					"ravi@gmail.com",
					LocalDate.of(2004, 1, 5)
			);
			
			repository.saveAll(
					List.of(ramesh, ravi)
			);
		};
	};
}
