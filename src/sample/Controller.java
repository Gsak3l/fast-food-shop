package sample;

import java.text.DecimalFormat;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;

public class Controller {
    //my variables
    private double totalOrderCost = 0;
    private double[] foodCost = new double[6];
    private double[] drinkCost = new double[4];
    private Image[] availableFoodImages = new Image[6];
    private Image[] availableDrinksImages = new Image[4];
    private DecimalFormat df2 = new DecimalFormat("#.##");
    //FXML variables
    @FXML
    private TableView totalOrder;
    @FXML
    private Spinner posotitaF;
    @FXML
    private Spinner posotitaP;
    @FXML
    private ObservableList<String> dishes = FXCollections.observableArrayList(
            "Γύρος", "Σουβλάκι", "Σουτζουκάκι", "Γεμιστά", "Χωριάτικη", "Πράσινη");
    @FXML
    private ObservableList<String> drinks = FXCollections.observableArrayList(
            "Κόκα Κόλα", "Πορτοκαλάδα", "Λεμονάδα", "Νερό");
    @FXML
    TableColumn Proion;
    @FXML
    TableColumn Posotita;
    @FXML
    TableColumn Kostos;
    @FXML
    TextField synolikoKostos;
    @FXML
    private ComboBox drinksComboBox;
    @FXML
    private ListView foodList;
    @FXML
    private ImageView foodImage;
    @FXML
    private ImageView drinksImage;


    @FXML
    void showFood(MouseEvent event) {
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

    private double foodCostPerUnit() {
        //price of each unit for the food section
        if (foodList.getSelectionModel().getSelectedItem().equals("Γύρος"))
            return foodCost[0];
        else if (foodList.getSelectionModel().getSelectedItem().equals("Σουβλάκι"))
            return foodCost[1];
        else if (foodList.getSelectionModel().getSelectedItem().equals("Σουτζουκάκι"))
            return foodCost[2];
        else if (foodList.getSelectionModel().getSelectedItem().equals("Γεμιστά"))
            return foodCost[3];
        else if (foodList.getSelectionModel().getSelectedItem().equals("Χωριάτικη"))
            return foodCost[4];
        else if (foodList.getSelectionModel().getSelectedItem().equals("Πράσινη"))
            return foodCost[5];
        return 0;
    }

    private double drinkCostPerUnit() {
        //price of each unit for the drinks section
        if (drinksComboBox.getSelectionModel().getSelectedItem().equals("Κόκα Κόλα"))
            return drinkCost[0];
        else if (drinksComboBox.getSelectionModel().getSelectedItem().equals("Πορτοκαλάδα"))
            return drinkCost[1];
        else if (drinksComboBox.getSelectionModel().getSelectedItem().equals("Λεμονάδα"))
            return drinkCost[2];
        else if (drinksComboBox.getSelectionModel().getSelectedItem().equals("Νερό"))
            return drinkCost[3];
        return 0;
    }

    private double foodPriceMul() {
        //food price multiplied by the number of units
        if (foodList.getSelectionModel().getSelectedItem().equals("Γύρος"))
            return Double.parseDouble(posotitaF.getValue().toString()) * foodCost[0];
        else if (foodList.getSelectionModel().getSelectedItem().equals("Σουβλάκι"))
            return Double.parseDouble(posotitaF.getValue().toString()) * foodCost[1];
        else if (foodList.getSelectionModel().getSelectedItem().equals("Σουτζουκάκι"))
            return Double.parseDouble(posotitaF.getValue().toString()) * foodCost[2];
        else if (foodList.getSelectionModel().getSelectedItem().equals("Γεμιστά"))
            return Double.parseDouble(posotitaF.getValue().toString()) * foodCost[3];
        else if (foodList.getSelectionModel().getSelectedItem().equals("Χωριάτικη"))
            return Double.parseDouble(posotitaF.getValue().toString()) * foodCost[4];
        else if (foodList.getSelectionModel().getSelectedItem().equals("Πράσινη"))
            return Double.parseDouble(posotitaF.getValue().toString()) * foodCost[5];
        return 0;
    }

    private double drinksPriceMul() {
        //drinks price multiplied by the number of units
        if (drinksComboBox.getSelectionModel().getSelectedItem().equals("Κόκα Κόλα"))
            return Double.parseDouble(posotitaP.getValue().toString()) * drinkCost[0];
        else if (drinksComboBox.getSelectionModel().getSelectedItem().equals("Πορτοκαλάδα"))
            return Double.parseDouble(posotitaP.getValue().toString()) * drinkCost[1];
        else if (drinksComboBox.getSelectionModel().getSelectedItem().equals("Λεμονάδα"))
            return Double.parseDouble(posotitaP.getValue().toString()) * drinkCost[2];
        else if (drinksComboBox.getSelectionModel().getSelectedItem().equals("Νερό"))
            return Double.parseDouble(posotitaP.getValue().toString()) * drinkCost[3];
        return 0;
    }

    @FXML
    void addToTable(MouseEvent event) {
        //onClick function, fx:id prosthikiProiontwn
        if (foodList.getSelectionModel().getSelectedItem() != null) {
            if (foodPriceMul() != 0) {
                //adding new rows on the table
                totalOrder.getItems().add(new Paraggelia((String) foodList.getSelectionModel().getSelectedItem(),
                        Integer.parseInt(posotitaF.getValue().toString()), foodCostPerUnit()));
                totalOrderCost += foodPriceMul();
            }
        }
        if (drinksComboBox.getSelectionModel().getSelectedItem() != null) {
            if (drinksPriceMul() != 0) {
                //adding new rows on the table
                totalOrder.getItems().add(new Paraggelia((String) drinksComboBox.getSelectionModel().getSelectedItem(),
                        Integer.parseInt(posotitaP.getValue().toString()), drinkCostPerUnit()));
                totalOrderCost += drinksPriceMul();
            }
        }
        posotitaF.setValueFactory(new SpinnerValueFactory.IntegerSpinnerValueFactory(0, 100));
        posotitaP.setValueFactory(new SpinnerValueFactory.IntegerSpinnerValueFactory(0, 100));
        synolikoKostos.setText("Συνολικό Κόστος: " + df2.format(totalOrderCost) + "€"); //decimal format
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
        foodCost[0] = 3.20;
        foodCost[1] = 3.00;
        foodCost[2] = 3.30;
        foodCost[3] = 5.00;
        foodCost[4] = 4.20;
        foodCost[5] = 4.00;
        drinkCost[0] = 1.20;
        drinkCost[1] = 1.00;
        drinkCost[2] = 1.00;
        drinkCost[3] = 0.50;
        //table rows
        Proion.setCellValueFactory(new PropertyValueFactory<>("eidos"));
        Posotita.setCellValueFactory(new PropertyValueFactory<>("posotita"));
        Kostos.setCellValueFactory(new PropertyValueFactory<>("kostosTemaxiou"));
    }
}
