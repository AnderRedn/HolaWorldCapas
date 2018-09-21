/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package helloworldcapas.view;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;

/**
 * Shows a greeting in the label when the button is pushed
 *
 * @author ander
 */
public class FXMLDocumentController {

    @FXML
    private Label label;
    private String greeting;
    /**
     * Setter of greeting
     * @param greeting 
     */
    public void setGreeting(String greeting) {
        this.greeting = greeting;
    }
    /**
     * Action event handler for the button in th UI
     * @param event 
     */
    
    @FXML
    private void handleButtonAction(ActionEvent event) {
        label.setText(greeting);
    }

}
