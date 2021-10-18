package com.company;
import javafx.application.Application;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.util.Objects;

public class Main extends Application{

    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("app.fxml")));
        primaryStage.setTitle("Rakho");
        primaryStage.setScene(new Scene(root , 604, 411));
        primaryStage.show();

    }
//g
    public static void main(String[] args) {
        launch(args);
    }
}
