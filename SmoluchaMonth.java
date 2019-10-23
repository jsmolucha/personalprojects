package question1;

public class SmoluchaMonth {
	    String[] monthName = { "January", "Februry", "March",
	            "April", "May", "June", "July", "August", "September",
	            "October", "November", "December" };
	    int monthNumberInt = 0;
	    public static String lastMonthCreated;
	    public SmoluchaMonth()
	    {
	        monthNumberInt = 1;
	    }

	    public SmoluchaMonth(int monthNumber)
	    {
	        if((monthNumber < 1 ) || ( monthNumber > 12)) {
	        this.monthNumberInt = 1;
	        } else {
	            this.monthNumberInt = monthNumber;
	        }
	    }

	    public SmoluchaMonth(String monthName)
	    {
	        monthNumberInt = monthName.indexOf(monthName);
	    }

	    public int getMonthNumberInt() {
	        return monthNumberInt;
	    }

	    public void setMonthNumberInt(int monthNumberInt) {
	        this.monthNumberInt = monthNumberInt;
	    }

	    public String toString()
	    {
	       return  "monthName: " + monthName[monthNumberInt];
	    }
	    public boolean Equals(SmoluchaMonth m)
	    {
	        if(this.monthNumberInt == m.getMonthNumberInt())
	            return true;
	        else
	            return false;
	    }
	    public boolean GreatThan(SmoluchaMonth m1)
	    {
	        if(monthNumberInt > m1.monthNumberInt)
	            return true;
	        else
	            return false;
	    }

	    public boolean LesserThan(SmoluchaMonth m1)
	    {
	        if(monthNumberInt < m1.monthNumberInt)
	            return true;
	        else
	            return false;
	    }
	}

