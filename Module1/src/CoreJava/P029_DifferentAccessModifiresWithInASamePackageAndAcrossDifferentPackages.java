package CoreJava;

import example.MyClass;
public class P029_DifferentAccessModifiresWithInASamePackageAndAcrossDifferentPackages {
    public void accessMembers() {
        MyClass obj = new MyClass();

        System.out.println("Public var: "+obj.publicVar);
        // obj.protectedVar, obj.defaultVar, and obj.privateVar are not accessible

        obj.publicMethod();
        // obj.protectedMethod(), obj.defaultMethod(), and obj.privateMethod() are not accessible
    }
}
