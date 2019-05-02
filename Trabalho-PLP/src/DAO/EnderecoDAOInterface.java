/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Model.Endereco;
import java.util.ArrayList;

/**
 *
 * @author alfarr
 */
public interface EnderecoDAOInterface {
    
    public boolean insertEndereco(Endereco endereco) throws EnderecoDAOException;
    public boolean deleteEndereco(int id) throws EnderecoDAOException;
    
    public int insertEndereco() throws EnderecoDAOException;
    
    public ArrayList<Endereco> retrieveAll () throws EnderecoDAOException;
    
}
