package smoluchaTickets;

import javafx.application.Application;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class ticketApp extends Application {
	
	public static double profitpercentage = 20;

	@Override
	public void start(Stage primaryStage) {
		
		Scene scene = new Scene(new Group(), 450, 250);

		GridPane grid = new GridPane();
		grid.setPadding(new Insets(10, 10, 10, 10));
		grid.setVgap(5);
		grid.setHgap(5);
		final TextField pAdult = new TextField();
		pAdult.setPromptText("price/unit adult tickets");
		pAdult.setPrefColumnCount(10);
		pAdult.getText();
		GridPane.setConstraints(pAdult, 0, 0);
		grid.getChildren().add(pAdult);
		
		final TextField numAdults = new TextField();
		numAdults.setPromptText("Number of adults");
		GridPane.setConstraints(numAdults, 0, 1);
		grid.getChildren().add(numAdults);
		
		final TextField pChild = new TextField();
		pChild.setPrefColumnCount(15);
	    pChild.setPromptText("Price/Unit for child");
	    GridPane.setConstraints(pChild, 0, 2);
	    grid.getChildren().add(pChild);
	    
	    final TextField numChild = new TextField();
	    numChild.setPrefColumnCount(15);
	    numChild.setPromptText("Number of child");
	    GridPane.setConstraints(numChild, 0, 3);
	    grid.getChildren().add(numChild);
	    
	    final Button calculate = new Button("Calculate");
	    GridPane.setConstraints(calculate, 0, 4);
	    grid.getChildren().add(calculate);
	    Platform.runLater(new Runnable() {
	    	   
	       @Override
	       public void run() {
	           calculate.requestFocus();
	           
	       		}
	       });
	       
	    final Label grossRevenueAdultTickets = new Label();
	    GridPane.setConstraints(grossRevenueAdultTickets, 0, 5);
	    GridPane.setColumnSpan(grossRevenueAdultTickets, 2);
	    grid.getChildren().add(grossRevenueAdultTickets);
	       
	    final Label grossRevenueChildTickets = new Label();
	    GridPane.setConstraints(grossRevenueChildTickets, 0, 6);
	    GridPane.setColumnSpan(grossRevenueChildTickets, 2);
	    grid.getChildren().add(grossRevenueChildTickets);
	    
	    final Label netRevenueAdultTickets = new Label();
	    GridPane.setConstraints(netRevenueAdultTickets, 0, 7);
	    GridPane.setColumnSpan(netRevenueAdultTickets, 2);
	    grid.getChildren().add(netRevenueAdultTickets);
	    
	    final Label netRevenueChildTickets = new Label();
	    GridPane.setConstraints(netRevenueChildTickets, 0, 8);
	    GridPane.setColumnSpan(netRevenueChildTickets, 2);
	    grid.getChildren().add(netRevenueChildTickets);
	    
	    calculate.setOnAction(new EventHandler<ActionEvent>() {

			@Override
			public void handle(ActionEvent e) {
				 grossRevenueAdultTickets.setText("Gross Rev adult ticket = " 
			+ grossRevenue(numAdults.getText(),pAdult.getText()));
	               grossRevenueChildTickets.setText("Gross Rev child ticket = " 
			+ grossRevenue(numChild.getText(),pChild.getText()));
	               netRevenueAdultTickets.setText("Net rev adult ticket = " 
			+ netRevenue(grossRevenue(numAdults.getText(),pAdult.getText())));
	               netRevenueChildTickets.setText("Net rev child ticket = " 
			+ netRevenue(grossRevenue(numChild.getText(),pChild.getText())));
				
			}
			private double netRevenue(Double grossRevenue) {
	               return grossRevenue - (grossRevenue*profitpercentage)/100;
	           }

	           private Double grossRevenue(String num, String price) {
	               return Integer.parseInt(num) * Double.parseDouble(price);
	           }
	    	
	    });
	    
	    Group root = (Group) scene.getRoot();
	       root.getChildren().add(grid);
	       primaryStage.setScene(scene);
	       primaryStage.show();
		
	}

	public static void main(String[] args) {
		launch(args);
	}
}
