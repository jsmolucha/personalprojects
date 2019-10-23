package employee;

public class ProductionWorker extends SmoluchaEmployee {

	public ProductionWorker(String name, String number, String date) {
		super(name, number, date);
	} 
	private int empShift;
	private double HourlyPay;
	
	public int getEmpShift() {
		return empShift;
	}
	public void setEmpShift(int empShift) {
		this.empShift = empShift;
	}
	public double getHourlyPay() {
		return HourlyPay;
	}
	public void setHourlyPay(double hourlyPay) {
		HourlyPay = hourlyPay;
	}
	public void saying1() {
		System.out.print("Shift:" + empShift);
		System.out.print("Hourly Pay: " + HourlyPay);
		
	}
}
