/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.pizzeria.dao;

import org.pedido.variedad.ingredientes.Ingredientes;

/**
 *
 * @author Notebook3
 */
public interface IngredientesDao {
    
    public Ingredientes buscarPorTipoDeIngredientes (String tipodeingredientes);
    public Ingredientes buscarPorTamaño (String tamaño);
    public Ingredientes buscarPorVariedades (String variedades);
    
}
