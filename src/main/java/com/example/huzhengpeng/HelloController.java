package com.example.huzhengpeng;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class HelloController {
    @FXML
    private Label welcomeText;

    @FXML
    private ImageView welcomeImage;

    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("");

        welcomeImage.setImage(new Image("image.jpg"));
    }
}