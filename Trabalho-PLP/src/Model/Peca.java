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
public class Peca {
    
    private int id_;
    private double preco_;
    private String nome_;
    private String desc_;
    private int qtd_;
    private int id_fornecedor_;

    public Peca() {
    }

    public Peca(int id_, double preco_, String nome_, String desc_, int qtd_, int id_fornecedor_) {
        this.id_ = id_;
        this.preco_ = preco_;
        this.nome_ = nome_;
        this.desc_ = desc_;
        this.qtd_ = qtd_;
        this.id_fornecedor_ = id_fornecedor_;
    }

    public int getId_() {
        return id_;
    }

    public void setId_(int id_) {
        this.id_ = id_;
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
