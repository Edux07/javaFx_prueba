package com.example.javafx_prueba;

import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;

public class StudentModel {
    private SimpleIntegerProperty id = new SimpleIntegerProperty();
    private SimpleStringProperty name = new SimpleStringProperty();
    private SimpleStringProperty LastName = new SimpleStringProperty();

    public StudentModel(Integer id, String name, String lastName) {
        this.id = new SimpleIntegerProperty(id);
        this.name = new SimpleStringProperty(name);
        LastName = new SimpleStringProperty(lastName);
    }



    public int getId() {
        return id.get();
    }

    public SimpleIntegerProperty idProperty() {
        return id;
    }

    public void setId(int id) {
        this.id.set(id);
    }

    public String getName() {
        return name.get();
    }

    public SimpleStringProperty nameProperty() {
        return name;
    }

    public void setName(String name) {
        this.name.set(name);
    }

    public String getLastName() {
        return LastName.get();
    }

    public SimpleStringProperty lastNameProperty() {
        return LastName;
    }

    public void setLastName(String lastName) {
        this.LastName.set(lastName);
    }
    @Override
    public String toString() {
        return "StudentModel{" +
                "id=" + id +
                ", name=" + name +
                ", LastName=" + LastName +
                '}';
    }
}
