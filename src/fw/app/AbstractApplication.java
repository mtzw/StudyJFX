package fw.app;

import java.io.IOException;
import java.net.URL;
import java.util.logging.Level;
import java.util.logging.Logger;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.fxml.JavaFXBuilderFactory;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import fw.controller.AbstractController;

public abstract class AbstractApplication extends Application {

	abstract protected String getApplicationTitle();

	abstract protected String getRootSceneName();

	protected Stage stage;

	@Override
	public void start(Stage primaryStage) throws Exception {
		try {
			stage = primaryStage;
			stage.setTitle(getApplicationTitle());

			switchScene(getRootSceneName());

			primaryStage.show();
		} catch (Exception e) {
			Logger.getLogger(getClass().getName()).log(Level.SEVERE, null, e);
		}
	}

	public AbstractController switchScene(String sceneName) {
		URL fxml = getClass().getClassLoader().getResource(sceneName + ".fxml");
		FXMLLoader loader = new FXMLLoader(fxml);
		loader.setBuilderFactory(new JavaFXBuilderFactory());
		try {
			AnchorPane page = (AnchorPane) loader.load();
			Scene scene = new Scene(page);
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
