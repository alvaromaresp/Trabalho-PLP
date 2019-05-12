/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Model.Servico;
import java.util.ArrayList;

/**
 *
 * @author alfarr
 */
public interface ServicoDAOInterface {
    public boolean insertPeca (Servico servico) throws ServicoDAOException;
    public boolean deletePeca (int id) throws ServicoDAOException;
    
    public ArrayList<Servico> retrieveAll () throws ServicoDAOException;
    
}
