package application;

public class Main extends AbstractApplication {

	public static void main(String[] args) {
		launch(args);
	}

	@Override
	protected String getApplicationTitle() {
		return "Try JavaFX2";
	}

	@Override
	protected String getRootSceneName() {
		return "Hello";
	}

}
