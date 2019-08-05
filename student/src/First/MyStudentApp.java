package First;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MyStudentApp {
	static Scanner getvalue = new Scanner(System.in);

	static List<Student> listOfStudent = new ArrayList<>();

	public static void menu() {
		System.out.println("1.Add \n 2.Update \n3.show \n 4.Delete");

		int value = getvalue.nextInt();

		switch (value) {
		case 1:
			System.out.println("Welcome to add Student Details");
			addStudent();
			break;
		case 2:
			System.out.println("In case 2");
		case 3:
			System.out.println("Show all Student Details");

			show();
			break;
		default:
			System.out.println("I AM DEFAULT...!!!");
		}
	}

	public static void addStudent() {
		Student student = new Student();
		System.out.println("Enter student name : ");
		student.setName(getvalue.next());
		System.out.println("Emter ur Student age:");
		student.setAge(getvalue.nextInt());
		listOfStudent.add(student);
		System.out.println(listOfStudent.size());
		menu();
	}

	public static void show() {
		System.out.println("Show all details ");
		for (Student xxx : listOfStudent) {
			System.out.println(xxx.toString());
			System.out.println(xxx.getName());
			if("jilla".equalsIgnoreCase(xxx.getName())) {
				System.out.println("Sikittan sekaru");
				xxx.setName("BILLA");
			}
		}
			System.out.println("------------------------------");
			
			for (Student vvv : listOfStudent) {
				System.out.println(vvv.toString());
				System.out.println(vvv.getName());
			}		 
		
	}

	public static void main(String[] args) {
		// MyStudentApp student =new MyStudentApp();
		menu();

	}

}
