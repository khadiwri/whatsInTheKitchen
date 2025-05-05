module com.example.whatsitk {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.desktop;


    opens com.example.whatsitk to javafx.fxml;
    exports com.example.whatsitk;
}