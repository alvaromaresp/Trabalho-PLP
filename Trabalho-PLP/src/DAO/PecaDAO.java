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
public class PecaDAO implements ProdutoDAOInterface, PecaDAOInterface{

    @Override
    public boolean insertPeca(Peca peca) throws PecaDAOException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean deletePeca(int id) throws PecaDAOException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ArrayList<Peca> retrieveAll() throws PecaDAOException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public <T> boolean insertProduto(ArrayList<T> array_generico, T produto) throws PecaDAOException {
        try{
            return array_generico.add(produto);
        } catch (Exception e) {
            throw new PecaDAOException(e.getMessage() + " // Erro em Peca - insertProduto(array, produto) ");
        }
    }
    
    
    
}
