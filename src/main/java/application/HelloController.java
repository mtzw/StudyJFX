package application;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;

public class HelloController extends AbstractController {
	@FXML
	public Button myButton;

	@FXML
	public Label myLabel;

	@FXML
	public void nextView(MouseEvent event) {
		myLabel.setText("ボタンがクリックされました！");

		application.switchScene("Second");
	}

	@Override
	public void initialize(URL location, ResourceBundle resources) {
	}
}
