package smolucha_Jakub;

import java.io.IOException;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;


public class Smolucha_main extends Application {
	private BorderPane RootLayout;
	private AnchorPane displayControlsData;
	
	public void start(Stage stage) throws IOException {
		
		RootLayout = FXMLLoader.load(getClass().getResource("/smolucha_Jakub/RootLayout.FXML"));
		Scene scene = new Scene(RootLayout, 800, 500);
		
		displayControlsData = FXMLLoader.load(getClass().getResource("/smolucha_Jakub/ShowControlsData.FXML"));
		RootLayout.getChildren().add(displayControlsData);
		
		
		stage.setTitle("Testing");
		stage.setScene(scene);
		
		stage.show();
		
	}
		
	public static void main(String[] args) {
		launch(args);
		
	}
}

	

