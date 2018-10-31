package AssignmentFile1;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class Assignment1 {

	//define variables
	
//	public static BufferedReader cin;
//	public static PrintWriter cout;
	
	public static void main(String[] args) {
//		cin = new BufferedReader(new InputStreamReader(System.in));
//		cout = new PrintWriter(System.out, true);

		int secNum = 20;
		for(int i = 0; i<19; i++) {
			System.out.println(sum(i,secNum));
			
			secNum++;
			
			
		}
		
	}
	public static int sum(int a, int b) {
		return a+b;
	}
	
}