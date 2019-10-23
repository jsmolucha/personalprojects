package employee;

import java.util.*;
public class EmployeeMain {
    public static void main(String[] args) {
    	Scanner input = new Scanner(System.in);
    	
    	System.out.print("Enter Employee Number: " );
    	String number = input.nextLine();
    	System.out.print("Enter Employee Name: ");
    	String name = input.nextLine();
    	System.out.print("Enter Employee Hire Date: ");
    	String date = input.nextLine();
    	System.out.print("Enter Shift number: ");
    	int empShift = input.nextInt();
    	System.out.print("Enter Hourly Pay: ");
    	double HourlyPay = input.nextDouble();
    	
 
    	
    	System.out.println("\nEmployee Number: " + number + "\nEmployee Name: " 
    						+ name + "\nEmployee Hire Date: " + date + "\nShift Number: "
    						+ empShift + "\nHourly Pay: " + HourlyPay);


    	

    }
    	
	
}
