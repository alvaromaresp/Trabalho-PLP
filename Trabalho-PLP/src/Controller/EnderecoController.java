/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import DAO.EnderecoDAO;
import Model.Endereco;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author alfarr
 */
public abstract class EnderecoController {
    
    private final Scanner scanner;
    private static final ArrayList<Endereco> enderecos_array_ = new ArrayList();
    
    public static int insertEndereco () throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.            
    }
    
    public static ArrayList<Endereco> retrieveAll () throws Exception{
        try{
            // EnderecoDAO endereco_dao = new EnderecoDAO();
            
            return enderecos_array_; // endereco_dao.retrieveAll();
        }catch(Exception e){
            throw new Exception(e.getMessage() + " // Erro em retrieveAll");
        }
            
    }

    public EnderecoController() {
        this.scanner = new Scanner(System.in);
    }
}
