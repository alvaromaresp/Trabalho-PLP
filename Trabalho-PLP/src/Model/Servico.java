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
public class Servico {
    
        private int id_;
        private String nome_;
        private String desc_;
        private double preco_;

    public Servico() {
    }
        
    
    public Servico(int id_, String nome_, String desc_, double preco_) {
        this.id_ = id_;
        this.nome_ = nome_;
        this.desc_ = desc_;
        this.preco_ = preco_;
    }

    public int getId_() {
        return id_;
    }

    public void setId_(int id_) {
        this.id_ = id_;
    }

    public String getNome_() {
        return this.nome_;
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

    public double getPreco_() {
        return preco_;
    }

    public void setPreco_(double preco_) {
        this.preco_ = preco_;
    }
        
    
    
}
