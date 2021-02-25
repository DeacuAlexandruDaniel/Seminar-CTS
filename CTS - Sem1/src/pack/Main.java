package pack;

import pack.zooStuff.*;

public class Main {

	public static void main(String[] args) {
		
		Zookeeper keeper = new Zookeeper("Dani");
		Zoo zoo = new Zoo();
		zoo.setZookeeper(keeper);

		Giraffe giraffe1 = new Giraffe("GirafaUnu", 10, 300);
		Giraffe giraffe2 = new Giraffe("GirafaDoi", 20, 350);
		
		zoo.addAnimal(giraffe1);
		zoo.addAnimal(giraffe2);
		zoo.feedAll();
		
		Zebra zebra1 = new Zebra("ZebraUnu", 5, 573);
		Zebra zebra2 = new Zebra("ZebraDoi", 7, 784);
		
		zoo.addAnimal(zebra1);
		zoo.addAnimal(zebra2);
		zoo.feedAll();
	}

}
