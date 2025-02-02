package CoreJava;

public class P013_StaticVariablesAndMethods {
	private static int count = 0;// static variable to holds the count
	
//	static method to increment the counter
	public static void increment() {
		count++;
		System.out.println("Counter increment: "+count);
	}
	
//	stetic method to reset the counter
	public static void reset() {
		count = 0;
		System.out.println("Counter reset to 0.");
	}
	
//	ststic method to get the current count
	public static int getCount() {
		return count;
	}
	
//	main method for demonstration
	public static void main(String args[]) {
		P013_StaticVariablesAndMethods.increment();//output counter incremented 1
		P013_StaticVariablesAndMethods.increment();//output counter incremented 2
		System.out.println("Current Count: "+P013_StaticVariablesAndMethods.getCount());// current count 2
		P013_StaticVariablesAndMethods.reset();// current count reset to 0
		System.out.println("Current Count: "+P013_StaticVariablesAndMethods.getCount());// now current count 0
	}
}
