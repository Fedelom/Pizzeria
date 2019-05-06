/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.pizzeria.dao;

import org.factura.Factura;

/**
 *
 * @author Notebook3
 */
public interface FacturaDao { 

    public Factura buscarPorFechaHoraEmision (String fechaHoraEmision);
    public Factura buscarPorNumero (String numero);
    public Factura buscarPorEstadoFactura (String estadoFactura);
    public Factura buscarPorDetallesPedido (String detallesPedido);
   
}
