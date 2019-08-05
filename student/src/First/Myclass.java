package First;
import java.util.Scanner;
import java.util.ArrayList;

public class Myclass {
	Student input = new Student();
	
	  ArrayList <Student> details = new ArrayList<Student>();
	  Scanner Obj = new Scanner(System.in);
	  
	public void show() {
   
		System.out.println("press 1 to add details");
		System.out.println("press 2 to update");
		System.out.println("press 3 to remove");
		System.out.println("show all details");
		int n = Obj.nextInt();
		switch(n) {
		case 1:
			System.out.println("please enter your name");
			input.setName(Obj.next());
			System.out.println("please enter your age");
			input.setAge(Obj.nextInt());
			System.out.println("enter your score");
			input.setScore(Obj.nextInt());
	     	details.add(input);
		case 2:
			
			
		}		
	}
	
	public static void main(String[] args) {
		Myclass print = new Myclass();
		print.show();
   }
}
