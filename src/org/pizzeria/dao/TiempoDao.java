/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.pizzeria.dao;

import org.pedido.tiempo.Tiempo;

/**
 *
 * @author Notebook3
 */
public interface TiempoDao {
    
    public Tiempo buscarPortiempo (String tiempo);
    public Tiempo buscarPorHora (String hora);
    public Tiempo buscarPorMinuto (String minuto);
    public Tiempo buscarPorSegundo (String segundo);
    
}
