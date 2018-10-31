package java_basic;

public class LearningMethods {

	public static void main(String[] args) {
		
		MyUtils myVar;
		myVar = new MyUtils();
		
		myVar.add10(20);
		//myVar is an instace of class MyUtils ans only invoke the non static  data types and methods
		
		
		
		System.out.println("Basic");
		MyUtils.printSomeJunk("data passed");
		MyUtils.sum2Numbers(10, 23);
		
		int a = MyUtils.add10(10);
		System.out.println(a);
		
		System.out.println(MyUtils.printSomeJunk("no return");
	}
	

}
