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
import javafx.scene.control.ToggleGroup;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;

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

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void colorRadioButtonSelected(ActionEvent event) {
    }

    @FXML
    private void sizeRadioButtonSelected(ActionEvent event) {
    }

    @FXML
    private void undoButtonPresssed(ActionEvent event) {
    }

    @FXML
    private void clearButtonPressed(ActionEvent event) {
    }

    @FXML
    private void drawingAreaMouseDragged(MouseEvent event) {
    }
    
}
