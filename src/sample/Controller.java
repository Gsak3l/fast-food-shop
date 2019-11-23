package sample;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;

public class Controller {
    @FXML
    private TextArea textPlace;
    @FXML
    private Button bntz;
    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    void changeText(ActionEvent event) throws Exception {
        System.out.println(textPlace.getText());
    }

    @FXML
    void initialize() {

    }
}
