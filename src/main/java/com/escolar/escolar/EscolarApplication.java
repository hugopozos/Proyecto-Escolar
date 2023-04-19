package com.escolar.escolar;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class EscolarApplication {

	public static void main(String[] args) {
		

		//SpringApplication.run(EscolarApplication.class, args);
		Catedratico.altaCatedratico("JUTS2301015V5", "Senen Juárez Tinoco");
		Catedratico.altaCatedratico("RARL230101PK5","Liliana Rangel Rentería");
		Catedratico.altaCatedratico("AEGS230101254", "Santiago Almeida González");
		Catedratico.mostrarCatedraticos();

	}

}
