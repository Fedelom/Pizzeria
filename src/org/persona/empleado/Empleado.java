/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.persona.empleado;

import org.persona.persona.Persona;

/**
 * Aca se inicia la clase Empleado, esta clase se relaciona por Herencia con Persona
 * @author Notebook3
 */
public class Empleado extends Persona{
    
    public Empleado(String nombre, String apellido, String dni, String direccion, String telefono) {
        super(nombre, apellido, dni, direccion, telefono);
    }
    
}
