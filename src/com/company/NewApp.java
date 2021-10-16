package com.company;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;

public class NewApp {

    @FXML
    private AnchorPane APane1;

    @FXML
    private AnchorPane Apane2;

    @FXML
    private Button bLogin;

    @FXML
    private TextField txtLogin;

    @FXML
    private PasswordField txtPass;

    @FXML
    private Label txtLbel;

    @FXML
    private Button bReg;

    public void initialize(){
        bLogin.setOnAction(event -> {

        });
    }

}
