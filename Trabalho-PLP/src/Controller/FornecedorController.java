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
                    break;
                }
                
                case "read":{
                    read();
                    break;
                }
                /*
                case "read-all":{
                    read_all();
                    break;
                }
                */
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
                }
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
            
            return fornecedor_dao.insertFornecedor(fornecedor_array_, aux);
            
        } catch (Exception e){
            throw new Exception(e.getMessage() + "// Erro em Fornecedor Controller- insertion ");
        }
    } 
    
    private boolean deletion () throws Exception {
        try{
            String cnpj;
            FornecedorDAO fornecedorDAO = new FornecedorDAO();
            
            cnpj = scanner.nextLine();   
            
            Fornecedor f = fornecedorDAO.retrieveFornecedorByCNPJ(fornecedor_array_, cnpj);
            
            return fornecedorDAO.deleteFornecedor(f.getId_());
        }catch (FornecedorDAOException e){
            throw new Exception(e.getMessage() + " // Erro em Fornecedor Controller - deletion");
        }
    }
    
    private void read () throws Exception {
        try{
            System.out.print("Digite o CNPJ: ");
            String cnpj = scanner.nextLine();
            FornecedorDAO fornecedorDAO = new FornecedorDAO();
            EnderecoController endereco_controller = new EnderecoController();
            
            Fornecedor f = fornecedorDAO.retrieveFornecedorByCNPJ(fornecedor_array_, cnpj);
            
            if (f != null){
                System.out.println("Nome Fantasia: " + f.getNome_fantasia());
                System.out.println("CNPJ: " + f.getCnpj_());
                endereco_controller.processRequest("read", f.getId_endereco_());
            } else {
                System.out.println("CNPJ inexistente.");
            }
         } catch (FornecedorDAOException e){
             throw new Exception(e.getMessage() + " // Erro em Cliente Controller - display ");
         }
    }
    
    private void update() throws Exception{
        try{
            
            System.out.print("Digite o cpf do cliente para trocar: ");
            String cpf = scanner.nextLine();
            
            FornecedorDAO fornecedor_dao = new FornecedorDAO();
            
            Fornecedor f = fornecedor_dao.retrieveFornecedorByCNPJ(fornecedor_array_, cpf);
            if (f == null)
            {
                System.out.println("AEFDP");
            }
            System.out.print("O que quer trocar: ");
            String op = scanner.nextLine();
            System.out.print("Digite o novo: ");
            String _new = scanner.nextLine();
            
            switch (op.toLowerCase()){
                case "cpf":{
                    while(fornecedor_dao.checkCNPJ(fornecedor_array_, _new)) _new = scanner.nextLine();
                    f.setCnpj_(_new);
                    break;
                }
                
                case "nome":{
                    f.setNome_fantasia(_new);
                    break;
                }
                
                case "endereco":{
                    EnderecoController endereco_controller = new EnderecoController();
                    endereco_controller.processRequest("update", f.getId_endereco_());
                    break;
                }
                        
            }
            
            fornecedor_array_.add(f.getId_(), f);
            
            
        } catch (FornecedorDAOException e){
            throw new Exception(e.getMessage() + " // Erro em Cliente Controller - update  ");    
        }
    }

}