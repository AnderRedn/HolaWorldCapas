/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package helloworldcapas.model;

/**
 *
 * @author ander
 */
public class ModelFactory {
    
    /**
     *Get a model implementation
     * @return  the Model implementation
     */
    
    public static Model getModel(){
        return new ModelImplementation();
    }
}
