/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.pizzeria.dao;

import org.pedido.variedad.Variedad;

/**
 *
 * @author Notebook3
 */
public interface VariedadDao {
    
    public Variedad buscarPorTipodeIngredientes (String tipodeingredientes);
    public Variedad buscarPorTamaño (String tamaño);
    public Variedad buscarPorVariedades (String variedades);
    
    
}
