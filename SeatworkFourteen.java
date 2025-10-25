public class SeatworkFourteen
public static void main(String[]args) {
    Motorcycle m= new Motorcycle();
    m.make= "Yamaha RZ350";
    m.color="yellow";

    System.out.println("Calling showAtts...");
    m.showAtts();
    System.out.println("-------------");

    System.out.println("Starting engine...");
    m.startEngine();
    System.out.println("-------------");

    System.out.println("Calling showAtts...");
    m.showAtts();
    System.out.println("-------------");

    System.out.println("Starting engine...");
    m.startEngine();
}


  // Assuming Motorcycle class exist somewhere
     class Motorcycle {
     String make;
     String color;
     public void showAtts() {
     System.out.println("This motorcycle is a"+ color + ""+ make);
    }

     public void startEngine() {
     System.out.println("The engine is now running");
    }
  }
