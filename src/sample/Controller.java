package sample;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.text.Text;

public class Controller {

    @FXML
    private ResourceBundle resources;
    @FXML
    private Spinner posotitaF;
    @FXML
    private Spinner posotitaP;
    @FXML
    ObservableList<String> dishes = FXCollections.observableArrayList(
            "Γύρος", "Σουβλάκι", "Σουτζουκάκι", "Χωριάτικη", "Γεμιστά");
    @FXML
    ObservableList<String> drinks = FXCollections.observableArrayList(
            "Πορτοκαλάδα", "Κόκα Κόλα", "Λεμονάδα", "Νερό", "Βότκα");
    @FXML
    private URL location;
    @FXML
    private ComboBox drinksComboBox;
    @FXML
    private ListView foodList;
    @FXML
    private ImageView foodImage;
    @FXML
    void printValue(MouseEvent event) {
        System.out.println(posotitaF.getValue());
    }

    @FXML
    void initialize() {
        assert foodList != null : "fx:id=\"foodList\" was not injected: check your FXML file 'sample.fxml'.";
        foodList.getItems().addAll(dishes);
        posotitaF.setValueFactory(new SpinnerValueFactory.IntegerSpinnerValueFactory(0, 100));
        drinksComboBox.getItems().addAll(drinks);
        posotitaP.setValueFactory(new SpinnerValueFactory.IntegerSpinnerValueFactory(0, 100));
        Image image = new Image("sample/fanta.jpg");
        foodImage.setImage(image);
    }
}
