/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import java.util.Scanner;

/**
 *
 * @author alfarr
 */
public class Main {
    
    public static void main (String[] args) throws Exception{
        Scanner ler = new Scanner(System.in);
        ClienteView cliente_view = new ClienteView();
        EnderecoView endereco_view = new EnderecoView();
        FornecedorView fornecedor_view = new FornecedorView();
        ProdutoView produto_view = new ProdutoView();
        
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
                            cliente_view.insertion();
                            break;
                        case 2:
                            fornecedor_view.insertion();
                            break;
                        case 3:
                            produto_view.insertion();
                            break;
                        default:
                            break;
                    }
                    break;
                case 2:
            //ALTERAR
                    switch (opc2) {
                        case 1:
                            cliente_view.update();
                            break;
                        case 2:
                            fornecedor_view.update();
                            break;
                        case 3:
                            produto_view.update();
                            break;
                        default:
                            break;
                    }
                    break;
                case 3:
                    //REMOVER
                    switch (opc2) {
                        case 1:
                            cliente_view.deletion();
                            break;
                        case 2:
                            fornecedor_view.deletion();
                            break;
                        case 3:
                            produto_view.deletion();
                            break;
                        default:
                            break;
                    } break;
                case 4:
                    switch (opc2) {
                        case 1:
                            cliente_view.read();
                            break;
                        case 2:
                            fornecedor_view.read();
                            break;
                        case 3:
                            produto_view.read();
                            break;
                        default:
                            break;
                    }
                case 5:
                    switch (opc2) {
                        case 1:
                            cliente_view.readAll();
                            break;
                        case 2:
                            fornecedor_view.readAll();
                            break;
                        case 3:
                            produto_view.readAll();
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
    

