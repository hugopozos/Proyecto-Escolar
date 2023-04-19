package com.escolar.escolar;

import jakarta.persistence.*;
import com.escolar.escolar.*;
import lombok.Getter;
import lombok.Setter;
import java.util.ArrayList;


public class Grupo {
    static ArrayList<Grupo> grupo = new ArrayList<Grupo>();
    @Id
    @Getter @Setter
    private String clave;

    @Getter @Setter
    private Materia materia;

    @Getter @Setter
    private Catedratico catedratico;

    @Getter @Setter
    private int hora;

    @Getter @Setter
    private int salon;

   private Alumno alumnos;

    public Grupo(String clave, Materia materia, Catedratico catedratico, int hora, int salon, Alumno alumnos) {
        this.clave = clave;
        this.materia = materia;
        this.catedratico = catedratico;
        this.hora = hora;
        this.salon = salon;
        this.alumnos = alumnos;
    }
    public static void altaGrupo(String clave, Materia materia, Catedratico catedratico, int hora, int salon, Alumno alumnos){
        grupo.add(new Grupo(clave,materia,catedratico,hora,salon,alumnos));
    }
}
