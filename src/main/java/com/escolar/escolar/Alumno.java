package com.escolar.escolar;

import java.util.ArrayList;

public class Alumno {
    private int numControl;
    private String nombre;

    static ArrayList<Alumno> alumnos = new ArrayList<>();
    public Alumno(int numControl, String nombre){
        this.numControl = numControl;
        this.nombre = nombre;
    }

    public static void altaAlumno(){

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
