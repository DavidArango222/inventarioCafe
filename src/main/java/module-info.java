module co.edu.uniquindio.inventario.inventarioapp {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;

    opens co.edu.uniquindio.inventario.inventarioapp to javafx.fxml;
    exports co.edu.uniquindio.inventario.inventarioapp;
    exports co.edu.uniquindio.inventario.inventarioapp.utils;
    opens co.edu.uniquindio.inventario.inventarioapp.utils to javafx.fxml;
    exports co.edu.uniquindio.inventario.inventarioapp.viewcontroller;
    opens co.edu.uniquindio.inventario.inventarioapp.viewcontroller to javafx.fxml;
    exports co.edu.uniquindio.inventario.inventarioapp.model;
    opens co.edu.uniquindio.inventario.inventarioapp.model to javafx.fxml;
}