/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Model.User;
import java.util.ArrayList;

/**
 *
 * @author alfarr
 */
public interface UserDAOInterface {
    public boolean insertUser (User user) throws UserDAOException;
    public boolean deleteUser (int id) throws UserDAOException;
    
    public ArrayList<User> retrieveAll () throws UserDAOException;
    
}
