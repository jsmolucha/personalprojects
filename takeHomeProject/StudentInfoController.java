package takeHomeProject;

import java.io.FileWriter;
import java.io.IOException;
import java.net.URL;
import java.time.LocalDate;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;

public class StudentInfoController implements Initializable  {
	@FXML public DatePicker registrationDatePicker;
	@FXML public TextField txtStudentID;
	@FXML public TextField txtFirstName;
	@FXML public TextField txtLastName;
	@FXML public TextField txtParentName;
	@FXML public TextField txtPhoneNumber;
	@FXML public ComboBox<String> cboStudentMajor;
	@FXML public DatePicker dobDatePicker;
	@FXML public TextArea txtDisplayArea;
	@FXML public Button btnRegister;
	@FXML public Button btnCancel;

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		
		cboStudentMajor.getItems().addAll(
				
				"Computer Science",
				"Liberal Arts",
				"Graphic Design",
				"Criminal Justice"	
				);
		
		btnRegister.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent e) {
				LocalDate regdate = registrationDatePicker.getValue();
				LocalDate birthdate = dobDatePicker.getValue();
				String studentmajor = cboStudentMajor.getValue();
				String studid = txtStudentID.getText();
				String firstname = txtFirstName.getText();
				String lastname = txtLastName.getText();
				String parentname = txtParentName.getText();
				String phonenum = txtPhoneNumber.getText();
				txtDisplayArea.setText("Date of Registration: " + regdate     
										+ "    " + studentmajor + "\n" + 
										"Date of Birth:   " + birthdate + "\n" + 
										"Student ID:   " + studid + "\n" +
										"First Name:   " + firstname + "\n" + 
										"Last Name:   " + lastname + "\n" +
										"Parent Name:   " + parentname + "\n" + 
										"Phone Number:   " + phonenum);
				
				try {
					String file = "SmoluchaData.xls";
					FileWriter fs;
					fs = new FileWriter(file,true);
							String studentidStr = txtStudentID.getText();
							String firstNameStr = txtFirstName.getText();
							String lastNameStr = txtLastName.getText();
							String parentStr = txtParentName.getText();
							String phonenumStr = txtPhoneNumber.getText();
							LocalDate birthDateStr = dobDatePicker.getValue();
							LocalDate regDateStr = registrationDatePicker.getValue();
							String studentmajorStr = cboStudentMajor.getValue();
							
							String registrationStr = 
							  "\n" + "Date: " + regDateStr 
							+ "\n" + "Student ID: " + studentidStr
							+ "\n" + "First Name: " + firstNameStr
							+ "\n" + "Last Name: " + lastNameStr
							+ "\n" + "Phone Number: " + phonenumStr
							+ "\n" + "Parent Names: " + parentStr
							+ "\n" + "Birth Date: " + birthDateStr
							+ "\n" + "Registration Date: " + regDateStr 
							+ "\n" + "Student Major: " + studentmajorStr;
							
							System.out.println(registrationStr);
							
							fs.write(registrationStr);
							fs.close();
						} catch (IOException e1) {
							
							e1.printStackTrace();
				}
			}				
		});
	}
}
	
	
	
	
	