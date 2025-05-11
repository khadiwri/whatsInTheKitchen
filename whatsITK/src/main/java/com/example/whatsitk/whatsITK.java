package com.example.whatsitk;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import javafx.scene.layout.Pane;
import javafx.geometry.Insets;
import javafx.scene.text.Text;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.FontPosture;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.util.ArrayList;

public class whatsITK extends Application {
    @Override
    public void start(Stage stage) /*throws IOException*/ {
        //Create border pane
        BorderPane pane = new BorderPane();

        //placing nodes in pane
        pane.setCenter(getVBox());
        pane.setBottom(getHBox());

        //Phase1: (kept for later)
        /*FXMLLoader fxmlLoader = new FXMLLoader(whatsITK.class.getResource("witkView.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 520, 350);*/
        Scene scene = new Scene(pane, 520, 350);
        stage.setTitle("Whats In The Kitchen?");
        stage.setScene(scene);
        stage.show();
    }
    //VBox to organize properties to ask for grocery item
    public VBox getVBox() {
        TextField userInput = new TextField("Enter new grocery item: ");
        VBox vBox = new VBox(15);
        vBox.setPadding(new Insets(15, 5, 5, 5));
        vBox.getChildren().add(new Label("What's In The Kitchen?"));
        vBox.getChildren().add(userInput);
                /*.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String text = userInput.getText();
                System.out.println("Enter new grocery item: " + userInput);
            }
        }));*/

        return vBox;
    }

    //collection of lists stored in respective buttons
    public HBox getHBox() {
        HBox hBox = new HBox(15);
        hBox.setPadding(new Insets(15, 15, 15, 15));
        hBox.setStyle("-fx-background-color: light blue");
        hBox.getChildren().add(new Button("Pantry")); /*.setOnAction((event) -> {});)*/
        hBox.getChildren().add(new Button("Fridge"));
        hBox.getChildren().add(new Button("Cupboard"));

        return hBox;
    }

    //method to add onto lists
    //public ArrayList<String> addToPantry() {
        //ArrayList<String> pantryList = new ArrayList<>();

        //pantryList.add();
    //}

    public static void main(String[] args) {
        launch();
    }
}