import java.util.ArrayList;

class Student {
	private int id;
	private String name;
	
	Student(int id, String name) {
		this.id = id;
		this.name = name;
		System.out.println("Student Created: " + name);
	}
	
	void displayInfo() {
		System.out.println("ID: " + id + ", Name: " + name);
	}

	@Override
	protected void finalize() throws Throwable {  // Fixed: Added Throwable and removed empty throws
		System.out.println("Garbage Collector destroying Student object: " + name);
		super.finalize();  // Good practice to call super.finalize()
	}
}

public class GarbageCollectorDemo {
	
	public static void main(String[] args) {  // Fixed: Added space in args
		
		System.out.println("=== Student Record System Started ===");

		ArrayList<Student> students = new ArrayList<>();

		students.add(new Student(1, "Juan"));
		students.add(new Student(2, "Maria"));
		students.add(new Student(3, "Pedro"));

		System.out.println("\n--- Displaying Student Records ---");
		for (Student s : students) {
			s.displayInfo();  // Added: Actually display student info
		}

		System.out.println("\n--- Removing Student Records ---");
		students.remove(0);  // Fixed: was "istudents"
		students.remove(0);

		System.out.println("\nRequesting Garbage Collection...");
		for (int i = 4; i <= 20; i++) {
			Student temp = new Student(i, "TempStudent" + i);  // Fixed: Added variable name
		}

		System.out.println("\n--- Clearing Remaining References ---");
		students = null;

		System.out.println("\nRequesting Garbage Collection Again...");
		System.gc();

		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			System.out.println(e);
		}

		System.out.println("\n=== Program Ended ===");
	}
}
