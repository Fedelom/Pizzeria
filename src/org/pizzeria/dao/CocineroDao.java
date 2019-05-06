/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.pizzeria.dao;

import org.pizzeria.ui.Cocinero;

/**
 *
 * @author Notebook3
 */
public interface CocineroDao {
    
    public Cocinero buscarPorNombre (String nombre);
    public Cocinero buscarPorApellido (String apellido);
    public Cocinero buscarPorDni (String dni);
    public Cocinero buscarPorTelefono (String telefono);
    public Cocinero buscarPorDireccion (String direccion);
    
}
