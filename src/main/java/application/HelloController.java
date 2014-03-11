package application;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;

import org.controlsfx.dialog.Dialogs;

public class HelloController extends AbstractController {
	@FXML
	Button myButton;

	@FXML
	Label myLabel;

	@FXML
	Button switchButton;

	@FXML
	public void nextView(MouseEvent event) {
		application.switchScene("Second");
	}

	@FXML
	public void myButtonOnClick(MouseEvent event) {
		myLabel.setText("ボタンがクリックされました！");

		Dialogs.create().masthead("test").message("Hello, World!")
				.showInformation();
	}

	@Override
	public void initialize(URL location, ResourceBundle resources) {
	}

}
