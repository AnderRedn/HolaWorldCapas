/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package helloworldcapas.controller;

import helloworldcapas.model.Model;
import helloworldcapas.model.ModelFactory;
import helloworldcapas.view.View;
import helloworldcapas.view.ViewFactory;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author ander
 */
public class ControllerIT {

    /**
     *
     */
    private final PrintStream systeamOut = System.out;
    private ByteArrayOutputStream testOut;

    private Controller controller;

    @Before
    public void setUp() {
        controller = new Controller();
        testOut = new ByteArrayOutputStream();
        System.setOut(new PrintStream(testOut));
    }

    @After
    public void tearDown() {
        System.setOut(systeamOut);
    }

    /**
     * Test of run method, of class Controller.
     */
    @Test
    public void testRun() {
        //String greeting = ModelFactory.getModel().getGreeting();
        // ViewFactory.getView().showGreeting(greeting);
        Model model = ModelFactory.getModel();
        View view = ViewFactory.getView();
        String greeting = model.getGreeting();
        //Es lo mismo que new Controller().run(model, view);
        Controller controller = new Controller();
        controller.run(model, view);
        assertEquals("Shown greeting is not correct!!!", greeting, testOut.toString());
    }

}
