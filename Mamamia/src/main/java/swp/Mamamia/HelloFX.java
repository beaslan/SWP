package swp.Mamamia;
import javafx.fxml.FXMLLoader;

import java.io.IOException;
import java.util.Random;

import javafx.application.Application;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.stage.Stage;


public class HelloFX extends Application {

    public void start(Stage stage) {
        Parent root = null;
        try {
        	root = FXMLLoader.load(getClass().getResource("MainLayout.fxml"));
        } catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        
        Scene scene = new Scene(root, 640, 480);
        scene.getStylesheets().add(HelloFX.class.getResource("styles.css").toExternalForm());
        stage.setTitle("Random Number App");
        stage.setScene(scene);
        stage.show();
        
        Label numberlb = (Label) scene.lookup("#numberlb");
        Random random = new Random();
        int randomNumber = random.nextInt(100) + 1;
        numberlb.setText("Zufallszahl: " + randomNumber);
    }

    public static void main(String[] args) {
        launch(args);
    }

}