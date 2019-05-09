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
public class ServicoDAO implements ProdutoDAOInterface, ServicoDAOInterface {

    @Override
    public boolean insertPeca(Servico servico) throws ServicoDAOException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean deletePeca(int id) throws ServicoDAOException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ArrayList<Servico> retrieveAll() throws ServicoDAOException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public <T> boolean insertProduto(ArrayList<T> array_generico, T produto) throws ServicoDAOException {
        try{
            return array_generico.add(produto);
        } catch (Exception e) {
            throw new ServicoDAOException(e.getMessage() + " // Erro em Serivco - insertProduto(array, produto) ");
        }
    }
    
}
