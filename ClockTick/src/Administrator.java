import java.util.Scanner;

public class Administrator {

	static Scanner cin = new Scanner(System.in);

	public static void main(String[] args) {

		// Student comes to Administrator to express his interest for the subject

		System.out.println("Student : Good Morning Sir! I came here for the choice of Extra subject");

		// Administrator ask for name and subject optional class
		Subject s = new Subject();
		System.out.println("Enter your name");

		String name = cin.nextLine();
		System.out.println(name);

		System.out.println("\nThere is a List of Subject kindly onlyy choose among them!"
				+ "Note: You can only enroll for Two subject" + " Follow is the List" + "\n1. Physics"
				+ "\n2. Chemistry" + "\n3. History" + "\n4. Geography" + "\n5. Computer Science");
		int subjectCounter = 2;
		while (subjectCounter > 2) {

		}
	}

}
