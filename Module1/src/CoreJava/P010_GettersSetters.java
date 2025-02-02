package CoreJava;


public class P010_GettersSetters {
  public static void main(String[] args) {
    Person myObj = new Person();
    myObj.user_id = "Miku123";  // error
    System.out.println(myObj.user_id); // error 
  }
}

class Person {
	  String user_id; // private = restricted access

	  // Getter
	  public String getName() {
	    return user_id;
	  }

	  // Setter
	  public void setName(String newName) {
	    this.user_id = newName;
	  }
	}