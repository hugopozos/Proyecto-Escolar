package com.escolar.escolar;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class EscolarApplication {

	public static void main(String[] args) {
		SpringApplication.run(EscolarApplication.class, args);
		/*Materia.altaMaterias(1,"Software");
		Materia.altaMaterias(2,"Cálculo Integral");
		Materia.altaMaterias(3,"Desarrollo Sustentable");
		Materia.mostrarMaterias();*/
	}

}
