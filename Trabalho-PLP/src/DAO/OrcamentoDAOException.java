/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

/**
 *
 * @author alfarr
 */
public class OrcamentoDAOException extends Exception{
    
    OrcamentoDAOException(){
        super();
    }
    
    OrcamentoDAOException(String message){
        super("Erro em ORCAMENTO: " + message);
    }
    
}
