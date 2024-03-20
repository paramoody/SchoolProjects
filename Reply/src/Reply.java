import java.util.Arrays;

public class Reply {
	public static int[] bubbleSort(int[] array) {
		boolean swap = true;
		while (swap == true){
			swap = false;
			for (int i = 0; i < array.length - 1; i++) {
				if (array[i] > array[i + 1]) {
					int temp = array[i];
					array[i] = array[i+1];
					array[i+1] = temp;
					swap = true;
				}
			}
		}
		return array;
	}



	public static void main(String[] args) {
		int[] numbers = { 99, 8, 10, 33, 2, 88, 1 };
		int[] sortedNumbers = bubbleSort(numbers);
		System.out.println(Arrays.toString(sortedNumbers));
	}
}