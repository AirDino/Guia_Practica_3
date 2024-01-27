package com.m5a.Guia_Practica_Mongo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import springfox.documentation.swagger2.annotations.EnableSwagger2;


@SpringBootApplication
@EnableSwagger2
public class GuiaPracticaMongoApplication {

	
	public static void main(String[] args) {
		SpringApplication.run(GuiaPracticaMongoApplication.class, args);
	}
	}