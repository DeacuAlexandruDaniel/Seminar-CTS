package pack.zooStuff;

public class Giraffe extends Animal {

	public int inaltime;

	public Giraffe(String name, float greutate, int inaltime) {
		super(name, greutate);
		this.inaltime = inaltime;
	}

	public Giraffe(String name, float greutate) {
		super(name, greutate);
	}

	public int getInaltime() {
		return inaltime;
	}

	public void setInaltime(int inaltime) {
		this.inaltime = inaltime;
	}

}
