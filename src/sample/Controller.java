package sample;

import java.net.URL;
import java.text.DecimalFormat;
import java.util.ResourceBundle;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.text.Text;

public class Controller {
    private double[] foodCost = new double[6];
    private double[] drinkCost = new double[4];
    private Image[] availableFoodImages = new Image[6];
    private Image[] availableDrinksImages = new Image[4];
    @FXML
    private ResourceBundle resources;
    @FXML
    private TableView totalOrder;
    @FXML
    private Spinner posotitaF;
    @FXML
    private Spinner posotitaP;
    @FXML
    ObservableList<String> dishes = FXCollections.observableArrayList(
            "Γύρος", "Σουβλάκι", "Σουτζουκάκι", "Γεμιστά", "Χωριάτικη", "Πράσινη");
    @FXML
    ObservableList<String> drinks = FXCollections.observableArrayList(
            "Κόκα Κόλα", "Πορτοκαλάδα", "Λεμονάδα", "Νερό");
    @FXML
    private URL location;
    @FXML
    TableColumn Proion;
    @FXML
    TableColumn Posotita;
    @FXML
    TableColumn Kostos;
    @FXML
    private ComboBox drinksComboBox;
    @FXML
    private ListView foodList;
    @FXML
    private ImageView foodImage;
    @FXML
    private ImageView drinksImage;

    @FXML
    void addItems(MouseEvent event) {
        //food price multiplied
        if (foodList.getSelectionModel().getSelectedItem().equals("Γύρος"))
            System.out.println(Double.parseDouble(posotitaF.getValue().toString()) * foodCost[0]); //this works!! from object to string and from string to double
        else if (foodList.getSelectionModel().getSelectedItem().equals("Σουβλάκι"))
            System.out.println(Double.parseDouble(posotitaF.getValue().toString()) * foodCost[1]);
        else if (foodList.getSelectionModel().getSelectedItem().equals("Σουτζουκάκι"))
            System.out.println(Double.parseDouble(posotitaF.getValue().toString()) * foodCost[2]);
        else if (foodList.getSelectionModel().getSelectedItem().equals("Γεμιστά"))
            System.out.println(Double.parseDouble(posotitaF.getValue().toString()) * foodCost[3]);
        else if (foodList.getSelectionModel().getSelectedItem().equals("Χωριάτικη"))
            System.out.println(Double.parseDouble(posotitaF.getValue().toString()) * foodCost[4]);
        else if (foodList.getSelectionModel().getSelectedItem().equals("Πράσινη"))
            System.out.println(Double.parseDouble(posotitaF.getValue().toString()) * foodCost[5]);
        //drinks price multiplied
        if (drinksComboBox.getSelectionModel().getSelectedItem().equals("Κόκα Κόλα"))
            System.out.println(Double.parseDouble(posotitaP.getValue().toString()) * drinkCost[0]);
        else if (drinksComboBox.getSelectionModel().getSelectedItem().equals("Πορτοκαλάδα"))
            System.out.println(Double.parseDouble(posotitaP.getValue().toString()) * drinkCost[1]);
        else if (drinksComboBox.getSelectionModel().getSelectedItem().equals("Λεμονάδα"))
            System.out.println(Double.parseDouble(posotitaP.getValue().toString()) * drinkCost[2]);
        else if (drinksComboBox.getSelectionModel().getSelectedItem().equals("Νερό"))
            System.out.println(Double.parseDouble(posotitaP.getValue().toString()) * drinkCost[3]);
        posotitaF.setValueFactory(new SpinnerValueFactory.IntegerSpinnerValueFactory(0, 100));
        posotitaP.setValueFactory(new SpinnerValueFactory.IntegerSpinnerValueFactory(0, 100));
    }

