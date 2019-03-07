package Lab2;

import java.io.File;
import java.util.ArrayList;


import java.util.Scanner;

/**
 * 
 * @author Skylar Smoker & Austin Hull
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
			worstFit= new Scanner(file);
			
		} catch(Exception e) {
			
			System.out.println("Could not find file");
			
		}
		
		int convCap = Integer.parseInt(capacity);
		
		firstFit(convCap);
		bestFit(convCap);
		worstFit(convCap);
		
	}
	

		
	int i =0;
	public void firstFit(int capacity)
	{
		System.out.println("\nFirst Fit Implementation: \n");
		ArrayList<Bin> bins= new ArrayList<Bin>();
		bins.add(new Bin(capacity));
		while(firstFit.hasNext()) {
			int itemSize= firstFit.nextInt();
			if (itemSize>capacity) {
				System.out.println("Item too large!");
				break;}
			boolean tf = false;
			if (bins.get(0).getOpenSpace()>=itemSize)
			{
				bins.get(0).put(itemSize);
				System.out.println("Item " + itemSize + " placed into Bin #" + 0);
				tf=true;
			}
			else {
				for(int j= 0; j<bins.size(); j++) {
					if(tf==true)
						break;
					if (bins.get(j).getOpenSpace()>=itemSize) {
							bins.get(j).put(itemSize);
							System.out.println("Item " + itemSize + " placed into Bin #" + j);
							tf= true;}
				}
				}
			if(tf== false)
			{
				i++;
				bins.add(new Bin(capacity));
				bins.get(i).put(itemSize);
				System.out.println("Item " + itemSize + " placed into Bin #" + i);
			}
		}
	for(int z= 0; z<bins.size(); z++) {
		System.out.println("Bin #" + z + ": Contains " +bins.get(z).numItems()+" items and "+bins.get(z).getOpenSpace()+ " open space.");
	}
	}
	
	public void bestFit(int capacity) {
		
		System.out.println("\nBest Fit Implementation: \n");
		BST<Integer, Bin> bst = new BST<Integer, Bin>();
		
		bst.put(1, new Bin(capacity));
		int i = 1;
		while (bestFit.hasNext()) {
		
			int itemSize = bestFit.nextInt();
			if (itemSize>capacity) {
				System.out.println("Item too large!");
				return;}
			boolean placed = false;
			
				int lowSize = capacity+1;
				int lowIndex=1;
				for (int j = 1; j < bst.size() + 1; j++) {
					int iter = bst.get(j).getOpenSpace();
					if (iter < lowSize && iter>=itemSize) {
						lowIndex = j;
						lowSize = iter;
					}
					
				}
				if(lowSize>=itemSize && lowSize<capacity+1) {
					bst.get(lowIndex).put(itemSize);
					placed = true;
					System.out.println("Item " + itemSize + " placed into Bin #" + lowIndex);
				}
				
				if (!placed) {
					i++;
					bst.put(i, new Bin(capacity));
					bst.get(i).put(itemSize);
					System.out.println("Item " + itemSize + " placed into Bin #" + i);
				}
			
						
		}
		
		for (int k = 1; k < bst.size() + 1; k++) {
			System.out.println("Bin #" + k + " contains " + bst.get(k).numItems() + " items and " +bst.get(k).getOpenSpace() + " open space.");
		}	
	}
	
	public void worstFit(int capacity) {
		
		System.out.println("\nWorst Fit Implementation: \n");
		
		BST<Integer, Bin> bst = new BST<Integer, Bin>();
		
		bst.put(1, new Bin(capacity));
		int i = 1;
		while (worstFit.hasNext()) {
		
			int itemSize = worstFit.nextInt();
			if (itemSize>capacity) {
				System.out.println("Item too large!");
				return;
			}
			
			boolean placed = false;
			
			int highSize = 0;
			int highIndex = 1;
			for (int j = 1; j < bst.size() + 1; j++) {
				int iter = bst.get(j).getOpenSpace();
				if (iter > highSize && iter>=itemSize) {
					highIndex = j;
					highSize = iter;
					
				}
				
			}
				
			if(highSize>=itemSize && highSize<capacity + 1) {
				bst.get(highIndex).put(itemSize);
				placed = true;
				System.out.println("Item " + itemSize + " placed into Bin #" + highIndex);
			}
			
			if (!placed) {
				i++;
				bst.put(i, new Bin(capacity));
				bst.get(i).put(itemSize);
				System.out.println("Item " + itemSize + " placed into Bin #" + i);
			}
			
						
		}
		
		for (int k = 1; k < bst.size() + 1; k++) {
			System.out.println("Bin #" + k + " contains " + bst.get(k).numItems() + " items and " +bst.get(k).getOpenSpace() + " open space.");
		}
		
		
	}
	

	public static void main(String args[]) {
		
		BinPacker BP = new BinPacker(args[0], args[1]);
		
		
		
		
	}
	
}
