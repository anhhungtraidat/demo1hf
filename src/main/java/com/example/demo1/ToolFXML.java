package com.example.demo1;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
import javafx.scene.control.ComboBox;

import java.io.IOException;
import java.util.Objects;

public class ToolFXML {
    public static void openFXML(String open, double x , double y) throws IOException {
        Parent root = FXMLLoader.load((Objects.requireNonNull(App.class.getResource(open))));
        Stage stage = new Stage();
        stage.setScene(new Scene(root, x, y));
        stage.show();
    }

    public static void closeFXML(AnchorPane form_close) {
        Stage stage = (Stage) form_close.getScene().getWindow();
        stage.close();
    }

    public static void closeFXML(Pane form_close) {
        Stage stage = (Stage) form_close.getScene().getWindow();
        stage.close();
    }

    public static void openFXML(String s) throws IOException {
        Parent root = FXMLLoader.load((Objects.requireNonNull(App.class.getResource(s))));
        Stage stage = new Stage();
        stage.setScene(new Scene(root));
        stage.show();
    }
}
