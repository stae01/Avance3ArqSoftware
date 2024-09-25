/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.admincompras.proyectorummy.mvc;

import com.admincompras.proyectorummy.entidades.Mano;

/**
 *
 * @author marlon
 */
public class ModeloJuego {
    
    private VistaJuego vista;
    private Mano mano;

    public ModeloJuego() {
        mano = new Mano();
    }

    void seleccionarFicha(int indice) {
        mano.seleccionar(indice);
    }

    void bajarGrupo() {
        mano.validarGrupo();
    }
    
}
