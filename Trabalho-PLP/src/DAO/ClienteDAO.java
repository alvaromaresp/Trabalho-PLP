/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Model.Cliente;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author alfarr
 */
public class ClienteDAO implements ClienteDAOInterface{
    
    private ArrayList<Cliente> clientes_array_;
    private Scanner scanner;

    @Override
    public boolean insertCliente(Cliente cliente) throws ClienteDAOException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
      
    }
    
    @Override
    public boolean insertCliente() throws ClienteDAOException {
        EnderecoDAO endereco_dao = new EnderecoDAO();
        try{
            Cliente cliente = new Cliente();
            System.out.println ("Entre com os dados do cliente: ");
            
            System.out.print("Nome: ");
            cliente.setNome_(scanner.nextLine());
            System.out.print("CPF: ");
            cliente.setCpf_(scanner.nextLine()); // OLHAR PATTERN
            System.out.print("Telefone: ");
            cliente.setTelefone_(scanner.nextLine());
            System.out.print("Email: ");
            cliente.setEmail_(scanner.nextLine());
     
            cliente.setId_endereco_(endereco_dao.insertEndereco());
            
            return clientes_array_.add(cliente);
        } catch (EnderecoDAOException e){
            throw new ClienteDAOException(e.getMessage() + " // Erro em insertCliente: ");
        }
    }
    

    @Override
    public boolean deleteClienteByID(int id) throws ClienteDAOException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ArrayList<Cliente> retrieveAll() throws ClienteDAOException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }


}
