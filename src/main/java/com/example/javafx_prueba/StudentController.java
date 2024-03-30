package com.example.javafx_prueba;

import javafx.collections.FXCollections;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

import java.net.URL;
import java.util.Arrays;
import java.util.ResourceBundle;

public class StudentController implements Initializable {
    @FXML
    private TableView<StudentModel> tableView;
    @FXML
    TableColumn<StudentModel, Integer> idColumn;
    @FXML
    TableColumn<StudentModel, String> nameColumn;
    @FXML
    TableColumn<StudentModel, String> lastNameColumn;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        idColumn.setCellValueFactory(new PropertyValueFactory<>("id"));
        nameColumn.setCellValueFactory(new PropertyValueFactory<>("name"));
        lastNameColumn.setCellValueFactory(new PropertyValueFactory<>("lastName"));
        tableView.setItems(FXCollections.observableArrayList(
                new StudentModel(1, "John", "Doe"),
                new StudentModel(2, "Jane", "Doe"),
                new StudentModel(3, "Mary", "Johnson"),
                new StudentModel(4, "Mike", "Smith")
        ));
    }
}