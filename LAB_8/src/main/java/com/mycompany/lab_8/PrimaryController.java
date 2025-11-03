/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package com.mycompany.lab_8;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.RadioButton;
import javafx.scene.control.Toggle;
import javafx.scene.control.ToggleGroup;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import static javafx.scene.paint.Color.color;
import javafx.scene.paint.Paint;
import javafx.scene.shape.Circle;

/**
 * FXML Controller class
 *
 * @author 2472557
 */
public class PrimaryController implements Initializable {

    @FXML
    private BorderPane root;
    @FXML
    private VBox sidebar;
    @FXML
    private RadioButton idBlack;
    @FXML
    private RadioButton idRed;
    @FXML
    private RadioButton idBlue;
    @FXML
    private RadioButton idGreen;
    @FXML
    private RadioButton idSmall;
    @FXML
    private RadioButton idMedium;
    @FXML
    private RadioButton idLarge;
    @FXML
    private Pane drawingAreaPane;
    @FXML
    private ToggleGroup colorToggleGroup;
    @FXML
    private ToggleGroup sizeToggleGroup;
    @FXML
    private Button undo;
    @FXML
    private Button clear;

    private PenSize radius = PenSize.MEDIUM;
    private Paint brushColor = Color.BLACK;

    private enum PenSize {
        SMALL(2),
        MEDIUM(4),
        LARGE(6);

        private final int radius;

        PenSize(int radius) {
            this.radius = radius;
        }

        public int getRadius() {
            return radius;
        }
    }

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        idBlack.setUserData(Color.BLACK);
        idRed.setUserData(Color.RED);
        idBlue.setUserData(Color.BLUE);
        idGreen.setUserData(Color.GREEN);
        idSmall.setUserData(PenSize.SMALL);
        idMedium.setUserData(PenSize.MEDIUM);
        idLarge.setUserData(PenSize.LARGE);
    }

    @FXML
    private void colorRadioButtonSelected(ActionEvent event) {
        Toggle selectedToggle = colorToggleGroup.getSelectedToggle();
        
        if (selectedToggle != null) {
            Object data = selectedToggle.getUserData();
            brushColor = (Color) data;
        }
    }

    @FXML
    private void sizeRadioButtonSelected(ActionEvent event) {
        Toggle selectedToggle = sizeToggleGroup.getSelectedToggle();
        
        if(selectedToggle != null) {
            Object data = selectedToggle.getUserData();
            radius = (PenSize) data;
        }
        
    }

    @FXML
    private void undoButtonPresssed(ActionEvent event) {
        int count = drawingAreaPane.getChildren().size();
        
        if (count > 0) {
            drawingAreaPane.getChildren().remove(count - 1);
        }
    }

    @FXML
    private void clearButtonPressed(ActionEvent event) {
        drawingAreaPane.getChildren().clear();
    }

    @FXML
    private void drawingAreaMouseDragged(MouseEvent event) {
        Circle circle = new Circle();
        circle.setLayoutX(event.getX());
        circle.setLayoutY(event.getY());
        circle.setRadius(radius.getRadius());
        circle.setFill(brushColor);
        drawingAreaPane.getChildren().addAll(circle);
        
        // ADD OBSERVABLE CIRCLE
    }

}
