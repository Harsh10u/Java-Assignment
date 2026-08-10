// InterfaceImplementationDemo.java
// Demonstrates implementation of interfaces, including a class implementing
// multiple interfaces (multiple inheritance of type)

interface Printable {
    void print();
}

interface Showable {
    void show();
}

// A class can implement more than one interface in Java
class Document implements Printable, Showable {
    String title;

    Document(String title) {
        this.title = title;
    }

    @Override
    public void print() {
        System.out.println("Printing document: " + title);
    }

    @Override
    public void show() {
        System.out.println("Showing document: " + title);
    }
}

// Interface extending another interface
interface Editable extends Printable {
    void edit();
}

class Report implements Editable {
    @Override
    public void print() {
        System.out.println("Printing the report");
    }

    @Override
    public void edit() {
        System.out.println("Editing the report");
    }
}

public class InterfaceImplementationDemo {
    public static void main(String[] args) {
        Document doc = new Document("Java Notes");
        doc.print();
        doc.show();

        Report report = new Report();
        report.edit();
        report.print();
    }
}
