package com.escolar.escolar;

import java.util.ArrayList;

public class Alumno {
    private int numControl;
    private String nombre;
    private Especialidad especialidad; 
    static ArrayList<Alumno> alumnos = new ArrayList<>();

    public Alumno(int numControl, String nombre,Especialidad especialidad){
        this.numControl = numControl;
        this.nombre = nombre;
        this.especialidad = especialidad; 
    }

    public static void altaAlumno(int numControl, String nombre,Especialidad especialidad){
        alumnos.add(new Alumno(numControl, nombre, especialidad));
        System.out.print("Se agrego a " + nombre);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getNumControl() {
        return numControl;
    }
    public void setNumControl(int numControl) {
        this.numControl = numControl;
    }
}
