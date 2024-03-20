package week6CT;

import java.util.ArrayList;
import java.util.Collections;

public class App {
	public static void main(String[] args) {
		ArrayList<Student> students = new ArrayList<>();
		students.add(new Student(500, "Joe Joeson", "101 Street st."));
		students.add(new Student(101, "Bob Boberson", "201 Street ave."));
		students.add(new Student(302, "Zip Zipperson", "544 Avenue st."));
		students.add(new Student(903, "Pete Peters", "600 Street blvd."));
		students.add(new Student(154, "Sue Sueson", "742 Blvd st."));
		students.add(new Student(258, "Mary Marys", "1000 Blvd ave."));
		students.add(new Student(396, "Sam Samson", "311 Avenue blvd."));
		students.add(new Student(707, "Rob Robbington", "401 Street blvd."));
		students.add(new Student(999, "James Jamerson", "500 Main st."));
		students.add(new Student(109, "Alice Allenton", "501 Main st."));

		SelectionSort.selectionSort(students, new SortByName());
		System.out.println("Sorted by Name:\n");
		for (int i = 0; i < students.size(); i++) {
			System.out.println(students.get(i));
		}

		SelectionSort.selectionSort(students, new SortByRoll());
		System.out.println();
		System.out.println("Sorted by Roll Number: \n");
		for (int i = 0; i < students.size(); i++) {
			System.out.println(students.get(i));
		}
	}
}
