package Lab2;

import java.io.File;
import java.util.Arrays;
import java.util.Scanner;

/**
 * 
 * @author Skylar Smoker
 *
 */

public class BinPacker {
	
	Scanner input;

	public BinPacker(String capacity, String file_name) {
		
		File file = new File(file_name);
		
		try {
			
			input = new Scanner(file);
			
		} catch(Exception e) {
			
			System.out.println("Could not find file");
			
		}
		
		int convCap = Integer.parseInt(capacity);
		
		firstFit(convCap);
		
	}
	
	public void firstFit(int capacity) {
		
		Bin bin = new Bin(capacity);
		
		while (input.hasNext()) {
			int itemSize = input.nextInt();
			
			if (bin.checkFit(itemSize)) {
				bin.put(itemSize);
			} 

		
		}
		
		System.out.println("# of Items: " + bin.numItems());
		
		
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
