/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.pedido.variedad.ingredientes;

import org.pedido.variedad.Variedad;

/**
 * Aca se inicia la clase Ingredientes, esta clase se relacion por Herencia con Variedad
 * @author Notebook3
 */
public class Ingredientes extends Variedad{
    
    public Ingredientes(String tipodeingredientes, String tamaño, String variedades) {
        super(tipodeingredientes, tamaño, variedades);
    }
    
}
