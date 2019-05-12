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
public abstract class Produto {
    private int id_prod_;
    protected double preco_;
    protected String nome_;
    protected String desc_;

    public Produto(int id_, double preco_, String nome_, String desc_) {
        this.id_prod_ = id_;
        this.preco_ = preco_;
        this.nome_ = nome_;
        this.desc_ = desc_;
    }

    public Produto() {
    }

    public int getId_() {
        return id_prod_;
    }

    public void setId_(int id_) {
        this.id_prod_ = id_;
    }

    public double getPreco_() {
        return preco_;
    }

    public void setPreco_(double preco_) {
        this.preco_ = preco_;
    }

    public String getNome_() {
        return nome_;
    }

    public void setNome_(String nome_) {
        this.nome_ = nome_;
    }

    public String getDesc_() {
        return desc_;
    }

    public void setDesc_(String desc_) {
        this.desc_ = desc_;
    }
    
    
}
