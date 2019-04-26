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
public class Cliente {
    
    private int id_;
    private String nome_;
    private String cpf_;
    private String telefone_;
    private String email_;
    private int id_endereco_;

    public Cliente() {
    }

    public Cliente(int id_, String nome_, String cpf_, String telefone_, String email_, int id_endereco_) {
        this.id_ = id_;
        this.nome_ = nome_;
        this.cpf_ = cpf_;
        this.telefone_ = telefone_;
        this.email_ = email_;
        this.id_endereco_ = id_endereco_;
    }

    public Cliente(int id_, String nome_, String cpf_, String telefone_) {
        this.id_ = id_;
        this.nome_ = nome_;
        this.cpf_ = cpf_;
        this.telefone_ = telefone_;
        this.email_ = null;
    }
    
    
            
        
    
}
