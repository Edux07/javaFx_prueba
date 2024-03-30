package com.example.javafx_prueba;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;


    public class StudentApp extends Application {
        @Override
        public void start(Stage stage) throws IOException {

            //Opción 2: Utilizar plantillas FXML (MUY RECOMENDADO)
            FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("Student-List.fxml"));
            Scene scene = new Scene(fxmlLoader.load(), 320, 240);
            stage.setTitle("Student!");
            stage.setScene(scene);
            stage.show();
        }



        public static void main(String[] args) {
            launch();
        }
    }


