package question1;

public class MonthMain {
	public static void main(String[] args) {
	    SmoluchaMonth m;
	    for (int i = 0; i <12; i++) {
	        m = new SmoluchaMonth();
	        m.setMonthNumberInt(i);
	        System.out.println("Month " + m.getMonthNumberInt() + " is " + m);
	    }
	}
}
