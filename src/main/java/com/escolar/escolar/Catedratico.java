package com.escolar.escolar;

import java.util.ArrayList;

public class Catedratico {
    private String catRFC= "";
    private String catNombre = "";
    public static ArrayList<Catedratico> catedraticos = new ArrayList<Catedratico>();

    public Catedratico(String catRFC, String catNombre) {
        this.catRFC = catRFC;
        this.catNombre = catNombre;
    }

    public static void altaCatedratico(String catRFC, String catNombre){
        catedraticos.add(new Catedratico(catRFC,catNombre));
    }

    public static void mostrarCatedraticos(){

        for(int i=0; i< catedraticos.size(); i++){
            System.out.println((i+1)+". Nombre del Catedrático: "+ catedraticos.get(i).catNombre+".");
            System.out.println("   RFC del Catedrático: "+ catedraticos.get(i).catRFC+". \n");

        }

    }
    public String getCatRFC() {
        return catRFC;
    }

    public void setCatRFC(String catRFC) {
        this.catRFC = catRFC;
    }

    public String getCatNombre() {
        return catNombre;
    }

    public void setCatNombre(String catNombre) {
        this.catNombre = catNombre;
    }
}
