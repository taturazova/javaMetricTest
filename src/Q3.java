/* the base case is when index is equal to length of the string.
 * method is called recursively which goes through the whole string increasing index one by one
 * and increasing count whenever occurance is found.
 * */
import java.util.Scanner;

public class Q3 {

	public static void main(String[] args) {
		Scanner in= new Scanner(System.in);
		System.out.println("Enter String");
		String s = in.nextLine();
		System.out.println("Enter char you want to find number of occurances");
		char ch = in.nextLine().charAt(0);
		System.out.println("No. of occurances are:");
		System.out.println(count(s,ch));
		in.close();
	}
	public static int count(String s, char a) {
		int index=0;
		int count=0;
		return count(s,a,index,count);}

	public static int count(String s,char a, int i, int count) {
	 if(i==s.length())
		 return count;
	 else if(s.charAt(i)==a)
		 return count(s,a,++i,++count);
	 
	 else
		
		 return count(s, a, ++i, count);}
	}



