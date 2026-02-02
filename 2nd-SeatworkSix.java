class Person {
    String name;
    String section;

    public void Person(String name, String section) {
        this.name = name;
        this.section = section;
    }

    void displayInfo() {
        System.out.println("Student name: " + name);
        System.out.println("Section: " + section);
    }
}

public class SeatworkSixThird {
    public static void main(String[] args) {
        Person p1 = null;
        //Person p1 = new Person();
        //p1.Person("King", "Techpro");

        try {
            p1.displayInfo();
        } catch (Exception e) {
            System.out.println("Beh may error");
        }
    }
}
