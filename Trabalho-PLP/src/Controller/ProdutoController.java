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
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
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
                   temp.setId_(array_pecas.size());
                   Peca peca = (Peca) temp;
                   peca.setId_fornecedor_(scanner.nextInt());
                   peca.setQtd_(scanner.nextInt());
                   
                   PecaDAO peca_dao = new PecaDAO();
                   
                   rFlag = peca_dao.insertProduto(array_pecas, peca);
               }
               
               case "serviço":{
                   temp.setId_(array_servicos.size());
                   Servico servico = (Servico) temp;
                   
                   Date dt = new Date();
                   SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
                   servico.setData_inicio_(sdf.format(dt));
                   
                   ServicoDAO servico_dao = new ServicoDAO();
                   rFlag = servico_dao.insertProduto(array_servicos, servico);
               }
               
            }
           
            return rFlag;
       } catch (ServicoDAOException | PecaDAOException e){
           throw new Exception(e.getMessage() + " // Erro em Produto Controller ");
       }
           
   }
   
   private boolean deletion () throws Exception{
       
   }
}
