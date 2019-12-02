package takeHomeProject;

import java.io.IOException;

import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;


public class scenecontainer {
	
	Stage stage;
	AnchorPane ap1Registration;
	Scene scn1;
	VBox menubar;
	Scene menuscn;

	
	scenecontainer() {
		stage = new Stage();
		try {
			ap1Registration = FXMLLoader.load(MainClass.class.getResource
			("/takeHomeProject/StudentInformation.fxml"));
		}
		catch(IOException e) {
			System.out.println("Studentinfo not loaded.");
			e.printStackTrace();
		}
		
		scn1 = new Scene(ap1Registration, 1280, 720);
		
		/*
		try {
			menubar = FXMLLoader.load(MainClass.class.getResource
					("/takeHomeProject/RootLayoutMenu.fxml"));
		}
		catch(IOException e1) {
			System.out.println("Menu bar not loaded.");
			e1.printStackTrace();
		}
		
		menuscn = new Scene(menubar);
		*/
		
		}
	public void showScene(Scene scene, String Title) {
		stage.setTitle(Title);
		stage.setScene(scene);
		stage.show();
	}
	public void showap1Registration() {
		stage.setTitle("Welcome to Student Registration");
		stage.setScene(scn1);
		stage.show();
	}
}



	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	