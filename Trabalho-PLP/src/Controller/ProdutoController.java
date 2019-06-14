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

/**
 *
 * @author ruanbasilio
 */
public class ProdutoController {
    
    
    public boolean insertion_peca(ArrayList<Peca> array_pecas, Peca peca) throws Exception {
        try{
            PecaDAO peca_dao = new PecaDAO();
            return peca_dao.insertProduto(array_pecas, peca);
        } catch (PecaDAOException e){
           throw new Exception(e.getMessage() + " // Erro em Produto Controller - insertion peca");
        }
    }
    
    public boolean insertion_servico(ArrayList<Servico> array_servicos, Servico servico) throws Exception {
        try{
            ServicoDAO servico_dao = new ServicoDAO();
            return servico_dao.insertProduto(array_servicos, servico);
        } catch (ServicoDAOException e){
           throw new Exception(e.getMessage() + " // Erro em Produto Controller - insertion servico ");
        }
    }
   
    public boolean deletion_peca(ArrayList<Peca> array_pecas, int id) throws Exception {
        try{
            PecaDAO peca_dao = new PecaDAO();
            return peca_dao.deleteProduto(array_pecas, id);
        } catch (PecaDAOException e){
           throw new Exception(e.getMessage() + " // Erro em Produto Controller - insertion peca");
        }
    }
    
    public boolean deletion_servico(ArrayList<Peca> array_servicos, int id) throws Exception {
        try{
            ServicoDAO servico_dao = new ServicoDAO();
            return servico_dao.deleteProduto(array_servicos, id);
        } catch (ServicoDAOException e){
           throw new Exception(e.getMessage() + " // Erro em Produto Controller - insertion peca");
        }
    }
    
    public ArrayList<Produto> read_peca(ArrayList<Peca> array_pecas, String nome) throws Exception{
        try{
            PecaDAO peca_dao = new PecaDAO();
            return peca_dao.retrieveByNome(array_pecas, nome);
        }catch (PecaDAOException e){
           throw new Exception(e.getMessage() + " // Erro em Produto Controller - read peca ");
       }   
    }
    
    public ArrayList<Produto> read_servico(ArrayList<Servico> array_servico, String nome) throws Exception{
        try{
            ServicoDAO servico_dao = new ServicoDAO();
            return servico_dao.retrieveByNome(array_servico, nome);
        }catch (ServicoDAOException e){
           throw new Exception(e.getMessage() + " // Erro em Produto Controller - read servico ");
       }   
    }
    
    public <T> boolean update_peca(ArrayList<Peca> array_pecas, int id, String op, T update) throws Exception{
       try{
          PecaDAO peca_dao = new PecaDAO();
          return peca_dao.updatePeca(array_pecas, id, op, update);
       } catch (PecaDAOException e){
           throw new Exception(e.getMessage() + " // Erro em Produto Controller - update peca ");
       }
   }
    
    public <T> boolean update_servico(ArrayList<Servico> array_servico, int id, String op, T update) throws Exception{
       try{
          ServicoDAO servico_dao = new ServicoDAO();
          return servico_dao.updateServico(array_servico, id, op, update);
       } catch (ServicoDAOException e){
           throw new Exception(e.getMessage() + " // Erro em Produto Controller - update servico ");
       }
   }
}
   /*public boolean insertion () throws Exception{
       try{
           System.out.print("Digite a categoria que deseja inserir (Peça ou Serviço): ");
           String subclass = scanner.nextLine();
           
           Produto temp;
           
           switch (subclass.toLowerCase()) {
               case "peça":
                   temp = new Peca();
                   break;
               case "serviço":
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
                   
                   PecaDAO peca_dao = new PecaDAO();
                   
                   rFlag = peca_dao.insertProduto(array_pecas, peca);
                   break;
               }
               
               case "serviço":{
                   Servico servico = (Servico) temp;
                   servico.setId_(array_servicos.size());
                   System.out.print("Média de duração do serviço: ");
                   servico.setDuracao_(scanner.nextDouble());
                   scanner.nextLine();
                   
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
           
           System.out.print("Digite a categoria que deseja inserir (Peça ou Serviço): ");
           String subclass = scanner.nextLine();
           boolean rFlag = false;
           System.out.print("Digite o id do produto (listados acima): ");
           int id = scanner.nextInt();
           scanner.nextLine();
           
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
           scanner.nextLine();
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
                           scanner.nextLine();
                           rFlag = peca_dao.updatePeca(array_pecas, id, op, update);
                           break;
                       }
                       
                       case "fornecedor": {
                           int update = scanner.nextInt();
                           scanner.nextLine();
                           rFlag = peca_dao.updatePeca(array_pecas, id, op, update);
                           break;
                       }
                       case "quantidade":{
                           int update = scanner.nextInt();
                           scanner.nextLine();
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
                           scanner.nextLine();
                           rFlag =  servico_dao.updateServico(array_servicos, id, op, update);
                           break;
                       }
                       
                       case "duração":{
                           double update = scanner.nextDouble();
                           scanner.nextLine();
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
}*/
