package CoreJava;

public class P009_ConstructorOverLoading {
	public static void main(String args[]) {
		Construct c = new Construct(2,3);
	}
}

class Construct{
//	For one Parameter
	Construct(int a){
		System.out.print(a);
	}
//	 For Two parameter
	Construct(int b, int c){
		System.out.println(b+" "+c);
	}
}
