package fw.controller;

import javafx.fxml.Initializable;
import javafx.scene.layout.AnchorPane;
import fw.app.AbstractApplication;

public abstract class AbstractController extends AnchorPane implements
		Initializable {
	protected AbstractApplication application;

	public void setApplication(AbstractApplication application) {
		this.application = application;
	}
}
