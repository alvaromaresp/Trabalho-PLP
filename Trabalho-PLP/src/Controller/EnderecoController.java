/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import DAO.EnderecoDAO;
import DAO.EnderecoDAOException;
import Model.Endereco;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author alfarr
 */
public class EnderecoController {
    
    private final Scanner scanner;
    
    
    public EnderecoController() {
        this.scanner = new Scanner(System.in);
    }
    
     
    public int insert (ArrayList<Endereco> enderecos_array_, Endereco endereco) throws Exception {
        try{
            EnderecoDAO endereco_dao = new EnderecoDAO();
                        
            return endereco_dao.insertEndereco(enderecos_array_, endereco);
            
        } catch (EnderecoDAOException e){
            throw new Exception(e.getMessage() + " // Erro em Endereço Controller - insertion ");
        }
            
    }
    
    public boolean delete (ArrayList<Endereco> enderecos_array_, int id) throws Exception {
        try{
            EnderecoDAO endereco_dao = new EnderecoDAO();
            
            return endereco_dao.deleteEndereco(enderecos_array_, id);
        } catch (EnderecoDAOException e){
            throw new Exception(e.getMessage() + " // Erro em Endereço Controller - deletion ");
        }
    }
    
    public void read (ArrayList<Endereco> enderecos_array_, int id) throws Exception{
        try{
            EnderecoDAO endereco_dao = new EnderecoDAO();
            System.out.println(endereco_dao.retrieveByID(enderecos_array_, id).toString());
        } catch (EnderecoDAOException e){
            throw new Exception(e.getMessage() + " // Erro em Endereço Controller - read ");
        }
        
    }
   
    public boolean update (ArrayList<Endereco> enderecos_array_, int id, String op, String _new) throws Exception{
        try{
            
            
            EnderecoDAO endereco_dao = new EnderecoDAO();
            Endereco aux = endereco_dao.retrieveByID(enderecos_array_, id);
            
            if (aux == null) return false;
            
            
            switch (op.toLowerCase()){
                
                case "rua":{
                    aux.setRua_(_new);
                    break;
                }
                
                case "numero":{
                    aux.setNumero_(_new);
                    break;
                }
                
                case "bairo":{
                    aux.setBairro_(_new);
                    break;
                }
                
                case "estado":{
                    aux.setEstado_(_new);
                    break;
                }
                
                case "cep":{
                    aux.setCep_(_new);
                    break;
                }
            }
            
            enderecos_array_.add(enderecos_array_.indexOf(aux), aux);
            
            return true;
            
        } catch (EnderecoDAOException e){
            throw new Exception(e.getMessage() + " // Erro em Endereço Controller - update (id)  ");  
        }
    }
    
}
