/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.factura;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import org.factura.estadofactura.EstadoFactura;
import org.pedido.detallepedido.DetallePedido;
import org.pedido.tiempo.Tiempo;

/**
 * Aca inicia la clase Factura, esta clase se relaciona por asociacion con Tiempo y por Agregacion con EstadoFactura
 * @author Notebook3
 */
public class Factura{
    
    private Tiempo fechaHoraEmision;
    private long numero;
    private EstadoFactura estadoFactura;
    private List<DetallePedido> detallesPedido;
    
    public Factura(){
        detallesPedido = new ArrayList();
    }

    public Factura(Tiempo fechaHoraEmision, long numero, EstadoFactura estadoFactura, List<DetallePedido> detallesPedido) {
        this.fechaHoraEmision = fechaHoraEmision;
        this.numero = numero;
        this.estadoFactura = estadoFactura;
        this.detallesPedido = detallesPedido;
    }

    public Tiempo getFechaHoraEmision() {
        return fechaHoraEmision;
    }

    /**
     *
     * @param fechaHoraEmision
     */
    public void setFechaHoraEmision(Tiempo fechaHoraEmision) {
        this.fechaHoraEmision = fechaHoraEmision;
    }

    public long getNumero() {
        return numero;
    }

    public void setNumero(long numero) {
        this.numero = numero;
    }

    public EstadoFactura getEstadoFactura() {
        return estadoFactura;
    }

    public void setEstadoFactura(EstadoFactura estadoFactura) {
        this.estadoFactura = estadoFactura;
    }

    public List<DetallePedido> getDetallesPedido() {
        return detallesPedido;
    }

    public void setDetallesPedido(List<DetallePedido> detallesPedido) {
        this.detallesPedido = detallesPedido;
    }
    
}
