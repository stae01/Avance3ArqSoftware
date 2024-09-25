/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.admincompras.proyectorummy.mvc;

/**
 *
 * @author marlon
 */
public class ControladorJuego {
    
    private ModeloJuego modelo;

    public ControladorJuego() {
        modelo = new ModeloJuego();
    }

    public ControladorJuego(ModeloJuego modelo) {
        this.modelo = modelo;
    }

    void seleccionarFicha(int indice) {
        modelo.seleccionarFicha(indice);
    }

    void bajarGrupo() {
        modelo.bajarGrupo();
    }
    
}
