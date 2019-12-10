package smolucha_Jakub;


import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

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
    
    final int firstname = 32;
    final int lastname = 32;
    final int street = 20;
    final int city = 20;
    final int zip = 5;
    final int state = 2;
    protected int count = 0;
    
    
	@FXML private void initialize() throws FileNotFoundException {
		
		btnAdd.setOnAction(e -> writeData(e));
		btnFirst.setOnAction(e -> FirstEntry(e));
		btnNext.setOnAction(e -> NextEntry(e));
		btnPrev.setOnAction(e -> PreviousEntry(e));
		btnLast.setOnAction(e -> LastEntry(e));
		btnUpdate.setOnAction(e -> UpdateEntry(e));
	}

	private void FirstEntry(ActionEvent e) {
		
		try (
			RandomAccessFile fileaccess = new RandomAccessFile("Smolucha.dat", "rw"); 
			) {
				if(fileaccess.length() > 0) {
					fileaccess.seek(0);
					read(fileaccess);
					System.out.println("Read first entry");
					count = 1;
				}
				else {
					System.out.println("No entry shown");
				}
			}	
		catch (IOException ex) {}
		}
	
	private void NextEntry(ActionEvent e) {
		
	
		try (
			RandomAccessFile fileaccess = new RandomAccessFile("Smolucha.dat", "rw"); 
			) {
				if (count * 91 < fileaccess.length()) {
					fileaccess.seek(count * 91);
					read(fileaccess);
					count ++;
					System.out.println("Read next entry");
	
			}
				else {
					System.out.println("no entry was shown");
				}
		}
		catch (IOException ex) {}
	}
	
	private void LastEntry(ActionEvent e) {
		
		try (
				RandomAccessFile fileaccess = 
					new RandomAccessFile("Smolucha.dat", "rw");
			) {
				count = ((int)fileaccess.length()) / 91;
				fileaccess.seek((count * 91) - 91);
				read(fileaccess);
				System.out.println("read file" + count);
			}
			catch (IOException ex) {}
		
	}
	private void PreviousEntry(ActionEvent e) {
		
		try ( 
				RandomAccessFile fileaccess = 
					new RandomAccessFile("Smolucha.dat", "rw");
			) {
				if (count > 1) 
					count--;
				else
					count = 1;
				fileaccess.seek((count * 91) - 91);
				read(fileaccess);
				System.out.println("information read" + count);
			}
			catch (IOException ex) {}
		
		
	}
	
    private void writeData(ActionEvent e)  {
    	
    try (
    	RandomAccessFile fileaccess = new RandomAccessFile("Smolucha.dat", "rw"); 
  
    	) {
    			
    		fileaccess.seek(fileaccess.length());
    		write(fileaccess);
    }	
    
    catch (FileNotFoundException ex) {}
    catch (IOException ex) {}
    catch (IndexOutOfBoundsException ex) {}
    	
    }
    
    private void UpdateEntry(ActionEvent e) {
    	
    	try ( 
    			RandomAccessFile fileaccess = new RandomAccessFile("Smolucha.dat", "rw"); 
    		) {
    		fileaccess.seek(count * 91 - 91);
    		write(fileaccess);
    	}
    	catch (FileNotFoundException ex) {}
    	catch (IOException ex) {}
    	
    	
    }
    
    private void write(RandomAccessFile fileaccess) throws IOException {
    	fileaccess.write(fixedLength(txtfirstname.getText().getBytes(), firstname));
    	fileaccess.write(fixedLength(txtlastname.getText().getBytes(), lastname));
    	fileaccess.write(fixedLength(txtstreet.getText().getBytes(), street));
    	fileaccess.write(fixedLength(txtcity.getText().getBytes(), city));
    	fileaccess.write(fixedLength(txtzip.getText().getBytes(), zip));
    	fileaccess.write(fixedLength(txtstate.getText().getBytes(), state));
    	
    }
    
	
	private void read(RandomAccessFile fileaccess) throws IOException {
		int pos;
		
		byte[] fname = new byte[firstname];	
		pos = fileaccess.read(fname);
		txtfirstname.setText(new String(fname));
		
		byte[] lname = new byte[lastname];	
		pos = fileaccess.read(lname);
		txtlastname.setText(new String(lname));
		
		byte[] str = new byte[street];	
		pos = fileaccess.read(str);
		txtstreet.setText(new String(str));
		
		byte[] cty = new byte[city];	
		pos = fileaccess.read(cty);
		txtcity.setText(new String(cty));
		
		byte[] zp = new byte[zip];	
		pos = fileaccess.read(zp);
		txtzip.setText(new String(zp));
		
		byte[] st = new byte[state];	
		pos = fileaccess.read(st);
		txtstate.setText(new String(st));
		
	}
	
	private byte[] fixedLength(byte[] x, int n) {
		byte[] b = new byte[n];
		for (int i = 0; i < x.length; i++) {
			b[i] = x[i];
		}
		return b;
	}

}






