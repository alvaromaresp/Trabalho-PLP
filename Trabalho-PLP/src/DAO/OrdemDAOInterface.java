/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Model.Ordem;
import java.util.ArrayList;

/**
 *
 * @author alfarr
 */
public interface OrdemDAOInterface {
    public boolean insertOrdem(Ordem ordem) throws OrdemDAOException;
    public boolean deleteOrdem (int id) throws OrdemDAOException;
    
    public ArrayList<Ordem> retrieveAll () throws OrdemDAOException;
}
