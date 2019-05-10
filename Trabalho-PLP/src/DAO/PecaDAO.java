/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Model.Peca;
import Model.Produto;
import java.util.ArrayList;

/**
 *
 * @author alfarr
 */
public class PecaDAO implements ProdutoDAOInterface, PecaDAOInterface{

    @Override
    public boolean insertPeca(Peca peca) throws PecaDAOException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean deletePeca(int id) throws PecaDAOException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ArrayList<Peca> retrieveAll() throws PecaDAOException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public <T> boolean insertProduto(ArrayList<T> array_generico, T produto) throws PecaDAOException {
        try{
            return array_generico.add(produto);
        } catch (Exception e) {
            throw new PecaDAOException(e.getMessage() + " // Erro em Peca - insertProduto(array, produto) ");
        }
    }

    @Override
    public <T> boolean deleteProduto(ArrayList<T> array_generico, int id) throws PecaDAOException {
        try{
            return array_generico.remove(id) != null;
        } catch (Exception e) {
            throw new PecaDAOException(e.getMessage() + " // Erro em Peca - deleteProduto(array, id) ");
        }
    }

    @Override
    public <T> ArrayList<Produto> retrieveByNome(ArrayList<T> array_generico, String nome) throws PecaDAOException {
        try{
            ArrayList<Produto> rArray = new ArrayList();
            
            for(Object t : array_generico){
                if(t instanceof Produto){
                    Produto temp = (Produto) t;
                    if (temp.getNome_().equals(nome)){
                        rArray.add(temp);
                    }
                }
            }
            
            return rArray;
        
        } catch (Exception e){
            throw new PecaDAOException(e.getMessage() + " // Erro em Peca - retrieveByNome(array, nome) ");          
        }
    }

    @Override
    public <T> boolean updatePeca(ArrayList<Peca> array_generico, int id, String op, T update) throws PecaDAOException {
        boolean rFlag = true;
        
        try{
            Peca temp = (Peca) array_generico.get(id);

            switch (op.toLowerCase()){

                case "nome":{
                    temp.setNome_((String) update);
                    break;
                }

                case "descrição":{
                    temp.setDesc_((String) update);
                    break;
                }

                case "preço":{
                    temp.setPreco_((double) update);
                    break;
                }

                case "quantidade":{
                    temp.setQtd_((int) update);
                    break;
                }

                case "fornecedor":{
                    temp.setId_fornecedor_((int) update);
                    break;
                }

                default:
                    rFlag = false;
                    break;
            }
            
            return rFlag;
        } catch (Exception e){
            throw new PecaDAOException(e.getMessage() + " // Erro em Servico - updateProduto ");
        }
    
    }
    
}
