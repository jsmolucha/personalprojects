package smolucha_AUSCustomer;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.Scanner;

public class CustomerMain {

	public static void main(String[] args) throws IOException {
		Customer c[] = new Customer[5];
		Scanner scan = new Scanner(System.in);
		File file = new File("ausports_cust.dat ");
		for(int i=0; i < c.length; i++);
		
		int i = 0;
		
		System.out.println("enter Customer Number :");
        int customerid = scan.nextInt();
        System.out.println("enter Customer Name :");
        String customername = scan.next();
        System.out.println("enter Credit Limit :");
        int creditlimit = scan.nextInt();
        System.out.println("enter Business Line : ");
        String businessline = scan.next();
        System.out.println("enter Region :");
        String region = scan.next();
        
        
        c[i] = new Customer(customerid, customername, creditlimit, businessline, region);
        
        FileOutputStream fileoutput = new FileOutputStream(file);
        ObjectOutputStream oos = new ObjectOutputStream(fileoutput);   
        oos.writeObject(c);
        oos.close();
        System.out.println("file made");
        
	}

}
