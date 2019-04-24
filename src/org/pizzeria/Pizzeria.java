/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.pizzeria;

/**
 * Aca se inicia la clase Pizzeria, esta clase sirve para ubicar nuestra pizzeria
 * @author Notebook3
 */
public class Pizzeria{

    public Pizzeria(String localidad, String horarios, String numerotelefono) {
        this.localidad = localidad;
        this.horarios = horarios;
        this.numerotelefono = numerotelefono;
    }
    
    private String localidad;
    private String horarios;
    private String numerotelefono;

    public String getLocalidad() {
        return localidad;
    }

    public void setLocalidad(String localidad) {
        this.localidad = localidad;
    }

    public String getHorarios() {
        return horarios;
    }

    public void setHorarios(String horarios) {
        this.horarios = horarios;
    }

    public String getNumerotelefono() {
        return numerotelefono;
    }

    public void setNumerotelefono(String numerotelefono) {
        this.numerotelefono = numerotelefono;
    }
   
}
