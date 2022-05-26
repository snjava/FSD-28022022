import java.io.FileNotFoundException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class ThrowThrows {

	public static void main(String[] args) {
		try {
			nameOperations();
		} catch(IllegalArgumentException ex) {
			System.err.println(ex.getMessage());
		}
	}
	
	
	
	public static void nameOperations() throws IllegalArgumentException, InputMismatchException, ArrayIndexOutOfBoundsException 
	{
		Scanner scan = new Scanner(System.in);

		System.out.println("Enter Your Name : ");
		String name = scan.next();

		if (name.length() < 2) {
			throw new IllegalArgumentException("Invalid Name provided.....");
		}

		System.out.println("Hello, " + name);

		scan.close();
	}
	
	
	
	public static void readDataFromFile(String filePath) throws FileNotFoundException {
		if(filePath not Exist)
		{
			throw new FileNotFoundException("The provided file is not exist..");
			
		}
	}

}
























