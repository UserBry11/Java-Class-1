//When errors appear, Java will stop and generate an error message. 
//Java will throw an exception (error message).
/*
 * Exception handling lets you catch and handle errors during runtime.
 * 
 * try - to define a block of code to be tested for errors while being executed.
 * catch - define a block of code to be executed, if an error occurs.
 * try and catch come in pairs.
 * finally - lets you run code regardless of the result.
 * 
 * throw - allows you to create a custom error.
 * throw is used with an exception type.
 * There are many exception types: ArithmticException, FileNotFoundException, ArrayIndexOutOfBoundsException, SecurityException, etc.
 * 
 * 
 */
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Exceptions {
	public static void main(String[] args) {
		try {
			readFile("test1.txt");
		} catch (FileNotFoundException e) {
			System.out.println("Message: " + e.getMessage());
		}
	}
	
	public static void readFile(String fileName) throws FileNotFoundException {
		File file = new File(fileName);
		Scanner scanner = new Scanner(file);
		
		while(scanner.hasNextLine()) {
			String line = scanner.nextLine();
			System.out.println(line);
		}
		scanner.close();
	}
}
