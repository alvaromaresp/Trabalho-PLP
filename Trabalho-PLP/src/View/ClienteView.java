/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import Controller.ClienteController;
import DAO.ClienteDAOException;
import Model.Cliente;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author alfarr
 */
public class ClienteView {
    
    private final Scanner scanner;
    private final ArrayList<Cliente> clientes_array_ = new ArrayList();
    private final ClienteController cliente_controller_;


    public ClienteView() {
        this.scanner = new Scanner(System.in);
        cliente_controller_ = new ClienteController();
    }   
    
    public void insertion () throws Exception{
        try{
            Cliente aux = new Cliente();   
            EnderecoView endereco_view = new EnderecoView();
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
            aux.setId_endereco_(endereco_view.insertion());
            
            if (cliente_controller_.insert(clientes_array_, aux)){
                System.out.println("Cliente inserido com sucesso!");
            } else {
                System.out.println("Falha na inserção do cliente!");
            }
            
            
        } catch (ClienteDAOException e){
            throw new Exception(e.getMessage() + " // Erro em Cliente View - insertion ");
        }
    }
    
    public void deletion () throws Exception {
        try{
            String cpf;
        
                
            cpf = scanner.nextLine();

            if(cliente_controller_.delete (clientes_array_, cpf)){
                System.out.println("Cliente deletado com sucesso!");
            } else {
                System.out.println("Falha na deleção do cliente!");
            }
            
        } catch (ClienteDAOException e){
            throw new Exception (e.getMessage() + " // Erro em Cliente View - deletion");
        }
    }
    
    public void read () throws Exception {
        
        String cpf;
         
        cpf = scanner.nextLine();
        
        Cliente c = cliente_controller_.read(clientes_array_, cpf);
        
        if (c != null){
            EnderecoView endereco_view = new EnderecoView();
            
            System.out.println("Nome: " + c.getNome_());
            System.out.println("CPF: " + c.getCpf_());
            System.out.println("Email: " + c.getEmail_());
            System.out.println("Telefone: " + c.getTelefone_());
            
            endereco_view.read(c.getId_endereco_());
        } else {
            System.out.println("CPF inexistente.");
        }
    }
    
    public void readAll() throws Exception {
        EnderecoView endereco_view = new EnderecoView();
        
        try {
        
            for (Cliente c : clientes_array_){
                System.out.println("Nome: " + c.getNome_());
                System.out.println("CPF: " + c.getCpf_());
                System.out.println("Email: " + c.getEmail_());
                System.out.println("Telefone: " + c.getTelefone_());
                endereco_view.read(c.getId_endereco_());
            }
        } catch (Exception e){
            throw new Exception(e.getMessage() + " // Erro em Cliente View - readAll");
        }
            
    }
    
    public void update () throws Exception {
        
        try{
            System.out.print("Digite o CPF do Cliente que deseja alterar: ");
            String cpf = scanner.nextLine();   

            System.out.print("Digite qual campo do Cliente deseja alterar (Nome, CPF, Email ou Telefone): ");
            String op = scanner.nextLine();
            System.out.print("Digite o novo: ");
            String _new = scanner.nextLine();

            while(cliente_controller_.checkCPF(clientes_array_, _new)) _new = scanner.nextLine();

            cliente_controller_.update(clientes_array_, cpf, op, _new);
        } catch (ClienteDAOException e){
            throw new Exception(e.getMessage() + " // Erro em Cliente View - update");
        }
    }
    
}
