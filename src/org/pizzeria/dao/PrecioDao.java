/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.pizzeria.dao;

import org.pedido.precio.Precio;

/**
 *
 * @author Notebook3
 */
public interface PrecioDao {
    
    public Precio buscarPorFormadePago (String formadepago);
    public Precio buscarPorTipodeMoneda (String tipodemoneda);
    public Precio buscarPorOferta (String oferta);
    
}
