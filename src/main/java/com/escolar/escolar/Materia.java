package com.escolar.escolar;

import java.util.ArrayList;

//Se crea la clase referente a las materias
public class Materia {

    int idMateria;
    String nombreMateria;
    static ArrayList<Materia> materias = new ArrayList<Materia>(); //Se crea el arreglo estático para las materias

    /*    public Materia(){
            materias = new ArrayList<Materia>();
        }*/

    //Método constructor para asignar valores a las materias
    public Materia(int idMateria, String nombreMateria) {
        this.idMateria = idMateria;
        this.nombreMateria = nombreMateria;
    }

    //Método para dar de alta las materias
    public static void altaMaterias(int idMateria, String nombreMateria) {
        materias.add(new Materia(idMateria, nombreMateria)); //Se agregan nuevas materias con los datos ingresados.
    }

    //Método para ver los valores de las materias añadidas
    /*public static void mostrarMaterias(){
        for(int i=0;i<materias.size();i++){
            System.out.println("ID de la materia: " + materias.get(i).idMateria);
            System.out.println("Nombre de la materia: " + materias.get(i).nombreMateria+"\n");
        }
    }*/

    //Métodos get que pueden ser utilizados

    /*private int getIdMateria(){
        return idMateria;
    }
    private String getNombreMateria(){
        return nombreMateria;
    }*/
}
