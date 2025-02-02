package CoreJava;

public class P012_Overloading {
	public static void main(String args[]) {
		Calculate c = new Calculate();
		
//		To call Float Addition function
//		c.add(3.4f, 5.6f);
		
//		to call integer addition function
		c.add(3, 50);
	}
}

class Calculate{
	public void add(int a, int b) {
		System.out.println(a+" + "+b+" = "+(a+b));
	}
	public void add(float a, float b) {
		System.out.println(a+" + "+b+" = "+(a+b));
	}
}
