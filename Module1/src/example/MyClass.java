package example;

public class MyClass {
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


class MySubClass extends MyClass {
    public void accessMembers() {
        System.out.println("Public var: " + publicVar);
        System.out.println("Protected var: " + protectedVar);
        System.out.println("Default var: " + defaultVar);

        publicMethod();
        protectedMethod();
        defaultMethod();

        // privateVar and privateMethod are not accessible
    }
}


class MyOtherClass {
    public void accessMembers() {
        MyClass obj = new MyClass();

        System.out.println("Public var: " + obj.publicVar);
        // obj.protectedVar, obj.defaultVar, and obj.privateVar are not accessible

        obj.publicMethod();
        // obj.protectedMethod(), obj.defaultMethod(), and obj.privateMethod() are not accessible
    }
}