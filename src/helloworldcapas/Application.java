/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package helloworldcapas;

import helloworldcapas.controller.Controller;
import helloworldcapas.view.View;
import helloworldcapas.view.ViewFactory;
import helloworldcapas.model.ModelFactory;
import helloworldcapas.model.Model;

/**
 * Esta es la aplicacion HolaMundo con Capas
 * @author Ander
 */
public class Application {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // new Controller().run()...
        ViewFactory vFactory  = new ViewFactory();
        View v = vFactory.getView();
        
        ModelFactory mFactory = new ModelFactory();
        Model m = mFactory.getModel();
        
        Controller c = new Controller();
        c.run(m, v);
    }
    
}
