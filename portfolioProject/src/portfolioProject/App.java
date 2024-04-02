package portfolioProject;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.LinkedList;
import java.util.Scanner;

public class App {
	public static void main(String[] args) {
		String name;
		String address;
		double gpa;
		Student newStudent;
		Boolean flag = true;
		Scanner s = new Scanner(System.in);
		LinkedList<Student> studentList = new LinkedList<>();
		while (flag) {

			System.out.print("Enter a student? (y/n) ");
			String response = s.nextLine();
			if (response.equalsIgnoreCase("n")) {

				flag = false;
			} else if (response.equalsIgnoreCase("y")){
				System.out.println("Enter name:");
				name = s.nextLine();
				System.out.println("Enter address:");
				address = s.nextLine();
				System.out.println("Enter GPA:");
				gpa = getValidGPA(s);
				newStudent = new Student(name, address, gpa);
				insertAlphabetically(studentList, newStudent);
			}else {
				System.out.println("Please enter 'y' or 'n'");
			}
		}
		s.close();
		String filePath = "Students.txt";
		File file = new File(filePath);
		try {
			BufferedWriter writer = new BufferedWriter(new FileWriter(file));
			for(Student student: studentList) {
				writer.write(student.toString() + "\n");
			}
			System.out.println("Student list writen to " + file.getAbsolutePath());
			writer.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
	

	public static double getValidGPA(Scanner s) {
		double gpa;
		while (true) {
			String input = s.nextLine();
			try {
				gpa = Double.parseDouble(input);
				if (gpa > 4 || gpa < 0) {
					System.out.println("GPA must be between 0 and 4");
					continue;
				}
				break;
			} catch (NumberFormatException e) {
				System.out.println("please enter a number for GPA");
			}
		}

		return gpa;
	}
	public static void insertAlphabetically(LinkedList<Student> list, Student newStudent){
		int index = 0;
		for (Student student: list) {
			if (student.getName().compareToIgnoreCase(newStudent.getName()) > 0) {
				break;
			}
			index++;
		}
		list.add(index, newStudent);
		
	}
}
