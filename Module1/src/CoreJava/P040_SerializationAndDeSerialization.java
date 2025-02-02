package CoreJava;


//import java.io.Serializable;
import java.io.*;

class Persons implements Serializable {
    private static final long serialVersionUID = 1L;

    private String name;
    private int age;

    public Persons(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}




public class P040_SerializationAndDeSerialization {
    public static void main(String[] args) {
        // Create a Person object
        Persons person = new Persons("Miku Kumar", 21);

        // Serialize the Person object to a file
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("person.ser"))) {
            oos.writeObject(person);
            System.out.println("Person object serialized to person.ser");
        } catch (IOException e) {
            System.out.println("Error serializing Person object: " + e.getMessage());
        }

        // Deserialize the Person object from the file
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("person.ser"))) {
            Persons deserializedPerson = (Persons) ois.readObject();
            System.out.println("Deserialized Person object: " + deserializedPerson);
        } catch (IOException | ClassNotFoundException e) {
            System.out.println("Error deserializing Person object: " + e.getMessage());
        }
    }
}
