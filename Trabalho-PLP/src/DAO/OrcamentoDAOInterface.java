/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Model.Orcamento;
import java.util.ArrayList;

/**
 *
 * @author alfarr
 */
public interface OrcamentoDAOInterface {
    
    public boolean insertOrcamento (Orcamento orcamento) throws OrcamentoDAOException;
    public boolean deleteOrcamento (int id) throws OrcamentoDAOException;
    
    public ArrayList<Orcamento> retrieveAll () throws OrcamentoDAOException;
    
}
