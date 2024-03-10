package week5CT;

import java.util.Scanner;

public class App {
public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	double[] nums = new double[5];
	System.out.println("enter 5 numbers");
	for (int i = 0; i < 5; i++) {
		nums[i] = scanner.nextDouble();
	}
	scanner.close();
	recursiveMultiply(nums);
}

static double total = 1.0;
static int pointer = 0;

private static void recursiveMultiply(double[] nums) {
	if (pointer < nums.length) {
		total = total * nums[pointer];
		pointer ++;
		recursiveMultiply(nums);
	} else {
		System.out.println(total);
		return;

	}
}
}