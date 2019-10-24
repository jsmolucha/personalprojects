package employee;

import java.util.*;

public class EmployeeMain {
    public static void main(String[] args) throws InvalidPayException, 
    InvalidEmployeeException, InvalidShiftException {
    	Scanner input = new Scanner(System.in);
    	
    	System.out.print("Enter Employee Number: " );
    	String number = input.nextLine();
    	
    	if (number.length() < 0 || number.length() > 3 ) { 
			System.out.println("Employee Number is invalid" + "\n");
			throw new InvalidEmployeeException();
		}
    	
    	System.out.print("Enter Employee Name: ");
    	String name = input.nextLine();
    	System.out.print("Enter Employee Hire Date: ");
    	String date = input.nextLine();
    	System.out.print("Enter Shift number: ");
    	int empShift = input.nextInt();
    	
    	if (empShift > 2 || empShift < 1) {
			System.out.println("Employee shift is invalid" );
			throw new InvalidShiftException();
		}
    	
    	System.out.print("Enter Hourly Pay: ");
    	double HourlyPay = input.nextDouble();
    	
    	if (HourlyPay < 1.0) {
			System.out.println("Pay rate is invalid" + "\n");
			throw new InvalidPayException();
		}
    	
    	System.out.println("\nEmployee Number: " + number + "\nEmployee Name: " 
				+ name + "\nEmployee Hire Date: " + date + "\nShift Number: "
				+ empShift + "\nHourly Pay: " + HourlyPay);
 
    }
	
}
