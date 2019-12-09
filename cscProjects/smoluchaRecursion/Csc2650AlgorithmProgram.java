package smoluchaRecursion;

public class Csc2650AlgorithmProgram {
	 public static void main(String[] args) {
		 
	       System.out.println("csc2650Algorithm(0, 0) = "
	                               + csc2650Algorithm(0, 0));
	       System.out.println("csc2650Algorithm(0, 1) = "
	                               + csc2650Algorithm(0, 1));
	       System.out.println("csc2650Algorithm(1, 1) = "
	                               + csc2650Algorithm(1, 1));
	       System.out.println("csc2650Algorithm(1, 2) = "
	                               + csc2650Algorithm(1, 2));
	       System.out.println("csc2650Algorithm(1, 3) = "
	                               + csc2650Algorithm(1, 3));
	       System.out.println("csc2650Algorithm(2, 2) = "
	                               + csc2650Algorithm(2, 2));
	       System.out.println("csc2650Algorithm(3, 2) = "
	                               + csc2650Algorithm(3, 2));
	   }
	   
	   public static int csc2650Algorithm(int m,int n) {
	       
	       if(m==0)
	           return n+1;
	       else if(n==0)
	           return csc2650Algorithm(m-1, 1);
	       else
	           return csc2650Algorithm(m-1, csc2650Algorithm(m, n-1));
	   }

}
