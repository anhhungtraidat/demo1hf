package com.example.demo1;

import javafx.beans.Observable;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.layout.AnchorPane;

import java.lang.reflect.Type;


public class DashboardController {

    @FXML
    public ComboBox<String>typeRoom;
    public ComboBox<String>statusRoom;
    public ComboBox<String>genderCustomer;
    public TextField costRoom;
    public TextField IDroom;
    public TableView tableView;


    public void initialize(){

        typeRoom.getItems().addAll("Single Room","Twin Room","VIP Room");

        statusRoom.getItems().addAll("Empty", "In use"," Deposite");

        genderCustomer.getItems().addAll("Male","Female");

        tableView.setItems(rooms);

    }
    public void type (ActionEvent actionEvent) {

    }
    public void status (ActionEvent actionEvent){

    }
    public void gender (ActionEvent actionEvent){

    }
    @FXML
    public Button roomButton;
    @FXML
    public AnchorPane roomTableView;
    @FXML

    public Button customerButton;
    @FXML
    public AnchorPane cusView;


    public void room(ActionEvent actionEvent) {
        cusView.setVisible(false);
        roomTableView.setVisible(true);
    }


    public void customer(ActionEvent actionEvent) {
        roomTableView.setVisible(false);
        cusView.setVisible(true);
    }
    public void add(ActionEvent actionEvent) {
        String typeroom = typeRoom.getValue();
        String statusroom = statusRoom.getValue();
        String costroom = costRoom.getText();
        int idroom = Integer.parseInt(IDroom.getText());
        rooms.add(new Room( idroom,typeroom, statusroom , costroom));
    }

    public void cost(ActionEvent actionEvent) {
    }
    private final ObservableList<Room> rooms = FXCollections.observableArrayList();
    private final ObservableList<Customer> customers= FXCollections.observableArrayList();
    public TextField CostRoom;
    public TextField IDRoom;
    public ComboBox<String> TypeRoom;
    public ComboBox<String> StatusRoom;
    public Button addButton;
    public Button modifyButton;
    public Button deleteButton;


    public Button addCustomer;
    public Button modifyCustomer;
    public Button deleteCustomer;
    public TextField nameCustomer;
    public TextField contactCustomer;
    public ComboBox<String> GenderCustomer;
    public TextField IDcustomer;
    public DatePicker inCustomer;
    public DatePicker outCustomer;


    public void modify(ActionEvent actionEvent) {
    }

    public void ID(ActionEvent actionEvent) {
    }

    public void delete(ActionEvent actionEvent) {
    }

    public void addCus(ActionEvent actionEvent) {
    }

    public void modifyCus(ActionEvent actionEvent) {
    }

    public void deleteCus(ActionEvent actionEvent) {
    }

    public void nameCus(ActionEvent actionEvent) {
    }

    public void genderCus(ActionEvent actionEvent) {
    }

    public void IDcus(ActionEvent actionEvent) {
    }

    public void inCus(ActionEvent actionEvent) {
    }

    public void outCus(ActionEvent actionEvent) {
    }
}
