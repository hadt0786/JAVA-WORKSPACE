package car_dealership;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Application {

	public static void main(String[] args) throws FileNotFoundException {

//		for(int i =0; i<=3;i++) {
//			Scanner cin = new Scanner(System.in);
//			System.out.println("enter some text");
//			String enteredTxt = cin.nextLine();
//			System.out.println(enteredTxt);
//		}

		File file = new File("myfile.txt");
		Scanner cin = new Scanner(file);

		while (cin.hasNextLine()) {
			String line = cin.nextLine();
			System.out.println(line);
		}
		cin.close();
	}

}
