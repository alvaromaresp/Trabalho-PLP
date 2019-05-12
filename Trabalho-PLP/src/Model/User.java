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
public class User {
    private int id_;
    private String cpf_;
    private int num_vendas_;
    private String nome_;
    private String pswd_;
    private int id_role_;
    private int id_endereco_;
    private String telefone_;
    private String email_;

    public User() {
    }

    public User(int id_, String cpf_, int num_vendas_, String nome_, String pswd_, int id_role_, int id_endereco_, String telefone_, String email_) {
        this.id_ = id_;
        this.cpf_ = cpf_;
        this.num_vendas_ = num_vendas_;
        this.nome_ = nome_;
        this.pswd_ = pswd_;
        this.id_role_ = id_role_;
        this.id_endereco_ = id_endereco_;
        this.telefone_ = telefone_;
        this.email_ = email_;
    }

    public int getId_() {
        return id_;
    }

    public void setId_(int id_) {
        this.id_ = id_;
    }

    public String getCpf_() {
        return cpf_;
    }

    public void setCpf_(String cpf_) {
        this.cpf_ = cpf_;
    }

    public int getNum_vendas_() {
        return num_vendas_;
    }

    public void setNum_vendas_(int num_vendas_) {
        this.num_vendas_ = num_vendas_;
    }

    public String getNome_() {
        return nome_;
    }

    public void setNome_(String nome_) {
        this.nome_ = nome_;
    }

    public String getPswd_() {
        return pswd_;
    }

    public void setPswd_(String pswd_) {
        this.pswd_ = pswd_;
    }

    public int getId_role_() {
        return id_role_;
    }

    public void setId_role_(int id_role_) {
        this.id_role_ = id_role_;
    }

    public int getId_endereco_() {
        return id_endereco_;
    }

    public void setId_endereco_(int id_endereco_) {
        this.id_endereco_ = id_endereco_;
    }

    public String getTelefone_() {
        return telefone_;
    }

    public void setTelefone_(String telefone_) {
        this.telefone_ = telefone_;
    }

    public String getEmail_() {
        return email_;
    }

    public void setEmail_(String email_) {
        this.email_ = email_;
    }
    
    
    
    
}
