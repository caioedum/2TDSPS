package com.example.java_180924.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	@GetMapping("/hello/{nome}")
	public String hello(@PathVariable("nome") String nome) {
		return "Oi mundo, me chamo" + nome;
	}

	@GetMapping("/hello2")
	public String hello2(@PathVariable("nome") String nome) {
		return "Oi mundo, me chamo" + nome;
	}

}
