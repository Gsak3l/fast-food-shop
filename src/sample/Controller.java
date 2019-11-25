package sample;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.scene.control.ListView;
import javafx.scene.text.Text;

public class Controller {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Text epilogiFagitouLabel;

    @FXML
    private ListView foodList;

    @FXML
    void initialize() {
        assert epilogiFagitouLabel != null : "fx:id=\"epilogiFagitouLabel\" was not injected: check your FXML file 'sample.fxml'.";
        assert foodList != null : "fx:id=\"foodList\" was not injected: check your FXML file 'sample.fxml'.";
        foodList.getItems().addAll("hello", "its me", "i was wondering", "if you want", "to marry me");
    }
}
