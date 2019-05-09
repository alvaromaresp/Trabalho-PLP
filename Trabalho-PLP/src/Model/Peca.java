/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author alfarr
 */
public class Peca extends Produto{
    
    private int id_;
    private int qtd_;
    private int id_fornecedor_;

    public Peca() {
    }

    public Peca(int id_, int prod_id, float preco_, String nome_, String desc_, int qtd_, int id_fornecedor_) {
        super(prod_id, preco_, nome_, desc_);
        this.qtd_ = qtd_;
        this.id_ = id_;
        this.id_fornecedor_ = id_fornecedor_;
    }

    public int getId_() {
        return id_;
    }

    public void setId_(int id_) {
        this.id_ = id_;
    }

    public int getQtd_() {
        return qtd_;
    }

    public void setQtd_(int qtd_) {
        this.qtd_ = qtd_;
    }

    public int getId_fornecedor_() {
        return id_fornecedor_;
    }

    public void setId_fornecedor_(int id_fornecedor_) {
        this.id_fornecedor_ = id_fornecedor_;
    }
    
    
}
