/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.reporte;

import org.pedido.Pedido;
import org.factura.Factura;
import org.pizzeria.Pizzeria;

/**
 * Aca se inicia la clase Reporte, se relaciona por Herencia con Pedido, Factura y Pizzeria
 * @author Notebook3
 */
public class Reporte extends Pizzeria{

    public Reporte(String recaudo, String servicios, String localidad, String horarios, String numerotelefono) {
        super(localidad, horarios, numerotelefono);
        this.recaudo = recaudo;
        this.servicios = servicios;
    }
    
    private String recaudo;
    private String servicios;

    public String getRecaudo() {
        return recaudo;
    }

    public void setRecaudo(String recaudo) {
        this.recaudo = recaudo;
    }

    public String getServicios() {
        return servicios;
    }

    public void setServicios(String servicios) {
        this.servicios = servicios;
    }
    
}
