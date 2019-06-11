/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import Controller.ClienteController;
import Controller.FornecedorController;
import Controller.EnderecoController;
import Controller.ProdutoController;
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
        ProdutoController produto_controller = new ProdutoController();
        
        int opc = -1, opc2;
        
        while(opc != 0){
            System.out.println("======== MENU ========");
            System.out.println("1 - Cliente");
            System.out.println("2 - Fornecedor");
            System.out.println("3 - Produto");
            System.out.print("Escolha a opção desejada: ");
            opc2 = ler.nextInt();
            ler.nextLine();
            
            System.out.println(" ");

            System.out.println("1 - Cadastrar");
            System.out.println("2 - Alterar");
            System.out.println("3 - Remover");
            System.out.println("4 - Listar");
            System.out.println("5 - Listar Todos");
            System.out.println("0 - Fechar");
            System.out.println("======================");
            System.out.print("Escolha a opção desejada: ");
            opc = ler.nextInt();
            ler.nextLine();
            System.out.println(" ");
            
            switch (opc) {
                case 1:
                    //CADASTRO
                    switch (opc2) {
                        case 1:
                            cliente_controller.processRequest("insert");
                            break;
                        case 2:
                            fornecedor_controller.processRequest("insert");
                            break;
                        case 3:
                            produto_controller.processRequest("insert");
                            break;
                        default:
                            break;
                    }
                    break;
                case 2:
            //ALTERAR
                    switch (opc2) {
                        case 1:
                            cliente_controller.processRequest("update");
                            break;
                        case 2:
                            fornecedor_controller.processRequest("update");
                            break;
                        case 3:
                            produto_controller.processRequest("update");
                            break;
                        default:
                            break;
                    }
                    break;
                case 3:
                    //REMOVER
                    switch (opc2) {
                        case 1:
                            cliente_controller.processRequest("delete");
                            break;
                        case 2:
                            fornecedor_controller.processRequest("delete");
                            break;
                        case 3:
                            produto_controller.processRequest("delete");
                            break;
                        default:
                            break;
                    } break;
                case 4:
                    switch (opc2) {
                        case 1:
                            cliente_controller.processRequest("delete");
                            break;
                        case 2:
                            fornecedor_controller.processRequest("delete");
                            break;
                        case 3:
                            produto_controller.processRequest("delete");
                            break;
                        default:
                            break;
                    }
                case 5:
                    switch (opc2) {
                        case 1:
                            cliente_controller.processRequest("read-all");
                            break;
                        case 2:
                            fornecedor_controller.processRequest("read-all");
                            break;
                        case 3:
                            produto_controller.processRequest("read-all");
                            break;
                        default:
                            break;
                    }
                default:
                    break;
            }
        }
        
    }

}
    

