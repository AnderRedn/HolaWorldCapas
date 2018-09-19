/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package helloworldcapas.controller;

import helloworldcapas.view.View;
import helloworldcapas.model.Model;

/**
 *
 * @author ander
 */
public class Controller {
    /**
     * 
     * @param modelo the model object
     * @param vista the view object
     */
    
   public void run(Model modelo, View vista){
       vista.showGreeting(modelo.getGreeting());
   }
}
