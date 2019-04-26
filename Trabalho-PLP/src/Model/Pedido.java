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
public class Pedido {
    private int id_orcamento_;
    private int id_peca_;

    public Pedido() {
    }

    public Pedido(int id_orcamento, int id_peca) {
        this.id_orcamento_ = id_orcamento;
        this.id_peca_ = id_peca;
    }

    public int getId_orcamento_() {
        return id_orcamento_;
    }

    public void setId_orcamento_(int id_orcamento_) {
        this.id_orcamento_ = id_orcamento_;
    }

    public int getId_peca_() {
        return id_peca_;
    }

    public void setId_peca_(int id_peca_) {
        this.id_peca_ = id_peca_;
    }
    
    
    
}
