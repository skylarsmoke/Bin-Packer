package Lab2;

import java.io.File;
<<<<<<< HEAD
import java.util.ArrayList;
import java.util.ListIterator;
=======
<<<<<<< Updated upstream
import java.util.Arrays;
=======
import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;
>>>>>>> Stashed changes
>>>>>>> 71e8a506197f7ee7b9f27b2ef5955d447f622251
import java.util.Scanner;

/**
 * 
 * @author Skylar Smoker and Austin Hull
 *
 */

public class BinPacker {
	
	Scanner firstFit;
	Scanner bestFit;
	Scanner worstFit;

	public BinPacker(String capacity, String file_name) {
		
		File file = new File(file_name);
		
		try {
			
			firstFit = new Scanner(file);
			bestFit = new Scanner(file);
			worstFit = new Scanner(file);
			
			
		} catch(Exception e) {
			
			System.out.println("Could not find file");
			
		}
		
		int convCap = Integer.parseInt(capacity);
		
		firstFit(convCap);
		bestFitDecreasing(convCap);
		
	}
<<<<<<< HEAD

=======
	
<<<<<<< Updated upstream
	public void firstFit(int capacity) {
		
		Bin bin = new Bin(capacity);
		
		while (input.hasNext()) {
			int itemSize = input.nextInt();
			
			if (bin.checkFit(itemSize)) {
				bin.put(itemSize);
			} 

		
=======
//	public void pack(int capacity) {
//				
//		while (input.hasNext()) {
//			int itemSize = input.nextInt();
////			if(bin.put(itemSize)==true)
//				bin.put(itemSize);
////			else
////				System.out.println("No Space");
//			
//		}
//		
//		System.out.println("# of Items: " + bin.numItems());
//		
//	}
>>>>>>> 71e8a506197f7ee7b9f27b2ef5955d447f622251
	int i =0;
	public void firstFit(int capacity)
	{
		ArrayList<Bin> bins= new ArrayList<Bin>();
<<<<<<< HEAD
		
		bins.add(new Bin(capacity));
		
		ListIterator<Bin> iter = bins.listIterator();
		
		while(firstFit.hasNext()) {
			int itemSize= firstFit.nextInt();
=======
		bins.add(new Bin(capacity));
		ListIterator<Bin> iter = bins.listIterator();
		while(input.hasNext()) {
			int itemSize= input.nextInt();
>>>>>>> 71e8a506197f7ee7b9f27b2ef5955d447f622251
			boolean tf = false;
			if (bins.get(0).getOpenSpace()>=itemSize)
			{
				bins.get(0).put(itemSize);
				tf=true;
			}
			else {
				for(int j= 0; j<bins.size(); j++) {
					if(tf==true)
						break;
					if (bins.get(j).getOpenSpace()>=itemSize) {
							bins.get(j).put(itemSize);
							tf= true;}
				}
				}
			if(tf== false)
			{
				i++;
				bins.add(new Bin(capacity));
				bins.get(i).put(itemSize);
			}
<<<<<<< HEAD

		}
		for(int z= 0; z<bins.size(); z++) {
			System.out.println("Bin #: "+z);
			System.out.println("Open Space: "+bins.get(z).getOpenSpace());
			System.out.println("Number of Items: " + bins.get(z).numItems());
			System.out.println();
		}
		
	}

	public void bestFitDecreasing(int capacity) {
=======
>>>>>>> Stashed changes
		}
	for(int z= 0; z<bins.size(); z++) {
		System.out.println("Bin #: "+z);
		System.out.println("Open Space: "+bins.get(z).getOpenSpace());
		System.out.println("Number of Items: " + bins.get(z).numItems());
		System.out.println();
	}
>>>>>>> 71e8a506197f7ee7b9f27b2ef5955d447f622251
		
		BST bst = new BST();
		
		while (bestFit.hasNext()) {
			int itemSize = bestFit.nextInt();
			
			System.out.println(itemSize);
		}
		
	}
	
<<<<<<< HEAD
=======
<<<<<<< Updated upstream

=======
	
>>>>>>> Stashed changes
>>>>>>> 71e8a506197f7ee7b9f27b2ef5955d447f622251
	public static void main(String args[]) {
		
		// BinPacker BP = new BinPacker(args[0], args[1]);
		
		// Replace everything below before compiling
		Scanner input = new Scanner(System.in);
		System.out.println("cap?");
		String capacity = input.next();
		System.out.println("name?");
		String file_name = input.next();
		
		BinPacker BP = new BinPacker(capacity, file_name);
		
		input.close();
		
		
	}
	
}