/* Helper method is used to set the index to 0.
 * Base case is when index becomes equal to the length of the string.
 * The method is recursively clled increasing the index reversing each alphabet one by one*/
import java.util.Scanner;

public class Q2 {
	public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String string = input.nextLine();
        reverse(string);
        input.close();
    }
	
	
	   public static void reverse(String s) {
        reverse(s, 0);
        
    }
		 public static void reverse(String s, int index) {
		        if (index < s.length()) {
		            reverse(s, index + 1);
		            System.out.print(s.charAt(index));
		        }
		    }

		   }


