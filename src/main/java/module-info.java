module com.example.javafx_prueba {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.kordamp.bootstrapfx.core;

    opens com.example.javafx_prueba to javafx.fxml;
    exports com.example.javafx_prueba;
}