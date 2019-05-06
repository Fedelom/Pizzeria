/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.pizzeria.dao;

import org.pedido.pizza.Pizza;

/**
 *
 * @author Notebook3
 */
public interface PizzaDao {
    
    public Pizza buscarPorNumeroPizza (String numeroPizza);
    public Pizza buscarPorNombre (String nombre);
    public Pizza buscarPorPrecio (String precio);
    public Pizza buscarPorVariedadPizza (String variedadPizza);
    
}