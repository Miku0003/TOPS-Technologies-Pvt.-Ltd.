package CoreJava;
import java.util.*;
public class P011_MaximumNumber {
	public static void main(String args[]) {
		Max m = new Max();
		m.findMaxNumber();
	}
}

class Max{
	public void findMaxNumber() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 1st Number: ");
		int num1 = sc.nextInt();
		System.out.println("Enter 2nd Number: ");
		int num2 = sc.nextInt();
		System.out.println("Enter 3rd Number: ");
		int num3 = sc.nextInt();
		if(num1 >= num2 && num1 >= num3) {
			System.out.println(num1+" is Maximum Number");
		}else if(num2 >= num3) {
			System.out.println(num2+" is Maximum Number");
		}else {
			System.out.println(num3+" is Maximum Number");
		}
	}
}