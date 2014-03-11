package application;

import javafx.fxml.Initializable;

public abstract class AbstractController implements Initializable {
	protected AbstractApplication application;

	protected AbstractController setUp(AbstractApplication application) {
		this.application = application;
		return this;
	}
}