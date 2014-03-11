package application;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;

import org.controlsfx.dialog.Dialogs;

import com.github.mtzw.javafx.JavafxController;

public class SecondController extends JavafxController {
	@FXML
	Button button1;
	@FXML
	Button button2;
	@FXML
	Label header;

	@FXML
	public void button1OnClick(MouseEvent event) {
		Dialogs.create().masthead("メッセージ").message("Button1 On Clicked!")
				.showInformation();
	}

	@FXML
	public void button2OnClick(MouseEvent event) {
		application.switchScene("Hello");
	}

	@Override
	public void initialize(URL location, ResourceBundle resources) {
	}

}
