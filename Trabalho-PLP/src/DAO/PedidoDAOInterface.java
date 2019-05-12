/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Model.Pedido;
import java.util.ArrayList;

/**
 *
 * @author alfarr
 */
public interface PedidoDAOInterface {
    public boolean insertPedido (Pedido pedido) throws PedidoDAOException;
    public boolean deletePedido (int id) throws PedidoDAOException;
    
    public ArrayList<Pedido> retrieveAll () throws PedidoDAOException;
}
