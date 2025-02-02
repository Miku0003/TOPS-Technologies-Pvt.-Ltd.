package CoreJava;
import java.util.*;
public class P003_Calculator {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter 1st Number : ");
		int a = sc.nextInt();
		System.out.println();
		System.out.print("Enter 2nd Number : ");
		int b = sc.nextInt();
		System.out.println();
		System.out.println("Enter the operator you want to perform the operation : ");
		char operator = sc.next().charAt(0);
		if(operator == '+') {
			System.out.println(a+" + "+b+" = "+(a+b));
		}else if(operator == '-') {
			System.out.println(a+" - "+b+" = "+(a-b));
		}else if(operator == '*') {
			System.out.println(a+" * "+b+" = "+(a*b));
		}else if(operator == '/') {
			System.out.println(a+" / "+b+" = "+((float)a/(float)b));
		}else if(operator == '%') {
			System.out.println(a+" % "+b+" = "+(a%b));
		}
	}
}
