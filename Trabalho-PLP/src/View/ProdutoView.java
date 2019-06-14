/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;
import Controller.ProdutoController;
import DAO.PecaDAOException;
import DAO.ServicoDAOException;
import Model.Peca;
import Model.Produto;
import Model.Servico;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author ruanbasilio
 */
public class ProdutoView {

   public Scanner scanner;
   private final ArrayList<Servico> array_servicos = new ArrayList();
   private final ArrayList<Peca> array_pecas = new ArrayList();
   private final ProdutoController produto_controller; 

    public ProdutoView() {
        this.scanner = new Scanner(System.in);
        this.produto_controller = new ProdutoController();
    }
   
public boolean insertion () throws Exception{
    try{
        System.out.print("Digite a categoria que deseja inserir (peca/servico): ");
        String subclass = scanner.nextLine();
           
        Produto temp;
           
        switch (subclass.toLowerCase()) {
            case "peca":
                temp = new Peca();
                break;
            case "servico":
                temp = new Servico();
                break;
            default:
                temp = new Produto();
                break;
        }
           
        boolean rFlag = false;
           
        System.out.print("Nome: ");
        temp.setNome_(scanner.nextLine());
        System.out.print("Descrição: ");
        temp.setDesc_(scanner.nextLine());
        System.out.print("Preço: ");
        temp.setPreco_(scanner.nextDouble());
        scanner.nextLine();
          
        switch (subclass.toLowerCase()){
               
            case "peça":{
                Peca peca = (Peca) temp;
                peca.setId_(array_pecas.size());
                System.out.print("Número do Fornecedor: ");
                peca.setId_fornecedor_(scanner.nextInt());
                scanner.nextLine();
                System.out.print("Quantidade em estoque: ");
                peca.setQtd_(scanner.nextInt());
                scanner.nextLine();
                
                rFlag = produto_controller.insertion_peca(array_pecas, peca);
                break;
            }
               
            case "serviço":{
                Servico servico = (Servico) temp;
                servico.setId_(array_servicos.size());
                System.out.print("Média de duração do serviço: ");
                servico.setDuracao_(scanner.nextDouble());
                scanner.nextLine();
                
                rFlag = produto_controller.insertion_servico(array_servicos, servico);
                break;
            }
               
        }
           
        return rFlag;
       } catch (ServicoDAOException e){
           throw new Exception(e.getMessage() + " // Erro em Produto View - insertion ");
       }
           
    }

    public boolean deletion () throws Exception{
       try{
           
           System.out.print("Digite a categoria que deseja apagar (peca/servico): ");
           String subclass = scanner.nextLine();
           boolean rFlag = false;
           System.out.print("Digite o id do produto (listados acima): ");
           int id = scanner.nextInt();
           scanner.nextLine();
           
           switch (subclass.toLowerCase()){
               
               case "peca":{
                   rFlag = produto_controller.deletion_peca(array_pecas, id);
                   break;
               }
               
               case "servico":{
                   rFlag = produto_controller.deletion_servico(array_pecas, id);
                   break;
               }
            }
           
           return rFlag;
       } catch (PecaDAOException | ServicoDAOException e){
           throw new Exception(e.getMessage() + " // Erro em Produto View - deletion ");
       }
    }
    
    public void readAll(){
       System.out.println("ID | NOME | DESCRIÇÃO | FORNECEDOR | QUANTIDADE | PREÇO");
       array_pecas.forEach((p) -> {
           System.out.println(p.toString());
       });
       
       System.out.println("--------------------------------------");
       System.out.println("ID | NOME | DESCRIÇÃO | DURAÇÃO | PREÇO");
       array_servicos.forEach((s) -> {
           System.out.println(s.toString());
       });
    }
    
    public void read() throws Exception{
       
       try{
           System.out.print("Digite a categoria que deseja imprimir (peca/servico): ");
           String subclass = scanner.nextLine();
           System.out.print("Digite o nome buscado: ");
           String nome = scanner.nextLine();
           
           ArrayList<Produto> array_temp = new ArrayList();
           
            switch(subclass.toLowerCase()){
               
                case "peca": {
                   array_temp = produto_controller.read_peca(array_pecas, nome);
                   break;
                }
               
                case "servico": {
                   array_temp = produto_controller.read_servico(array_servicos, nome);
                   break;
                }

            }
           
            for(Produto p : array_temp){
               System.out.println(p.toString());
            }
           
       } catch (PecaDAOException | ServicoDAOException e){
           throw new Exception(e.getMessage() + " // Erro em Produto View - read  ");
       }
               
    }
    
    public boolean update() throws Exception{
       
       try{
           System.out.print("Digite o a opção para update (peca ou servico): ");
           String subclass = scanner.nextLine();
           boolean rFlag = false;
           System.out.print("Digite o ID: ");
           int id = scanner.nextInt();
           scanner.nextLine();
           String op;
           
           switch (subclass.toLowerCase()){
               case "peça":{
                   System.out.print("Digite o que deseja alterar (nome/descricao/preco/fornecedor/quantidade): ");
                   op = scanner.nextLine();
                   System.out.print("Digite o novo valor: ");
                   switch (op.toLowerCase()){
                    case "nome":{
                            String update = scanner.nextLine();
                            rFlag = produto_controller.update_peca(array_pecas, id, op, update);
                            break;
                        }

                        case "descrição":{
                            String update = scanner.nextLine();
                            rFlag = produto_controller.update_peca(array_pecas, id, op, update);
                            break;
                        }

                        case "preço":{
                            double update = scanner.nextDouble();
                            scanner.nextLine();
                            rFlag = produto_controller.update_peca(array_pecas, id, op, update);
                            break;
                        }

                        case "fornecedor": {
                            int update = scanner.nextInt();
                            scanner.nextLine();
                            rFlag = produto_controller.update_peca(array_pecas, id, op, update);
                            break;
                        }
                        case "quantidade":{
                            int update = scanner.nextInt();
                            scanner.nextLine();
                            rFlag = produto_controller.update_peca(array_pecas, id, op, update);
                            break;
                        }
                    }
               }
               
               case "serviço":{
                   System.out.print("Digite o que deseja alterar (nome/descricao/preco/duracao): ");
                   op = scanner.nextLine();
                   System.out.print("Digite o novo valor: ");
                    switch (op.toLowerCase()){
                       
                       case "nome":{
                           String update = scanner.nextLine();
                           rFlag = produto_controller.update_servico(array_servicos, id, op, update);
                           break;
                       }
                       
                       case "descrição":{
                           String update = scanner.nextLine();
                           rFlag = produto_controller.update_servico(array_servicos, id, op, update);
                           break;
                       }
                       
                       case "preço":{
                           double update = scanner.nextDouble();
                           scanner.nextLine();
                           rFlag = produto_controller.update_servico(array_servicos, id, op, update);
                           break;
                       }
                       
                       case "duração":{
                           double update = scanner.nextDouble();
                           scanner.nextLine();
                           rFlag = produto_controller.update_servico(array_servicos, id, op, update);
                           break;
                       }
                    }
                }
            }
           
           return rFlag;
       } catch (PecaDAOException | ServicoDAOException e){
           throw new Exception(e.getMessage() + " // Erro em Produto View - update ");
       }

   }
}
