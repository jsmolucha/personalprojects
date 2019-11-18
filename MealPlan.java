package auroraMeals;

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class MealPlan extends Application {

	@Override
	public void start(Stage primaryStage) {

		BorderPane pane = new BorderPane();
		pane.setTop(getHBox());
		pane.setLeft(getVBox());
		
		Scene scene = new Scene(pane, 750, 500);
		primaryStage.setTitle("Aurora Meal Plans");
		primaryStage.setScene(scene);
		primaryStage.show();
	}

private HBox getHBox() {
	//make a new horizontal box and add padding 
	 HBox hBox = new HBox(30);
	 hBox.setPadding(new Insets(20, 20, 30, 30));
	 hBox.setStyle("-fx-background-color: #0d628c");
	 hBox.getChildren().add(new Label("Residence Hall"));
	 //make a new array of items for the combobox
	 ObservableList<String> halls = FXCollections.observableArrayList("Davis Hall",
			 "Jenks Hall", "Memorial Hall", "Centennial Hall", "Watkins Hall", 
			 "Wilkinson Hall", "");
	 //make the actual combobox
	 final ComboBox<String> comboboxhall = new ComboBox<String>(halls);
	 //instantiate the array to be used as the dropdown options
	 comboboxhall.setPromptText("Select Hall..");
	 //add the combobox to the horizontal box which is in the borderpane
	 hBox.getChildren().add(comboboxhall);
	 hBox.getChildren().add(new Label("Meal Plans"));
	 ObservableList<String> prices = FXCollections.observableArrayList("$1,765 per semester",
			 "$1,865 per semester", "$1,565 per Semester", "");
	 final ComboBox<String> comboboxprice = new ComboBox<String>(prices);
	 comboboxprice.setPromptText("Select Pricing..");
	 hBox.getChildren().add(comboboxprice);
	 hBox.setAlignment(Pos.CENTER);
	 
	 return hBox;
	 


	 
 }
  
 
 private VBox getVBox() {
	 VBox vBox = new VBox(30);
	 vBox.setPadding(new Insets(30, 30, 30, 30));
	 vBox.setStyle("-fx-background-color: #5db7e3");
	 vBox.getChildren().add(new Button("Display Menu"));
	 vBox.getChildren().add(new Button("Lunch"));
	 vBox.getChildren().add(new Label("Residence Hall"));

	 return vBox;

	 
	 
 }
	public static void main(String[] args) {
		launch(args);
	}
}
