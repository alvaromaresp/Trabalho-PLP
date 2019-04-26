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
public class Endereco {
    private int id_;
    private String rua_;
    private String numero_;
    private String bairro_;
    private String estado_;
    private String cep_;

    public Endereco() {
    }

    public Endereco(int id_, String rua_, String numero_, String bairro_, String estado_, String cep_) {
        this.id_ = id_;
        this.rua_ = rua_;
        this.numero_ = numero_;
        this.bairro_ = bairro_;
        this.estado_ = estado_;
        this.cep_ = cep_;
    }

    public int getId_() {
        return id_;
    }

    public void setId_(int id_) {
        this.id_ = id_;
    }

    public String getRua_() {
        return rua_;
    }

    public void setRua_(String rua_) {
        this.rua_ = rua_;
    }

    public String getNumero_() {
        return numero_;
    }

    public void setNumero_(String numero_) {
        this.numero_ = numero_;
    }

    public String getBairro_() {
        return bairro_;
    }

    public void setBairro_(String bairro_) {
        this.bairro_ = bairro_;
    }

    public String getEstado_() {
        return estado_;
    }

    public void setEstado_(String estado_) {
        this.estado_ = estado_;
    }

    public String getCep_() {
        return cep_;
    }

    public void setCep_(String cep_) {
        this.cep_ = cep_;
    }
    
    
    
}
