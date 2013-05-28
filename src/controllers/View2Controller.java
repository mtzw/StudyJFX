package controllers;

import java.net.URL;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import fw.controller.AbstractController;

public class View2Controller extends AbstractController {

	@FXML
	public TextArea console;

	@FXML
	public Button button;

	@Override
	public void initialize(URL location, ResourceBundle bundle) {
		console.setText("���߂�ڂ������Ȃ���������");
		button.setText("�N���b�N�I");
	}

	public void toView1() {
		Logger.getLogger(getClass().getName()).log(Level.INFO,
				console.getText());

		application.switchScene("view1");
	}
}
