package com.example.demo1;

import com.example.demo1.ToolFXML;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

import java.io.IOException;


public class HelloController {

    @FXML
    public TextField username;
    @FXML
    public PasswordField password;
    public Button btnlogin;
    public AnchorPane mainForm;
    public Pane loginPane;

    public void login() throws IOException {

        String username1 = username.getText();
        String password1 = password.getText();
        if(username1.equals("1") && password1.equals("1"))
        {
            ToolFXML.openFXML("dashboard.fxml");
            ToolFXML.closeFXML(loginPane);
        }
        else {
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("Announcement");
            alert.setHeaderText("Account is invalid.");
            alert.setContentText("Please try again!");
            alert.showAndWait();
        }
    }

    public void forgot(ActionEvent actionEvent) {
    }

    public void signIn(ActionEvent actionEvent) {
    }
}

