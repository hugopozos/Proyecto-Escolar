package com.escolar.escolar;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.lang.runtime.SwitchBootstraps;
import java.util.Scanner;

@SpringBootApplication
public class EscolarApplication {

	public static void main(String[] args) {
		//****************Menu para altas de forma manual***********************************+
		Scanner scanner = new Scanner(System.in);
		System.out.println("Ingrese alguna opcion para dar de alta: ");
		String num = scanner.next();

		//Hola como estas
		switch (num){
			case "1":
				//Alta de la Especialidad
				System.out.println("Ingrese ID especialidad: ");
				int idEspecialidad = scanner.nextInt();
				scanner.nextLine();

				System.out.println("Ingrese el nombre de la especialidad: ");
				String nombreEspecialidad = scanner.nextLine();
				Especialidad.altaEspecialidad(idEspecialidad, nombreEspecialidad);
			case "2":
				//Alta de Materia
				System.out.println("Ingrese ID de Materia: ");
				int idMateria = scanner.nextInt();
				scanner.nextLine();

				System.out.println("Ingrese el nombre de la materia: ");
				String nombreMateria = scanner.nextLine();
				Materia.altaMaterias(idMateria, nombreMateria);
			case "3":
				//Alta de catedratico
				System.out.println("Ingrese el RFC de catedratico: ");
				String catRFC = scanner.nextLine();
				scanner.nextLine();

				System.out.println("Ingrese el nombre del catedratico: ");
				String catNombre = scanner.nextLine();
				Catedratico.altaCatedratico(catRFC,catNombre );
			case "4":
				System.out.println("Ingrese ID de Materia: ");
				int numControl = scanner.nextInt();
				scanner.nextLine();

				System.out.println("Ingrese el nombre de la materia: ");
				String nombre = scanner.nextLine();

				Materia.altaMaterias(numControl, nombre);
			default:
				System.out.println("Ingrese algunn numero del 1 al 4 para usar el menu");
		}

		//***********************+ALTAS ESTATICAS************************************
		//Alta de especialidad de la carrera de sistemas
		Especialidad especialidad1 = new Especialidad(1, "Computacion Avanzada");
		Especialidad.altaEspecialidad(2,"Concurrencia");
		Alumno.altaAlumno(1, "Gonzalo Anuar Perez Aramburo", especialidad1);
    
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

		//Alta de especialidad de la carrera de sistemas
		Especialidad.altaEspecialidad(1,"Concurrencia");

	}
//Esto es solo un comentario
}
