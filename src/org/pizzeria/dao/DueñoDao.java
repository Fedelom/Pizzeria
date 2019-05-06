/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.pizzeria.dao;

import org.pizzeria.ui.Dueño;

/**
 *
 * @author Notebook3
 */
public interface DueñoDao {
    
    public Dueño buscarPorNombre (String nombre);
    public Dueño buscarPorApellido (String apellido);
    public Dueño buscarPorDni (String dni);
    public Dueño buscarPorTelefono (String telefono);
    public Dueño buscarPorDireccion (String direccion);
}
