/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.pizzeria.dao;

import org.factura.estadofactura.EstadoFactura;

/**
 *
 * @author Notebook3
 */
public interface EstadoFacturaDao {
 
    public EstadoFactura buscarPorId (String id);
    public EstadoFactura buscarPorNombre (String nombre);
    public EstadoFactura buscarPorDescripcion (String descripcion);
 
}
