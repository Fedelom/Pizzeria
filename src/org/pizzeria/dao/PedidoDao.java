/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.pizzeria.dao;

import java.util.List;
import org.pedido.Pedido;

/**
 *
 * @author Notebook3
 */
public interface PedidoDao {
    
    public List<Pedido> buscarPendientesDeFacturacion();
    public void guardar(Pedido pedido);
    public Pedido buscarPorFechaHoraEmision (String fechaHoraEmision);
    public Pedido buscarPorFechaHoraEntrega (String fechaHoraEntrega);
    public Pedido buscarPorCliente (String Cliente);
    public Pedido buscarPorNumero (String numero);
    public Pedido buscarPorDetallesPedido (String detallesPedido);
                
}
