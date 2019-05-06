/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.pizzeria.dao;

import org.pizzeria.ui.Empleado;

/**
 *
 * @author Notebook3
 */
public interface EmpleadoDao {
    
    public Empleado buscarPorNombre (String nombre);
    public Empleado buscarPorApellido (String apellido);
    public Empleado buscarPorDni (String dni);
    public Empleado buscarPorTelefono (String telefono);
    public Empleado buscarPorDireccion (String direccion);
    
}
