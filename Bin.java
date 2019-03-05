package Lab2;

public class Bin {
	
	private int capacity;
	private int openSpace;
	private int newCap;
	private int items = 0;
	
	public Bin(int capacity) {
		this.capacity = capacity;
		this.openSpace = capacity;
		this.newCap = this.capacity;
	}

	public void put(int itemSize) {
		this.openSpace = this.newCap - itemSize;
		this.newCap = this.openSpace;
		this.items++;
	}
	
	public boolean checkFit(int itemSize) {
		if (itemSize <= this.openSpace) {
			return true;
		} else {
			return false;
		}
	}
	
	public int getCap() {
		return this.capacity;
	}
	
	public int getOpenSpace() {
		return this.openSpace;
	}
	
	public int numItems() {
		return this.items;
	}
	
}
