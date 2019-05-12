/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import DAO.ClienteDAO;
import DAO.ClienteDAOException;
import Model.Cliente;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author alfarr
 */
public class ClienteController {
    
    private final Scanner scanner;
    private final ArrayList<Cliente> clientes_array_ = new ArrayList();

    public ClienteController() {
        this.scanner = new Scanner(System.in);

    }   
    
    
    public void processRequest (String cmd) throws Exception{
        try{           
           switch(cmd){
               case "insert":{
                   if (insertion()){
                       System.out.println("Cliente inserido com sucesso!");
                   } else {
                       System.out.println("Erro na inserção do Cliente.");
                   }
                   
                   break;
               }   
               case "read":{
                   read();
                   break;
               }
               case "read-all":{
                   read_all();
                   break;
               }
               case "update":{
                   update();
                   break;
               }
               case "delete": {
                   if (deletion()){
                       System.out.println("Cliente excluído com sucesso!");
                   } else {
                       System.out.println("Erro na exclusão do Cliente.");
                   }
                   break;
               }
           }
        } catch (Exception e){
           throw new Exception(e.getMessage() + " // Erro em Cliente Controller - processRequest  ");    
        }
            
    }
    
    private boolean insertion () throws Exception{
        try{
            ClienteDAO cliente_dao = new ClienteDAO();
            Cliente aux = new Cliente();
            
            EnderecoController endereco_controller = new EnderecoController();
            
            aux.setId_(clientes_array_.size());
            
            System.out.println("Entre com as informações do Cliente");
            System.out.print("Nome: ");
            aux.setNome_(scanner.nextLine());
            System.out.print("CPF: ");
            aux.setCpf_(scanner.nextLine());
            System.out.print("Email: ");
            aux.setEmail_(scanner.nextLine());
            System.out.print("Telefone: ");
            aux.setTelefone_(scanner.nextLine());
            
            aux.setId_endereco_(endereco_controller.processRequest("insert", -1));
            
            return cliente_dao.insertCliente(clientes_array_, aux);
        } catch (Exception e){
            throw new Exception(e.getMessage() + " // Erro em Cliente Controller - insertion ");
        }
    }
    
    private boolean deletion () throws Exception {
        try{
            String cpf;
            ClienteDAO cliente_dao = new ClienteDAO();
        
            cpf = scanner.nextLine();
            
            return cliente_dao.deleteClienteByCPF(clientes_array_, cpf);
        } catch (ClienteDAOException e){
            throw new Exception(e.getMessage() + " // Erro em Cliente Controller - deletion ");    
        }
    }
    
    private void read () throws Exception {
         try{
             System.out.print("Digite o CPF: ");
            String cpf = scanner.nextLine();
            ClienteDAO clienteDAO = new ClienteDAO();
            EnderecoController endereco_controller = new EnderecoController();
            
            Cliente c = clienteDAO.retrieveClienteByCPF(clientes_array_, cpf);
            
            if (c != null){
                System.out.println("Nome: " + c.getNome_());
                System.out.println("CPF: " + c.getCpf_());
                System.out.println("Email: " + c.getEmail_());
                System.out.println("Telefone: " + c.getTelefone_());
                endereco_controller.processRequest("read", c.getId_endereco_());
            } else {
                System.out.println("CPF inexistente.");
            }
         } catch (ClienteDAOException e){
             throw new Exception(e.getMessage() + " // Erro em Cliente Controller - display ");
         }
   }
    
    private void read_all() {
        for (Cliente c : clientes_array_){
            System.out.println("Nome: " + c.getNome_());
            System.out.println("CPF: " + c.getCpf_());
            System.out.println("Email: " + c.getEmail_());
            System.out.println("Telefone: " + c.getTelefone_());
        }
    }
    
    private void update() throws Exception{
        try{
            
            System.out.print("Digite o cpf do cliente para trocar: ");
            String cpf = scanner.nextLine();
            
            ClienteDAO cliente_dao = new ClienteDAO();
            
            Cliente c = cliente_dao.retrieveClienteByCPF(clientes_array_, cpf);
            if (c == null)
            {
                System.out.println("AEFDP");
            }
            System.out.print("O que quer trocar: ");
            String op = scanner.nextLine();
            System.out.print("Digite o novo: ");
            String _new = scanner.nextLine();
            
            switch (op.toLowerCase()){
                case "cpf":{
                    while(cliente_dao.checkCPF(clientes_array_, _new)) _new = scanner.nextLine();
                    c.setCpf_(_new);
                    break;
                }
                
                case "nome":{
                    c.setNome_(_new);
                    break;
                }
                
                case "telefone":{
                    c.setTelefone_(_new);
                    break;
                }
                
                case "endereco":{
                    EnderecoController endereco_controller = new EnderecoController();
                    endereco_controller.processRequest("update", c.getId_endereco_());
                    break;
                }
                        
            }
            
            clientes_array_.add(c.getId_(), c);
            
            
        } catch (ClienteDAOException e){
            throw new Exception(e.getMessage() + " // Erro em Cliente Controller - update  ");    
        }
    }
    
    
}
