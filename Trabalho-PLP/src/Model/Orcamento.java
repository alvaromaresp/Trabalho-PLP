/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;
import java.util.Date;

/**
 *
 * @author alfarr
 */
public class Orcamento {
    
    private int id_orcamento_;
    private Date date_;
    private int id_cliente_;
    private int id_user_;
    private String user_cpf_;

    public Orcamento(int id_orcamento_, int id_cliente_, int id_user_, String user_cpf_) {
        this.id_orcamento_ = id_orcamento_;
        this.id_cliente_ = id_cliente_;
        this.id_user_ = id_user_;
        this.user_cpf_ = user_cpf_;
        this.date_ = new Date(); // ARRUMAR DATE FORMAT
    }
    
    
    
}
