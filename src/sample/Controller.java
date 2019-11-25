package sample;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.ListView;
import javafx.scene.input.MouseEvent;
import javafx.scene.text.Text;

public class Controller {

    @FXML
    Text epilogiFagitouLabel;
    ListView<String> foodList = new ListView<String>();
    ObservableList<String> items =FXCollections.observableArrayList ("Single", "Double", "Suite", "Family App");
    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    void addText(MouseEvent event) {
        foodList.setItems(items);
        epilogiFagitouLabel.setText("hello there");
    }

    @FXML
    void initialize() {
        assert foodList != null : "fx:id=\"foodList\" was not injected: check your FXML file 'sample.fxml'.";

    }
}