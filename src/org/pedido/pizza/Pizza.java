/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.pedido.pizza;

import java.math.BigDecimal;
import org.pedido.Pedido;
import org.pedido.variedad.variedadpizza.VariedadPizza;

/**
 * Aca se inicia la clase Pizza, esta clase se conecta por Herencia con Pedido y Variedad
 * @author Notebook3
 */
public class Pizza extends Pedido{
    
    private int numeroPizza;
    private String nombre;
    private BigDecimal precio;
    private VariedadPizza variedadPizza;

    public Pizza(int numeroPizza, String nombre, BigDecimal precio, VariedadPizza variedadPizza) {
        this.numeroPizza = numeroPizza;
        this.nombre = nombre;
        this.precio = precio;
        this.variedadPizza = variedadPizza;
    }

    public int getNumeroPizza() {
        return numeroPizza;
    }

    public void setNumeroPizza(int numeroPizza) {
        this.numeroPizza = numeroPizza;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public BigDecimal getPrecio() {
        return precio;
    }

    public void setPrecio(BigDecimal precio) {
        this.precio = precio;
    }

    public VariedadPizza getVariedadPizza() {
        return variedadPizza;
    }

    public void setVariedadPizza(VariedadPizza variedadPizza) {
        this.variedadPizza = variedadPizza;
    }

    @Override
    public String toString() {
        return this.numeroPizza + this.nombre + this.precio + this.variedadPizza;
    }
    
}
