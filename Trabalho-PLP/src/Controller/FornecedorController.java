/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import DAO.FornecedorDAO;
import DAO.FornecedorDAOException;
import Model.Fornecedor;
import java.util.ArrayList;
import java.util.Scanner;
/**
 *
 * @author Picolino
 */
public class FornecedorController {
    
    private final Scanner scanner;
    private final ArrayList<Fornecedor> fornecedor_array_ = new ArrayList();
    
    public FornecedorController() {
        this.scanner = new Scanner(System.in);
    }
    
    public void processRequest (String cmd) throws Exception{
        try{
            switch(cmd){
                case "insert":{
                    if(insertion()){
                        System.out.println("Fornecedor inserido com sucesso!");
                    } else{
                        System.out.println("Erro na inserção do Fornecedor");
                    }
                }
                /*
                case "read":{
                    read();
                    break;
                }
                
                case "read-all":{
                    read_all();
                    break;
                }
                
                case "uptade":{
                    update();
                    break;
                }
                
                case "delete":{
                    if(deletion()){
                        System.out.println("Fornecedo excluído com sucesso!");
                    } else{
                        System.out.println("Erro na exclusão do Fornecedor");
                    }
                    break;
                }*/
            }
        } catch (Exception e){
            throw new Exception(e.getMessage() + "// Erro em Fornecedor Controller- processResquest ");
        }
    }
    
    private boolean insertion () throws Exception{
        try{
            FornecedorDAO fornecedor_dao = new FornecedorDAO();
            Fornecedor aux = new Fornecedor();
            
            EnderecoController endereco_controller = new EnderecoController();
            
            aux.setId_(fornecedor_array_.size());
            
            System.out.println("Entre com as informações do Fornecedor");
            System.out.print("CNPJ: ");
            aux.setCnpj_(scanner.nextLine());
            System.out.print("Nome fantasia: ");
            aux.setNome_fantasia(scanner.nextLine());
            
            aux.setId_endereco_(endereco_controller.processRequest("insert", -1));
            
            return fornecedor_dao.insertFornecedor(aux);
        } catch (Exception e){
            throw new Exception(e.getMessage() + "// Erro em Fornecedor Controller- insertion ");
        }
    } 
    /*
    private boolean deletion () throws Exception {
        try{
            String cnpj;
            FornecedorDAO fornecedor_dao = new FornecedorDAO();
            
            cnpj = scanner.nextLine();
            
            return fornecedor_dao.deleteFornecedor(cnpj);
        } catch (FornecedorDAOException e){
            throw new Exception(e.getMessage() + " // Erro em Fornecedor Controller - deletion");
        }
    }
    
    private void read () throws Exception {
        for(Fornecedor f : fornecedor_array_){
            System.out.println("CNPJ: " + f.getCNPJ_());
            System.out.println("Nome fantasia: " + f.getNome_fantasia());
        }
    }
*/
}