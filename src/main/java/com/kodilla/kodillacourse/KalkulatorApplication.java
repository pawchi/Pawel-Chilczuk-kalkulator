package com.kodilla.kodillacourse;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class KalkulatorApplication {

	public static void main(String[] args) {
		SpringApplication.run(KalkulatorApplication.class, args);
		Calculator run = new Calculator(10,5);
		System.out.println("Wynik dodawania: a+b="+run.addition());
		System.out.println("Wynik odejmowania: a-b="+run.substraction());
	}
}
