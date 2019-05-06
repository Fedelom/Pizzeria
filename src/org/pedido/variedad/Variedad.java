/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.pedido.variedad;

import java.util.List;
import org.pedido.Pedido;
import org.pedido.detallepedido.DetallePedido;
import org.pedido.tiempo.Tiempo;
import org.persona.cliente.Cliente;

/**
 * Aca se inicia la clase Variedad, se relaciona por Herencia con Pedido
 * @author Notebook3
 */
public class Variedad extends Pedido{

    public Variedad(String tipodeingredientes, String tamaño, String variedades) {
        this.tipodeingredientes = tipodeingredientes;
        this.tamaño = tamaño;
        this.variedades = variedades;
    }

    public Variedad(String tipodeingredientes, String tamaño, String variedades, Tiempo fechaHoraCreacion, Tiempo fechaHoraEntrega, Cliente cliente, int numero, List<DetallePedido> detallesPedido) {
        super(fechaHoraCreacion, fechaHoraEntrega, cliente, numero, detallesPedido);
        this.tipodeingredientes = tipodeingredientes;
        this.tamaño = tamaño;
        this.variedades = variedades;
    }
    
    private String tipodeingredientes;
    private String tamaño;
    private String variedades;

    public String getTipodeingredientes() {
        return tipodeingredientes;
    }

    public void setTipodeingredientes(String tipodeingredientes) {
        this.tipodeingredientes = tipodeingredientes;
    }

    public String getTamaño() {
        return tamaño;
    }

    public void setTamaño(String tamaño) {
        this.tamaño = tamaño;
    }

    public String getVariedades() {
        return variedades;
    }

    public void setVariedades(String variedades) {
        this.variedades = variedades;
    }

    @Override
    public Tiempo getFechaHoraCreacion() {
        return fechaHoraCreacion;
    }

    /**
     *
     * @param fechaHoraCreacion
     */
    @Override
    public void setFechaHoraCreacion(Tiempo fechaHoraCreacion) {
        this.fechaHoraCreacion = fechaHoraCreacion;
    }
    @Override
    public String toString() {
        return this.tamaño + this.tipodeingredientes + this.variedades;
    }
}
