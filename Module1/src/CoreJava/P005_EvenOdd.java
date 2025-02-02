package CoreJava;

import java.util.*;

public class P005_EvenOdd {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a Number : ");
		int a = sc.nextInt();
		System.out.println();
		if(a < 0) {
			System.out.println("Please enter greater than 0.");
		}else if(a == 0) {
			System.out.println("Your Number "+a+" is an Even number, \nbut it is not the smallest positive even number.");
		}else if(a == 1) {
			System.out.println("Your Number "+a+" is smallest Odd.");
		}else if(a % 2 == 0) {
			System.out.println("Your Number "+a+" is Even.");
		}else if(a % 2 != 0) {
			System.out.println("Your Number "+a+" is Odd.");
		}
	}
}
