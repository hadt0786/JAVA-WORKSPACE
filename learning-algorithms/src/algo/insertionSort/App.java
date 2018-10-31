package algo.insertionSort;

public class App {
	
	public static void main(String[] args) {
		int myArray[]=insertionSort(new int[] {4,22,6,0,8,5,4});
	}
	public static int[] insertionSort(int[]a) {
		for(int i=1;i<a.length;i++) {
			int element = a[i];//element variable contain the data we intent to bring in the sorted area
			int j = i-1;//j---> index position of the last value pf the sorted area
			while(j>=1 && a[j]>element) {
				a[j+1]=a[j];
				j--;
			}
			a[j+1] = element;
				
		}
		return a;
	}

}
