/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.pedido;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import org.factura.Factura;
import org.pedido.detallepedido.DetallePedido;
import org.pedido.estadopedido.EstadoPedido;
import org.pedido.tiempo.Tiempo;
import org.persona.cliente.Cliente;

/**
 * Aca se inicia Pedido, esta clase tiene una relacion de Uno a Muchos con Tiempo
 * @author Notebook3
 */
public class Pedido{
    
    public Tiempo fechaHoraCreacion;
    private Tiempo fechaHoraEntrega;
    private Cliente cliente;
    private int numero;
    private List<DetallePedido> detallesPedido;
    
    public Pedido(){
        detallesPedido = new ArrayList();
    }

    public Pedido(Tiempo fechaHoraCreacion, Tiempo fechaHoraEntrega, Cliente cliente, int numero, List<DetallePedido> detallesPedido) {
        this.fechaHoraCreacion = fechaHoraCreacion;
        this.fechaHoraEntrega = fechaHoraEntrega;
        this.cliente = cliente;
        this.numero = numero;
        this.detallesPedido = detallesPedido;
    }
    
    public BigDecimal calcTotalPedido(){
        BigDecimal total = BigDecimal.ZERO;
        
        for(DetallePedido detalle : detallesPedido){
            total = total.add(detalle.calcTotalItem());
        }
        return total;
    }
    
    public void facturar (Factura facturar, EstadoPedido facturado){
        
    }

    public Tiempo getFechaHoraCreacion() {
        return fechaHoraCreacion;
    }

    public void setFechaHoraCreacion(Tiempo fechaHoraCreacion) {
        this.fechaHoraCreacion = fechaHoraCreacion;
    }

    public Tiempo getFechaHoraEntrega() {
        return fechaHoraEntrega;
    }

    public void setFechaHoraEntrega(Tiempo fechaHoraEntrega) {
        this.fechaHoraEntrega = fechaHoraEntrega;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public List<DetallePedido> getDetallesPedido() {
        return detallesPedido;
    }

    public void setDetallesPedido(List<DetallePedido> detallesPedido) {
        this.detallesPedido = detallesPedido;
    }
    
  
}
