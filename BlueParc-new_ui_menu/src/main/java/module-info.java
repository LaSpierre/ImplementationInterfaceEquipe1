module ca.project.bluepar2 {
    requires javafx.controls;
    requires javafx.fxml;


    opens ca.project.bluepar2 to javafx.fxml;
    exports ca.project.bluepar2;
}