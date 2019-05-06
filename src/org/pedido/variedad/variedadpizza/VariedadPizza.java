/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.pedido.variedad.variedadpizza;

/**
 * Aca se inicia la clase VariedadPizza, esta clase se conecta por agregacion con Variedad
 * @author Notebook3
 */
public class VariedadPizza{
    
    private int numeroVariedad;
    private String ingredientes;
    private String nombre;
    
    public VariedadPizza(){
    }

    public VariedadPizza(int numeroVariedad, String ingredientes, String nombre) {
        this.numeroVariedad = numeroVariedad;
        this.ingredientes = ingredientes;
        this.nombre = nombre;
    }

    public int getNumeroVariedad() {
        return numeroVariedad;
    }

    public void setNumeroVariedad(int numeroVariedad) {
        this.numeroVariedad = numeroVariedad;
    }

    public String getIngredientes() {
        return ingredientes;
    }

    public void setIngredientes(String ingredientes) {
        this.ingredientes = ingredientes;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
@Override
    public String toString() {
        return this.nombre + this.numeroVariedad + this.ingredientes;
    }
    
    
}
