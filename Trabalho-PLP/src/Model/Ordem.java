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
public class Ordem {
    private int id_orcamento_;
    private int id_servico_;

    public Ordem() {
    }

    public Ordem(int id_orcamento_, int id_servico_) {
        this.id_orcamento_ = id_orcamento_;
        this.id_servico_ = id_servico_;
    }

    public int getId_orcamento_() {
        return id_orcamento_;
    }

    public void setId_orcamento_(int id_orcamento_) {
        this.id_orcamento_ = id_orcamento_;
    }

    public int getId_servico_() {
        return id_servico_;
    }

    public void setId_servico_(int id_servico_) {
        this.id_servico_ = id_servico_;
    }
    
    
    
}
