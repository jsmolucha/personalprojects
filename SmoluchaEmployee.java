package employee;

public class SmoluchaEmployee {
	private String empName, empNumber, hireDate;
	public SmoluchaEmployee(String name, String number, String date)
		{
			empName = name;
			empNumber = number;
			hireDate = date;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public String getEmpNumber() {
		return empNumber;
	}
	public void setEmpNumber(String empNumber) {
		this.empNumber = empNumber;
	}
	public String getHireDate() {
		return hireDate;
	}
	public void setHireDate(String hireDate) {
		this.hireDate = hireDate;
	}
	public void saying() {
		System.out.println("\nEmployeeName" + empName + "\nEmployee Number: "
							+ empNumber + "\nHire Date: " + hireDate);
	}
	
}
