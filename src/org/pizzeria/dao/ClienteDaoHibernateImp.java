/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.pizzeria.dao;

import org.pizzeria.ui.Cliente;

/**
 *
 * @author Notebook3
 */
public class ClienteDaoHibernateImp implements ClienteDao{
    
    private final SessionFactory sessionFactory;

        public ClienteDaoHibernateImp(SessionFactory sessionFactory) {
            this.sessionFactory = sessionFactory;
    }

    @Override
    public Cliente buscarPorNombre(String nombre) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Cliente buscarPorApellido(String apellido) {
        
        Session session = sessionFactory.openSession();
        
        CriteriaBuilder builder = session.getCriteriaBuilder();
        CriteriaQuery<Cliente> query = builder.createQuery(Cliente.class);
        Root<Cliente> root = query.from(Cliente.class);
        query.select(root);
        query.where(builder.equal(root.get("apellido"), apellido));
        
        Cliente cliente = session.createQuery(query).uniqueResult();
        
        session.close();
        
        return cliente;
        
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Cliente buscarPorDni(String dni) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Cliente buscarPorTelefono(String telefono) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Cliente buscarPorDireccion(String direccion) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Cliente actualizarCliente(String nombre) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private static class SessionFactory {

        public SessionFactory() {
        }
    }
    
}
