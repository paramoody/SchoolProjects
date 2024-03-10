public class Reply {
	public static void main(String[] args) {
		System.out.println(fact(3));
	}
	public static int fact(int num){
		int total;
		if (num == 1){
			return 1;
		}
		total = num * fact(num - 1);
		return total;
	}
}