    @FXML
    void showImage(MouseEvent event) {
        //onclick action for the listview
        //show image on click event
        if (foodList.getSelectionModel().getSelectedItem().equals("Γύρος"))
            foodImage.setImage(availableFoodImages[0]);
        else if (foodList.getSelectionModel().getSelectedItem().equals("Σουβλάκι"))
            foodImage.setImage(availableFoodImages[1]);
        else if (foodList.getSelectionModel().getSelectedItem().equals("Σουτζουκάκι"))
            foodImage.setImage(availableFoodImages[2]);
        else if (foodList.getSelectionModel().getSelectedItem().equals("Γεμιστά"))
            foodImage.setImage(availableFoodImages[3]);
        else if (foodList.getSelectionModel().getSelectedItem().equals("Χωριάτικη"))
            foodImage.setImage(availableFoodImages[4]);
        else if (foodList.getSelectionModel().getSelectedItem().equals("Πράσινη"))
            foodImage.setImage(availableFoodImages[5]);
    }

    @FXML
    void showDrinks(ActionEvent event) {
        //on action event for the combobox
        //show image on action event
        if (drinksComboBox.getSelectionModel().getSelectedItem().equals("Κόκα Κόλα"))
            drinksImage.setImage(availableDrinksImages[0]);
        else if (drinksComboBox.getSelectionModel().getSelectedItem().equals("Πορτοκαλάδα"))
            drinksImage.setImage(availableDrinksImages[1]);
        else if (drinksComboBox.getSelectionModel().getSelectedItem().equals("Λεμονάδα"))
            drinksImage.setImage(availableDrinksImages[2]);
        else if (drinksComboBox.getSelectionModel().getSelectedItem().equals("Νερό"))
            drinksImage.setImage(availableDrinksImages[3]);
    }

    @FXML
    void initialize() {
        //adding the available dishes to the listView
        foodList.getItems().addAll(dishes);
        //adding the available spinner values for the dishes
        posotitaF.setValueFactory(new SpinnerValueFactory.IntegerSpinnerValueFactory(0, 100));
        //adding the available drinks to the drink comboBox
        drinksComboBox.getItems().addAll(drinks);
        //adding the available spinner values for the drinks
        posotitaP.setValueFactory(new SpinnerValueFactory.IntegerSpinnerValueFactory(0, 100));
        //setting images for food and drinks
        availableFoodImages[0] = new Image("sample/gyros.jpg");
        availableFoodImages[1] = new Image("sample/souvlaki.jpg");
        availableFoodImages[2] = new Image("sample/soutsoukaki.jpg");
        availableFoodImages[3] = new Image("sample/gemista.jpg");
        availableFoodImages[4] = new Image("sample/xoriatiki.jpg");
        availableFoodImages[5] = new Image("sample/prasini.jpg");
        availableDrinksImages[0] = new Image("sample/kokakola.jpg");
        availableDrinksImages[1] = new Image("sample/portokalada.jpg");
        availableDrinksImages[2] = new Image("sample/lemonada.jpg");
        availableDrinksImages[3] = new Image("sample/nero.jpg");
        //initializing cost for food and drinks
        DecimalFormat df2 = new DecimalFormat("#.##");
        foodCost[0] = 3.2;
        foodCost[1] = 3.0;
        foodCost[2] = 3.3;
        foodCost[3] = 5.0;
        foodCost[4] = 4.2;
        foodCost[5] = 4.0;
        drinkCost[0] = 1.2;
        drinkCost[1] = 1.0;
        drinkCost[2] = 1.0;
        drinkCost[3] = 0.5;
        //table rows hopefully
        //TableColumn Proion = new TableColumn("Προϊόν");
        Proion.setCellValueFactory(new PropertyValueFactory<>("eidos"));
        //TableColumn Posotita = new TableColumn("Ποσότητα");
        Posotita.setCellValueFactory(new PropertyValueFactory<>("posotita"));
        //TableColumn Kostos = new TableColumn("Κόστος");
        Kostos.setCellValueFactory(new PropertyValueFactory<>("kostosTemaxiou"));
        //totalOrder.getColumns().addAll(Proion, Posotita, Kostos);

        totalOrder.getItems().add(new Paraggelia("Γύρος", 3, 3.20));
        totalOrder.getItems().add(new Paraggelia("Γύρος", 3, 3.20));
        totalOrder.getItems().add(new Paraggelia("Γύρος", 3, 3.20));
    }
}
