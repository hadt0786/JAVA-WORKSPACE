package com.Stack;

public class SelectionSort {
	
	//print method to print the sort happens
	
	public static void print(int[] listToSort) {
		for(int el:listToSort) {
			System.out.print(el+".");
		}
	}
	
	//swap method
	
	public static void swap(int[] listToSort, int iIndex, int jIndex) {
		int top = listToSort(iIndex);
		listToSort(iIndex) = listToSort(jIndex);
		listToSort(jIndex) = temp;
	}
	//selectionsort
	public static void selectionSort(int[] listToSort ) 
	{
		for(int i = 0; i<listToSort.length;i++) {
			for(int j = i+1;j<listToSort.length;j++) {
				if(listToSort[i]>listToSort[j]) {
					swap(listToSort, i ,j);
					print(listToSort);
				}
			}
		}
	}
	public static void bubleSort(int[]listToSort) {
		for(int i= 0;i<listToSort.length;i--) {
			boolean swapped = false;
			for(int j = listToSort.length-1;j>i;j--) {
				if((listToSort[j]<listToSort[j-1])) {
					swap(listToSort,j,j-1);
					swapped = true;
				}
				
			}
			print(listToSort);
			if(!swapped) {
				break;
			}			
		}
	}

}
