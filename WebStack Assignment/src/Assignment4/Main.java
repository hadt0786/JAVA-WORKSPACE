package Assignment4;

//Write Java program to print the squares and cubes for the numbers 1 to 5. 

public class Main {

	public Main() {
		
	}
	
	public static void main(String[] args) {
		int square = 0;
		int cube = 0;
		for(int i=1;i<6;i++) {
			for(int j = i; j<i;j++) {
				square +=j; 
			}
			System.out.println(square);
		}
		
	}

}
