import java.util.ArrayList;

public class StackImplementation {
	static ArrayList<Integer> arr ;
	
	public StackImplementation(int val) {
		 new ArrayList<>();
		arr.add(val);
		
	}
	
	public static void push (int val) {
		int top = arr.size();
		arr.add(top,val);
		
		
		
	}
	public static void pop () {
		if(!isEmpty()) {
			arr.remove(arr.size());
			
		}	
	}
	
	
	public static boolean isEmpty() {
		if(arr.size()==0) {
			return true;
		}
		else return false;
	}
	
	public static void main(String[] args) {
		StackImplementation obj; 
		for(int i =0;i<10;i++) {
			push(i);
		
	}}
}
