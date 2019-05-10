/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import DAO.PecaDAO;
import DAO.PecaDAOException;
import DAO.ServicoDAO;
import DAO.ServicoDAOException;
import Model.Peca;
import Model.Produto;
import Model.Servico;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author alfarr
 */
public class ProdutoController {
    
   private final Scanner scanner;
   private final ArrayList<Servico> array_servicos = new ArrayList();
   private final ArrayList<Peca> array_pecas = new ArrayList();
   
   ProdutoController(){
       this.scanner = new Scanner(System.in);
   }
   
   public void processRequest (String cmd) throws Exception{
        try{
           
           switch(cmd.toLowerCase()){
               case "insert":{
                   if (insertion()){
                       System.out.println("Produto inserido com sucesso!");
                   } else {
                       System.out.println("Erro na inserção do Produto.");
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
                   read_all();
                   update();
                   break;
               }
               
               case "delete": {
                   read_all();
                   if (deletion()){
                       System.out.println("Produto excluído com sucesso!");
                   } else {
                       System.out.println("Erro na exclusão do Produto.");
                   }
                   break;
               }
                   
           }
        } catch (Exception e){
           throw new Exception(e.getMessage() + " // Erro em Produto Controller - processRequest  ");    
        }
            
    }
   
   private boolean insertion () throws Exception{
       try{
           String subclass = scanner.nextLine();
           Produto temp = new Produto();
           boolean rFlag = false;
           
           temp.setNome_(scanner.nextLine());
           temp.setDesc_(scanner.nextLine());
           temp.setPreco_(scanner.nextFloat());
          
           switch (subclass.toLowerCase()){
               
               case "peça":{
                   Peca peca = (Peca) temp;
                   peca.setId_(array_pecas.size());
                   peca.setId_fornecedor_(scanner.nextInt());
                   peca.setQtd_(scanner.nextInt());
                   
                   PecaDAO peca_dao = new PecaDAO();
                   
                   rFlag = peca_dao.insertProduto(array_pecas, peca);
                   break;
               }
               
               case "serviço":{
                   Servico servico = (Servico) temp;
                   servico.setId_(array_servicos.size());
                   servico.setDuracao_(scanner.nextFloat());
                   
                   
                   ServicoDAO servico_dao = new ServicoDAO();
                   rFlag = servico_dao.insertProduto(array_servicos, servico);
                   break;
               }
               
            }
           
            return rFlag;
       } catch (ServicoDAOException | PecaDAOException e){
           throw new Exception(e.getMessage() + " // Erro em Produto Controller - insertion ");
       }
           
   }
   
   private boolean deletion () throws Exception{
       try{
           String subclass = scanner.nextLine();
           boolean rFlag = false;
           int id = scanner.nextInt();
           
           switch (subclass.toLowerCase()){
               
               case "peça":{
                   PecaDAO peca_dao = new PecaDAO();
                   
                   rFlag = peca_dao.deleteProduto(array_pecas, id);
                   break;
               }
               
               case "serviço":{
                   ServicoDAO servico_dao = new ServicoDAO();
                   
                   rFlag = servico_dao.deleteProduto(array_pecas, id);
                   break;
               }
            }
           
           return rFlag;
       } catch (PecaDAOException | ServicoDAOException e){
           throw new Exception(e.getMessage() + " // Erro em Produto Controller - deletion ");
       }
   }
   
   private void read_all(){
       array_pecas.forEach((p) -> {
           System.out.println(p.toString());
       });
       
       System.out.println("--------------------------------------");
       
       array_servicos.forEach((s) -> {
           System.out.println(s.toString());
       });
   }
   
   private void read() throws Exception{
       
       try{
           String subclass = scanner.nextLine();
           String nome = scanner.nextLine();
           
           ArrayList<Produto> array_temp = new ArrayList();
           
           switch(subclass.toLowerCase()){
               
               case "peça": {
                   PecaDAO peca_dao = new PecaDAO();
                   
                   array_temp = peca_dao.retrieveByNome(array_pecas, nome);
                   break;
               }
               
               case "serviço": {
                   ServicoDAO servico_dao = new ServicoDAO();
                   
                   array_temp = servico_dao.retrieveByNome(array_servicos, nome);
                   break;
               }

           }
           
           for(Produto p : array_temp){
               System.out.println(p.toString());
           }
           
       } catch (PecaDAOException | ServicoDAOException e){
           throw new Exception(e.getMessage() + " // Erro em Produto Controller - read  ");
       }
           
       
   }
   
   private boolean update() throws Exception{
       
       try{
           String subclass = scanner.nextLine();
           boolean rFlag = false;
           int id = scanner.nextInt();
           String op;
           
           switch (subclass.toLowerCase()){
               
               case "peça":{
                   PecaDAO peca_dao = new PecaDAO();
                   
                   Peca temp = array_pecas.get(id);
                   
                   op = scanner.nextLine();
                   
                   switch (op.toLowerCase()){
                       
                       case "nome":{
                           String update = scanner.nextLine();
                           rFlag = peca_dao.updatePeca(array_pecas, id, op, update);
                           break;
                       }
                       
                       case "descrição":{
                           String update = scanner.nextLine();
                           rFlag = peca_dao.updatePeca(array_pecas, id, op, update);
                           break;
                       }
                       
                       case "preço":{
                           double update = scanner.nextDouble();
                           rFlag = peca_dao.updatePeca(array_pecas, id, op, update);
                           break;
                       }
                       
                       case "fornecedor": {
                           int update = scanner.nextInt();
                           rFlag = peca_dao.updatePeca(array_pecas, id, op, update);
                           break;
                       }
                       case "quantidade":{
                           int update = scanner.nextInt();
                           rFlag = peca_dao.updatePeca(array_pecas, id, op, update);
                           break;
                       }
                   }
                   
                   break;
               }
               
               case "serviço":{
                   ServicoDAO servico_dao = new ServicoDAO();
                   
                    op = scanner.nextLine();
                   
                    switch (op.toLowerCase()){
                       
                       case "nome":{
                           String update = scanner.nextLine();
                           rFlag = servico_dao.updateServico(array_servicos, id, op, update);
                           break;
                       }
                       
                       case "descrição":{
                           String update = scanner.nextLine();
                           rFlag = servico_dao.updateServico(array_servicos, id, op, update);
                           break;
                       }
                       
                       case "preço":{
                           double update = scanner.nextDouble();
                           rFlag =  servico_dao.updateServico(array_servicos, id, op, update);
                           break;
                       }
                       
                       case "duração":{
                           double update = scanner.nextDouble();
                           rFlag =  servico_dao.updateServico(array_servicos, id, op, update);
                           break;
                       }
                    }
                }
            }
           
           return rFlag;
       } catch (PecaDAOException | ServicoDAOException e){
           throw new Exception(e.getMessage() + " // Erro em Produto Controller - update ");
       }

   }
}
