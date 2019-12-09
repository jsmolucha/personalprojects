package smolucha_Jakub;

import javafx.stage.Stage;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;


public class SmoluchaMain extends Application {
	private BorderPane rootLayout;
	private AnchorPane displayControlsData;
	
	
	public void start(Stage primaryStage) throws Exception {
	
		
		rootLayout = FXMLLoader.load(getClass().getResource("/smolucha_Jakub/RootLayout.FXML"));
		Scene scene = new Scene(rootLayout, 500, 500);
		
		displayControlsData = FXMLLoader.load(getClass().getResource("/smolucha_Jakub/ShowDataControls.FXML"));
		rootLayout.getChildren().add(displayControlsData);
		
		primaryStage.setTitle("Store, Retrieve, and Update Student Data");
		primaryStage.setScene(scene);
		primaryStage.show();
		
		
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}

	


