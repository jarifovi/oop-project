package com.example.prison_management;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;

public class ViewScheduledVisits {

    @FXML
    private TableView<?> SchedulenfoTableview;

    @FXML
    private TableColumn<?, ?> dateinfocolumn;

    @FXML
    private TableColumn<?, ?> timeinfocolumn;

    @FXML
    private TableColumn<?, ?> visitorinfocolumn;

    @FXML
    void backButton(ActionEvent event) {

    }

}
