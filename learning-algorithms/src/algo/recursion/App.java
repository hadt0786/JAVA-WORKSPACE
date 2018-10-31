package algo.recursion;

public class App {

	public static void main(String[] args) {
		 System.out.println(recursiveLinearSearch(new int[] {1,2,3,4,5,6,7,8,9,10,11,12,13,14}, 0,28));

	}
	
	public static int recursiveLinearSearch(int[]a, int i,int x) {
	//i is starting point
		if(i>a.length-1) { //if x evalutates, the x is not in the array
			return -1;
		}
		else if(a[i]==x) {
			return i;
		}
		else {
			System.out.print("index at i "+i);
			return recursiveLinearSearch(a,i+1,x);
		}
	}
	
	public static int recursiveBinarySearch(int []a,int p ,int r, int x) {

		System.out.println("["+p+"..."+r+"]");
		if(p>r) {
			return -1;
		}
		else {
			int q = (p+r)/2;
			if(a[q]==x) {
				return q;
			}else if(a[q]>x) {
				return recursiveBinarySearch(a,p,q-1,x);
			}else {
				return recursiveBinarySearch(a,p+1,r,x);
			}
		}
		
	}
	
	
	
	public static void reduceByOne(int n) {
		//reduceByOne(n-1); cause stack overflow exception
		
		//base case: case condition calling a recursive case to end
		if(n>=0) {
			reduceByOne(n-1);
		}
		System.out.println("complteed call " +n);
		//output -->
//		Completed call : -1
//		Completed call : 0
//		Completed call : 1
//		Completed call : 2
//		Completed call : 3
//		Completed call : 4
//		Completed call : 5
	}

}
