module com.mycompany.lab_8 {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.mycompany.lab_8 to javafx.fxml;
    exports com.mycompany.lab_8;
}
