package pack.zooStuff;

public class Zookeeper {
	
	public String nume;
	
	public Zookeeper(String nume) {
		super();
		this.nume = nume;
	}

	public void feed(Animal animal) {
		System.out.println("Animalul " + animal.getName() + " a fost hranit");
	}
	
}
