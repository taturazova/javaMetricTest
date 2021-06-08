/* base case is if the directory exists. Recursive function is called again and again to write the names of files till they are not equal to null.
 * First method is used to write the directory and is the helper method which calls another method to list files which run s recursively till files exists.
 * */
import java.io.File;
public class Q4_{
	public static void main(String[] args) {
		File file = new File("..");
		listAllFiles(file);
}
	public static void listAllFiles(File dir) {
		if (dir.exists()) {
			System.out.println("["+dir.getName().toUpperCase() + "]");
			String spaces = "  ";
			listAllFiles(dir,spaces);}
		else {
			System.out.println("Sorry, there is no such root directry!");
			}
				}
	public static void listAllFiles(File dir, String spaces) {
		if (dir.exists()) {
			File[] listofFiles = dir.listFiles();
			if (listofFiles != null) {
				spaces = spaces + "  ";
				for (File i : listofFiles) {
					if (i.isDirectory()) {
						System.out.println(spaces+ "["+i.getName().toUpperCase() + "]");
						listAllFiles(i,spaces);}
					else {
						System.out.println(spaces + " "+i.getName());}
				}
					}	
				}			}
}


