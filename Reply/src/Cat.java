
public class Cat extends Animal{

	public Cat(int age, String name, String type) {
		super(age, name, type);
	}

	@Override
	public void makeNoise() {
		System.out.println("Meow");
	}
	

}
