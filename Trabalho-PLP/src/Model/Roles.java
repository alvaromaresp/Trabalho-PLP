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
public class Roles {
    private int id_;
    private int role_;
    private boolean adm_;

    public Roles() {
    }

    public Roles(int id_, int role_, boolean adm_) {
        this.id_ = id_;
        this.role_ = role_;
        this.adm_ = adm_;
    }

    public int getId_() {
        return id_;
    }

    public void setId_(int id_) {
        this.id_ = id_;
    }

    public int getRole_() {
        return role_;
    }

    public void setRole_(int role_) {
        this.role_ = role_;
    }

    public boolean isAdm_() {
        return adm_;
    }

    public void setAdm_(boolean adm_) {
        this.adm_ = adm_;
    }
    
    
    
}
