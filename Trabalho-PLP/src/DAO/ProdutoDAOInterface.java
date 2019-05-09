/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import java.util.ArrayList;

/**
 *
 * @author alfarr
 */
public interface ProdutoDAOInterface {
    
    public <T> boolean insertProduto(ArrayList<T> array_generico, T produto) throws Exception;
    
    
}
