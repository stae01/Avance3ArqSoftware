/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.admincompras.proyectorummy.entidades;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author marlon
 */
public class Mano {

    List<Ficha> fichas;
    List<Boolean> selecciones;

    public Mano() {
        fichas = new ArrayList<>();
        selecciones = new ArrayList<>();

        fichas.add(new Ficha(15, "Rojo"));
        fichas.add(new Ficha(7, "Azul"));
        fichas.add(new Ficha(15, "Amarillo"));
        fichas.add(new Ficha(12, "Rojo"));
        fichas.add(new Ficha(15, "Verde"));
        fichas.add(new Ficha(10, "Rojo"));

        for (int i = 0; i < 6; i++) {
            selecciones.add(Boolean.FALSE);
        }
    }

    public List<Ficha> getFichas() {
        return fichas;
    }

    public void setFichas(List<Ficha> fichas) {
        this.fichas = fichas;
    }

    public List<Boolean> getSelecciones() {
        return selecciones;
    }

    public void setSelecciones(List<Boolean> selecciones) {
        this.selecciones = selecciones;
    }

    public void seleccionar(int indice) {
        if (selecciones.get(indice).booleanValue() == Boolean.FALSE) {
            selecciones.set(indice, Boolean.TRUE);

            System.out.println("");
            System.out.println(selecciones.get(indice).booleanValue());
            System.out.println(String.valueOf(fichas.get(indice).numero) + " " + fichas.get(indice).color);
        } else {
            selecciones.set(indice, Boolean.FALSE);

            System.out.println("");
            System.out.println(selecciones.get(indice).booleanValue());
            System.out.println(String.valueOf(fichas.get(indice).numero) + " " + fichas.get(indice).color);
        }
    }

    public void validarGrupo() {

        // ordenar fichas en lista nueva
        List<Ficha> fichasOrdenadas = new ArrayList();
        for (int i = 0; i < fichas.size(); i++) {
            if (selecciones.get(i).booleanValue() == Boolean.TRUE) {
                fichasOrdenadas.add(fichas.get(i));
            }
        }

        // comprobar mismo color
        boolean banderaColor = true;
        for (int i = 0; i < fichasOrdenadas.size(); i++) {
            if (fichasOrdenadas.get(0).getColor().equals(fichasOrdenadas.get(i).getColor())) {
            } else {
                banderaColor = false;
            }
        }
        
        // comprobar escalada
        boolean banderaEscalada = true;
        
        // si todas son del mismo color y las fichas seleccionadas son tres o más
        if (banderaColor == true && fichasOrdenadas.size() >= 3) {
            int conteo = 0;
            for (int i = 0; i < fichasOrdenadas.size(); i++) {
                conteo += fichasOrdenadas.get(i).getNumero();
            }
            
            // si se juntaron los 30 puntos
            if (conteo >= 30) {
                System.out.println("BAJADA POR COLOR");
            }
        }

    }

}
