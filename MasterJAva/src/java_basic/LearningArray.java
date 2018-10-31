package java_basic;

public class LearningArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int values;//container for single variable
		values = 100;//not valid100,200,300; 
		int [] value = new int [100];
		value[0] = 1000;
		value[99] = 93432;
		//values[1] = "hello";//not possible
		
		System.out.println(value[100]);
		
		String words [] = new String [] {"words", "two"};
		
		System.out.println(words[0]);
		
		
	}

}
