/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.pedido.tiempo;

import java.util.List;
import org.pedido.Pedido;
import org.pedido.detallepedido.DetallePedido;
import org.persona.cliente.Cliente;

/**
 * Aca se inicia la clase Tiempo, esta clase se relacion por agregacion con Pedido
 * @author Notebook3
 */
public class Tiempo extends Pedido{
    
    private Tiempo tiempo;
    private Tiempo hora;
    private Tiempo minuto;
    private Tiempo segundo;
    
    public Tiempo() {
    }

    public Tiempo(Tiempo fechaHoraCreacion, Tiempo fechaHoraEntrega, Cliente cliente, int numero, List<DetallePedido> detallesPedido) {
        super(fechaHoraCreacion, fechaHoraEntrega, cliente, numero, detallesPedido);
    }

}
