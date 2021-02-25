package pack.zooStuff;

import java.util.List;
import java.util.ArrayList;

public class Zoo {

	private List<Animal> animals;
	private Zookeeper zookeeper;

	public Zoo(List<Animal> animals, Zookeeper zookeeper) {
		super();
		this.animals = animals;
		this.zookeeper = zookeeper;
	}
	
	public Zoo() {
		super();
		animals = new ArrayList<Animal>();
		zookeeper = new Zookeeper("Gigi");
	}

	public List<Animal> getAnimals() {
		return animals;
	}

	public void setAnimals(List<Animal> animals) {
		this.animals = animals;
	}

	public Zookeeper getZookeeper() {
		return zookeeper;
	}

	public void setZookeeper(Zookeeper zookeeper) {
		this.zookeeper = zookeeper;
	}
	
	public void feedAll() {
		for(Animal a : animals){
			zookeeper.feed(a);
		}
	}
	
	public void addAnimal(Animal a) {
		animals.add(a);
	}
	
}
