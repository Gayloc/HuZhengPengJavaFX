module com.example.huzhengpeng {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.huzhengpeng to javafx.fxml;
    exports com.example.huzhengpeng;
}