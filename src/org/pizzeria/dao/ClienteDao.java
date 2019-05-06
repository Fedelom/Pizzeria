/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.pizzeria.dao;

import org.pizzeria.ui.Cliente;

/**
 *
 * @author Notebook3
 */
public interface ClienteDao {
    
    public Cliente buscarPorNombre (String nombre);
    public Cliente buscarPorApellido (String apellido);
    public Cliente buscarPorDni (String dni);
    public Cliente buscarPorTelefono (String telefono);
    public Cliente buscarPorDireccion (String direccion);
        
}
