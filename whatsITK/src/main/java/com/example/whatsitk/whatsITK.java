package com.example.whatsitk;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class whatsITK extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(whatsITK.class.getResource("witkView.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 520, 350);
        stage.setTitle("Whats In The Kitchen?");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}