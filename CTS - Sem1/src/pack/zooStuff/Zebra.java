package pack.zooStuff;

public class Zebra extends Animal{

	private int numberOfStripes;

	public Zebra(String name, float greutate, int numberOfStripes) {
		super(name, greutate);
		this.numberOfStripes = numberOfStripes;
	}

	public Zebra(String name, float greutate) {
		super(name, greutate);
	}

	public int getNumberOfStripes() {
		return numberOfStripes;
	}

	public void setNumberOfStripes(int numberOfStripes) {
		this.numberOfStripes = numberOfStripes;
	}
	
	
	
}
