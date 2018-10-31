package algo.binarySearch;

public class App {
	//always use if given array is SORTED

	public static void main(String[] args) {
		System.out.println(binarySearch(new int[] {1,2,3,4,5,6,7,8,9,10,11,12,13},12) );

	}
	public static int binarySearch(int[]a, int x) {
		
		int p = 0, r = a.length-1 ;
		
		while(p<=r) 
		{
			int q = (p+r)/2;
			if(x < a[q]) r = q-1;//moving to left array
			else if (x>a[q]) p=q+1;//moving right
			else return q;
			
		}
		return -1;
	}

}
