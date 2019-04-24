/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.pedido.precio;

import java.util.List;
import org.pedido.Pedido;
import org.pedido.detallepedido.DetallePedido;
import org.pedido.tiempo.Tiempo;
import org.persona.cliente.Cliente;

/**
 * Aca se inicia la clase Precio, esta clase se conecta por Herencia con Pedido y es una agregacion
 * @author Notebook3
 */
public class Precio extends Pedido{

    public Precio(String formadepago, String tipodemoneda, String oferta) {
        this.formadepago = formadepago;
        this.tipodemoneda = tipodemoneda;
        this.oferta = oferta;
    }

    public Precio(String formadepago, String tipodemoneda, String oferta, Tiempo fechaHoraCreacion, Tiempo fechaHoraEntrega, Cliente cliente, int numero, List<DetallePedido> detallesPedido) {
        super(fechaHoraCreacion, fechaHoraEntrega, cliente, numero, detallesPedido);
        this.formadepago = formadepago;
        this.tipodemoneda = tipodemoneda;
        this.oferta = oferta;
    }
    
    private String formadepago;
    private String tipodemoneda;
    private String oferta;

    public String getFormadepago() {
        return formadepago;
    }

    public void setFormadepago(String formadepago) {
        this.formadepago = formadepago;
    }

    public String getTipodemoneda() {
        return tipodemoneda;
    }

    public void setTipodemoneda(String tipodemoneda) {
        this.tipodemoneda = tipodemoneda;
    }

    public String getOferta() {
        return oferta;
    }

    public void setOferta(String oferta) {
        this.oferta = oferta;
    }

    public Tiempo getFechaHoraCreacion() {
        return fechaHoraCreacion;
    }

    public void setFechaHoraCreacion(Tiempo fechaHoraCreacion) {
        this.fechaHoraCreacion = fechaHoraCreacion;
    }
    
}
