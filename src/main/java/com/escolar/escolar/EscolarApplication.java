package com.escolar.escolar;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class EscolarApplication {

	public static void main(String[] args) {
		
		Especialidad especialidad1 = new Especialidad(1, "Computacion Avanzada");
		Alumno.altaAlumno(1, "Gonzalo Anuar Perez Aramburo", especialidad1);
	}

}
