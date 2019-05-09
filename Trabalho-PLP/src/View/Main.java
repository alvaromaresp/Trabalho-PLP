/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import Controller.ClienteController;
import Controller.FornecedorController;
import java.util.Scanner;

/**
 *
 * @author alfarr
 */
public class Main {
    
    public static void main (String[] args) throws Exception{
        
        Scanner ler = new Scanner(System.in);
        
        int opc, opc2;
        
        System.out.println("1 - Cliente");
        System.out.println("2 - Fornecedor");
        System.out.println("Escolha a opção desejada: ");
        opc = ler.nextInt();
        while(opc != 0)
        {
            switch(opc){
                case 1:{
                    ClienteController cliente_controller = new ClienteController();
                    System.out.println("1 - Cadastrar");
                    System.out.println("2 - Alterar");
                    System.out.println("3 - Remover");
                    System.out.println("4 - Listar");
                    System.out.println("5 - Listar Todos");
                    opc2 = ler.nextInt();
                    switch(opc2){
                        case 1:{
                            cliente_controller.processRequest("insert");
                        }
                        break;
                        case 2:{
                            cliente_controller.processRequest("update");
                        }
                        break;
                        case 3:{
                            cliente_controller.processRequest("delete");
                        }
                        break;
                        case 4:{
                            cliente_controller.processRequest("read");
                        }
                        break;
                        case 5:{
                            cliente_controller.processRequest("read-all");
                        }
                        break;
                    }
                }
                case 2:{
                    FornecedorController fornecedor_controller = new FornecedorController();
                    System.out.println("1 - Cadastrar");
                    System.out.println("2 - Alterar");
                    System.out.println("3 - Remover");
                    System.out.println("4 - Listar");
                    System.out.println("5 - Listar Todos");
                    opc2 = ler.nextInt();
                    switch(opc2){
                        case 1:{
                            fornecedor_controller.processRequest("insert");
                        }
                        break;
                        case 2:{
                            fornecedor_controller.processRequest("update");
                        }
                        break;
                        case 3:{
                            fornecedor_controller.processRequest("delete");
                        }
                        break;
                        case 4:{
                            fornecedor_controller.processRequest("read");
                        }
                        break;
                        case 5:{
                            fornecedor_controller.processRequest("read-all");
                        }
                        break;
                    }
                }
            }
            System.out.println("1 - Cliente");
            System.out.println("2 - Fornecedor");
            System.out.println("Escolha a opção desejada: ");
            opc = ler.nextInt();
        }
    }
    
}

