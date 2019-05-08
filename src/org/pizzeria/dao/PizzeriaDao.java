/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.pizzeria.dao;

import org.pizzeria.Pizzeria;

/**
 *
 * @author Notebook3
 */
public interface PizzeriaDao {
    
   public Pizzeria buscarPorLocalidad  (String localidad);
   public Pizzeria buscarPorHorarios (String horarios);
   public Pizzeria buscarPorNumeroTelefono (String numerotelefono);
   
}
