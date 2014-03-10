package application;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.input.MouseEvent;

import org.controlsfx.dialog.Dialogs;

public class SecondController extends AbstractController {

	@FXML
	Button button1;
	@FXML
	Button button2;

	@FXML
	public void button1OnClick(MouseEvent event) {
		Dialogs.create().lightweight().message("Button1 On Clicked!")
				.showInformation();
	}

	@FXML
	public void button2OnClick(MouseEvent event) {
		Dialogs.create().lightweight().message("Button2 On Clicked!")
				.showInformation();
	}

	@Override
	public void initialize(URL location, ResourceBundle resources) {
	}

}
