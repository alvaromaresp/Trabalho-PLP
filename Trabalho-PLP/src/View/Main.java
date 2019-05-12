/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import Controller.ClienteController;
import Controller.FornecedorController;
import Controller.EnderecoController;
import java.util.Scanner;

/**
 *
 * @author alfarr
 */
public class Main {
    
    public static void main (String[] args) throws Exception{
        Scanner ler = new Scanner(System.in);
        ClienteController cliente_controller = new ClienteController();
        FornecedorController fornecedor_controller = new FornecedorController();
        EnderecoController endereco_controller = new EnderecoController();
        
        int opc = -1, opc2;
        
        while(opc != 0){
            System.out.println("======== MENU ========");
            System.out.println("1 - Cadastrar");
            System.out.println("2 - Alterar");
            System.out.println("3 - Remover");
            System.out.println("4 - Listar");
            System.out.println("5 - Listar Todos");
            System.out.println("0 - Fechar");
            System.out.println("======================");
            System.out.print("Escolha a opção desejada: ");
            opc = ler.nextInt();
            System.out.println(" ");
            
            System.out.println("Options: ");
            System.out.println("1 - Cliente");
            System.out.println("2 - Fornecedor");
            System.out.print("Escolha a opção desejada: ");
            opc2 = ler.nextInt();
            System.out.println(" ");
                
            if(opc == 1){ //CADASTRO
                if(opc2 == 1){
                    cliente_controller.processRequest("insert");
                }
                else if(opc == 2){
                    fornecedor_controller.processRequest("insert");
                }
            }
            
            else if(opc == 2){ //ALTERAR
                if(opc2 == 1){
                    cliente_controller.processRequest("uptade");
                }
                else if(opc == 2){
                    fornecedor_controller.processRequest("uptade");
                }
            }
            
            else if(opc == 3){ //REMOVER
                if(opc2 == 1){
                    cliente_controller.processRequest("delete");
                }
                else if(opc == 2){
                    fornecedor_controller.processRequest("delete");
                }
            }
            
            else if(opc == 4){
                if(opc2 == 1){
                    cliente_controller.processRequest("read");
                }
                else if(opc == 2){
                    fornecedor_controller.processRequest("read");
                }
            }
            
            else if(opc == 5){
                if(opc2 == 1){
                    cliente_controller.processRequest("read-all");
                }
                else if(opc == 2){
                    fornecedor_controller.processRequest("read-all");
                }
            }
        }
        
    }
        
        /*Scanner ler = new Scanner(System.in);
        ClienteController cliente_controller = new ClienteController();
        FornecedorController fornecedor_controller = new FornecedorController();
                        
        int opc = -1, opc2;
        while(opc != 0)
        {
            System.out.println("1 - Cliente");
            System.out.println("2 - Fornecedor");
            System.out.println("0 - Fechar");
            System.out.print("Escolha a opção desejada: ");
            opc = ler.nextInt();
            
            if(opc != 0){
                System.out.println("1 - Cadastrar");
                System.out.println("2 - Alterar");
                System.out.println("3 - Remover");
                System.out.println("4 - Listar");
                System.out.println("5 - Listar Todos");
                System.out.print("Escolha a opção desejada: ");
                opc2 = ler.nextInt();
                System.out.println();

                switch(opc){
                    case 1:{
                        switch(opc2){
                            case 1:{
                                cliente_controller.processRequest("insert");
                                break;
                            }
                            case 2:{
                                cliente_controller.processRequest("update");
                                break;
                            }
                            case 3:{
                                cliente_controller.processRequest("delete");
                                break;
                            }
                            case 4:{
                                cliente_controller.processRequest("read");
                                break;
                            }
                            case 5:{
                                cliente_controller.processRequest("read-all");
                                break;
                            }
                        }
                        opc2 = 0;
                    }
                    case 2:{
                        switch(opc2){
                            case 1:{
                                fornecedor_controller.processRequest("insert");
                                break;
                            }
                            case 2:{
                                fornecedor_controller.processRequest("update");
                                break;
                            }
                            case 3:{
                                fornecedor_controller.processRequest("delete");
                                break;
                            }
                            case 4:{
                                fornecedor_controller.processRequest("read");
                                break;
                            }
                            case 5:{
                                fornecedor_controller.processRequest("read-all");
                                break;
                            }
                        }
                    }
                }
            }
        }
    }*/
}
    

