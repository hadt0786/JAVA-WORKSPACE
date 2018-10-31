package algo.selectionSort;

public class App {

	public static void main(String[] args) {
		int myArray[] = selectionSort(new int[] { 2,3,4,3,2,3,4,6,67,});
		for(int i = 0; i<myArray.length;i++) {
			System.out.println(myArray[i]);
		}
	}
	public static int[] selectionSort(int a[]) {
		for(int i = 0; i<a.length;i++) {
			int minimum = i;
			for(int j =i+1;j<a.length;j++) {
				if(a[j]<a[minimum]) {//if we find a smaller value
					minimum = j;
				}
				
			}
			//swap
			int temp = a[i];
			a[i] = a[minimum];
			a[minimum] = temp;;
		}
		return a;
	}

}
