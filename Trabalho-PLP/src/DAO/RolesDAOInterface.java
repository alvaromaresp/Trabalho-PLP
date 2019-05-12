/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Model.Roles;
import java.util.ArrayList;

/**
 *
 * @author alfarr
 */
public interface RolesDAOInterface {
    public boolean insertPeca (Roles role) throws RolesDAOException;
    public boolean deletePeca (int id) throws RolesDAOException;
    
    public ArrayList<Roles> retrieveAll () throws RolesDAOException;
    
}
