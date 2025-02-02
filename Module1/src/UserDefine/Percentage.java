package UserDefine;


public class Percentage {
	public float percentage(float a,float b) {
		float per = a*b/100;
		return per;
		
	}
}

class MyClass {
    public int publicVar = 10;
    protected int protectedVar = 20;
    int defaultVar = 30; // default access modifier
    private int privateVar = 40;

    public void publicMethod() {
        System.out.println("Public method");
    }

    protected void protectedMethod() {
        System.out.println("Protected method");
    }

    void defaultMethod() { // default access modifier
        System.out.println("Default method");
    }

    private void privateMethod() {
        System.out.println("Private method");
    }
}

