/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Model.Peca;
import java.util.ArrayList;

/**
 *
 * @author alfarr
 */
public interface PecaDAOInterface {
    public boolean insertPeca (Peca peca) throws PecaDAOException;
    public boolean deletePeca (int id) throws PecaDAOException;
    
    public ArrayList<Peca> retrieveAll () throws PecaDAOException;
    
}