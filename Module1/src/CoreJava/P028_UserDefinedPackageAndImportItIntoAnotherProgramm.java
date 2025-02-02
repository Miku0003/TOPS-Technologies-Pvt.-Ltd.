package CoreJava;

import java.util.Scanner;
import UserDefine.Percentage;

public class P028_UserDefinedPackageAndImportItIntoAnotherProgramm {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Total Number (Amount/Marks): ");
		float a = sc.nextFloat();
		System.out.println("How Many Percentage You Want to Calculate: ");
		float b = sc.nextFloat();
		Percentage p = new Percentage();
		System.out.println("Value = "+p.percentage(a,b));
	}
}
