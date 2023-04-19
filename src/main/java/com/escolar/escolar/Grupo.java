package com.escolar.escolar;

import jakarta.persistence.*;
import com.escolar.escolar.*;
import lombok.Getter;
import lombok.Setter;


public class Grupo {

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

    @Getter @Setter
    private Alumno alumnos[];

    public Grupo(String clave, Materia materia, Catedratico catedratico, int hora, int salon, Alumno[] alumnos) {
        this.clave = clave;
        this.materia = materia;
        this.catedratico = catedratico;
        this.hora = hora;
        this.salon = salon;
        this.alumnos = alumnos;
    }
}
