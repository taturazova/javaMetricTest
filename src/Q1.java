/* base case is that when the integer entered in the function is zero, it returns 0.
 * Recursive call is used to calculate sum of unlimited series.
 * the series is continued with method being applied repeatedly with the input integer decreasing
 * everytime till it is equal to 0.  */

public class Q1 {

	public static void main(String[] args) {
	
		for(int i=1;i<=5;i++) {
			System.out.printf("%.2f", f(i));
			System.out.println();
			
		}
	}
		
		public static double  f(int i) {
			if(i==0) {
				return 0;}
			else {
				return  f(i-1)+(1.0/(2*i));
		
		}
		

	}

}

