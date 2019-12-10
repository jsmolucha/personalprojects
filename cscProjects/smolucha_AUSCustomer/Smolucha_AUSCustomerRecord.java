package smolucha_AUSCustomer;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class Smolucha_AUSCustomerRecord {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		
	       File file = new File("misports_cust.dat");
	       FileInputStream fin = new FileInputStream(file);
	       ObjectInputStream output = new ObjectInputStream(fin);
	       Customer[] c = (Customer[]) output.readObject();
	       for(int i=0; i<c.length; i++){
	           System.out.println(c[i].toString());
	       }
	       
	       output.close();
	      
	         
	   }
	}


