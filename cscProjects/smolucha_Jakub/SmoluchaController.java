package smolucha_Jakub;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;

public class SmoluchaController {
	
	@FXML private TextField txtstudentid;
	@FXML private TextField txtlastname;
    @FXML private TextField txtfirstname;
    @FXML private TextField txtstreet;
    @FXML private TextField txtcity;
    @FXML private TextField txtstate;
    @FXML private TextField txtzip;
    @FXML private Button btnAdd;
    @FXML private Button btnFirst;
    @FXML private Button btnNext;
    @FXML private Button btnPrev;
    @FXML private Button btnLast;
    @FXML private Button btnUpdate;
    @FXML private AnchorPane anchorPane;
    
    @FXML private void initialize() {
		
		btnAdd.setOnAction(e -> clearData(e));	
    }
	
    private void clearData(ActionEvent e) {
		
		txtstudentid.clear();
		txtlastname.clear();
		txtfirstname.clear();
		txtstreet.clear();
	
    }
}
