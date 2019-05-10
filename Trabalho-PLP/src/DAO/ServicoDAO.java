/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Model.Produto;
import Model.Servico;
import java.util.ArrayList;

/**
 *
 * @author alfarr
 */
public class ServicoDAO implements ProdutoDAOInterface, ServicoDAOInterface {

    @Override
    public boolean insertPeca(Servico servico) throws ServicoDAOException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean deletePeca(int id) throws ServicoDAOException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ArrayList<Servico> retrieveAll() throws ServicoDAOException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public <T> boolean insertProduto(ArrayList<T> array_generico, T produto) throws ServicoDAOException {
        try{
            return array_generico.add(produto);
        } catch (Exception e) {
            throw new ServicoDAOException(e.getMessage() + " // Erro em Servico - insertProduto(array, produto) ");
        }
    }

    @Override
    public <T> boolean deleteProduto(ArrayList<T> array_generico, int id) throws ServicoDAOException {
        try{
            return array_generico.remove(id) != null;
        } catch (Exception e) {
            throw new ServicoDAOException(e.getMessage() + " // Erro em Servico - deleteProduto(array, id) ");
        }
    }

    @Override
    public <T> ArrayList<Produto> retrieveByNome(ArrayList<T> array_generico, String nome) throws ServicoDAOException {
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
            throw new ServicoDAOException(e.getMessage() + " // Erro em Servico - retrieveByNome(array, nome) ");          
        }
    }

    @Override
    public <T> boolean updateServico(ArrayList<Servico> array_generico, int id, String op, T update) throws ServicoDAOException {
        
        boolean rFlag = true;
        
        try{
            Servico temp = (Servico) array_generico.get(id);

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
                    temp.setPreco_((float) update);
                    break;
                }

                case "duração":{
                    temp.setDuracao_((float) update);
                    break;
                }

                default:
                    rFlag = false;
                    break;
            }
            
            return rFlag;
        } catch (Exception e){
            throw new ServicoDAOException(e.getMessage() + " // Erro em Servico - updateProduto ");
        }
    }
    
}
