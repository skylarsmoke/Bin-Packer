package Lab2;

public class Bin {
	
	private int capacity;
	private int openSpace;
	private int items = 0;
	
	public Bin(int capacity) {
		this.capacity = capacity;
		this.openSpace = capacity;
	}

	public void put(int itemSize) {
		this.openSpace = this.capacity - itemSize;
		this.items++;
	}
	
	public boolean checkFit(int itemSize) {
		if (itemSize <= this.openSpace) {
			return true;
		} else {
			return false;
		}
	}
	
	public int getOpenSpace() {
		return this.openSpace;
	}
	
	public int numItems() {
		return this.items;
	}
	
}
