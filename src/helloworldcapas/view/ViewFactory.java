/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package helloworldcapas.view;

/**
 * Creates and returns a view
 * @author ander
 */
public class ViewFactory {
    
    /**
     * Get a view implementation
     * @return  the View implementation
     */
    
    public static View getView(){
        return new JavaFXViewImplementation();
    }
}
