package apps;

import javafx.application.Application;
import fw.app.AbstractApplication;

public class Main extends AbstractApplication {

	public static void main(String[] args) {
		Application.launch();
	}

	@Override
	protected String getApplicationTitle() {
		return "サンプルです";
	}

	@Override
	protected String getRootSceneName() {
		return "view1";
	}

}
