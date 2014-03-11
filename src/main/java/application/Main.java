package application;

import com.github.mtzw.javafx.JavafxApplication;

public class Main extends JavafxApplication {

	public static void main(String[] args) {
		launch(args);
	}

	@Override
	protected Configuration configure() {
		return new Configuration("StudyJFX", "Hello", 640, 480,
				"application.css");
	}

}
