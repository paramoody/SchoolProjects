package week6CT;

import java.util.Comparator;

public class SortByRoll implements Comparator<Student>{

	@Override
	public int compare(Student o1, Student o2) {
		return o1.getRollNo() - o2.getRollNo();
	}

}
