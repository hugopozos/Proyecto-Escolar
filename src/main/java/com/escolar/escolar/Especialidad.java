package com.escolar.escolar;
import java.util.ArrayList;
public class Especialidad{
    //atributos
    int idEspecialidad;
    String nombreEspecialidad;
    //arreglo para guardar todas las especialidades
    static ArrayList<Especialidad>especialidad = new ArrayList<Especialidad>();


    //Constructor de la clase, para asignar especialidades
    public Especialidad(int idEspecialidad,String nombreEspecialidad){
        this.idEspecialidad = idEspecialidad;
        this.nombreEspecialidad = nombreEspecialidad;
    }

    //Metodo para dar de alta a las especialidades
    public static void altaEspecialidad (int idEspecialidad,String nombreEspecialidad){
        especialidad.add(new Especialidad(idEspecialidad,nombreEspecialidad));
    }
}
