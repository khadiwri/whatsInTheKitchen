package com.example.whatsitk;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import java.awt.event.ActionEvent;

public class witkController {
    @FXML
    private Label welcomeText, kitCat;
    @FXML
    private TextField groceryItem;
    @FXML
    private String grocery;

    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("Please enter the name of grocery item you'd like to add and which list you'd like to sort it in.");
    }
    //get grocery item name
    public void submit(ActionEvent event) {
        try {
            grocery = groceryItem.getText();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
    @FXML
    protected void onPantryButtonClick() {
        kitCat.setText("Grocery item has been added to the Pantry.");
    }
    @FXML
    protected void onFridgeButtonClick() {
        kitCat.setText("Grocery item has been added to the Fridge.");
    }
    @FXML
    protected void onCupboardButtonClick() {
        kitCat.setText("Grocery item has been added to the Cupboard.");
    }
}