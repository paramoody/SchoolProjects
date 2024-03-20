
public class RecursiveHello {
	public static void main(String[] args) {
		int x = 6;
		System.out.println("fibonacci sequence at index " + x + " is " + fib(x));
		
	}
	static int fib(int x) {
		if (x <= 1) {
			return x;
		}
		int result = fib(x - 1) + fib( x - 2);
		return result;
		
	}
}
