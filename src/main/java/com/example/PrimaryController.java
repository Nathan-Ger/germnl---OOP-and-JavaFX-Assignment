package com.example;

import java.io.IOException;
import javafx.fxml.FXML;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import java.net.URL;

public class PrimaryController {

    @FXML 
    private ImageView imageView;

    @FXML
    public void initialize() {
        URL imageUrl = getClass().getResource("/com/example/Images/defaultImageView.jpeg");
        if (imageUrl == null) {
            throw new IllegalArgumentException("Image file not found");
        }
        Image image = new Image(imageUrl.toExternalForm());
        imageView.setImage(image);

    }
    
}
