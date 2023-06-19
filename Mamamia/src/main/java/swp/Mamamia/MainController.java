package swp.Mamamia;


import java.awt.Label;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.layout.AnchorPane;
import javafx.scene.shape.Arc;

public class MainController {

    @FXML
    private Button btmClick;
    
    @FXML
    private AnchorPane box1;
    
    @FXML
    private Label numberlb;
    
    @FXML
    void btmonClick(ActionEvent event) {
        System.out.println("pressed open");
    }
    @FXML
    private Arc paint;

}
