/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.pizzeria.dao;

import org.pedido.estadopedido.EstadoPedido;

/**
 *
 * @author Notebook3
 */
public interface EstadoPedidoDao {
    
    public EstadoPedido buscarPorNumeroEstado (String numeroEstado);
    public EstadoPedido buscarPorNombre (String nombre);
    public EstadoPedido buscarPorDescripcion (String descripcion);
}
