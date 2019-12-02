package takeHomeProject;

import javafx.application.Application;
import javafx.stage.Stage;

public class MainClass extends Application {
	public static scenecontainer scenes;
	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage primaryStage) {
		scenes = new scenecontainer();
		MainClass.scenes.showap1Registration();
	}
	
}
