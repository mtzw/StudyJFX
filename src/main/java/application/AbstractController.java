package application;

import javafx.fxml.Initializable;

public abstract class AbstractController implements Initializable {
	protected AbstractApplication application;

	public void setApplication(AbstractApplication application) {
		this.application = application;
	}
}