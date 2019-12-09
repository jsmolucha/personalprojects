package smoluchaComparator;

public class SmoluchaComparator <T extends Number > {
	   T[] objects; 
	   
	   public SmoluchaComparator(T[] values) {
		   
	       objects = values;  
	   }

	   public T getHighest() {
		   
	       T max=objects[0];

	       for (int index = 1   ; index < objects.length; index++) { 
	    	   
	           if(objects[index].doubleValue()>max.doubleValue())
	               max=objects[index];
	       }
	       return max;
	   }

	   public T getLowest() {
	       T min=objects[0];

	       for (int index = 1   ; index < objects.length; index++) {   
	    	   
	           if(objects[index].doubleValue()<min.doubleValue())
	               min=objects[index];
	       }

	       return min;
	   }
	   
	   public double getTotal() {

	       double total =0;

	       for (T number : objects) {
	           total += number.doubleValue();
	       }      
	       return total;      
	   	}

	   public double getAverage() {
		   
	       double total =0;
	       
	       for (T number : objects) {
	    	   
	           total += number.doubleValue();
	       }      
	       return total/objects.length;  
	   }

	   public static void main(String[] args) {
		   
	       Integer[] numbers = {2, 4, 6, 8, 10, 12};

	       SmoluchaComparator<Integer> comparator = new SmoluchaComparator<Integer>(numbers);

	       System.out.println("The highest value is " +
	               comparator.getHighest());
	       System.out.println("The lowest value is " +
	               comparator.getLowest());
	       System.out.println("The total of the values is " +
	               comparator.getTotal());
	       System.out.println("The average of the values is " +
	               comparator.getAverage());
	      
	   }

}
