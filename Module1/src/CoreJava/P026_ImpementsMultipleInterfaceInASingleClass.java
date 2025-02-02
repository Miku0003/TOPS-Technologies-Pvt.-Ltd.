package CoreJava;


// Interface 1: Printable

interface Printable {
    void print();
}


// Interface 2: Shareable

interface Shareable {
    void share();
}


// Interface 3: Editable

interface Editable {
    void edit();
}


// Class: Document (Implements multiple interfaces)

class Document implements Printable, Shareable, Editable {
    private String content;

    public Document(String content) {
        this.content = content;
    }

    @Override
    public void print() {
        System.out.println("Printing: " + content);
    }

    @Override
    public void share() {
        System.out.println("Sharing: " + content);
    }

    @Override
    public void edit() {
        System.out.println("Editing: " + content);
    }
}


// Main Class

public class P026_ImpementsMultipleInterfaceInASingleClass {
    public static void main(String[] args) {
        Document document = new Document("Hello, Miku Kumar!");

        document.print();
        document.share();
        document.edit();
    }
}
