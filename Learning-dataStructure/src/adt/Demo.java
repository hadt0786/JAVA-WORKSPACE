package adt;

public class Demo {
	//Algorithm are the instruction to perform a program
	
	public int countEvents(int elements[]) {
		int count = 0; 
		for(int i = 0; i<elements.length;i++) {
			
	if(elements[i]%2==0)
	{
		
		count++;
	}
	
	}
		return count;
	}
	}

//n =100 100 passes linear efficient
public int getElementFrom(int[]a,int index) {
	return a[index];
	//constant time regardless of input size
}


public int countDuplicates(innt items1[], int intems2[]) {
	int count =0;
	for(int i =0 ;i<item1.length;i++) {
		for(int j =0; items2.length;j++) {
			if(items1[i]==items[2])
				count++;
		}
	}
	return count;
	//Nested loop very slow
	//no of interation = square of input values
}
growth rate

Linear = Single loop--> O(n) BIG O n--> size of input node

Quadratic - Loop inside loop --> O(nsqaue)

constant growth rate --> O(1)

Cubic growth rate -->O(ncube) for{for{for{}}}

expoential O(npown)




























		