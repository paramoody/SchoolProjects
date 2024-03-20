package week6CT;

import java.util.ArrayList;
import java.util.Comparator;

public class SelectionSort {
	public static void selectionSort(ArrayList<Student> list, Comparator<Student> c) {
		for (int i = 0; i < list.size(); i++) {
			int minIndex = i;
			for(int j = i + 1; j < list.size(); j++) {
				if (c.compare(list.get(j), list.get(minIndex)) < 0) {
					minIndex = j;
				}
			}
			Student temp = list.get(i);
			list.set(i, list.get(minIndex));
			list.set(minIndex, temp);
		}
	}
}
