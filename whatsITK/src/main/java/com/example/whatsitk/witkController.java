package com.example.whatsitk;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import java.awt.event.ActionEvent;
import java.util.Scanner;

public class witkController {
    @FXML
    private Label welcomeText, kitCat;
    @FXML
    private TextField groceryItem;
    @FXML
    private String grocery;

    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("Please enter new grocery item: ");
        //Scanner newItem = new Scanner(System.in);
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