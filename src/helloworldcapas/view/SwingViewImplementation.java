/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package helloworldcapas.view;

import javax.swing.JFrame;
import javax.swing.JOptionPane;


/**
 * Class for the swing implementation of th HelloWorldCapas app.
 * @author ander
 */
public class SwingViewImplementation implements View {
    
    /**
     * Shows a greeting in a Message window.
     * @param greeting The greeting
     */
    @Override
    public void showGreeting(String greeting) {
       JFrame frame = new JFrame();
       JOptionPane.showMessageDialog(frame, greeting, "Panel infromativo", JOptionPane.INFORMATION_MESSAGE );
       frame.dispose();
    }
        
}
