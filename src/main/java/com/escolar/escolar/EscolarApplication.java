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

		//SpringApplication.run(EscolarApplication.class, args);
		Materia.altaMaterias(1,"Ingeniería de Software");
		Materia.altaMaterias(2,"Lenguajes de Interfaz");
		Materia.altaMaterias(3,"Fundamentos de Ingeniería de Software");
		//Materia.mostrarMaterias();  //Este método se encuentra como comentario en la clase Materia, decomentar primero para llamarlo.

	}

}
