/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import Controller.ClienteController;

/**
 *
 * @author alfarr
 */
public class Main {
    
    public static void main (String[] args) throws Exception{
        ClienteController cliente_controller = new ClienteController();
        
        cliente_controller.processRequest("inserir");
        
        cliente_controller.processRequest("print-all");
    }
    
}
