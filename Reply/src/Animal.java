
public abstract class Animal {
	int age;
	String name;
	String type;
	public Animal(int age, String name, String type) {
		this.age = age;
		this.name = name;
		this.type = type;
	}
	public abstract void makeNoise();

}
