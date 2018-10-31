package ds.stack;

public class App {
	public static void main(String[] args) {
		Stack stack = new Stack(10);
		
//		stack.push(20);
//		stack.push(40);
//		stack.push(60);
//		stack.push(60);
//		stack.push(80);
	
		while(!stack.isEmpty()){
			long value = stack.pop();
			System.out.println(value);
		}
		System.out.println(reverseString("hello"));
	}
	public static String reverseString(String str) {
		int stackSize = str.length(); //get the stack sizeStack sta
		Stack stack2 = new Stack(stackSize);
		for(int j = 0;j<str.length();j++) {
			char ch = str.charAt(j);
			stack2.push(ch);
			
		}
		String result ="";
		while(!stack2.isEmpty()) {
			char ch = stack2.pop();
			result = result+ch;
		}
		return result;
	}
	

}
