package controllers;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import fw.controller.AbstractController;

public class View1Controller extends AbstractController {

	@FXML
	public Button button;

	@Override
	public void initialize(URL location, ResourceBundle bundle) {
		button.setText("view2‚Ö");
		button.addEventHandler(ActionEvent.ACTION,
				new EventHandler<ActionEvent>() {
					@Override
					public void handle(ActionEvent event) {
						application.switchScene("view2");
					}
				});
	}

}
