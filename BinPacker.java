package Lab2;

import java.util.Scanner;

/**
 * 
 * @author Skylar Smoker
 *
 */

public class BinPacker {

	public BinPacker(String capacity, String file_name) {
		
		
		
	}
	
	
	public static void main(String args[]) {
		
		// BinPacker BP = new BinPacker(args[0], args[1]);
		
		// Replace everything below before compiling
		Scanner input = new Scanner(System.in);
		
		String capacity = input.next();
		String file_name = input.next();
		
		BinPacker BP = new BinPacker(capacity, file_name);
		
		input.close();
		
	}
	
}
