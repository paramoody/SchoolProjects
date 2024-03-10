package polymorphism;

public class App {
	public static void main(String[] args) {
		Machine myMachine = new Machine();
		myMachine.run();
		
		Car myCar = new Car();
		myCar.run();
	}
}
