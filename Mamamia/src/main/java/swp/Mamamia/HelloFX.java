package swp.Mamamia;
import javafx.fxml.FXMLLoader;


import java.io.IOException;

import javafx.application.Application;
import javafx.scene.Parent;
import javafx.scene.Scene;
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
        
        Scene scene = new Scene(root);
        scene.getStylesheets().add(HelloFX.class.getResource("styles.css").toExternalForm());
        stage.setTitle("ColorChange");
        stage.setScene(scene);
        stage.show();
        
       
    }

    public static void main(String[] args) {
        launch(args);
    }

}