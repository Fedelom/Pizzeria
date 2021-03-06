/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.pedido.estadopedido;

import org.pedido.Pedido;

/**
 * Aca se inicia la clase EstadoPedido, esta clase se conecta por Herencia con Pedido
 * @author Notebook3
 */
public class EstadoPedido extends Pedido{
    
    private int numeroEstado;
    private String nombre;
    private String descripcion;
    
    public EstadoPedido(){
        
    }

    public EstadoPedido(int numeroEstado, String nombre, String descripcion) {
        this.numeroEstado = numeroEstado;
        this.nombre = nombre;
        this.descripcion = descripcion;
    }
    
    public boolean esPteFacturacion(){
        return nombre.equals("Pendiente de pago");
    }
    public boolean esFacturado(){
        return nombre.equals("Facturando");
    }
    public boolean esGenerada(){
        return nombre.equals("Generada");
    }
    public boolean esRetirada(){
        return nombre.equals("Retirada");
    }
    public boolean esDelivery(){
        return nombre.equals("Entregada");
    }
    public boolean esRecibida(){
        return nombre.equals("Recibida");
    }
    public boolean esCancelada(){
        return nombre.equals("Fin");
    }

    public int getNumeroEstado() {
        return numeroEstado;
    }

    public void setNumeroEstado(int numeroEstado) {
        this.numeroEstado = numeroEstado;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
       
    @Override
    public String toString() {
        return this.nombre + this.descripcion + this.numeroEstado;
    }  
    
    
}
