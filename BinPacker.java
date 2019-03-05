package Lab2;

import java.io.File;
import java.util.ArrayList;
import java.util.ListIterator;
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

	int i =0;
	public void firstFit(int capacity)
	{
		ArrayList<Bin> bins= new ArrayList<Bin>();
		
		bins.add(new Bin(capacity));
		
		ListIterator<Bin> iter = bins.listIterator();
		
		while(firstFit.hasNext()) {
			int itemSize= firstFit.nextInt();
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

		}
		for(int z= 0; z<bins.size(); z++) {
			System.out.println("Bin #: "+z);
			System.out.println("Open Space: "+bins.get(z).getOpenSpace());
			System.out.println("Number of Items: " + bins.get(z).numItems());
			System.out.println();
		}
		
	}

	public void bestFitDecreasing(int capacity) {
		
		BST bst = new BST();
		
		while (bestFit.hasNext()) {
			int itemSize = bestFit.nextInt();
			
			System.out.println(itemSize);
		}
		
	}
	
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