/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.persona.cliente;

import org.persona.persona.Persona;

/**
 * Aca se inicia la clase Cliente, se relaciona por Herencia con Persona
 * @author Notebook3
 */
public class Cliente extends Persona{
 
    public Cliente(String nombre, String apellido, String dni, String direccion, String telefono) {
        super(nombre, apellido, dni, direccion, telefono);
    }
    
}
