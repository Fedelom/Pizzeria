/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.pizzeria.dao;

import org.pedido.variedad.variedadpizza.VariedadPizza;

/**
 *
 * @author Notebook3
 */
public interface VariedadPizzaDao {
    
    public VariedadPizza buscarPorNumeroVariedad (String numeroVariedad);
    public VariedadPizza buscarPorIngredientes (String ingredientes);
    public VariedadPizza buscarPorNombre (String nombre);
    
}
