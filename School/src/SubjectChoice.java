import java.util.Scanner;

public class SubjectChoice {

	static Scanner cin;

	public static void main(String[] args) {

		System.out.println("Enter the your name");
		String sName = cin.nextLine();

		// check the student already enrolled for two subjects

		System.out.println(sName);

		
		
		System.out.println("Enter the subject separated by commas");

		String choiceSubject = cin.nextLine();
		System.out.println(choiceSubject);
		String[] choice_Subject = choiceSubject.split(",");

		int num_choice = choice_Subject.length;

		while (num_choice > 2) {
			System.out.println("You can only take two subjects ");
			choiceSubject = cin.nextLine();
			System.out.println(choiceSubject);
			choice_Subject = choiceSubject.split(",");
			num_choice = choice_Subject.length;

		}

	}

}
