package swp.Mamamia;

import javafx.scene.control.Label;

import javafx.scene.control.TextField;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Random;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.layout.AnchorPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Arc;
import javafx.stage.FileChooser;

public class MainController {
	

    
    @FXML
    private Button btmClick;
    
    @FXML
    private AnchorPane box1;
    
    @FXML
    private Label numberlb;
    @FXML
    private TextField color;
    
    @FXML
    private Button data;
    
    @FXML
    private Arc paint;
    private File selectedFile;
    private  ArrayList<String> lines = new ArrayList<>();;

    
    @FXML
    void openfile(ActionEvent event) {
        FileChooser fileChooser = new FileChooser();
        fileChooser.setTitle("Wählen Sie eine Textdatei aus");
        fileChooser.getExtensionFilters().add(new FileChooser.ExtensionFilter("Textdateien", "*.txt"));
        selectedFile = fileChooser.showOpenDialog(null);
        if (selectedFile != null) {
            System.out.println("Datei ausgewählt");
        }
        


        try (BufferedReader br = new BufferedReader(new FileReader(selectedFile))) {
            String line=br.readLine(); 
            while ((line = br.readLine()) != null) {
            		lines.add(line) ;
            		 System.out.println(line);
                }
           
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

 
    @FXML
    void btmonClick(ActionEvent event) {
    	Random random = new Random();
    	int red = random.nextInt(256); 
        int green = random.nextInt(256);
        int blue = random.nextInt(256);
        numberlb.setText("Rot:"  +  red  +  ", Grün: "  +  green  +  ", Blau: "  +  blue);


        Color randomColor = Color.rgb(red, green, blue);
        box1.setStyle("-fx-background-color: " + toRGBCode(randomColor) + ";");
    }

    private String toRGBCode(Color color) {
        return String.format("#%02X%02X%02X",
                (int) (color.getRed() * 255),
                (int) (color.getGreen() * 255),
                (int) (color.getBlue() * 255));
    }
 }

