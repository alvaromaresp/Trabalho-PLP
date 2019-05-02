/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Model.Endereco;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author alfarr
 */
public class EnderecoDAO implements EnderecoDAOInterface{
    
    private ArrayList<Endereco> enderecos_array_;
    Scanner scanner;

    @Override
    public boolean insertEndereco(Endereco endereco) throws EnderecoDAOException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    @Override
    public int insertEndereco() throws EnderecoDAOException {
        try{
            Endereco endereco = new Endereco();
            System.out.println("Entre com as informações do endereço:");
            
            System.out.print("CEP: ");
            endereco.setCep_(scanner.nextLine());
            System.out.print("Rua: ");
            System.out.print("Numero: ");
            endereco.setNumero_(scanner.nextLine());
            endereco.setRua_(scanner.nextLine());
            System.out.print("Bairro: ");
            endereco.setBairro_(scanner.nextLine());
            System.out.print("Estado:");
            endereco.setEstado_(scanner.nextLine());
            endereco.setId_(enderecos_array_.size());
            
            enderecos_array_.add(endereco);
            
            return endereco.getId_();
        }catch(Exception e){
            throw new EnderecoDAOException(e.getMessage() + " // Erro em insertEnderco() ");
        }
    }
    
    @Override
    public boolean deleteEndereco(int id) throws EnderecoDAOException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ArrayList<Endereco> retrieveAll() throws EnderecoDAOException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
