/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package helloworldcapas.view;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 *
 * @author ander
 */
public class JavaFXViewImplementation extends Application implements View {

    /**
     * Private static attribute to store the greeting passed from the model to
     * be shown
     */
    private static String greeting;

    /**
     * Constuye los objetos necesarios para una app Java FX
     *
     * @param stage
     * @throws Exception
     */
    @Override
    public void start(Stage stage) throws Exception {
        /**
         * Cargar el archivo FXML y obtener un objeto Parent que lo representa. 
         * (Parent)Almacenar la estructura de objetos del documetno fxml de tal manera 
         * que veamos la estructura jerarquica
         */
        FXMLLoader loader = new FXMLLoader(getClass().getResource("FXMLDocument.fxml"));
        Parent root = loader.load();
        /**
         * Obtener el controlador FXML del documento
         */
        FXMLDocumentController dCon = loader.getController();
        /**
         * Pasar el greeting al controlador FXML
         */
        dCon.setGreeting(greeting);
        /**
         * Creamos la escena y le pasamos el obejto root
         */
        Scene scene = new Scene(root);
        /**
         * Cargamos la escena en el escenario y lo mostramos
         */
        stage.setScene(scene);
        /**
         * Mostrar stage
         */
        stage.show();
    }

    /**
     * Muestra un saludo
     *
     * @param greeting
     */
    @Override
    public void showGreeting(String greeting) {
        JavaFXViewImplementation.greeting = greeting;
        Application.launch();
    }

    public void setGreeting(String greeting) {
        this.greeting = greeting;
    }

}
