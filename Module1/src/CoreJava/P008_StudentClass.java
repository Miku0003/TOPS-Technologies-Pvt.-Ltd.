package CoreJava;

import java.util.*;

class Student{
	
	public void display() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Sudent Name: ");
		String student_name = sc.nextLine();
		System.out.println("Enter Student Age: ");
		int student_age = sc.nextInt();
		
		
		System.out.println("Student Name = "+student_name);
		System.out.println("Student Age = "+student_age);
	}
	
}

public class P008_StudentClass {
	public static void main(String args[]) {
		Student s = new Student();
		s.display();
	}
}
