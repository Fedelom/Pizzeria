/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.pizzeria.dao;

import org.pedido.detallepedido.DetallePedido;

/**
 *
 * @author Notebook3
 */
public interface DetallePedidoDao {
    
    public DetallePedido buscarPorNumeroPedido (String numeroPedido);
    public DetallePedido buscarPorCantidad (String cantidad);
    public DetallePedido buscarPorPrecio (String precio);
    public DetallePedido buscarPorPizza (String pizza);
    public DetallePedido buscarPorEstado (String estado);
 
}
