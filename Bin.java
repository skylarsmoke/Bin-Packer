package Lab2;

public class Bin {
	
	int capacity;
	int openSpace;
	
	public Bin(int capacity) {
		this.capacity = capacity;
	}

	public void calculateSpace(int itemSize) {
		this.openSpace = this.capacity - itemSize;
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
	
}
