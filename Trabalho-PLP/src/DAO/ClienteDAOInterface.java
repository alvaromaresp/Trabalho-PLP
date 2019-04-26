/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Model.Cliente;
import java.util.ArrayList;

/**
 *
 * @author alfarr
 */
public interface ClienteDAOInterface {
    
    public boolean insertCliente(Cliente cliente) throws ClienteDAOException;
    public boolean deleteClienteByID(int id) throws ClienteDAOException;
    
    public ArrayList<Cliente> retrieveAll() throws ClienteDAOException;
    
    
}
