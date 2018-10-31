package practice.loops;

public class LoopsPractice {

	public static void main(String[] args) {
		
//		while(true) {
//			System.out.println("AKASH"); //until my computer crasehes
//			
//		}
		int count = 0;
		while(count<=100) {
			System.out.println("AKASH "+count ); //until my computer crasehes
			count+=1;
			
			if(count==30) {
				//prints upto 29
				break;
			}
			//break;//only prints Akash 0
		}
		while(!(count<=100)) {
			System.out.println("AKASH "+count ); //until my computer crasehes
			count+=1;
			//not print anything
		}
		String str = "we have a large inventory of thigs in our warehouse falling in"
				+ "the category:appearat and  the slightly"
				+ "more int he demad category:makeup along"
				+ "with the category:furniture and...";
		printCategories(str);

		
	}
	/**
	 * extract all categories from the string argument
	 * use function substring(String star, String end)
	 * 				indexOf(String s, int i) //if it doesnot find return -1
	 * 				while(true){}
	 * @param str
	 * @return appearat , makeup, furniture 
	 **/
	public static void printCategories(String str) {
		
		for(int i = 0; i<100;i++) {
			System.out.println("i :"+i);
		}
		String forTest = "reverse the string";
		
		for(int j = forTest.length()-1; j>=0;j--) {
			System.out.println("i :"+forTest.charAt(j));
			}
		
		String forTest1 = "reverse the string";
		
		for(int k = forTest1.length()-1; k>=0;k-=5) {
			System.out.println("i :"+forTest.charAt(k));
			}
		
		
		int i = 0;
		while(true) {
			
			int found = str.indexOf("category:",i);
			if(found==-1) {
				break;
			}
			int start = found+9;//start of the actual category
			int end = str.indexOf(" ", start);
			System.out.println(str.substring(start, end));
			end+=1;
					}
		
	}

}
