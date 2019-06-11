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
    private static final ArrayList<Endereco> enderecos_array_ = new ArrayList();
    
    
    public EnderecoController() {
        this.scanner = new Scanner(System.in);
    }
    
    public int processRequest (String cmd, int id) throws Exception {
        try{
           
           switch(cmd){
               
                case "insert":{
                   return insertion();               
               }
                
                case "delete": {
                   return deletion(id)? 1 : 0;
               }
                              
               case "update":{
                   update(id);
                   break;
               }
               
               case "read":{
                   System.out.println("test");
                   read(id);
                   break;
               }        
                   
           }
           System.out.println("Comando não encontrado em Endereço Controller.");
           return -1;
        } catch (Exception e){
           throw new Exception(e.getMessage() + " // Erro em Endereço Controller - processRequest (cmd, id)  ");    
        }
        
    }
    
    private int insertion () throws Exception {
        try{
            EnderecoDAO endereco_dao = new EnderecoDAO();
            
            Endereco aux = new Endereco();
            System.out.print("CEP: ");
            aux.setCep_(scanner.nextLine());
            System.out.print("Rua: ");
            aux.setRua_(scanner.nextLine());
            System.out.print("Numero: ");
            aux.setNumero_(scanner.nextLine());
            System.out.print("Bairro: ");
            aux.setBairro_(scanner.nextLine());
            System.out.print("Cidade: ");
            aux.setCidade_(scanner.nextLine());
            System.out.print("Estado: ");
            aux.setEstado_(scanner.nextLine());
            
            aux.setId_(enderecos_array_.size());
            
            return endereco_dao.insertEndereco(enderecos_array_, aux);
            
        } catch (EnderecoDAOException e){
            throw new Exception(e.getMessage() + " // Erro em Endereço Controller - insertion ");
        }
            
    }
    
    private boolean deletion (int id) throws Exception {
        try{
            EnderecoDAO endereco_dao = new EnderecoDAO();
            
            return endereco_dao.deleteEndereco(enderecos_array_, id);
        } catch (EnderecoDAOException e){
            throw new Exception(e.getMessage() + " // Erro em Endereço Controller - deletion ");
        }
    }
    
    private void read (int id){
        System.out.println("Endereço na tela");
        System.out.println(enderecos_array_.get(id).toString());
    }
   
    private boolean update (int id) throws Exception{
        try{
            Endereco aux = enderecos_array_.get(id);
            
            if (aux == null) return false;
            
            String op = scanner.nextLine();
            String _new = scanner.nextLine();
            
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
            
            enderecos_array_.add(id, aux);
            
            return true;
            
        } catch (Exception e){
            throw new Exception(e.getMessage() + " // Erro em Endereço Controller - update (id)  ");  
        }
    }
    
}
