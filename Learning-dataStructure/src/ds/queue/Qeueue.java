package ds.queue;

public class Qeueue {
	
	private int maxSize; //initializes the set number of slots
	private long[] queArray; //slots to main the data
	private int front; //this will be index position for the element int the front
	private int rear;//going to be the index position for the element in the rear
	private int nItems;// counter to maintain the number of items in our queue
	public Qeueue(int size) {
		super();
		this.maxSize = size;
		this.queArray = new long[size];
		front = 0; //index position of the first slot of the array
		
		rear = -1; //there is no item in the array yet to be considered as last item
		
		nItems = 0; //we dont have an element in the array
	}
	
	public long insert(long j) {
		//handling ArrayIndexoutof bound exception
		//circular queue
		if(rear==maxSize-1) {
			rear=-1;
		}
		rear++;
		queArray[rear] = j;
		nItems++;
//		rear++;//changes from -1 to 0 if it is 0 then it will be 2
//		queArray[rear] = j;
//		//
//		if(front==maxSize) {
//			front=0;//we can set front back to 0th index so that we can utilise 
//		}
//		
//		
//		nItems--;
//		return temp;
	}
	
	public long peekFront() {
		return queArray[front];
	}
	public boolean isEmpty() {
		return (nItems==0);
	}
	public boolean isFull() {
		return (nItems == maxSize);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	public long remove() {
		//remove item from the front
		long temp = queArray[front];
		front++;
		
		nItems--;
	}
	
	
	public void view() {
		System.out.print("[");
		for(int i =0 ; i<queArray.length;i++) {
			System.out.println(queArray[i]+" ");
		}
		System.out.print("]");
		
	}
	}
