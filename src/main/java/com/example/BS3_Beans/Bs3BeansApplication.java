package com.example.BS3_Beans;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import javax.annotation.*;

@SpringBootApplication
public class Bs3BeansApplication {

	public static void main(String[] args) {
		SpringApplication.run(Bs3BeansApplication.class, args);
	}

	@PostConstruct
	public void llamada1(){
		System.out.println("Hola desde clase inicial");
	}

	@Bean
	CommandLineRunner ejectuame(){
		return p -> System.out.println("Hola desde clase secundaria");
	}

	@Bean
	CommandLineRunner ejectuame2(){
		return p -> System.out.println("Soy la tercera clase");
	}

}