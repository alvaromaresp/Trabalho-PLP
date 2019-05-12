/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;
import java.util.Date;
import java.text.SimpleDateFormat;

/**
 *
 * @author alfarr
 */
public class Servico extends Produto{
    
    private int id_;
    private String data_inicio_;

    public Servico() {
    }
        
    
    public Servico(int id_, int id_prod_, String nome_, String desc_, double preco_) {
        super(id_prod_, preco_, nome_, desc_);
        this.id_ = id_;
        Date dt = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        this.data_inicio_ = sdf.format(dt);
        
    }

    public int getId_() {
        return id_;
    }

    public void setId_(int id_) {
        this.id_ = id_;
    }
    

    public String getDate(){
        return data_inicio_;
    }
        
    
    
}
