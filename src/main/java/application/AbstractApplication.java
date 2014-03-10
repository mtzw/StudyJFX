package application;

import java.io.IOException;
import java.net.URL;
import java.util.logging.Level;
import java.util.logging.Logger;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.fxml.JavaFXBuilderFactory;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public abstract class AbstractApplication extends Application {

	abstract protected String getApplicationTitle();

	abstract protected String getRootSceneName();

	public double getApplicationWidth() {
		return 400;
	}

	public double getApplicationHeight() {
		return 400;
	}

	protected Stage stage;

	@Override
	public void start(Stage primaryStage) throws Exception {
		try {
			stage = primaryStage;
			stage.setTitle(getApplicationTitle());

			switchScene(getRootSceneName());

			stage.show();
		} catch (Exception e) {
			Logger.getLogger(getClass().getName()).log(Level.SEVERE, null, e);
		}
	}

	public AbstractController switchScene(String sceneName) {
		URL fxml = getClass().getResource(sceneName + ".fxml");
		FXMLLoader loader = new FXMLLoader(fxml);
		loader.setBuilderFactory(new JavaFXBuilderFactory());
		try {
			Pane pane = (Pane) loader.load();
			Scene scene = new Scene(pane, getApplicationWidth(),
					getApplicationHeight());
			scene.getStylesheets().add(
					getClass().getResource("application.css").toExternalForm());
			stage.setScene(scene);
			stage.sizeToScene();
		} catch (IOException e) {
			Logger.getLogger(getClass().getName()).log(Level.SEVERE, null, e);
		}

		AbstractController controller = (AbstractController) loader
				.getController();
		controller.setApplication(this);

		return controller;
	}

}